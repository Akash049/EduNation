package com.edu.edunation.util;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.caverock.androidsvg.SVG;

/**
 * Created by akashchandra on 11/29/17.
 */

public class SvgDrawableTranscoder implements ResourceTranscoder<SVG, PictureDrawable> {
    @Override
    public Resource<PictureDrawable> transcode(Resource<SVG> toTranscode) {
        SVG svg = toTranscode.get();
        Picture picture = svg.renderToPicture();
        PictureDrawable drawable = new PictureDrawable(picture);
        return new SimpleResource<PictureDrawable>(drawable);
    }

    @Override
    public String getId() {
        return "";
    }
}