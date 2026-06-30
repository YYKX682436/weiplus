package pk2;

/* loaded from: classes3.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.j9 f355843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(pk2.j9 j9Var) {
        super(1);
        this.f355843d = j9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        pk2.j9 j9Var = this.f355843d;
        java.lang.Integer num = j9Var.f355889e;
        if (num != null && intValue == num.intValue()) {
            j9Var.f355889e = null;
        }
        return jz5.f0.f302826a;
    }
}
