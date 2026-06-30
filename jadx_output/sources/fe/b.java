package fe;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe.g f261347d;

    public b(fe.g gVar) {
        this.f261347d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fe.g gVar = this.f261347d;
        yg.h hVar = gVar.f261358f;
        if (hVar != null) {
            gVar.f261360h = ((hVar.c() - r2) * 1000.0f) / ((float) (android.os.SystemClock.elapsedRealtime() - hVar.f462065b.get(gVar.f261359g)));
        }
    }
}
