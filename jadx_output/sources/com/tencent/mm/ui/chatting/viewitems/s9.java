package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class s9 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.q9 f205500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.y9 f205502g;

    public s9(com.tencent.mm.ui.chatting.viewitems.y9 y9Var, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.q9 q9Var, com.tencent.mm.storage.f9 f9Var) {
        this.f205502g = y9Var;
        this.f205499d = dVar;
        this.f205500e = q9Var;
        this.f205501f = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f205499d.P(true);
        com.tencent.mm.ui.chatting.viewitems.q9 q9Var = this.f205500e;
        rl5.r rVar = q9Var.f205332e;
        yb5.d dVar = this.f205499d;
        com.tencent.mm.ui.chatting.viewitems.y9 y9Var = this.f205502g;
        te5.v.f(rVar, dVar, y9Var.f206050w, y9Var.f206049v, 49, q9Var.f205333f.f447173r, this.f205501f.I0());
        q9Var.f205333f.f447173r = 1;
        y9Var.f206050w = -1;
        y9Var.f206049v = -1;
    }
}
