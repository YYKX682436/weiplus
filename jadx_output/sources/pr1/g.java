package pr1;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f357939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f357940e;

    public g(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView, int i17) {
        this.f357940e = brandServiceSortView;
        this.f357939d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog run");
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = this.f357940e;
        java.util.List<fb5.n> datas = brandServiceSortView.getDatas();
        int i17 = this.f357939d;
        if (i17 < 0 || datas == null || i17 >= datas.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog run refresh all");
            brandServiceSortView.i();
        } else {
            datas.remove(i17);
            fb5.m adapter = brandServiceSortView.getAdapter();
            adapter.c(adapter.f260894d);
        }
    }
}
