package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ko extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f134975d;

    /* renamed from: e, reason: collision with root package name */
    public final ey2.k0 f134976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f134976e = (ey2.k0) a17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Finder.LocationUIC", "[onActivityResult] requestCode=" + i17 + " resultCode=" + i18);
        ey2.k0 k0Var = this.f134976e;
        if (i17 == 563) {
            ya2.o1.t4(k0Var, false, null, 2, null);
        } else {
            if (i17 != 564) {
                return;
            }
            this.f134975d = k0Var.N6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ey2.k0 k0Var = this.f134976e;
        boolean N6 = k0Var.N6();
        this.f134975d = N6;
        if (N6) {
            ya2.o1.t4(k0Var, false, null, 2, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f134975d) {
            return;
        }
        ey2.k0 k0Var = this.f134976e;
        boolean N6 = k0Var.N6();
        this.f134975d = N6;
        if (N6) {
            ya2.o1.t4(k0Var, false, null, 2, null);
        }
    }
}
