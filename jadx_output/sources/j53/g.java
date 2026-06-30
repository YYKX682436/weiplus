package j53;

/* loaded from: classes10.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j53.h f297811d;

    public g(j53.h hVar) {
        this.f297811d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j53.h hVar = this.f297811d;
        hVar.f297812a.finish();
        hVar.f297812a.overridePendingTransition(0, 0);
    }
}
