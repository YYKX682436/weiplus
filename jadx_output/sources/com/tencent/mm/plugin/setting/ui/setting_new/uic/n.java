package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes8.dex */
public final class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f162005d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f162006e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f162007f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f162008g;

    /* renamed from: h, reason: collision with root package name */
    public long f162009h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f162005d = jz5.h.b(com.tencent.mm.plugin.setting.ui.setting_new.uic.m.f162004d);
        this.f162006e = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting_new.uic.i(activity));
    }

    public static final java.lang.String T6(com.tencent.mm.plugin.setting.ui.setting_new.uic.n nVar) {
        nVar.getClass();
        return gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        kotlinx.coroutines.r2 r2Var = this.f162007f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        this.f162007f = O6 != null ? v65.i.b(O6, null, new com.tencent.mm.plugin.setting.ui.setting_new.uic.l(this, null), 1, null) : null;
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = (com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText) findViewById(com.tencent.mm.R.id.d98);
        if (actionBarEditText != null) {
            actionBarEditText.requestFocus();
            actionBarEditText.addTextChangedListener(new com.tencent.mm.plugin.setting.ui.setting_new.uic.k(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kotlinx.coroutines.r2 r2Var = this.f162007f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f162008g;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        kotlinx.coroutines.r2 r2Var = this.f162007f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        this.f162007f = O6 != null ? v65.i.b(O6, null, new com.tencent.mm.plugin.setting.ui.setting_new.uic.l(this, null), 1, null) : null;
    }
}
