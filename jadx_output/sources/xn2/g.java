package xn2;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f455501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlin.jvm.internal.g0 g0Var) {
        super(1);
        this.f455501d = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.getItemId() == this.f455501d.f310121d);
    }
}
