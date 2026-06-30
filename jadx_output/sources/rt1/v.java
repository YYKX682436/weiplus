package rt1;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI f399490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI, java.lang.String str) {
        super(0);
        this.f399490d = carLicensePlateEditUI;
        this.f399491e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI.f94609i;
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI = this.f399490d;
        carLicensePlateEditUI.getClass();
        carLicensePlateEditUI.setResult(-1, new android.content.Intent().putExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT", this.f399491e));
        carLicensePlateEditUI.finish();
        return jz5.f0.f302826a;
    }
}
