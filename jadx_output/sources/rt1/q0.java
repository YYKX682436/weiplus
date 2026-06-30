package rt1;

/* loaded from: classes7.dex */
public final class q0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI f399476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399477e;

    public q0(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI, java.lang.String str) {
        this.f399476d = carLicensePlateListUI;
        this.f399477e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getGroupId() == 0 && menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI = this.f399476d;
            java.lang.String string = carLicensePlateListUI.getString(com.tencent.mm.R.string.aqy);
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI2 = this.f399476d;
            db5.e1.B(carLicensePlateListUI, string, "", carLicensePlateListUI2.getString(com.tencent.mm.R.string.f490367t0), carLicensePlateListUI2.getString(com.tencent.mm.R.string.f490347sg), new rt1.p0(carLicensePlateListUI2, this.f399477e), null, com.tencent.mm.R.color.f478622ch);
        }
    }
}
