package wc5;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.g0 f444549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(wc5.g0 g0Var) {
        super(1);
        this.f444549d = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cd5.c a17 = cd5.c.f40661e.a(((java.lang.Number) obj).intValue());
        wc5.g0 g0Var = this.f444549d;
        if (a17 != null) {
            g0Var.f444570e = a17;
        }
        ((sl5.g) ((jz5.n) g0Var.f444572g).getValue()).a();
        return jz5.f0.f302826a;
    }
}
