package ei4;

/* loaded from: classes11.dex */
public final class w implements yz5.q, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f253247d;

    /* renamed from: e, reason: collision with root package name */
    public hi4.e f253248e;

    public w(yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this.f253247d = (i17 & 1) != 0 ? null : aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        hi4.e item = (hi4.e) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        this.f253248e = item;
        rl5.r rVar = new rl5.r(view.getContext());
        rVar.L = this;
        rVar.g(view, intValue, 0L, this, this, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        rVar.m();
        hi4.k kVar = hi4.m.f281555f;
        java.lang.String field_session_id = item.field_session_id;
        kotlin.jvm.internal.o.f(field_session_id, "field_session_id");
        kVar.d(field_session_id, 106);
        return java.lang.Boolean.TRUE;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(menuInfo, "menuInfo");
        menu.add(0, 2, 0, com.tencent.mm.R.string.f490367t0);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f253248e = null;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hi4.e eVar = this.f253248e;
        if (eVar == null || menuItem.getItemId() != 2) {
            return;
        }
        hi4.k kVar = hi4.m.f281555f;
        java.lang.String field_session_id = eVar.field_session_id;
        kotlin.jvm.internal.o.f(field_session_id, "field_session_id");
        kVar.d(field_session_id, 107);
        if (!ni4.x.f337776d.k().delete(eVar, new java.lang.String[0]) || (aVar = this.f253247d) == null) {
            return;
        }
    }
}
