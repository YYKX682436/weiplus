package q42;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q42.l f360067g;

    public g(q42.l lVar, int i17, long j17, java.lang.String str) {
        this.f360067g = lVar;
        this.f360064d = i17;
        this.f360065e = j17;
        this.f360066f = str;
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
            if (bVar.f402932b == 4 && bVar.f402933c == this.f360064d && (mVar = this.f360067g.f360080a) != null) {
                ((g42.f) mVar).Di(this.f360065e, bVar, this.f360066f);
            }
        }
    }
}
