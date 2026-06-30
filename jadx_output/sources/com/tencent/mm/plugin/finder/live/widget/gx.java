package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class gx implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f118479d;

    public gx(com.tencent.mm.plugin.finder.live.widget.rx rxVar) {
        this.f118479d = rxVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.f62 f62Var;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.widget.rx rxVar = this.f118479d;
        if (itemId == rxVar.V) {
            df2.dd ddVar = df2.od.f230952w;
            ddVar.a(rxVar.H.getLiveRoomData(), 2, 4, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            java.util.LinkedList linkedList = rxVar.S;
            if (linkedList != null && (f62Var = (r45.f62) kz5.n0.a0(linkedList, rxVar.f0().f438132e)) != null) {
                ddVar.c(rxVar.H.getLiveRoomData(), ml2.t1.R2, f62Var.getString(0));
            }
            df2.od odVar = (df2.od) rxVar.H.controller(df2.od.class);
            if (odVar != null) {
                df2.od.d7(odVar, null, 1, null);
            }
            com.tencent.mm.plugin.finder.live.widget.e0.t(rxVar, false, 1, null);
        }
    }
}
