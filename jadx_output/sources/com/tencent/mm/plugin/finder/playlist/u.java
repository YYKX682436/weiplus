package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f122463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f122466g;

    public u(o25.y1 y1Var, com.tencent.mm.plugin.finder.playlist.l0 l0Var, android.content.Context context, r45.ev2 ev2Var) {
        this.f122463d = y1Var;
        this.f122464e = l0Var;
        this.f122465f = context;
        this.f122466g = ev2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        com.tencent.mm.plugin.finder.playlist.t tVar = new com.tencent.mm.plugin.finder.playlist.t(this.f122464e, this.f122465f, this.f122466g);
        ((com.tencent.mm.pluginsdk.forward.m) this.f122463d).aj((db5.h4) menuItem, tVar);
    }
}
