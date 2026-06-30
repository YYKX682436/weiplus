package q01;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f359314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17) {
        super(1);
        this.f359314d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object value = it.getValue();
        kotlin.jvm.internal.o.f(value, "<get-value>(...)");
        return java.lang.Boolean.valueOf(((java.lang.Number) value).longValue() < this.f359314d);
    }
}
