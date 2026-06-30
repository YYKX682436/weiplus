package l26;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l26.q0 f315263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l26.q0 q0Var) {
        super(1);
        this.f315263d = q0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Integer.valueOf(this.f315263d.f315270b.getAndIncrement());
    }
}
