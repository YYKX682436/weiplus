package p75;

/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f352648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f352648d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        p75.l it = (p75.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof p75.j) {
            this.f352648d.f310112d = true;
        }
        return ((p75.d) it).z();
    }
}
