package rv0;

/* loaded from: classes5.dex */
public final class h3 implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f400032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400033b;

    public h3(rv0.o7 o7Var, rv0.n1 n1Var) {
        this.f400032a = o7Var;
        this.f400033b = n1Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        rv0.o7 o7Var = this.f400032a;
        if (o7Var.getUserActed$plugin_mj_template_release() && o7Var.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()) {
            gx0.kh q76 = this.f400033b.q7();
            java.lang.String string = o7Var.getContext().getString(com.tencent.mm.R.string.lmk);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
    }
}
