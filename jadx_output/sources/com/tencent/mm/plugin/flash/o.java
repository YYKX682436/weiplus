package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class o implements com.tencent.mm.plugin.flash.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener f137232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener f137233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode f137234c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener f137235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f137236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.b0 f137237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.p f137238g;

    public o(com.tencent.mm.plugin.flash.p pVar, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener iYTReflectListener, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener iYTBaseFunctionListener, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener, android.graphics.SurfaceTexture surfaceTexture, com.tencent.mm.plugin.flash.b0 b0Var) {
        this.f137238g = pVar;
        this.f137232a = iYTReflectListener;
        this.f137233b = iYTBaseFunctionListener;
        this.f137234c = ytSDKKitFrameworkWorkMode;
        this.f137235d = iYtSDKKitFrameworkEventListener;
        this.f137236e = surfaceTexture;
        this.f137237f = b0Var;
    }

    @Override // com.tencent.mm.plugin.flash.b0
    public void a(java.lang.Boolean bool, com.tencent.mm.plugin.flash.d0 d0Var) {
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.flash.p pVar = this.f137238g;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "open camera failed");
            vz2.c.k("openCamera", -1);
            vz2.c.b().B = 1;
            pVar.f137242c.W6(90035, "open camera failed");
            return;
        }
        vz2.c.j("openCamera");
        if (!pVar.f137240a.b(d0Var.f137201d.f447652a, d0Var.f137212o)) {
            vz2.c.k("sdkCamera", -1);
            vz2.c.b().B = 2;
            pVar.f137242c.W6(90013, "init yt camera failed");
            return;
        }
        vz2.c.j("sdkCamera");
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext platformContext = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getPlatformContext();
        platformContext.reflectListener = this.f137232a;
        platformContext.baseFunctionListener = this.f137233b;
        if (!pVar.f137240a.a(this.f137234c, this.f137235d)) {
            vz2.c.k("sdkFaceType", -1);
            vz2.c.b().B = 2;
            pVar.f137242c.W6(90013, "init yt framework failed");
            return;
        }
        vz2.c.j("sdkFaceType");
        d0Var.f(this.f137236e, new com.tencent.mm.plugin.flash.b0() { // from class: com.tencent.mm.plugin.flash.o$$a
            @Override // com.tencent.mm.plugin.flash.b0
            public final void a(java.lang.Boolean bool2, com.tencent.mm.plugin.flash.d0 d0Var2) {
                com.tencent.mm.plugin.flash.o oVar = com.tencent.mm.plugin.flash.o.this;
                oVar.getClass();
                if (bool2.booleanValue()) {
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "camera start preview failed");
                vz2.c.k("openCamera", -1);
                vz2.c.b().B = 1;
                oVar.f137238g.f137242c.W6(90038, "open camera failed");
            }
        });
        android.graphics.Point c17 = d0Var.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "set sdk preview size:%sx%s", java.lang.Integer.valueOf(c17.x), java.lang.Integer.valueOf(c17.y));
        int rotate = com.tencent.youtu.sdkkitframework.common.YtCameraSetting.getRotate(pVar.f137242c, d0Var.f137212o, 1);
        int i17 = c17.x;
        int i18 = c17.y;
        if (rotate >= 5) {
            i17 = i18;
            i18 = i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "setPreviewRect width:%d,height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        vz2.c.k("detect", i17 + "x" + i18);
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().setPreviewRect(new android.graphics.Rect(0, 0, i17, i18));
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().setDetectRect(new android.graphics.Rect(0, 0, i17, i18));
        this.f137237f.a(java.lang.Boolean.TRUE, d0Var);
        vz2.c.m(11);
    }
}
