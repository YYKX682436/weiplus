package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class xh implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f200232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.yh f200234f;

    public xh(com.tencent.mm.ui.chatting.component.yh yhVar, java.util.LinkedList linkedList, java.lang.String str) {
        this.f200234f = yhVar;
        this.f200232d = linkedList;
        this.f200233e = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.component.yh yhVar = this.f200234f;
        if (itemId == 0) {
            ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) yhVar.f198580d.f460708c.a(sb5.n.class))).n0(-1L, this.f200232d, 1, 0);
        } else {
            if (itemId != 1) {
                return;
            }
            com.tencent.mm.roomsdk.model.factory.a c17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(yhVar.f198580d.u().d1()).c(this.f200233e, yhVar.f198580d.u().d1());
            c17.c(yhVar.f198580d.g(), yhVar.f198580d.s().getString(com.tencent.mm.R.string.f490573yv), yhVar.f198580d.s().getString(com.tencent.mm.R.string.i4j), true, true, new com.tencent.mm.ui.chatting.component.wh(this, c17));
        }
    }
}
