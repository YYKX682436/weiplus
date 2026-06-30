package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class kn implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f204362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.gn f204364f;

    public kn(com.tencent.mm.ui.chatting.viewitems.gn gnVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar, com.tencent.mm.storage.f9 f9Var) {
        this.f204364f = gnVar;
        this.f204362d = aoVar;
        this.f204363e = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.ui.chatting.viewitems.gn gnVar = this.f204364f;
        gnVar.f204055s.P(true);
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f204362d;
        te5.v.f(aoVar.f203385h, gnVar.f204055s, gnVar.f204059w, gnVar.f204058v, 1, aoVar.f203386i.f447173r, this.f204363e.I0());
        aoVar.f203386i.f447173r = 1;
        gnVar.f204059w = -1;
        gnVar.f204058v = -1;
    }
}
