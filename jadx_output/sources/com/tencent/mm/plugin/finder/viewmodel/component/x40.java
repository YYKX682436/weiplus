package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x40 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136398d;

    public x40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f136398d = f50Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.viewmodel.component.f50.P6(this.f136398d);
        android.view.View actionView = it.getActionView();
        if (actionView == null) {
            return true;
        }
        hc2.v0.e(actionView, "personal_set", 0, 29309, false, true, null, null, 106, null);
        return true;
    }
}
