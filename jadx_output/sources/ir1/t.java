package ir1;

/* loaded from: classes11.dex */
public final class t implements ir1.w, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f294047d;

    /* renamed from: e, reason: collision with root package name */
    public hr1.e f294048e;

    public t(int i17) {
        this.f294047d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(menuInfo, "menuInfo");
        hr1.e eVar = this.f294048e;
        java.lang.String str = eVar != null ? eVar.field_sessionId : null;
        if (kotlin.jvm.internal.o.b(str, "bizfansnofiticationholder@bizfansmsg") || kotlin.jvm.internal.o.b(str, "bizphotofansnofiticationholder@picfansmsg")) {
            return;
        }
        boolean z17 = true;
        if ((str == null || str.length() == 0) || (!kotlin.jvm.internal.o.b(str, "bizfansgreetholder@bizfansmsg") && !kotlin.jvm.internal.o.b(str, "bizphotofansgreetholder@picfansmsg"))) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        menu.add(0, 2, 0, com.tencent.mm.R.string.f490367t0);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f294048e = null;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hr1.e eVar = this.f294048e;
        if (eVar == null || menuItem.getItemId() != 2) {
            return;
        }
        jr1.i iVar = jr1.i.f301360a;
        int i18 = this.f294047d;
        if (i18 == 5) {
            if (yq1.u0.Vi().deleteNotify(eVar.systemRowid, false)) {
                nr1.k Zi = yq1.u0.Zi();
                java.lang.String field_sessionId = eVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                Zi.y0(field_sessionId, false);
                yq1.u0.Vi().doNotify(eVar.field_sessionId, 6, eVar);
                nr1.b Ui = yq1.u0.Ui();
                hr1.a aVar = new hr1.a();
                aVar.field_openid = eVar.field_sessionId;
                Ui.delete(aVar, new java.lang.String[0]);
                java.lang.String field_talker = eVar.field_talker;
                kotlin.jvm.internal.o.f(field_talker, "field_talker");
                iVar.e(3, r26.n0.Z(field_talker, "@picfansmsg"), i18);
            }
        } else if (yq1.u0.Di().deleteNotify(eVar.systemRowid, false)) {
            hr1.o Ni = yq1.u0.Ni();
            java.lang.String field_sessionId2 = eVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
            Ni.getClass();
            hr1.m y07 = Ni.y0(field_sessionId2);
            Ni.f283361f.remove(field_sessionId2);
            Ni.f283360e.remove(y07.field_talker + '_' + y07.field_senderUserName);
            Ni.delete((l75.f0) y07, false, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            yq1.u0.Di().doNotify(eVar.field_sessionId, 6, eVar);
            hr1.c Bi = yq1.u0.Bi();
            hr1.a aVar2 = new hr1.a();
            aVar2.field_openid = eVar.field_sessionId;
            Bi.delete(aVar2, new java.lang.String[0]);
            java.lang.String field_talker2 = eVar.field_talker;
            kotlin.jvm.internal.o.f(field_talker2, "field_talker");
            iVar.e(3, r26.n0.Z(field_talker2, "@bizfansmsg"), i18);
        }
        c01.w9.h(eVar.field_sessionId, new ir1.s());
    }
}
