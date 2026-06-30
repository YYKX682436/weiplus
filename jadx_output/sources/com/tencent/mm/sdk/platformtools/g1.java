package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public abstract class g1 {
    public static boolean a(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".bmp") || lowerCase.endsWith(".png") || lowerCase.endsWith(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG) || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".gif");
    }
}
