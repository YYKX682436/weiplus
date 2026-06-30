package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fb implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f203952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ab f203954g;

    public fb(com.tencent.mm.ui.chatting.viewitems.ab abVar, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.ya yaVar, com.tencent.mm.storage.f9 f9Var) {
        this.f203954g = abVar;
        this.f203951d = dVar;
        this.f203952e = yaVar;
        this.f203953f = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f203951d.P(true);
        rl5.r rVar = this.f203952e.f206058i;
        yb5.d dVar = this.f203951d;
        com.tencent.mm.ui.chatting.viewitems.ab abVar = this.f203954g;
        te5.v.d(rVar, dVar, abVar.f203296w, abVar.f203295v, 49, 0, 1, this.f203953f.I0(), 0);
        abVar.f203296w = -1;
        abVar.f203295v = -1;
    }
}
