package rv0;

/* loaded from: classes5.dex */
public final class x1 implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xv0.g f400322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400323b;

    public x1(xv0.g gVar, rv0.n1 n1Var) {
        this.f400322a = gVar;
        this.f400323b = n1Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        xv0.g gVar = this.f400322a;
        if (gVar.getUserActed$plugin_mj_template_release() && gVar.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()) {
            gx0.kh q76 = this.f400323b.q7();
            java.lang.String string = gVar.getContext().getString(com.tencent.mm.R.string.f492508lm2);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
    }
}
