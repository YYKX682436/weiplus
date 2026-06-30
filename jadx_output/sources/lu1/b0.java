package lu1;

/* loaded from: classes9.dex */
public abstract class b0 {
    public static final android.graphics.Point a(android.view.View anchor) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        int[] iArr = new int[2];
        anchor.getLocationOnScreen(iArr);
        int width = iArr[0] + (anchor.getWidth() / 2);
        int i17 = iArr[1];
        int height = anchor.getHeight() + i17;
        int i18 = i17 >= 0 ? i17 : 0;
        if (height > com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels) {
            height = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels;
        }
        return new android.graphics.Point(width, (i18 + height) / 2);
    }

    public static final void b(android.widget.ImageView imageView, java.lang.String url, float f17, boolean z17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(url, "url");
        yo0.f fVar = new yo0.f();
        java.lang.String m17 = xt1.q.m(url);
        kotlin.jvm.internal.o.f(m17, "getPictureStoragePath(...)");
        fVar.f464079c = m17;
        fVar.f464078b = true;
        fVar.f464087k = z17;
        fVar.f464081e = i18;
        fVar.f464082f = i19;
        fVar.f464077a = true;
        yo0.i a17 = fVar.a();
        vo0.e eVar = vo0.e.f438467a;
        vo0.e.f438468b.c(url, imageView, a17);
    }

    public static /* synthetic */ void c(android.widget.ImageView imageView, java.lang.String str, float f17, boolean z17, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            f17 = 0.0f;
        }
        float f18 = f17;
        boolean z18 = (i27 & 8) != 0 ? false : z17;
        if ((i27 & 16) != 0) {
            i17 = -1;
        }
        b(imageView, str, f18, z18, i17, (i27 & 32) != 0 ? 0 : i18, (i27 & 64) != 0 ? 0 : i19);
    }
}
