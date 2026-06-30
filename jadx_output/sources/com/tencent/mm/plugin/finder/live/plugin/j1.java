package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113045d;

    public j1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f113045d = v3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113045d;
        km2.b bVar = v3Var.S;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "onClickReplayBtn:info is null, returning");
        } else if (bVar.f309066p == 0) {
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "onClickReplayBtn:replayPrivilege is false");
        } else {
            r45.nw1 nw1Var = bVar.f309070t;
            if (nw1Var == null) {
                com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "onClickReplayBtn.liveInfo is null");
            } else {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(nw1Var.getInteger(31));
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "onClickReplayBtn:Current replay status: " + valueOf);
                if (valueOf != null && valueOf.intValue() == 1) {
                    com.tencent.mm.plugin.finder.live.util.y.m(v3Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.b2(v3Var, bVar, null), 3, null);
                } else if (valueOf != null && valueOf.intValue() == 0) {
                    v3Var.J1(bVar);
                } else if (valueOf != null && valueOf.intValue() == 3) {
                    r45.sl1 sl1Var = bVar.f309071u;
                    if ((sl1Var != null ? sl1Var.getInteger(0) : 0) != 0) {
                        com.tencent.mm.plugin.finder.live.util.y.m(v3Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.z2(v3Var, new com.tencent.mm.plugin.finder.live.plugin.c2(bVar, v3Var), null), 3, null);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
