package s7;

/* loaded from: classes16.dex */
public class m implements s7.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f403715a;

    public m(java.util.List list) {
        this.f403715a = list;
    }

    @Override // s7.i
    public boolean a(s7.s sVar, s7.y1 y1Var) {
        java.util.Iterator it = this.f403715a.iterator();
        while (it.hasNext()) {
            if (s7.x.g(sVar, (s7.u) it.next(), y1Var)) {
                return false;
            }
        }
        return true;
    }

    public java.lang.String toString() {
        return "not(" + this.f403715a + ")";
    }
}
