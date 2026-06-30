package pr1;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f357936d;

    public d(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView) {
        this.f357936d = brandServiceSortView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = this.f357936d;
        if (brandServiceSortView.getMode() == 1) {
            brandServiceSortView.setMode(0);
            brandServiceSortView.e(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.g(brandServiceSortView, brandServiceSortView.f94049t.a(brandServiceSortView.f94050u)));
            brandServiceSortView.setMode(1);
        } else {
            brandServiceSortView.e(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.g(brandServiceSortView, brandServiceSortView.f94049t.a(brandServiceSortView.f94050u)));
        }
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.h(brandServiceSortView);
        brandServiceSortView.E = false;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = brandServiceSortView.D;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        brandServiceSortView.D.dismiss();
        brandServiceSortView.D.setCancelMessage(null);
        brandServiceSortView.D.setDismissMessage(null);
    }
}
