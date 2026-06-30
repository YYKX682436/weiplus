package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class ob implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.tb f161386d;

    public ob(com.tencent.mm.plugin.setting.ui.setting.tb tbVar) {
        this.f161386d = tbVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.tb tbVar = this.f161386d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = tbVar.P6();
        if (P6 != null) {
            P6.setResult(2);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = tbVar.P6();
        if (P62 == null) {
            return false;
        }
        P62.finish();
        return false;
    }
}
