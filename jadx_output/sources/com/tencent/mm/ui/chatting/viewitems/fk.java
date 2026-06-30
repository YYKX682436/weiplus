package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fk implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ik f203977a;

    public fk(com.tencent.mm.ui.chatting.viewitems.ik ikVar) {
        this.f203977a = ikVar;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            return;
        }
        int d17 = erVar.d();
        boolean z17 = erVar instanceof com.tencent.mm.ui.chatting.viewitems.jk;
        com.tencent.mm.ui.chatting.viewitems.ik ikVar = this.f203977a;
        if (z17) {
            tt0.b bVar = ((com.tencent.mm.ui.chatting.viewitems.jk) erVar).R;
            ikVar.f204195h = bVar.f421784a;
            ikVar.f204196i = bVar.f421785b;
            ikVar.f204194g = false;
        } else if (erVar instanceof com.tencent.mm.ui.chatting.viewitems.ck) {
            ikVar.f204197m = ((com.tencent.mm.ui.chatting.viewitems.ck) erVar).R;
            ikVar.f204194g = true;
        }
        g4Var.c(d17, 100, 0, ikVar.f204191d.s().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
    }
}
