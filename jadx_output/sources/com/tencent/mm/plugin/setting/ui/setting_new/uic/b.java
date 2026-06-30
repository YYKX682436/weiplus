package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes11.dex */
public final class b extends wm3.a implements l75.z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.u().c().a(this);
        new r45.nn3().b().l().h(new com.tencent.mm.plugin.setting.ui.setting_new.uic.a(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.u().c().e(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(getContext());
        if (a17 == null || (stateCenter = a17.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new r24.b());
    }
}
