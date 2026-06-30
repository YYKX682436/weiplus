package sr2;

/* loaded from: classes2.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(sr2.y2 y2Var) {
        super(1);
        this.f411569d = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent it = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        sr2.y2 y2Var = this.f411569d;
        pf5.e.launchUI$default(y2Var, null, null, new sr2.f2(y2Var, it, null), 3, null);
        return jz5.f0.f302826a;
    }
}
