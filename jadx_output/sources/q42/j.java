package q42;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f360074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q42.l f360076f;

    public j(q42.l lVar, long j17, java.lang.String str) {
        this.f360076f = lVar;
        this.f360074d = j17;
        this.f360075e = str;
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
            if (bVar.f402932b == 7 && (mVar = this.f360076f.f360080a) != null) {
                ((g42.f) mVar).Di(this.f360074d, bVar, this.f360075e);
            }
        }
    }
}
