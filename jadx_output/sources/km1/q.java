package km1;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f309024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(km1.s sVar, yz5.l lVar, android.util.Size size) {
        super(1);
        this.f309022d = sVar;
        this.f309023e = lVar;
        this.f309024f = size;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.magicbrush.MagicBrush magicBrush = this.f309022d.f309041u;
            if (magicBrush == null) {
                km1.s sVar = this.f309022d;
                yz5.l lVar = this.f309023e;
                if (km1.s.F) {
                    java.lang.String str = sVar.f309029f;
                }
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.FALSE);
                }
            } else {
                km1.s sVar2 = this.f309022d;
                android.util.Size size = this.f309024f;
                km1.p pVar = new km1.p(sVar2);
                if (km1.s.F) {
                    sVar2.getClass();
                    java.util.Objects.toString(size);
                }
                if (sVar2.f309038r) {
                    com.tencent.mars.xlog.Log.i(sVar2.f309029f, "setupWebGLExtTextureIfNeed, already registerSurface");
                } else {
                    com.tencent.mars.xlog.Log.i(sVar2.f309029f, "setupWebGLExtTextureIfNeed, registerSurface");
                    com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin mBExternalTexturePlugin = magicBrush.f48582f;
                    kotlin.jvm.internal.o.f(mBExternalTexturePlugin, "getExternalTexturePlugin(...)");
                    bh.a.a(mBExternalTexturePlugin, "livepusher", sVar2.f309027d.f252497d, size.getWidth(), size.getHeight(), null, new km1.n(sVar2, pVar), new km1.o(sVar2), false, 128, null);
                    sVar2.f309038r = true;
                }
                yz5.l lVar2 = this.f309023e;
                if (lVar2 != null) {
                    lVar2.invoke(java.lang.Boolean.TRUE);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i(this.f309022d.f309029f, "startCustomVideoCaptureIfNeed, setupWebGLEnv failure");
            yz5.l lVar3 = this.f309023e;
            if (lVar3 != null) {
                lVar3.invoke(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f302826a;
    }
}
