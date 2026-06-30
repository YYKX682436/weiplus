package se2;

/* loaded from: classes2.dex */
public final class g implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.q f406856d;

    public g(kotlinx.coroutines.q cont) {
        kotlin.jvm.internal.o.g(cont, "cont");
        this.f406856d = cont;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        if (mMPAGView != null) {
            mMPAGView.i(this);
        }
        kotlinx.coroutines.q qVar = this.f406856d;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
