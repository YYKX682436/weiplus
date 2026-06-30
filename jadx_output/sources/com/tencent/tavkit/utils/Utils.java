package com.tencent.tavkit.utils;

/* loaded from: classes14.dex */
public class Utils {
    public static boolean isRectValid(com.tencent.tav.coremedia.CGRect cGRect) {
        return cGRect != null && isSizeValid(cGRect.size);
    }

    public static boolean isSizeValid(com.tencent.tav.coremedia.CGSize cGSize) {
        return (cGSize == null || cGSize.width == 0.0f || cGSize.height == 0.0f) ? false : true;
    }
}
