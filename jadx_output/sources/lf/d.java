package lf;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf.e f318177d;

    public d(lf.e eVar) {
        this.f318177d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        lf.e eVar = this.f318177d;
        java.util.List list = eVar.f318185n;
        if (list != null && ((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            lf.e.a(eVar, eVar.f318185n, -1, "timeout", null);
            ((java.util.concurrent.CopyOnWriteArrayList) eVar.f318185n).clear();
        }
        java.util.List list2 = eVar.f318186o;
        if (list2 == null || ((java.util.concurrent.CopyOnWriteArrayList) list2).size() <= 0) {
            return;
        }
        lf.e.a(eVar, eVar.f318186o, -1, "timeout", null);
        ((java.util.concurrent.CopyOnWriteArrayList) eVar.f318186o).clear();
    }
}
