package ib5;

/* loaded from: classes14.dex */
public final class k implements ib5.e {

    /* renamed from: a, reason: collision with root package name */
    public android.renderscript.RenderScript f290274a;

    /* renamed from: b, reason: collision with root package name */
    public final android.renderscript.ScriptIntrinsicBlur f290275b;

    /* renamed from: c, reason: collision with root package name */
    public android.renderscript.Allocation f290276c;

    /* renamed from: d, reason: collision with root package name */
    public int f290277d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f290278e = -1;

    public k(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SupportRenderScriptBlur", "rs create: %s", this);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        android.renderscript.RenderScript create = android.renderscript.RenderScript.create(context);
        this.f290274a = create;
        this.f290275b = android.renderscript.ScriptIntrinsicBlur.create(create, android.renderscript.Element.U8_4(create));
    }

    @Override // ib5.e
    public android.graphics.Bitmap.Config a() {
        return android.graphics.Bitmap.Config.ARGB_8888;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    @Override // ib5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(android.graphics.Bitmap r5, float r6) {
        /*
            r4 = this;
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            java.lang.String r1 = "Radius(%s) out of range (0 < r <= 25), realRadius:%s"
            java.lang.String r2 = "MicroMsg.SupportRenderScriptBlur"
            if (r0 > 0) goto L1c
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r3}
            com.tencent.mars.xlog.Log.w(r2, r1, r6)
        L1a:
            r6 = r0
            goto L32
        L1c:
            r0 = 1103626240(0x41c80000, float:25.0)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 <= 0) goto L32
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r3}
            com.tencent.mars.xlog.Log.w(r2, r1, r6)
            goto L1a
        L32:
            android.renderscript.RenderScript r0 = r4.f290274a
            if (r0 == 0) goto L84
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createFromBitmap(r0, r5)
            int r1 = r5.getHeight()
            int r2 = r4.f290278e
            if (r1 != r2) goto L4c
            int r1 = r5.getWidth()
            int r2 = r4.f290277d
            if (r1 != r2) goto L4c
            r1 = 1
            goto L4d
        L4c:
            r1 = 0
        L4d:
            if (r1 != 0) goto L6e
            android.renderscript.Allocation r1 = r4.f290276c
            if (r1 == 0) goto L56
            r1.destroy()
        L56:
            android.renderscript.RenderScript r1 = r4.f290274a
            android.renderscript.Type r2 = r0.getType()
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createTyped(r1, r2)
            r4.f290276c = r1
            int r1 = r5.getWidth()
            r4.f290277d = r1
            int r1 = r5.getHeight()
            r4.f290278e = r1
        L6e:
            android.renderscript.ScriptIntrinsicBlur r1 = r4.f290275b
            r1.setRadius(r6)
            r1.setInput(r0)
            android.renderscript.Allocation r6 = r4.f290276c
            r1.forEach(r6)
            android.renderscript.Allocation r6 = r4.f290276c
            r6.copyTo(r5)
            r0.destroy()
            return r5
        L84:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "RenderScript has been destroyed!!! "
            r6.<init>(r0)
            java.lang.String r0 = r4.toString()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ib5.k.b(android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    @Override // ib5.e
    public final void destroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SupportRenderScriptBlur", "destroy %s", this);
        this.f290275b.destroy();
        android.renderscript.RenderScript renderScript = this.f290274a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f290274a = null;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SupportRenderScriptBlur", "RenderScript has already been destroyed!!!");
        }
        android.renderscript.Allocation allocation = this.f290276c;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    public void finalize() {
        super.finalize();
        if (this.f290274a != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SupportRenderScriptBlur", "RS leak warning: maybe you forget to call destroy!!! %s", this);
        }
    }
}
