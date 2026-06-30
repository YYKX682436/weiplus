package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class b6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f198716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.DoFavoriteEvent f198717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c6 f198718f;

    public b6(com.tencent.mm.ui.chatting.component.c6 c6Var, java.util.List list, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent) {
        this.f198718f = c6Var;
        this.f198716d = list;
        this.f198717e = doFavoriteEvent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        for (com.tencent.mm.storage.f9 f9Var : this.f198716d) {
            if (!f9Var.m2() && !f9Var.C2()) {
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = this.f198717e;
                am.c4 c4Var = doFavoriteEvent.f54090g;
                int i18 = c4Var.f6317c;
                com.tencent.mm.ui.chatting.component.c6 c6Var = this.f198718f;
                if (i18 == 14 && c4Var.f6315a.f370964f.size() == 0) {
                    c6Var.f198873d.o0();
                    return;
                }
                c6Var.b(doFavoriteEvent);
                java.util.Iterator it = c6Var.f198873d.p0().iterator();
                while (it.hasNext()) {
                    com.tencent.mm.ui.chatting.e.c(com.tencent.mm.ui.chatting.c.Fav, com.tencent.mm.ui.chatting.d.Samll, (com.tencent.mm.storage.f9) it.next(), 0);
                }
                return;
            }
        }
    }
}
