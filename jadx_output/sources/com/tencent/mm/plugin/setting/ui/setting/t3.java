package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class t3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f161559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI f161560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f161561f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI, com.tencent.mm.ui.widget.dialog.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f161560e = settingFingerprintVerifyUI;
        this.f161561f = f4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.t3(this.f161560e, this.f161561f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting.t3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f161559d;
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI = this.f161560e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.f1 Bi = ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Bi(v65.m.b(settingFingerprintVerifyUI), true);
            this.f161559d = 1;
            obj = ((kotlinx.coroutines.g1) Bi).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        ((vd0.v1) j1Var).aj(false, "", r17);
        wd0.j1 j1Var2 = (wd0.j1) i95.n0.c(wd0.j1.class);
        kotlinx.coroutines.y0 b17 = v65.m.b(settingFingerprintVerifyUI);
        wd0.f[] fVarArr = wd0.f.f444711d;
        ((vd0.v1) j1Var2).wi(b17, 0, (com.tencent.mm.feature.setting.api.FingerprintVerifyParam) obj, new com.tencent.mm.plugin.setting.ui.setting.s3(this.f161561f, settingFingerprintVerifyUI));
        return jz5.f0.f302826a;
    }
}
