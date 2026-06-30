package rv0;

/* loaded from: classes5.dex */
public final class g2 implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.d f400013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400014b;

    public g2(rv0.d dVar, rv0.n1 n1Var) {
        this.f400013a = dVar;
        this.f400014b = n1Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        rv0.d dVar = this.f400013a;
        if (dVar.getUserActed$plugin_mj_template_release() && dVar.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()) {
            gx0.kh q76 = this.f400014b.q7();
            java.lang.String string = dVar.getContext().getString(com.tencent.mm.R.string.lm_);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
    }
}
