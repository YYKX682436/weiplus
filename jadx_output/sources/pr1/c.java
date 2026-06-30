package pr1;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f357935d;

    public c(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView) {
        this.f357935d = brandServiceSortView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = this.f357935d;
        if (brandServiceSortView.E) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1378L, 8L, 1L, false);
            brandServiceSortView.E = false;
            brandServiceSortView.D = db5.e1.Q(brandServiceSortView.getContext(), null, brandServiceSortView.getContext().getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        }
    }
}
