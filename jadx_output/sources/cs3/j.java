package cs3;

/* loaded from: classes9.dex */
public class j extends android.graphics.drawable.BitmapDrawable implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f222114d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(android.content.res.Resources r5, java.lang.String r6) {
        /*
            r4 = this;
            c01.q8 r0 = c01.n8.b()
            r1 = 1
            if (r0 == 0) goto L1a
            c01.q8 r0 = c01.n8.b()
            xf4.d r0 = (xf4.d) r0
            r2 = 16
            java.lang.String r0 = r0.b(r2, r1)
            r2 = 1073741824(0x40000000, float:2.0)
            android.graphics.Bitmap r0 = com.tencent.mm.sdk.platformtools.j.a(r0, r2)
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            if (r0 != 0) goto L21
            goto L22
        L21:
            r1 = r3
        L22:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "MicroMsg.UrlDrawable"
            java.lang.String r3 = "verify bmp is null ? %B"
            com.tencent.mars.xlog.Log.i(r1, r3, r2)
            r4.<init>(r5, r0)
            r4.f222114d = r6
            java.lang.Class<y60.f> r5 = y60.f.class
            i95.m r5 = i95.n0.c(r5)
            y60.f r5 = (y60.f) r5
            x60.e r5 = (x60.e) r5
            r5.wi(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cs3.j.<init>(android.content.res.Resources, java.lang.String):void");
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (this.f222114d.equals(str)) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        cs3.i iVar = new cs3.i(this);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(iVar);
        if (d17 == null || d17.isRecycled()) {
            d17 = null;
        }
        android.graphics.Rect bounds = getBounds();
        if (d17 != null) {
            canvas.drawBitmap(d17, (android.graphics.Rect) null, bounds, (android.graphics.Paint) null);
        }
    }
}
