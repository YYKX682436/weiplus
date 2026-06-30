package qb2;

/* loaded from: classes10.dex */
public final class l0 implements qb2.v, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f361233d;

    /* renamed from: e, reason: collision with root package name */
    public qb2.t f361234e;

    public l0(yz5.a callBack) {
        kotlin.jvm.internal.o.g(callBack, "callBack");
        this.f361233d = callBack;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(menuInfo, "menuInfo");
        qb2.t tVar = this.f361234e;
        if (!kotlin.jvm.internal.o.b(tVar != null ? tVar.field_sessionId : null, "findersayhisessionholder")) {
            qb2.t tVar2 = this.f361234e;
            if (!kotlin.jvm.internal.o.b(tVar2 != null ? tVar2.field_sessionId : null, "finder_system_message")) {
                qb2.t tVar3 = this.f361234e;
                if (!kotlin.jvm.internal.o.b(tVar3 != null ? tVar3.field_sessionId : null, "finderaliassessionholder")) {
                    menu.add(0, 2, 0, com.tencent.mm.R.string.f490367t0);
                }
            }
        }
        qb2.t tVar4 = this.f361234e;
        java.lang.String str = tVar4 != null ? tVar4.field_senderUserName : null;
        if (str == null) {
            str = "";
        }
        if (!com.tencent.mm.storage.z3.T3(str)) {
            qb2.t tVar5 = this.f361234e;
            if (!kotlin.jvm.internal.o.b(tVar5 != null ? tVar5.field_sessionId : null, "finderaliassessionholder")) {
                return;
            }
        }
        menu.add(0, 4, 0, com.tencent.mm.R.string.gq8);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f361234e = null;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        qb2.t tVar = this.f361234e;
        if (tVar != null) {
            int itemId = menuItem.getItemId();
            if (itemId != 2) {
                if (itemId != 4) {
                    return;
                }
                ((c61.l7) i95.n0.c(c61.l7.class)).Kj().deleteNotify(tVar.systemRowid, false);
                ((c61.l7) i95.n0.c(c61.l7.class)).Kj().doNotify(tVar.field_sessionId, 6, tVar);
                return;
            }
            android.view.ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
            kotlin.jvm.internal.o.e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) menuInfo;
            java.lang.String str = tVar.field_senderRoleType == 3 ? tVar.field_senderUserName : "";
            kotlin.jvm.internal.o.d(str);
            java.lang.String field_sessionId = tVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            new db2.g(str, field_sessionId).l().K(new qb2.k0(tVar, this, adapterContextMenuInfo));
        }
    }
}
