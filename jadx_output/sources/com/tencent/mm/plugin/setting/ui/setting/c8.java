package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class c8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.k8 f160901d;

    public c8(com.tencent.mm.plugin.setting.ui.setting.k8 k8Var) {
        this.f160901d = k8Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.k8 k8Var = this.f160901d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = k8Var.P6();
        if (P6 != null) {
            P6.finish();
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = k8Var.P6();
        if (P62 == null) {
            return false;
        }
        P62.setResult(1);
        return false;
    }
}
