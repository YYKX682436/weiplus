package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.o f153526d;

    public m(com.tencent.mm.plugin.profile.o oVar) {
        this.f153526d = oVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.profile.o oVar = this.f153526d;
        if (oVar.f153544d.a()) {
            com.tencent.mm.plugin.profile.s1.e(oVar.f153541a, oVar.f153544d.g().f411832d, 1338);
            return false;
        }
        oVar.c();
        return false;
    }
}
