package q42;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q42.l f360054g;

    public c(q42.l lVar, int i17, long j17, java.lang.String str) {
        this.f360054g = lVar;
        this.f360051d = i17;
        this.f360052e = j17;
        this.f360053f = str;
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
            if (bVar.f402932b == 1 && bVar.f402933c == this.f360051d && (mVar = this.f360054g.f360080a) != null) {
                ((g42.f) mVar).Di(this.f360052e, bVar, this.f360053f);
            }
        }
    }
}
