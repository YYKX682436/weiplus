package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes7.dex */
public final class ze extends com.tencent.mm.ui.chatting.viewitems.a0 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if ((view != null ? view.getTag() : null) != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.dhh);
        com.tencent.mm.ui.chatting.viewitems.ye yeVar = new com.tencent.mm.ui.chatting.viewitems.ye();
        yeVar.a(xgVar);
        xgVar.setTag(yeVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a componentProvider) {
        kotlin.jvm.internal.o.g(componentProvider, "componentProvider");
        return new com.tencent.mm.ui.chatting.viewitems.af(f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.ye yeVar = (com.tencent.mm.ui.chatting.viewitems.ye) holder;
        ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.U1() : null);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgWxGameDynamicCardViewHolder", "content is null");
            return;
        }
        ot0.h y17 = v17.y(com.tencent.mm.pluginsdk.ui.tools.j0.class);
        kotlin.jvm.internal.o.f(y17, "piece(...)");
        com.tencent.mm.pluginsdk.ui.tools.j0 j0Var = (com.tencent.mm.pluginsdk.ui.tools.j0) y17;
        java.lang.String str = j0Var.f191722c;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = yeVar.f206079b;
        if (constraintLayout != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = constraintLayout.getChildCount() > 0 && !kotlin.jvm.internal.o.b(constraintLayout.getTag(), str) ? constraintLayout : null;
            if (constraintLayout2 != null) {
                constraintLayout2.removeAllViews();
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgWxGameDynamicCardViewHolder", "AppContentWxGameCardPiece.frameSetName is null");
            return;
        }
        java.lang.String str2 = j0Var.f191721b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardViewHolder", "framesetname : " + str + ", framesetData : " + str2);
        if (z65.c.a()) {
            android.widget.TextView textView = yeVar.f206080c;
            if (textView != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append('+');
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = yeVar.f206079b;
                sb6.append(constraintLayout3 != null ? constraintLayout3.hashCode() : 0);
                textView.setText(sb6.toString());
            }
            android.widget.TextView textView2 = yeVar.f206080c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = yeVar.f206079b;
        if (constraintLayout4 != null) {
            g05.i iVar = (g05.i) i95.n0.c(g05.i.class);
            kotlin.jvm.internal.o.d(str);
            kotlin.jvm.internal.o.d(str2);
            g05.r rVar = (g05.r) iVar;
            rVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "setFrameSetView bizHandle:" + rVar.f267490m);
            iq0.c Di = rVar.Di();
            if (Di != null) {
                i95.m c17 = i95.n0.c(gq0.t.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                gq0.t.Ve((gq0.t) c17, Di, null, constraintLayout4, str, str2, 0, null, 98, null);
            }
            constraintLayout4.setTag(str);
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ui.chatting.component.k kVar = (com.tencent.mm.ui.chatting.component.k) ((sb5.c) ui6.f460708c.a(sb5.c.class));
        kVar.getClass();
        java.util.HashMap hashMap = kVar.f199323f;
        hashMap.put(str, yeVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "frameSetNameholdermap size:" + hashMap.size());
    }
}
