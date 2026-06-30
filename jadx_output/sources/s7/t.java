package s7;

/* loaded from: classes16.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f403833a = null;

    public void a(s7.r rVar) {
        if (this.f403833a == null) {
            this.f403833a = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < this.f403833a.size(); i17++) {
            if (((s7.r) this.f403833a.get(i17)).f403785a.f403841b > rVar.f403785a.f403841b) {
                this.f403833a.add(i17, rVar);
                return;
            }
        }
        this.f403833a.add(rVar);
    }

    public void b(s7.t tVar) {
        if (tVar.f403833a == null) {
            return;
        }
        if (this.f403833a == null) {
            this.f403833a = new java.util.ArrayList(tVar.f403833a.size());
        }
        java.util.Iterator it = tVar.f403833a.iterator();
        while (it.hasNext()) {
            a((s7.r) it.next());
        }
    }

    public java.lang.String toString() {
        if (this.f403833a == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f403833a.iterator();
        while (it.hasNext()) {
            sb6.append(((s7.r) it.next()).toString());
            sb6.append('\n');
        }
        return sb6.toString();
    }
}
