package k14;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.k f303338d;

    public h(k14.k kVar) {
        this.f303338d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "check short link timeout");
        k14.k kVar = this.f303338d;
        kVar.f303350n.set(true);
        kVar.a();
        k14.u uVar = kVar.f303343d;
        if (uVar != null) {
            uVar.a(kVar.f303344e, false, null);
        }
    }
}
