package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class aj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f160838d;

    /* renamed from: e, reason: collision with root package name */
    public int f160839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI f160840f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI settingsMusicAiCreateModelUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f160840f = settingsMusicAiCreateModelUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.aj(this.f160840f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting.aj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI settingsMusicAiCreateModelUI;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f160839e;
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI settingsMusicAiCreateModelUI2 = this.f160840f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
            this.f160838d = settingsMusicAiCreateModelUI2;
            this.f160839e = 1;
            obj = ((ef0.y2) o8Var).Zi(settingsMusicAiCreateModelUI2, this);
            if (obj == aVar) {
                return aVar;
            }
            settingsMusicAiCreateModelUI = settingsMusicAiCreateModelUI2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsMusicAiCreateModelUI = (com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI) this.f160838d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        settingsMusicAiCreateModelUI.f160575f = (bw5.lc0) obj;
        bw5.lc0 lc0Var = settingsMusicAiCreateModelUI2.f160575f;
        settingsMusicAiCreateModelUI2.f160574e = lc0Var != null ? lc0Var.f29746p : 0;
        settingsMusicAiCreateModelUI2.V6();
        return jz5.f0.f302826a;
    }
}
