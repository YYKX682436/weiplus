package d85;

/* loaded from: classes7.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d85.l0 f227144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d85.l0 l0Var) {
        super(1);
        this.f227144d = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f227144d.a(((java.lang.Boolean) obj).booleanValue() ? d85.h0.GRANTED : d85.h0.BUSINESS_REFUSE);
        return jz5.f0.f302826a;
    }
}
