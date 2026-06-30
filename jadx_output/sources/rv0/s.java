package rv0;

/* loaded from: classes5.dex */
public final class s implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400225d;

    public s(rv0.n1 n1Var) {
        this.f400225d = n1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) obj;
        rv0.n1 n1Var = this.f400225d;
        if (n1Var.p7().f276255v.getValue() != gx0.fd.f276432h) {
            return;
        }
        kotlin.jvm.internal.o.d(mJTime);
        n1Var.v7(mJTime);
    }
}
