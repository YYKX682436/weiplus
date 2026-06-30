package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class nj implements j35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.oj f161363a;

    public nj(com.tencent.mm.plugin.setting.ui.setting.oj ojVar) {
        this.f161363a = ojVar;
    }

    @Override // j35.g0
    public void a(int i17, int i18, android.content.Intent intent) {
        boolean u17 = ip.b.u();
        com.tencent.mm.plugin.setting.ui.setting.oj ojVar = this.f161363a;
        if (!u17) {
            ojVar.f161396a.initView();
            return;
        }
        ip.l.r(true);
        ojVar.f161396a.initView();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 0L, 1L, false);
        c01.a9.b(true, false);
    }
}
