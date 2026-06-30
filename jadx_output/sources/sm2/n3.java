package sm2;

/* loaded from: classes3.dex */
public final class n3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f409588b;

    public n3(sm2.o4 o4Var, int i17) {
        this.f409587a = o4Var;
        this.f409588b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1122L);
        com.tencent.mm.plugin.finder.assist.u8 u8Var = com.tencent.mm.plugin.finder.assist.u8.f102599a;
        gk2.e eVar = this.f409587a.f19609a;
        int i17 = this.f409588b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0-vBitrate:");
        hn0.v vVar = hn0.v.f282440a;
        sb6.append(hn0.v.f282442c);
        u8Var.b(eVar, 1122, i17, "anchorErrorCancel", sb6.toString());
    }
}
