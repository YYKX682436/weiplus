package hr3;

/* loaded from: classes11.dex */
public class rb extends hr3.nb {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference f283948h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference) {
        super(normalUserFooterPreference);
        this.f283948h = normalUserFooterPreference;
    }

    @Override // hr3.nb, hr3.eb, hr3.va
    public void f() {
        super.f();
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f283948h;
        android.view.View view = normalUserFooterPreference.f153734x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        normalUserFooterPreference.C1.setVisibility(8);
        normalUserFooterPreference.D1.setVisibility(8);
        normalUserFooterPreference.G1.setVisibility(8);
        normalUserFooterPreference.E1.setVisibility(8);
        normalUserFooterPreference.F1.setVisibility(8);
        android.view.View view2 = normalUserFooterPreference.f153738z1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        normalUserFooterPreference.H1.setVisibility(8);
        normalUserFooterPreference.f153737y1.setVisibility(0);
        android.view.View view3 = normalUserFooterPreference.f153735x1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (normalUserFooterPreference.L.o2()) {
            normalUserFooterPreference.f153733p1.setText(normalUserFooterPreference.K1.getString(com.tencent.mm.R.string.bfh));
            normalUserFooterPreference.H1.setVisibility(0);
        } else {
            normalUserFooterPreference.f153733p1.setText(normalUserFooterPreference.K1.getString(com.tencent.mm.R.string.bfc));
        }
        normalUserFooterPreference.f153736y0.setOnClickListener(new hr3.ob(this));
        normalUserFooterPreference.f153733p1.setOnClickListener(new hr3.qb(this));
    }

    @Override // hr3.va
    public void g() {
        com.tencent.mm.storage.z3 z3Var = this.f283948h.L;
        if (z3Var == null || !z3Var.r2()) {
            k(false, true);
        } else {
            j();
        }
    }

    @Override // hr3.nb, hr3.eb, hr3.va
    public void i() {
        super.i();
    }

    @Override // hr3.nb, hr3.va, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
    }
}
