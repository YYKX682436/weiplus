package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class aa implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.q9 f203289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ga f203291g;

    public aa(com.tencent.mm.ui.chatting.viewitems.ga gaVar, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.q9 q9Var, com.tencent.mm.storage.f9 f9Var) {
        this.f203291g = gaVar;
        this.f203288d = dVar;
        this.f203289e = q9Var;
        this.f203290f = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f203288d.P(true);
        com.tencent.mm.ui.chatting.viewitems.q9 q9Var = this.f203289e;
        rl5.r rVar = q9Var.f205332e;
        yb5.d dVar = this.f203288d;
        com.tencent.mm.ui.chatting.viewitems.ga gaVar = this.f203291g;
        te5.v.f(rVar, dVar, gaVar.f204024w, gaVar.f204023v, 49, q9Var.f205333f.f447173r, this.f203290f.I0());
        q9Var.f205333f.f447173r = 1;
        gaVar.f204024w = -1;
        gaVar.f204023v = -1;
    }
}
