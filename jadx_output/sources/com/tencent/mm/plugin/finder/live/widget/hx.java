package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class hx implements com.tencent.mm.ui.widget.dialog.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f118602a;

    public hx(com.tencent.mm.plugin.finder.live.widget.rx rxVar) {
        this.f118602a = rxVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d1
    public final void onShow() {
        r45.f62 f62Var;
        df2.dd ddVar = df2.od.f230952w;
        com.tencent.mm.plugin.finder.live.widget.rx rxVar = this.f118602a;
        ddVar.a(rxVar.H.getLiveRoomData(), 1, 4, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        java.util.LinkedList linkedList = rxVar.S;
        if (linkedList == null || (f62Var = (r45.f62) kz5.n0.a0(linkedList, rxVar.f0().f438132e)) == null) {
            return;
        }
        ddVar.d(rxVar.H.getLiveRoomData(), ml2.u1.O2, f62Var.getString(0));
    }
}
