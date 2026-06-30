package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class sc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l55 f205510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.nc f205511f;

    public sc(com.tencent.mm.ui.chatting.viewitems.nc ncVar, com.tencent.mm.storage.f9 f9Var, r45.l55 l55Var) {
        this.f205511f = ncVar;
        this.f205509d = f9Var;
        this.f205510e = l55Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f205511f.getClass();
        mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
        com.tencent.mm.storage.f9 f9Var = this.f205509d;
        java.lang.String j17 = f9Var.j();
        ((lp3.l) jVar).getClass();
        r45.k55 e17 = bm5.d1.e(j17);
        r45.l55 Ui = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ui(e17, this.f205510e.f379155g);
        if (Ui != null) {
            java.util.LinkedList linkedList = e17.f378386e;
            linkedList.remove(Ui);
            if (linkedList.isEmpty()) {
                c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
                return;
            }
            f9Var.d1(((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).mj(e17));
            f9Var.setType(922746929);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
        }
    }
}
