package rt1;

/* loaded from: classes7.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI f399475d;

    public q(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI) {
        this.f399475d = carLicensePlateEditUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f399475d.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
