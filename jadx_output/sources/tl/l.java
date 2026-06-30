package tl;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.n f420058d;

    public l(tl.n nVar) {
        this.f420058d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tl.n nVar = this.f420058d;
        nVar.f420061a.h();
        tl.a aVar = nVar.f420061a.f420125e;
        if (aVar != null) {
            aVar.a();
        }
    }
}
