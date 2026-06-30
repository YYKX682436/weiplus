package ib5;

/* loaded from: classes14.dex */
public final class j implements ib5.e {

    /* renamed from: a, reason: collision with root package name */
    public android.renderscript.RenderScript f290269a;

    /* renamed from: b, reason: collision with root package name */
    public final android.renderscript.ScriptIntrinsicBlur f290270b;

    /* renamed from: c, reason: collision with root package name */
    public android.renderscript.Allocation f290271c;

    /* renamed from: d, reason: collision with root package name */
    public int f290272d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f290273e = -1;

    public j(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RenderScriptBlur", "rs create: %s", this);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        android.renderscript.RenderScript create = android.renderscript.RenderScript.create(context);
        this.f290269a = create;
        this.f290270b = android.renderscript.ScriptIntrinsicBlur.create(create, android.renderscript.Element.U8_4(create));
    }

    @Override // ib5.e
    public android.graphics.Bitmap.Config a() {
        return android.graphics.Bitmap.Config.ARGB_8888;
    }

    @Override // ib5.e
    public final android.graphics.Bitmap b(android.graphics.Bitmap bitmap, float f17) {
        android.renderscript.RenderScript renderScript = this.f290269a;
        if (renderScript == null) {
            throw new java.lang.NullPointerException("RenderScript has been destroyed!!! " + toString());
        }
        android.renderscript.Allocation createFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScript, bitmap);
        if (!(bitmap.getHeight() == this.f290273e && bitmap.getWidth() == this.f290272d)) {
            android.renderscript.Allocation allocation = this.f290271c;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f290271c = android.renderscript.Allocation.createTyped(this.f290269a, createFromBitmap.getType());
            this.f290272d = bitmap.getWidth();
            this.f290273e = bitmap.getHeight();
        }
        android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlur = this.f290270b;
        scriptIntrinsicBlur.setRadius(f17);
        scriptIntrinsicBlur.setInput(createFromBitmap);
        scriptIntrinsicBlur.forEach(this.f290271c);
        this.f290271c.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }

    @Override // ib5.e
    public final void destroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RenderScriptBlur", "destroy %s", toString());
        this.f290270b.destroy();
        android.renderscript.RenderScript renderScript = this.f290269a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f290269a = null;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.RenderScriptBlur", "RenderScript has already been destroyed!!! %s", this);
        }
        android.renderscript.Allocation allocation = this.f290271c;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    public void finalize() {
        super.finalize();
        if (this.f290269a != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RenderScriptBlur", "RS leak warning: maybe you forget to call destroy!!! %s", this);
        }
    }
}
