package com.tencent.mm.plugin.gif;

/* loaded from: classes10.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f142179a;

    public o(java.lang.String str) {
        int[] iArr = new int[6];
        this.f142179a = iArr;
        try {
            ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).recycle(((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).openByFilePath(kk.w.a(str, false), iArr));
            com.tencent.mars.xlog.Log.i("MMGIFInfo", "width:%d height:%d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
        } catch (com.tencent.mm.plugin.gif.MMGIFException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MMGIFInfo", com.tencent.mm.sdk.platformtools.z3.c(e17));
            throw new java.lang.IllegalStateException(e17);
        }
    }
}
