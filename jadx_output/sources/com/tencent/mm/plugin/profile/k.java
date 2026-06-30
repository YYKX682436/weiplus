package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.o f153508d;

    public k(com.tencent.mm.plugin.profile.o oVar) {
        this.f153508d = oVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.profile.o oVar = this.f153508d;
        oVar.getClass();
        com.tencent.mars.xlog.Log.i("BizProfileMenuController", "Interaction notification button clicked");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.profile.c(oVar.f153544d.g() == sr3.a.f411830f, oVar, null), 3, null);
        return true;
    }
}
