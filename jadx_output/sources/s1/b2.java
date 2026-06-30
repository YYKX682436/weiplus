package s1;

/* loaded from: classes14.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k2 f401993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(s1.k2 k2Var) {
        super(0);
        this.f401993d = k2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s1.q0 a17 = this.f401993d.a();
        java.util.Iterator it = ((java.util.LinkedHashMap) a17.f402065e).entrySet().iterator();
        while (it.hasNext()) {
            ((s1.k0) ((java.util.Map.Entry) it.next()).getValue()).f402022d = true;
        }
        u1.w wVar = a17.f402061a;
        if (!wVar.X) {
            wVar.I(false);
        }
        return jz5.f0.f302826a;
    }
}
