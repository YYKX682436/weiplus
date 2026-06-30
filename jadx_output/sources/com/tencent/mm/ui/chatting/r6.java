package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public final class r6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.t6 f202642d;

    public r6(com.tencent.mm.ui.chatting.t6 t6Var) {
        this.f202642d = t6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$onClickListenerMobileQQ$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.t6 t6Var = this.f202642d;
        boolean f17 = com.tencent.mm.pluginsdk.model.app.j1.f(t6Var.f202704b, "com.tencent.mobileqq");
        android.content.Context context = t6Var.f202704b;
        if (f17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQAssistantFooterHandler", "starting mobile qq");
            p95.a.a(new com.tencent.mm.ui.chatting.p6(t6Var, context.getPackageManager().getLaunchIntentForPackage("com.tencent.mobileqq")));
        } else if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            db5.e1.y(context, i65.a.r(context, com.tencent.mm.R.string.f490837n73), "", i65.a.r(context, com.tencent.mm.R.string.n6z), null);
        } else if (!com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            db5.e1.j(t6Var.f202704b, com.tencent.mm.R.string.f490834n70, 0, com.tencent.mm.R.string.n6y, com.tencent.mm.R.string.n6x, new com.tencent.mm.ui.chatting.q6(t6Var), null);
        } else if (context != null) {
            gw4.f fVar = new gw4.f(context);
            fVar.f276157b = "mmdownloadapp_tx3SGbyHv8FJrTQDWR";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$onClickListenerMobileQQ$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
