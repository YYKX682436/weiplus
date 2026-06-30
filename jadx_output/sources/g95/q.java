package g95;

/* loaded from: classes9.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f269817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.HashSet hashSet) {
        super(1);
        this.f269817d = hashSet;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        g15.a aVar = (g15.a) obj;
        if (aVar.k() == 11) {
            if (this.f269817d.contains(java.lang.Long.valueOf(aVar.l()))) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
