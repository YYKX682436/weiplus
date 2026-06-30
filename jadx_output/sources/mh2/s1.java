package mh2;

/* loaded from: classes10.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.u1 f326457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(mh2.u1 u1Var) {
        super(1);
        this.f326457d = u1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        mh2.u1 u1Var = this.f326457d;
        u1Var.f326473h.setIconColor(intValue);
        u1Var.f326474i.setColor(intValue);
        return jz5.f0.f302826a;
    }
}
