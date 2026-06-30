package xk0;

/* loaded from: classes8.dex */
public final class g implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final int f454969d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f454970e;

    /* renamed from: f, reason: collision with root package name */
    public float f454971f;

    public g(int i17) {
        this.f454969d = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if ((r11 == r8.f454971f) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.graphics.Canvas r9, android.graphics.Bitmap r10, float r11) {
        /*
            r8 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "preBitmap"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "draw cacheColorWeight "
            r0.<init>(r1)
            float r1 = r8.f454971f
            r0.append(r1)
            java.lang.String r1 = ", colorWeight:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", cacheFilteredBitmap:"
            r0.append(r1)
            android.graphics.Bitmap r1 = r8.f454970e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FilterItem"
            com.tencent.mars.xlog.Log.i(r1, r0)
            android.graphics.Bitmap r0 = r8.f454970e
            if (r0 == 0) goto L40
            float r0 = r8.f454971f
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 != 0) goto L57
        L40:
            r8.f454971f = r11
            oj0.c r2 = oj0.c.f345726a
            int r4 = r8.f454969d
            int r5 = r10.getWidth()
            int r6 = r10.getHeight()
            float r7 = r8.f454971f
            r3 = r10
            android.graphics.Bitmap r10 = r2.b(r3, r4, r5, r6, r7)
            r8.f454970e = r10
        L57:
            android.graphics.Bitmap r10 = r8.f454970e
            kotlin.jvm.internal.o.d(r10)
            r11 = 0
            r0 = 0
            r9.drawBitmap(r10, r0, r0, r11)
            java.lang.String r9 = "lxl item draw"
            com.tencent.mars.xlog.Log.i(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk0.g.a(android.graphics.Canvas, android.graphics.Bitmap, float):void");
    }

    public java.lang.Object clone() {
        return super.clone();
    }
}
