package pj5;

/* loaded from: classes9.dex */
public final class t extends in5.r {
    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView chattingScheduleMsgMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView(context, null, 0, 6, null);
        chattingScheduleMsgMvvmView.setId(com.tencent.mm.R.id.srl);
        chattingScheduleMsgMvvmView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        return chattingScheduleMsgMvvmView;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.storage.f9 f9Var;
        pj5.l item = (pj5.l) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView chattingScheduleMsgMvvmView = (com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView) holder.itemView.findViewById(com.tencent.mm.R.id.srl);
        z01.d0 d0Var = new z01.d0();
        r45.wq4 wq4Var = new r45.wq4();
        r45.lo5 lo5Var = item.f355387d;
        wq4Var.parseFrom(lo5Var.f379679h.f192156a);
        try {
            f9Var = ((com.tencent.mm.storage.g9) c01.d9.b().u()).o2(wq4Var.f389390f, wq4Var.f389391g);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScheduleMsgDetailUI", "onBindViewHolder get msg failed, username: " + wq4Var.f389390f + ", svrId: " + wq4Var.f389391g);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScheduleMsgDetailUI", th6, "onBindViewHolder failed", new java.lang.Object[0]);
            f9Var = null;
        }
        d0Var.f468986d = wq4Var.f389388d;
        d0Var.f468987e = pj5.k.f355386a.b(f9Var);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = wq4Var.f389390f;
        ((sg3.a) v0Var).getClass();
        d0Var.f468988f = c01.a2.e(str);
        d0Var.f468989g = java.lang.Long.valueOf(lo5Var.f379677f * 1000);
        d0Var.f468990h = java.lang.Long.valueOf(wq4Var.f389391g);
        d0Var.f468993n = new pj5.n(f9Var, lo5Var, item, holder, d0Var, chattingScheduleMsgMvvmView);
        d0Var.f468991i = new pj5.o(holder, f9Var);
        d0Var.f468994o = new pj5.s(holder, item);
        chattingScheduleMsgMvvmView.setViewModel(d0Var);
    }
}
