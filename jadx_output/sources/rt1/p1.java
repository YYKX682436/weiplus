package rt1;

/* loaded from: classes7.dex */
public final class p1 implements rt1.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final qt1.g f399472a;

    /* renamed from: b, reason: collision with root package name */
    public rt1.b1 f399473b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel f399474c;

    public p1(qt1.g scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f399472a = scene;
    }

    public final kotlinx.coroutines.y0 a() {
        kotlinx.coroutines.y0 a17;
        rt1.b1 b1Var = this.f399473b;
        return (b1Var == null || (a17 = b1Var.a()) == null) ? kotlinx.coroutines.z0.b() : a17;
    }

    public com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel b() {
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = this.f399474c;
        if (carLicensePlateListViewContract$ViewModel != null) {
            return carLicensePlateListViewContract$ViewModel;
        }
        kotlin.jvm.internal.o.o("_viewModel");
        throw null;
    }

    public void c(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel model) {
        kotlin.jvm.internal.o.g(model, "model");
        this.f399474c = model;
        if (kotlin.jvm.internal.o.b(null, b().f94623d)) {
            e();
            return;
        }
        rt1.b1 b1Var = this.f399473b;
        if (b1Var != null) {
            b1Var.b(b().f94623d);
        }
    }

    public void d() {
        android.app.Activity d17;
        rt1.b1 b1Var = this.f399473b;
        if (b1Var == null || (d17 = b1Var.d()) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForCreate get NULL activity");
        } else {
            kotlinx.coroutines.l.d(a(), null, null, new rt1.i1(d17, this, null), 3, null);
        }
    }

    public final void e() {
        kotlinx.coroutines.l.d(a(), null, null, new rt1.o1(this, !kotlin.jvm.internal.o.b(null, b().f94623d), null), 3, null);
    }
}
