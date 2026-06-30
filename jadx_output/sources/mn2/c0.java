package mn2;

/* loaded from: classes5.dex */
public final class c0 extends dp0.d {

    /* renamed from: d, reason: collision with root package name */
    public final float f329921d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f329922e;

    public c0(float f17, java.lang.Integer num) {
        this.f329921d = f17;
        this.f329922e = num;
    }

    @Override // zo0.k
    public hp0.g a(cp0.n targetView, vo0.h reaper, hp0.g input) {
        android.graphics.Bitmap S;
        java.lang.StringBuilder sb6;
        int intValue;
        float f17 = this.f329921d;
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        kotlin.jvm.internal.o.g(input, "input");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("asResource imageView: ");
        sb7.append(targetView.b());
        sb7.append(" originBitmap: ");
        java.lang.Object obj = input.f282913a;
        sb7.append(obj);
        com.tencent.mars.xlog.Log.i("Finder.FinderBlurBitmapProducer", sb7.toString());
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null || (S = com.tencent.mm.sdk.platformtools.x.S(bitmap, bitmap.getHeight() / 5, bitmap.getWidth() / 5, true, true)) == null) {
            return input;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(S);
        java.lang.Integer num = this.f329922e;
        if (num != null && (intValue = num.intValue()) != -1) {
            canvas.drawColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(intValue));
        }
        ib5.k kVar = null;
        try {
            if (f17 > 25.0f) {
                S = com.tencent.mm.sdk.platformtools.x.X(S, (int) f17);
            } else {
                ib5.k kVar2 = new ib5.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
                try {
                    kVar2.b(S, f17);
                    kVar = kVar2;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    kVar = kVar2;
                    try {
                        com.tencent.mars.xlog.Log.e("Finder.FinderBlurBitmapProducer", "setBlurBitmap error:" + th.getMessage());
                        S = com.tencent.mm.sdk.platformtools.x.X(S, (int) f17);
                        if (kVar != null) {
                            try {
                                kVar.destroy();
                            } catch (android.renderscript.RSInvalidStateException e17) {
                                e = e17;
                                sb6 = new java.lang.StringBuilder("RSInvalidStateException ");
                                sb6.append(e.getMessage());
                                com.tencent.mars.xlog.Log.w("Finder.FinderBlurBitmapProducer", sb6.toString());
                                return new hp0.g(S);
                            }
                        }
                        return new hp0.g(S);
                    } catch (java.lang.Throwable th7) {
                        if (kVar != null) {
                            try {
                                kVar.destroy();
                            } catch (android.renderscript.RSInvalidStateException e18) {
                                com.tencent.mars.xlog.Log.w("Finder.FinderBlurBitmapProducer", "RSInvalidStateException " + e18.getMessage());
                            }
                        }
                        throw th7;
                    }
                }
            }
            if (kVar != null) {
                try {
                    kVar.destroy();
                } catch (android.renderscript.RSInvalidStateException e19) {
                    e = e19;
                    sb6 = new java.lang.StringBuilder("RSInvalidStateException ");
                    sb6.append(e.getMessage());
                    com.tencent.mars.xlog.Log.w("Finder.FinderBlurBitmapProducer", sb6.toString());
                    return new hp0.g(S);
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
        return new hp0.g(S);
    }

    @Override // zo0.k
    public java.lang.String b(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        return source;
    }
}
