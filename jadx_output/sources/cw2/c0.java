package cw2;

/* loaded from: classes15.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.d0 f223611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(cw2.d0 d0Var) {
        super(2);
        this.f223611d = d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Number) obj2).intValue() + ((java.lang.Number) obj).intValue() == 0) {
            cw2.d0 d0Var = this.f223611d;
            d0Var.a(d0Var.f223634h, "onPreloadComplete");
        }
        return jz5.f0.f302826a;
    }
}
