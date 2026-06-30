package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class em extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203891s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488517vp, (android.view.ViewGroup) null);
        com.tencent.mm.ui.chatting.viewitems.fm fmVar = new com.tencent.mm.ui.chatting.viewitems.fm();
        fmVar.timeTV = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483696br1);
        fmVar.userTV = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.brc);
        fmVar.f203981b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.bp_);
        fmVar.f203982c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483699br4);
        fmVar.f203983d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bkl);
        fmVar.clickArea = inflate.findViewById(com.tencent.mm.R.id.bkg);
        inflate.setTag(fmVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (this.f203891s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        com.tencent.mm.storage.c9 J6 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).J6(erVar.c().j());
        java.lang.String str = J6.f193821f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            java.lang.String str2 = J6.f193819d;
            if ((str2 != null ? str2 : "").length() <= 0) {
                return true;
            }
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(J6.f193819d)), null);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("msgid", erVar.c().getMsgId());
        intent.putExtra("talker", erVar.c().Q0());
        j45.l.j(dVar.g(), "qqmail", ".ui.ReadMailUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 14);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203891s = dVar;
        com.tencent.mm.ui.chatting.viewitems.fm fmVar = (com.tencent.mm.ui.chatting.viewitems.fm) g0Var;
        com.tencent.mm.storage.c9 J6 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).J6(f9Var.j());
        fmVar.f203982c.setText(J6.f193816a);
        fmVar.f203983d.setText(J6.f193817b);
        X(fmVar, J6.f193818c);
        fmVar.f203981b.setVisibility(J6.f193820e ? 0 : 8);
        fmVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), fmVar, null));
        fmVar.clickArea.setOnClickListener(w(dVar));
        fmVar.clickArea.setOnLongClickListener(u(dVar));
        fmVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
    }
}
