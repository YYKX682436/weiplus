package n72;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.q f335262d;

    public j(n72.q qVar) {
        this.f335262d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        n72.q qVar = this.f335262d;
        qVar.E = qVar.f335272d.getBitmap();
        s75.d.b(new n72.l(qVar), "saveFaceBitmap");
    }
}
