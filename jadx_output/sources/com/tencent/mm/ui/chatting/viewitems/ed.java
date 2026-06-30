package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class ed extends com.tencent.mm.ui.chatting.viewitems.a0 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488459tu);
        com.tencent.mm.ui.chatting.viewitems.cd cdVar = new com.tencent.mm.ui.chatting.viewitems.cd();
        cdVar.a(xgVar);
        xgVar.setTag(cdVar);
        return xgVar;
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
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgRingtone", "fill item %d, msgId %d", java.lang.Integer.valueOf(holder.getAdapterPosition()), java.lang.Long.valueOf(f9Var.getMsgId()));
            android.app.Activity g17 = ui6.g();
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = ((com.tencent.mm.ui.chatting.viewitems.cd) holder).f203717c;
            if (mMNeat7extView2 == null || (mMNeat7extView = ((com.tencent.mm.ui.chatting.viewitems.cd) holder).f203716b) == null) {
                return;
            }
            mMNeat7extView2.l(0, g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2) * i65.a.q(g17));
            mMNeat7extView2.setPadding(g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq), g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq), g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq), g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq));
            mMNeat7extView2.setTextGravity(1);
            mMNeat7extView2.setClickable(true);
            mMNeat7extView.l(0, g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2) * i65.a.q(g17));
            mMNeat7extView.setPadding(g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq), g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq), g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq), g17.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq));
            mMNeat7extView.setTextGravity(1);
            mMNeat7extView.setClickable(true);
            int color = ui6.g().getResources().getColor(com.tencent.mm.R.color.f479308vo);
            int color2 = ui6.g().getResources().getColor(com.tencent.mm.R.color.f479310vq);
            int type = f9Var.getType();
            java.lang.String[] c17 = type != 85 ? type != 86 ? null : mx3.b0.f332528a.c() : mx3.b0.f332528a.d();
            if (c17 == null) {
                return;
            }
            java.lang.String str2 = (java.lang.String) kz5.z.L(c17);
            java.lang.String str3 = (java.lang.String) kz5.z.f0(c17);
            android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(str3);
            kotlin.jvm.internal.o.f(newSpannable, "newSpannable(...)");
            newSpannable.setSpan(new com.tencent.mm.ui.chatting.viewitems.dd(color, color2, str, f9Var, ui6), 0, str3.length(), 18);
            mMNeat7extView.setTextColor(ui6.g().getResources().getColor(com.tencent.mm.R.color.FG_2));
            mMNeat7extView.c(newSpannable, android.widget.TextView.BufferType.SPANNABLE, null);
            f9Var.d1(str2 + str3);
            int i17 = com.tencent.mm.ui.chatting.adapter.q.f198438a;
            com.tencent.mm.ui.chatting.adapter.q qVar = com.tencent.mm.ui.chatting.adapter.p.f198437a;
            mMNeat7extView.setTag(new com.tencent.mm.ui.chatting.viewitems.er(msgData, false, qVar, "", false));
            mMNeat7extView.setBackground(ui6.g().getResources().getDrawable(com.tencent.mm.R.drawable.f481227ns));
            mMNeat7extView2.setTextColor(ui6.g().getResources().getColor(com.tencent.mm.R.color.FG_2));
            mMNeat7extView2.b(str2);
            mMNeat7extView2.setTag(new com.tencent.mm.ui.chatting.viewitems.er(msgData, false, qVar, "", false));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgRingtone", "error happened parse msg info");
        }
    }
}
