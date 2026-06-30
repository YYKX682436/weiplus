package pi0;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f354739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yz5.l lVar) {
        super(1);
        this.f354739d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (kotlin.Result.m527isFailureimpl(value)) {
            value = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) value;
        this.f354739d.invoke(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        return jz5.f0.f302826a;
    }
}
