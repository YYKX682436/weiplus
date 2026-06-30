package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class s implements com.tencent.mm.plugin.flash.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f137178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137179b;

    public s(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout, android.graphics.SurfaceTexture surfaceTexture) {
        this.f137179b = faceFlashActionPreviewLayout;
        this.f137178a = surfaceTexture;
    }

    @Override // com.tencent.mm.plugin.flash.b0
    public void a(java.lang.Boolean bool, com.tencent.mm.plugin.flash.d0 d0Var) {
        if (!bool.booleanValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "open camera failed");
            vz2.c.k("openCamera", -1);
            com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137179b;
            faceFlashActionPreviewLayout.f137078s.a7(faceFlashActionPreviewLayout.d(90035, i65.a.r(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.string.c7m)));
            return;
        }
        vz2.c.j("openCamera");
        if (!this.f137179b.f137079t.b(d0Var.f137201d.f447652a, d0Var.f137212o)) {
            vz2.c.k("sdkCamera", -1);
            com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = this.f137179b;
            faceFlashActionPreviewLayout2.f137078s.a7(faceFlashActionPreviewLayout2.d(90013, i65.a.r(faceFlashActionPreviewLayout2.getContext(), com.tencent.mm.R.string.c7m)));
            return;
        }
        vz2.c.j("sdkCamera");
        int i17 = (int) (com.tencent.mm.ui.bl.b(this.f137179b.getContext()).x * 0.27f * 2.0f);
        int b17 = (int) (i17 * d0Var.b());
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext platformContext = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getPlatformContext();
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout3 = this.f137179b;
        platformContext.baseFunctionListener = faceFlashActionPreviewLayout3;
        platformContext.reflectListener = faceFlashActionPreviewLayout3;
        if (!faceFlashActionPreviewLayout3.f137079t.a(faceFlashActionPreviewLayout3.f137083x, faceFlashActionPreviewLayout3)) {
            vz2.c.k("sdkFaceType", -1);
            com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout4 = this.f137179b;
            faceFlashActionPreviewLayout4.f137078s.a7(faceFlashActionPreviewLayout4.d(90013, i65.a.r(faceFlashActionPreviewLayout4.getContext(), com.tencent.mm.R.string.c7q)));
            return;
        }
        vz2.c.j("sdkFaceType");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.p(this, i17, b17));
        d0Var.f(this.f137178a, new com.tencent.mm.plugin.flash.action.q(this));
        android.graphics.Point c17 = d0Var.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "set sdk preview size:%sx%s", java.lang.Integer.valueOf(c17.x), java.lang.Integer.valueOf(c17.y));
        int rotate = com.tencent.youtu.sdkkitframework.common.YtCameraSetting.getRotate(this.f137179b.getContext(), d0Var.f137212o, 1);
        int i18 = c17.x;
        int i19 = c17.y;
        if (rotate >= 5) {
            i19 = i18;
            i18 = i19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "setPreviewRect width:%d,height:%d，enableCopyData：%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(this.f137179b.F));
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().setPreviewRect(new android.graphics.Rect(0, 0, i18, i19));
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().setDetectRect(new android.graphics.Rect(0, 0, i18, i19));
        this.f137179b.f137082w.b(d0Var.f137201d.c());
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout5 = this.f137179b;
        if (faceFlashActionPreviewLayout5.P) {
            android.content.Context context = faceFlashActionPreviewLayout5.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.flash.action.j0 j0Var = (com.tencent.mm.plugin.flash.action.j0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.flash.action.j0.class);
            android.hardware.Camera.Parameters c18 = d0Var.f137201d.c();
            if (j0Var.f137149e) {
                j0Var.f137148d.d(c18);
            }
            android.content.Context context2 = this.f137179b.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.flash.action.j0 j0Var2 = (com.tencent.mm.plugin.flash.action.j0) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.flash.action.j0.class);
            if (j0Var2.f137149e) {
                j0Var2.f137148d.e();
            }
        }
        d0Var.e(new com.tencent.mm.plugin.flash.action.r(this, c17));
    }
}
