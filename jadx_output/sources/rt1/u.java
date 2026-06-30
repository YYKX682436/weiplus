package rt1;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt1.f f399487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI f399488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(qt1.f fVar, com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI) {
        super(0);
        this.f399487d = fVar;
        this.f399488e = carLicensePlateEditUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qt1.f fVar = this.f399487d;
        if (fVar.f366521e == -17500) {
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI = this.f399488e;
            carLicensePlateEditUI.setResult(-2);
            carLicensePlateEditUI.finish();
        } else {
            st1.g.b(fVar);
        }
        return jz5.f0.f302826a;
    }
}
