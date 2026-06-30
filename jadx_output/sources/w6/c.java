package w6;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w6.e f443074d;

    public c(w6.e eVar) {
        this.f443074d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w6.e eVar = this.f443074d;
        eVar.getClass();
        while (true) {
            try {
                eVar.b((w6.d) eVar.f443091d.remove());
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }
}
