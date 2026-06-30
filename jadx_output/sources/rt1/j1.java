package rt1;

/* loaded from: classes7.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f399429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(rt1.p1 p1Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f399429d = p1Var;
        this.f399430e = str;
        this.f399431f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rt1.p1 p1Var = this.f399429d;
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel b17 = p1Var.b();
        java.lang.String oldPlate = this.f399430e;
        kotlin.jvm.internal.o.g(oldPlate, "oldPlate");
        java.lang.String newPlate = this.f399431f;
        kotlin.jvm.internal.o.g(newPlate, "newPlate");
        if (kotlin.jvm.internal.o.b(null, b17.f94623d)) {
            b17.a(newPlate);
        } else {
            com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo = b17.f94623d;
            kotlin.jvm.internal.o.d(mMCarLicensePlateInfo);
            java.util.ArrayList arrayList = mMCarLicensePlateInfo.f94604d;
            int indexOf = arrayList.indexOf(oldPlate);
            if (indexOf >= 0) {
                arrayList.add(indexOf + 1, newPlate);
                arrayList.remove(indexOf);
            } else {
                arrayList.add(newPlate);
            }
        }
        rt1.b1 b1Var = p1Var.f399473b;
        if (b1Var != null) {
            b1Var.b(p1Var.b().f94623d);
        }
        return jz5.f0.f302826a;
    }
}
