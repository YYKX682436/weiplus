package d0;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.b f225176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z0.b bVar) {
        super(2);
        this.f225176d = bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        p2.s layoutDirection = (p2.s) obj2;
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        return java.lang.Integer.valueOf(((z0.e) this.f225176d).a(0, intValue, layoutDirection));
    }
}
