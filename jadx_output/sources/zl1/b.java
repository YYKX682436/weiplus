package zl1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.t f473571d;

    public b(zl1.t tVar) {
        this.f473571d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            zl1.t tVar = this.f473571d;
            if (i17 >= tVar.f473620i.size()) {
                return;
            }
            tVar.g(tVar.f473616e.getChildAt(i17), (zl1.r) tVar.f473620i.get(i17));
            i17++;
        }
    }
}
