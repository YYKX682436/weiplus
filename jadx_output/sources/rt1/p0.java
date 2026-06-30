package rt1;

/* loaded from: classes7.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI f399470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399471e;

    public p0(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI, java.lang.String str) {
        this.f399470d = carLicensePlateListUI;
        this.f399471e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rt1.z0 z0Var = this.f399470d.f94617f;
        if (z0Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        rt1.p1 p1Var = (rt1.p1) z0Var;
        java.lang.String plateNo = this.f399471e;
        kotlin.jvm.internal.o.g(plateNo, "plateNo");
        kotlinx.coroutines.l.d(p1Var.a(), null, null, new rt1.g1(plateNo, p1Var, null), 3, null);
    }
}
