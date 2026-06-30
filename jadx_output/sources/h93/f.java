package h93;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f279699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.Set set) {
        super(1);
        this.f279699d = set;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(this.f279699d.contains(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue())));
    }
}
