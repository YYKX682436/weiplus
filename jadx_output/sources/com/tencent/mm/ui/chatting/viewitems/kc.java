package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class kc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mc f204323d;

    public kc(com.tencent.mm.ui.chatting.viewitems.mc mcVar) {
        this.f204323d = mcVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan tag not valid");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.storage.f9 c17 = erVar.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan msg not valid");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String j17 = c17.j();
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan content not valid");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.scanner.model.OfflineScanContext a17 = com.tencent.mm.plugin.scanner.model.OfflineScanContext.CREATOR.a(j17);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a17.f158763g);
        boolean z17 = a17.f158767n;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan onClick codeType: %d, selectFromAlbum: %b", valueOf, java.lang.Boolean.valueOf(z17));
        java.lang.String b17 = tb5.o0.b(view.getResources().getString(com.tencent.mm.R.string.he9), a17.f158766m);
        int i17 = view.getId() == com.tencent.mm.R.id.khi ? 3 : 2;
        com.tencent.mm.ui.chatting.viewitems.mc mcVar = this.f204323d;
        tb5.o0.d(mcVar.f204571t, c17, null, b17, i17, false);
        com.tencent.mm.plugin.scanner.model.j0 j0Var = com.tencent.mm.plugin.scanner.model.j0.f158937a;
        java.lang.String str = a17.f158761e;
        java.lang.String str2 = a17.f158768o;
        int i18 = z17 ? 2 : 1;
        j0Var.a(str, str2, i18, a17.f158769p, 1, a17.f158770q + "");
        if (gm0.j1.d().n() == 0) {
            db5.e1.y(mcVar.f204571t.g(), mcVar.f204571t.g().getString(com.tencent.mm.R.string.f492664he4), "", mcVar.f204571t.g().getString(com.tencent.mm.R.string.f490455vj), new com.tencent.mm.ui.chatting.viewitems.jc(this));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.plugin.scanner.j1.c(a17.f158768o)) {
            java.lang.String str3 = a17.f158761e;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan zBar result invalid");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((e04.f) mcVar.f204573v).b(mcVar.f204571t.g(), null, null, str3, a17.f158767n, a17.f158764h, a17.f158768o, a17.f158765i, 99, true, a17.f158769p, false, false, 0, null);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17.f158761e)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan qBar result invalid");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((e04.p) mcVar.f204572u).h(mcVar.f204571t.g(), a17.f158761e, a17.f158762f, a17.f158768o, a17.f158763g, a17.f158764h, null, null, a17.f158765i, true, a17.f158769p, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
