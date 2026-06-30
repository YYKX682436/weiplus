package yd;

/* loaded from: classes7.dex */
public class m implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd.n f460954d;

    public m(yd.n nVar) {
        this.f460954d = nVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        yd.n nVar = this.f460954d;
        ((java.util.ArrayList) nVar.f460955g).clear();
        yd.r rVar = nVar.f460957i;
        if (rVar != null) {
            java.util.List list = nVar.f460955g;
            ce.t tVar = (ce.t) rVar;
            tVar.getClass();
            try {
                tVar.f40724b.X(((ae.a) tVar.f40723a).w(), list);
            } catch (java.lang.Exception unused) {
            }
        }
        java.util.List list2 = nVar.f460955g;
        java.lang.StringBuilder sb6 = nVar.f460956h;
        sb6.setLength(0);
        java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
        while (it.hasNext()) {
            yd.v vVar = (yd.v) it.next();
            sb6.append(vVar.f460972a);
            sb6.append(": ");
            sb6.append(vVar.f460973b);
            sb6.append("\n");
        }
        nVar.setText(sb6);
        return true;
    }
}
