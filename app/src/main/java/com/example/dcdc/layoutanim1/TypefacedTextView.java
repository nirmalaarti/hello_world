package com.example.dcdc.layoutanim1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by dcdc on 24-Jun-16.
 */
public class TypefacedTextView extends TextView {
    public TypefacedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
      /* if(!this.isInEditMode()) {
            TypedArray styledAttrs = context.obtainStyledAttributes(attrs, styleable.TypefacedTextView);
            String fontName = styledAttrs.getString(styleable.TypefacedTextView_typeface);
            styledAttrs.recycle();
            if(fontName != null) {
                Typeface typeface = Typeface.createFromAsset(context.getAssets(), fontName);
                this.setTypeface(typeface);
            }

        }*/
    }
}
