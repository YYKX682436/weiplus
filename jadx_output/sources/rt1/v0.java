package rt1;

/* loaded from: classes3.dex */
public final class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI f399492d;

    public v0(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI) {
        this.f399492d = carLicensePlateListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f399492d.onBackPressed();
        return true;
    }
}
