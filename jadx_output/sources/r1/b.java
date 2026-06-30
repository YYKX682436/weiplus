package r1;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f368569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar) {
        super(1);
        this.f368569d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        m1.a e17 = (m1.a) obj;
        kotlin.jvm.internal.o.g(e17, "e");
        if (e17 instanceof r1.d) {
            return (java.lang.Boolean) this.f368569d.invoke(e17);
        }
        throw new java.lang.IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
