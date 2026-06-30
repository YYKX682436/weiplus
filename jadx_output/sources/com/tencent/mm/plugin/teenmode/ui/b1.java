package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class b1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianUI f172933d;

    public b1(com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI) {
        this.f172933d = bindGuardianUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f172933d.finish();
        return true;
    }
}
