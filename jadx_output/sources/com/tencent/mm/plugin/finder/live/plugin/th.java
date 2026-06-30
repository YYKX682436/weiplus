package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class th implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wh f114401e;

    public th(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.wh whVar) {
        this.f114400d = viewGroup;
        this.f114401e = whVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBgDecoration by running delay task. ");
        android.view.ViewGroup viewGroup = this.f114400d;
        sb6.append(viewGroup.getContext());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveDecorationPlugin", sb6.toString());
        android.content.Context context = viewGroup.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if ((mMActivity == null || mMActivity.isDestroyed()) ? false : true) {
            android.content.Context context2 = viewGroup.getContext();
            com.tencent.mm.ui.MMActivity mMActivity2 = context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null;
            if ((mMActivity2 == null || mMActivity2.isFinishing()) ? false : true) {
                com.tencent.mm.plugin.finder.live.plugin.wh whVar = this.f114401e;
                if (((mm2.c1) whVar.P0(mm2.c1.class)).U7()) {
                    return;
                }
                com.tencent.mm.plugin.finder.live.plugin.wh.t1(whVar, ((fy2.d) whVar.P0(fy2.d.class)).f267240g);
            }
        }
    }
}
