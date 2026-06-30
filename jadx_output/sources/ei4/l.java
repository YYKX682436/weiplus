package ei4;

/* loaded from: classes11.dex */
public final class l implements yz5.q, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusConversationFragment f253225d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f253226e;

    /* renamed from: f, reason: collision with root package name */
    public hi4.a f253227f;

    public l(com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusConversationFragment fragment, yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        aVar = (i17 & 2) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f253225d = fragment;
        this.f253226e = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        hi4.a conv = (hi4.a) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(conv, "conv");
        this.f253227f = conv;
        rl5.r rVar = new rl5.r(view.getContext());
        rVar.L = this;
        rVar.g(view, intValue, 0L, this, this, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        rVar.m();
        hi4.k kVar = hi4.m.f281555f;
        java.lang.String field_sessionId = conv.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        kVar.d(field_sessionId, 54);
        return jz5.f0.f302826a;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(menuInfo, "menuInfo");
        hi4.a aVar = this.f253227f;
        if (kotlin.jvm.internal.o.b(aVar != null ? aVar.field_sessionId : null, "textstatussayhisessionholder")) {
            return;
        }
        menu.add(0, 2, 0, com.tencent.mm.R.string.gqi);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f253227f = null;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hi4.a aVar = this.f253227f;
        if (aVar == null || menuItem.getItemId() != 2) {
            return;
        }
        android.view.ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
        kotlin.jvm.internal.o.e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) menuInfo;
        ni4.x xVar = ni4.x.f337776d;
        boolean deleteNotify = xVar.h().deleteNotify(aVar.systemRowid, false);
        if (deleteNotify) {
            li4.d m17 = xVar.m();
            java.lang.String field_sessionId = aVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            m17.getClass();
            hi4.n y07 = m17.y0(field_sessionId);
            m17.f318792f.remove(field_sessionId);
            m17.f318791e.remove(y07.field_talker + '_' + y07.field_senderUserName);
            android.os.SystemClock.uptimeMillis();
            m17.delete((l75.f0) y07, false, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            xVar.h().doNotify(aVar.field_sessionId, 6, aVar);
            yz5.a aVar2 = this.f253226e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            androidx.fragment.app.FragmentActivity activity = this.f253225d.getActivity();
            if (activity != null) {
                xVar.o();
                pf5.z zVar = pf5.z.f353948a;
                if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.textstatus.ui.tf) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.textstatus.ui.tf.class)).U6(1);
                hi4.k kVar = hi4.m.f281555f;
                java.lang.String field_sessionId2 = aVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
                kVar.d(field_sessionId2, 55);
            }
        }
        c01.w9.h(aVar.field_sessionId, new ei4.k(deleteNotify, adapterContextMenuInfo));
    }
}
