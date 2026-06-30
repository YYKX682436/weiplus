package l45;

/* loaded from: classes10.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l45.l f316452d;

    public j(l45.l lVar) {
        this.f316452d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l45.l lVar = this.f316452d;
        try {
            java.util.Iterator it = lVar.f316459h.f316463d.iterator();
            while (it.hasNext()) {
                ((dl.b) it.next()).z();
            }
            lVar.f316459h.p();
        } catch (java.lang.Exception unused) {
        }
    }
}
