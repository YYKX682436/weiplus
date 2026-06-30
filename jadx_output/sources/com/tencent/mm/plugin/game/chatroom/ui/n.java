package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes5.dex */
public final class n implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g43.x f138851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.t f138852e;

    public n(g43.x xVar, com.tencent.mm.plugin.game.chatroom.ui.t tVar) {
        this.f138851d = xVar;
        this.f138852e = tVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(editable)).toString();
        boolean z17 = obj.length() == 0;
        g43.x xVar = this.f138851d;
        if (z17 || !(!r26.n0.N(obj))) {
            w33.b bVar = (w33.b) xVar.f268794d.getValue();
            if (bVar != null) {
                com.tencent.mm.plugin.game.chatroom.ui.q.a(com.tencent.mm.plugin.game.chatroom.ui.q.f138855a, bVar, this.f138852e, false);
                return;
            }
            return;
        }
        xVar.getClass();
        java.lang.String str = xVar.f268796f;
        if (str != null) {
            kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(xVar), (oz5.l) xVar.f268801n.getValue(), null, new g43.v(xVar, obj, str, null), 2, null);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
