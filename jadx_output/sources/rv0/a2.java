package rv0;

/* loaded from: classes5.dex */
public final class a2 implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uv0.u f399918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uv0.w f399920c;

    public a2(uv0.u uVar, rv0.n1 n1Var, uv0.w wVar) {
        this.f399918a = uVar;
        this.f399919b = n1Var;
        this.f399920c = wVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        uv0.u uVar = this.f399918a;
        boolean userActed$plugin_mj_template_release = uVar.getUserActed$plugin_mj_template_release();
        rv0.n1 n1Var = this.f399919b;
        if (userActed$plugin_mj_template_release && uVar.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()) {
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = uVar.getContext().getString(com.tencent.mm.R.string.lm6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        n1Var.m7().f14482d.removeObserver(this.f399920c);
    }
}
