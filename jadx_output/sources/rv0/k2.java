package rv0;

/* loaded from: classes5.dex */
public final class k2 implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400077b;

    public k2(rv0.j7 j7Var, rv0.n1 n1Var) {
        this.f400076a = j7Var;
        this.f400077b = n1Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        rv0.j7 j7Var = this.f400076a;
        if (j7Var.getUserActed$plugin_mj_template_release() && j7Var.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()) {
            gx0.kh q76 = this.f400077b.q7();
            java.lang.String string = j7Var.getContext().getString(com.tencent.mm.R.string.lmh);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
    }
}
