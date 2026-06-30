package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class o4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp2.q f121857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 f121858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f121859g;

    public o4(int i17, vp2.q qVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var, androidx.recyclerview.widget.f2 f2Var) {
        this.f121856d = i17;
        this.f121857e = qVar;
        this.f121858f = p4Var;
        this.f121859g = f2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        int i18 = this.f121856d;
        if (i18 != -1) {
            java.lang.Object remove = this.f121857e.f438951e.remove(i18);
            kotlin.jvm.internal.o.f(remove, "removeAt(...)");
            so2.j5 j5Var = (so2.j5) remove;
            vp2.p pVar = j5Var instanceof vp2.p ? (vp2.p) j5Var : null;
            long j17 = (pVar == null || (feedObject = pVar.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0);
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var = this.f121858f;
            p4Var.o(5, j17);
            this.f121859g.notifyItemRemoved(i18);
            long itemId = j5Var.getItemId();
            p4Var.getClass();
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.n4(itemId, null), 2, null);
        }
    }
}
