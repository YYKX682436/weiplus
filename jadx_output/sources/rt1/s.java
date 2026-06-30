package rt1;

/* loaded from: classes7.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI f399483d;

    public s(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI) {
        this.f399483d = carLicensePlateEditUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI = this.f399483d;
        rt1.l lVar = carLicensePlateEditUI.f94610e;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("inputLayoutController");
            throw null;
        }
        java.lang.String str = lVar.f399447d;
        if (kotlin.jvm.internal.o.b(str, carLicensePlateEditUI.f94613h)) {
            carLicensePlateEditUI.setResult(-1, new android.content.Intent().putExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT", str));
            carLicensePlateEditUI.finish();
        } else {
            kotlinx.coroutines.l.d(carLicensePlateEditUI.f94608d, null, null, new rt1.w(carLicensePlateEditUI, str, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
