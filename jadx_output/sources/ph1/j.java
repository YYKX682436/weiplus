package ph1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f354333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph1.l f354334e;

    public j(ph1.l lVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f354334e = lVar;
        this.f354333d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f354334e.b(this.f354333d, false);
    }
}
