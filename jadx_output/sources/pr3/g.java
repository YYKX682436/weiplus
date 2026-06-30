package pr3;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f357975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list) {
        super(1);
        this.f357975d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return (pr3.e) this.f357975d.get(((java.lang.Number) obj).intValue());
    }
}
