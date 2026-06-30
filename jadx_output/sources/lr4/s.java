package lr4;

/* loaded from: classes11.dex */
public final class s implements lr4.d, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public kr4.g f320762d;

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(menuInfo, "menuInfo");
        kr4.g gVar = this.f320762d;
        if (kotlin.jvm.internal.o.b(gVar != null ? gVar.field_sessionId : null, "w1wsayhisessionholder@w1wmsg")) {
            return;
        }
        menu.add(0, 2, 0, com.tencent.mm.R.string.f490367t0);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f320762d = null;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        kr4.g gVar = this.f320762d;
        if (gVar == null || menuItem.getItemId() != 2) {
            return;
        }
        fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
        if (g0Var.Bi().deleteNotify(gVar.systemRowid, false)) {
            kr4.n Vi = g0Var.Vi();
            java.lang.String field_sessionId = gVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            kr4.o y07 = Vi.y0(field_sessionId);
            Vi.f311521f.remove(field_sessionId);
            Vi.f311520e.remove(y07.field_talkerUserName + '_' + y07.field_selfUserName);
            Vi.delete((l75.f0) y07, false, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            android.database.Cursor B = Vi.f311519d.B("select rowid from W1wSessionInfo  where selfUserName = '" + y07.field_selfUserName + "' limit 1", null);
            try {
                boolean z17 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (!z17) {
                    fr4.g0 g0Var2 = (fr4.g0) i95.n0.c(fr4.g0.class);
                    java.lang.String field_selfUserName = y07.field_selfUserName;
                    kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
                    g0Var2.getClass();
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = g0Var2.f265827n;
                    if (((java.lang.Boolean) concurrentHashMap.get(field_selfUserName)) != null) {
                    }
                }
                g0Var.Bi().doNotify(gVar.field_sessionId, 6, gVar);
                kr4.k Ai = g0Var.Ai();
                kr4.e eVar = new kr4.e();
                eVar.field_username = gVar.field_sessionId;
                Ai.delete(eVar, new java.lang.String[0]);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(B, th6);
                    throw th7;
                }
            }
        }
        c01.w9.h(gVar.field_sessionId, new lr4.r(gVar));
    }
}
