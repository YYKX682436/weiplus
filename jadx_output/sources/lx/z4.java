package lx;

/* loaded from: classes11.dex */
public final class z4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f322028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f322029e;

    public z4(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, java.lang.ref.WeakReference weakReference) {
        this.f322028d = flutterBizPlugin;
        this.f322029e = weakReference;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 385) {
            gm0.j1.d().q(385, this);
            boolean Bi = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Bi();
            com.tencent.mars.xlog.Log.i(this.f322028d.f65253d, "onSceneEnd: %s, %s, %s, unReg: %s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(Bi));
            com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi bizPersonalCenterNativeToFlutterApi = (com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi) this.f322029e.get();
            if (bizPersonalCenterNativeToFlutterApi != null) {
                bizPersonalCenterNativeToFlutterApi.showRegisterPage(!Bi, lx.y4.f322018d);
            }
        }
    }
}
