package u56;

/* loaded from: classes16.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u56.g f424824d;

    public f(u56.g gVar) {
        this.f424824d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u56.g gVar = this.f424824d;
        int size = gVar.f424825d.size();
        int i17 = 0;
        if (size < gVar.f424826e) {
            int i18 = gVar.f424827f - size;
            while (i17 < i18) {
                gVar.f424825d.add(gVar.a());
                i17++;
            }
            return;
        }
        int i19 = gVar.f424827f;
        if (size > i19) {
            int i27 = size - i19;
            while (i17 < i27) {
                gVar.f424825d.poll();
                i17++;
            }
        }
    }
}
