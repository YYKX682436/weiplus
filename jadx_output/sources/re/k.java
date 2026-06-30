package re;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f394274d;

    public k(re.n nVar) {
        this.f394274d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK;
        re.n nVar = this.f394274d;
        nVar.d(wdVar);
        re.n.b(nVar, wdVar);
    }
}
