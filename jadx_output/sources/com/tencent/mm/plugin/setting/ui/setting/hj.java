package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class hj implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity f161114d;

    public hj(com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity) {
        this.f161114d = baseMvvmActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f161114d.finish();
        return false;
    }
}
