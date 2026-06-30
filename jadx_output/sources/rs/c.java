package rs;

/* loaded from: classes3.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs.k f399241e;

    public c(rs.k kVar, java.util.ArrayList arrayList) {
        this.f399241e = kVar;
        this.f399240d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f399240d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rs.k kVar = this.f399241e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f399280l.remove(arrayList);
                return;
            }
            kVar.D((androidx.recyclerview.widget.k3) it.next());
        }
    }
}
