package id2;

/* loaded from: classes8.dex */
public final class r4 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.s4 f290786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290787e;

    public r4(id2.s4 s4Var, yz5.l lVar) {
        this.f290786d = s4Var;
        this.f290787e = lVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String str = this.f290786d.f290797e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(str, b52.b.b(), "person_page_more_recent_switch_pop_cancel", "");
        this.f290787e.invoke(java.lang.Boolean.FALSE);
    }
}
