package rv0;

/* loaded from: classes5.dex */
public final class t3 implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.f f400257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400258b;

    public t3(rv0.f fVar, rv0.n1 n1Var) {
        this.f400257a = fVar;
        this.f400258b = n1Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        rv0.f fVar = this.f400257a;
        if (fVar.getUserActed$plugin_mj_template_release() && fVar.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()) {
            gx0.kh q76 = this.f400258b.q7();
            java.lang.String string = fVar.getContext().getString(com.tencent.mm.R.string.lm8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
    }
}
