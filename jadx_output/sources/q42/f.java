package q42;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f360061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q42.l f360063f;

    public f(q42.l lVar, long j17, java.lang.String str) {
        this.f360063f = lVar;
        this.f360061d = j17;
        this.f360062e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        q42.m mVar;
        java.util.ArrayList arrayList = (java.util.ArrayList) l42.n.Ai().Bi();
        if (arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s42.b bVar = (s42.b) it.next();
            if (bVar.f402932b == 3 && (mVar = this.f360063f.f360080a) != null) {
                ((g42.f) mVar).Di(this.f360061d, bVar, this.f360062e);
            }
        }
    }
}
