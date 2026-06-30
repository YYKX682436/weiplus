package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class yk extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.neattextview.textview.view.f, com.tencent.mm.ui.chatting.l6 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(inflater, com.tencent.mm.R.layout.f488484e15);
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = new com.tencent.mm.ui.chatting.viewitems.ao();
        aoVar.a(xgVar, false);
        xgVar.setTag(aoVar);
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
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.TransItemTag");
        ((com.tencent.mm.ui.chatting.viewitems.go) tag).d();
        menu.clear();
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = (com.tencent.mm.ui.chatting.viewitems.ao) tag;
        aoVar.f203379b.setTag(com.tencent.mm.R.id.bon, java.lang.Long.valueOf(f9Var.getMsgId()));
        aoVar.f203379b.setTag(com.tencent.mm.R.id.rfh, f9Var.Q0());
        aoVar.f203379b.setTag(com.tencent.mm.R.id.bom, java.lang.Boolean.TRUE);
        aoVar.f203379b.setMaxLines(Integer.MAX_VALUE);
        aoVar.f203379b.setTag(new com.tencent.mm.ui.chatting.viewitems.go(msgData, ui6.D(), aoVar, null));
        java.util.Map map = ot0.q.v(f9Var.U1()).G2;
        Z(aoVar, f9Var.P0() < 2, true);
        com.tencent.mm.ui.chatting.viewitems.al alVar = com.tencent.mm.ui.chatting.viewitems.bl.f203496a;
        kotlin.jvm.internal.o.d(map);
        com.tencent.mm.ui.chatting.viewitems.al.a(alVar, ui6, aoVar, map);
        n(aoVar, ui6, f9Var, userName);
        m(aoVar, ui6, userName, f9Var);
        aoVar.f203379b.setOnLongClickListener(u(ui6));
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = aoVar.f203379b;
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(aoVar.f203379b.getContext())));
    }
}
