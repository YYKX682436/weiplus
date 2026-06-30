package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f137288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.b0 f137289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.d0 f137290f;

    public x(com.tencent.mm.plugin.flash.d0 d0Var, android.graphics.SurfaceTexture surfaceTexture, com.tencent.mm.plugin.flash.b0 b0Var) {
        this.f137290f = d0Var;
        this.f137288d = surfaceTexture;
        this.f137289e = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.b0 b0Var = this.f137289e;
        com.tencent.mm.plugin.flash.d0 d0Var = this.f137290f;
        try {
            d0Var.f137201d.i(this.f137288d);
            com.tencent.mm.plugin.facedetect.model.s.o(d0Var.f137202e, d0Var.f137203f, 5);
            try {
                d0Var.f137201d.k();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "startPreview failed:" + e17.getMessage());
                d0Var.f137208k = false;
                if (b0Var != null) {
                    b0Var.a(java.lang.Boolean.FALSE, null);
                }
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "setPreviewTexture failed:" + e18.getMessage());
            d0Var.f137208k = false;
            if (b0Var != null) {
                b0Var.a(java.lang.Boolean.FALSE, null);
            }
        }
    }
}
