package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class xi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f161758d;

    /* renamed from: e, reason: collision with root package name */
    public int f161759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI f161760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI settingsMusicAiCoverModelUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f161760f = settingsMusicAiCoverModelUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.xi(this.f161760f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting.xi) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI settingsMusicAiCoverModelUI;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f161759e;
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI settingsMusicAiCoverModelUI2 = this.f161760f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
            this.f161758d = settingsMusicAiCoverModelUI2;
            this.f161759e = 1;
            obj = ((ef0.y2) o8Var).Zi(settingsMusicAiCoverModelUI2, this);
            if (obj == aVar) {
                return aVar;
            }
            settingsMusicAiCoverModelUI = settingsMusicAiCoverModelUI2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsMusicAiCoverModelUI = (com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI) this.f161758d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        settingsMusicAiCoverModelUI.f160570f = (bw5.lc0) obj;
        bw5.lc0 lc0Var = settingsMusicAiCoverModelUI2.f160570f;
        settingsMusicAiCoverModelUI2.f160569e = lc0Var != null ? lc0Var.f29743m : 0;
        settingsMusicAiCoverModelUI2.V6(true);
        return jz5.f0.f302826a;
    }
}
