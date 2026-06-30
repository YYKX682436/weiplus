package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class ib implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.nb f161152d;

    public ib(com.tencent.mm.plugin.setting.ui.setting.nb nbVar) {
        this.f161152d = nbVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f161152d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
