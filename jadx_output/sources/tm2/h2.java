package tm2;

/* loaded from: classes3.dex */
public final class h2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f420521b;

    public h2(tm2.s2 s2Var, int i17) {
        this.f420520a = s2Var;
        this.f420521b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
        tm2.s2 s2Var = this.f420520a;
        fm2.b bVar = s2Var.f19601c;
        if (bVar != null) {
            bVar.statusChange(qo0.b.H, bundle);
        }
        boolean z18 = ((mm2.c1) s2Var.c(mm2.c1.class)).Y4;
        com.tencent.mm.plugin.finder.assist.u8 u8Var = com.tencent.mm.plugin.finder.assist.u8.f102599a;
        if (z18) {
            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1141L);
            gk2.e eVar = s2Var.f19609a;
            int i17 = this.f420521b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0-vBitrate:");
            hn0.v vVar = hn0.v.f282440a;
            sb6.append(hn0.v.f282442c);
            u8Var.b(eVar, cg1.b.CTRL_INDEX, i17, "externalErrorClose", sb6.toString());
            return;
        }
        com.tencent.mm.plugin.finder.assist.p8 p8Var2 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1131L);
        gk2.e eVar2 = s2Var.f19609a;
        int i18 = this.f420521b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("0-vBitrate:");
        hn0.v vVar2 = hn0.v.f282440a;
        sb7.append(hn0.v.f282442c);
        u8Var.b(eVar2, 1131, i18, "secondaryErrorClose", sb7.toString());
    }
}
