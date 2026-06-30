package zv0;

/* loaded from: classes5.dex */
public final class m implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476204b;

    public m(zv0.f0 f0Var, rv0.n1 n1Var) {
        this.f476203a = f0Var;
        this.f476204b = n1Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        zv0.f0 f0Var = this.f476203a;
        if (f0Var.getUserActed$plugin_mj_template_release() && f0Var.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()) {
            gx0.kh q76 = this.f476204b.q7();
            java.lang.String string = f0Var.getContext().getString(com.tencent.mm.R.string.m1s);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
    }
}
