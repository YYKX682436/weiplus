package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class y2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.DoFavoriteEvent f202559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202561f;

    public y2(com.tencent.mm.ui.chatting.presenter.n3 n3Var, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.util.List list) {
        this.f202561f = n3Var;
        this.f202559d = doFavoriteEvent;
        this.f202560e = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = this.f202559d;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (c4Var.f6317c == 14 && c4Var.f6315a.f370964f.size() == 0) {
            return;
        }
        this.f202561f.c(doFavoriteEvent);
        java.util.Iterator it = this.f202560e.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.chatting.e.c(com.tencent.mm.ui.chatting.c.Fav, com.tencent.mm.ui.chatting.d.Samll, (com.tencent.mm.storage.f9) it.next(), 0);
        }
    }
}
