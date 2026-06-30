package kn;

/* loaded from: classes11.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn.l f309402d;

    public h(kn.l lVar) {
        this.f309402d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "check short link timeout");
        kn.l lVar = this.f309402d;
        lVar.f309418m.set(true);
        lVar.b();
        lVar.a(false, null, -1);
    }
}
