package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class nl extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f204933s = "ChattingItemFinderLiveSubscriptionNotifyTmpl";

    /* renamed from: t, reason: collision with root package name */
    public yb5.d f204934t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view == null || view.getTag() == null) {
            view = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.cnf);
            com.tencent.mm.ui.chatting.viewitems.kl klVar = new com.tencent.mm.ui.chatting.viewitems.kl();
            klVar.f204351b = view.findViewById(com.tencent.mm.R.id.bkn);
            klVar.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            klVar.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
            klVar.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
            android.view.View view2 = klVar.f204351b;
            if (view2 != null) {
                klVar.f204352c = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.qmn);
                klVar.f204353d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.qmt);
                klVar.f204354e = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.qmm);
                klVar.f204355f = view2.findViewById(com.tencent.mm.R.id.qms);
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.i0j);
                klVar.f204356g = textView;
                com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
                klVar.f204357h = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.qmq);
                klVar.f204358i = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.qmw);
                klVar.f204359j = view2.findViewById(com.tencent.mm.R.id.qmu);
                klVar.f204360k = view2.findViewById(com.tencent.mm.R.id.kgg);
            }
            view.setTag(klVar);
        }
        return view;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        java.lang.Object tag = v17.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        boolean z17 = false;
        if (erVar == null) {
            return false;
        }
        int d17 = erVar.d();
        yb5.d dVar = this.f204934t;
        if (dVar != null && !dVar.F()) {
            z17 = true;
        }
        if (z17) {
            menu.c(d17, 100, 0, v17.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be A[LOOP:1: B:60:0x01b8->B:62:0x01be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0258  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r21, yb5.d r22, rd5.d r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.nl.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
