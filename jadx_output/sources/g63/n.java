package g63;

/* loaded from: classes8.dex */
public final class n implements g63.d, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f269143d;

    /* renamed from: e, reason: collision with root package name */
    public z53.i f269144e;

    /* renamed from: f, reason: collision with root package name */
    public int f269145f;

    /* renamed from: g, reason: collision with root package name */
    public int f269146g;

    public n(yz5.a callBack) {
        kotlin.jvm.internal.o.g(callBack, "callBack");
        this.f269143d = callBack;
    }

    public void a(android.view.View view, int i17, z53.i conv, int i18) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(conv, "conv");
        this.f269144e = conv;
        this.f269145f = i17;
        this.f269146g = i18;
        rl5.r rVar = new rl5.r(view.getContext());
        rVar.L = this;
        int i19 = com.tencent.mm.view.TouchableLayout.f213511d;
        rVar.g(view, i17, 0L, this, this, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        rVar.m();
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(menuInfo, "menuInfo");
        z53.i iVar = this.f269144e;
        if ((iVar != null ? java.lang.Boolean.valueOf(iVar.u0()) : null) != null) {
            z53.i iVar2 = this.f269144e;
            if (iVar2 != null && iVar2.u0()) {
                menu.add(0, 3, 0, com.tencent.mm.R.string.bl9);
                return;
            }
        }
        z53.i iVar3 = this.f269144e;
        if (iVar3 != null && iVar3.field_unReadCount == 0) {
            menu.add(0, 1, 0, com.tencent.mm.R.string.bla);
        } else {
            menu.add(0, 0, 0, com.tencent.mm.R.string.bl_);
        }
        menu.add(0, 3, 0, com.tencent.mm.R.string.bl9);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f269144e = null;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z18 = false;
        objArr[0] = java.lang.Integer.valueOf(menuItem.getItemId());
        z53.i iVar = this.f269144e;
        objArr[1] = iVar != null ? iVar.field_sessionId : null;
        com.tencent.mars.xlog.Log.i("GameLife.ConversationOnLongClickListener", "menuItem.itemId:%d,sessionId:%s", objArr);
        z53.i iVar2 = this.f269144e;
        if (iVar2 != null) {
            int itemId = menuItem.getItemId();
            yz5.a aVar = this.f269143d;
            if (itemId == 0) {
                z53.t Ui = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
                java.lang.String field_sessionId = iVar2.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                if (Ui.y0(field_sessionId)) {
                    if (aVar != null) {
                        return;
                    }
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("GameLife.ConversationOnLongClickListener", "clearUnreadCount failed. sessionId=" + iVar2.field_sessionId);
                    return;
                }
            }
            if (itemId == 1) {
                z53.t Ui2 = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
                java.lang.String field_sessionId2 = iVar2.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
                if (com.tencent.mm.storage.z3.a4(field_sessionId2)) {
                    z17 = true;
                } else {
                    com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "check sessionId failed");
                    z17 = false;
                }
                if (z17) {
                    z53.i z07 = Ui2.z0(field_sessionId2);
                    z07.field_unReadCount = 1;
                    z18 = Ui2.update(z07.systemRowid, z07, false);
                    Ui2.doNotify("single", 5, z07);
                    com.tencent.mars.xlog.Log.i("GameLife.ConversationStorage", "[addUnreadCount] ret=" + z18 + " sessionId=" + field_sessionId2);
                }
                if (z18) {
                    if (aVar != null) {
                        return;
                    }
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("GameLife.ConversationOnLongClickListener", "markUnread failed. sessionId=" + iVar2.field_sessionId);
                    return;
                }
            }
            if (itemId != 3) {
                return;
            }
            boolean u07 = iVar2.u0();
            com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
            if (u07) {
                int i18 = this.f269145f + 1;
                int i19 = this.f269146g;
                java.lang.String field_sessionId3 = iVar2.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId3, "field_sessionId");
                dVar.e(i18, 1L, i19, field_sessionId3, 0L, "", 0L, "", iVar2.t0(), e63.a.f249817a, (r35 & 1024) != 0 ? null : null);
            } else {
                y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(iVar2.field_selfUserName);
                if (Di != null) {
                    int i27 = this.f269145f + 1;
                    int i28 = this.f269146g;
                    java.lang.String field_sessionId4 = iVar2.field_sessionId;
                    kotlin.jvm.internal.o.f(field_sessionId4, "field_sessionId");
                    long j17 = Di.field_accountType;
                    java.lang.String field_selfUserName = iVar2.field_selfUserName;
                    kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
                    y53.m mVar = iVar2.F;
                    kotlin.jvm.internal.o.d(mVar);
                    long j18 = mVar.field_accountType;
                    java.lang.String field_talker = iVar2.field_talker;
                    kotlin.jvm.internal.o.f(field_talker, "field_talker");
                    dVar.e(i27, 92L, i28, field_sessionId4, j17, field_selfUserName, j18, field_talker, iVar2.t0(), e63.a.f249817a, (r35 & 1024) != 0 ? null : null);
                }
            }
            android.view.ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
            kotlin.jvm.internal.o.e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) menuInfo;
            boolean Bi = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Bi(iVar2.field_sessionId);
            if (!Bi) {
                com.tencent.mars.xlog.Log.e("GameLife.ConversationOnLongClickListener", "longclick delete conversation fail");
            } else if (iVar2.u0()) {
                pq5.h.a().i(g63.m.f269141a).B();
            } else {
                pq5.h.a().i(new g63.l(iVar2, Bi, adapterContextMenuInfo)).B();
            }
        }
    }
}
