package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class rn implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f205468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.nn f205470f;

    public rn(com.tencent.mm.ui.chatting.viewitems.nn nnVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar, com.tencent.mm.storage.f9 f9Var) {
        this.f205470f = nnVar;
        this.f205468d = aoVar;
        this.f205469e = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.ui.chatting.viewitems.nn nnVar = this.f205470f;
        nnVar.f204935s.P(true);
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f205468d;
        te5.v.f(aoVar.f203385h, nnVar.f204935s, nnVar.f204939w, nnVar.f204938v, 1, aoVar.f203386i.f447173r, this.f205469e.I0());
        aoVar.f203386i.f447173r = 1;
        nnVar.f204939w = -1;
        nnVar.f204938v = -1;
    }
}
