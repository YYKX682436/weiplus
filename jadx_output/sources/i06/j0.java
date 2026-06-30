package i06;

/* loaded from: classes16.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k0 f286665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(i06.k0 k0Var) {
        super(0);
        this.f286665d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        java.util.List parameters = this.f286665d.getParameters();
        if (!parameters.isEmpty()) {
            java.util.Iterator it = parameters.iterator();
            while (it.hasNext()) {
                if (i06.o4.h(((i06.u2) ((f06.o) it.next())).i())) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
