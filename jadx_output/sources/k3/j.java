package k3;

/* loaded from: classes13.dex */
public class j implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303794a;

    public j(java.lang.String str) {
        this.f303794a = str;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        k3.k kVar = (k3.k) obj;
        synchronized (k3.l.f303799c) {
            x.n nVar = k3.l.f303800d;
            java.util.ArrayList arrayList = (java.util.ArrayList) nVar.getOrDefault(this.f303794a, null);
            if (arrayList == null) {
                return;
            }
            nVar.remove(this.f303794a);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                ((m3.a) arrayList.get(i17)).accept(kVar);
            }
        }
    }
}
