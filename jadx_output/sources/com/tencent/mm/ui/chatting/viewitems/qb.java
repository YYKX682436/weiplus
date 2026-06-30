package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class qb implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f205342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lb f205344g;

    public qb(com.tencent.mm.ui.chatting.viewitems.lb lbVar, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.ya yaVar, com.tencent.mm.storage.f9 f9Var) {
        this.f205344g = lbVar;
        this.f205341d = dVar;
        this.f205342e = yaVar;
        this.f205343f = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f205341d.P(true);
        rl5.r rVar = this.f205342e.f206058i;
        yb5.d dVar = this.f205341d;
        com.tencent.mm.ui.chatting.viewitems.lb lbVar = this.f205344g;
        te5.v.d(rVar, dVar, lbVar.f204416w, lbVar.f204415v, 49, 0, 1, this.f205343f.I0(), 0);
        lbVar.f204416w = -1;
        lbVar.f204415v = -1;
    }
}
