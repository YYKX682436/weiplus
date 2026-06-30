package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class zc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn.c f200367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.bd f200369f;

    public zc(com.tencent.mm.ui.chatting.component.bd bdVar, rn.c cVar, int i17) {
        this.f200369f = bdVar;
        this.f200367d = cVar;
        this.f200368e = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        rn.c cVar = this.f200367d;
        com.tencent.mm.ui.chatting.component.bd bdVar = this.f200369f;
        if (itemId == 1) {
            android.app.Activity g17 = bdVar.f198732a.f198580d.g();
            java.lang.String x17 = bdVar.f198732a.f198580d.x();
            java.lang.String str = cVar.field_todoid;
            java.lang.String str2 = cVar.field_username;
            boolean v07 = cVar.v0();
            kn.j0.h(g17, x17, str, str2, false, 1, v07 ? 1 : 0, 0, new com.tencent.mm.ui.chatting.component.yc(this));
            return;
        }
        if (itemId != 2) {
            return;
        }
        boolean i18 = kn.j0.i(cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp delete(%s) result:%s", cVar.field_todoid, java.lang.Boolean.valueOf(i18));
        if (i18) {
            bdVar.f198732a.n0(cVar);
            bdVar.f198732a.f199768m.notifyItemRemoved(this.f200368e);
            bdVar.f198732a.p0();
        }
        java.lang.String x18 = bdVar.f198732a.f198580d.x();
        boolean v08 = cVar.v0();
        kn.k0.b(x18, v08 ? 1 : 0, 2, 2, cVar.field_todoid, cVar.field_username);
    }
}
