package wv0;

/* loaded from: classes5.dex */
public final class j implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wv0.q f449917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f449918b;

    public j(wv0.q qVar, rv0.n1 n1Var) {
        this.f449917a = qVar;
        this.f449918b = n1Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        wv0.q qVar = this.f449917a;
        if (qVar.getUserActed$plugin_mj_template_release() && qVar.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()) {
            rv0.n1 n1Var = this.f449918b;
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.lmg);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
    }
}
