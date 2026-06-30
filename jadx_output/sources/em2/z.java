package em2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f255186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gk2.e eVar) {
        super(1);
        this.f255186d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String uId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(uId, "uId");
        java.util.List Z6 = ((mm2.o4) this.f255186d.a(mm2.o4.class)).Z6();
        kotlin.jvm.internal.o.f(Z6, "<get-allLinkMicUserList>(...)");
        synchronized (Z6) {
            java.util.Iterator it = Z6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((km2.q) obj2).f309170a, uId)) {
                    break;
                }
            }
        }
        return (km2.q) obj2;
    }
}
