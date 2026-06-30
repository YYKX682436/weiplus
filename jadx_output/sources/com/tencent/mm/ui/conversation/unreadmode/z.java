package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.d0 f208172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf5.n f208174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f208175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yf5.x f208176h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f208177i;

    public z(com.tencent.mm.ui.conversation.unreadmode.d0 d0Var, java.lang.String str, yf5.n nVar, in5.s0 s0Var, yf5.x xVar, int i17) {
        this.f208172d = d0Var;
        this.f208173e = str;
        this.f208174f = nVar;
        this.f208175g = s0Var;
        this.f208176h = xVar;
        this.f208177i = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kz5.p0 p0Var;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/unreadmode/UnreadConversationItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.unreadmode.d0 d0Var = this.f208172d;
        com.tencent.mm.ui.conversation.b3 b3Var = d0Var.f208122m;
        yf5.n nVar = this.f208174f;
        android.view.View viewWrapper = nVar.f461930q;
        kotlin.jvm.internal.o.f(viewWrapper, "viewWrapper");
        b3Var.a(this.f208173e, viewWrapper, nVar);
        android.view.View itemView = this.f208175g.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        int i17 = this.f208177i;
        d0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick position=");
        sb6.append(i17);
        sb6.append(", username=");
        yf5.x xVar = this.f208176h;
        com.tencent.mm.storage.l4 l4Var = xVar.f461995d;
        sb6.append(l4Var != null ? l4Var.h1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.UnreadConversationItemConvert", sb6.toString());
        com.tencent.mm.storage.l4 l4Var2 = xVar.f461995d;
        if (l4Var2 != null) {
            xm3.t0 t0Var = d0Var.f208123n;
            if (t0Var == null || (mvvmList = t0Var.I) == null || (arrayList = mvvmList.f152065o) == null) {
                p0Var = kz5.p0.f313996d;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.storage.l4 l4Var3 = ((yf5.x) it.next()).f461995d;
                    if (l4Var3 != null) {
                        arrayList3.add(l4Var3);
                    }
                }
                p0Var = arrayList3;
            }
            com.tencent.mm.ui.conversation.unreadmode.g0 g0Var = d0Var.f208118f;
            if (g0Var != null) {
                java.lang.String h17 = l4Var2.h1();
                if (h17 != null) {
                    boolean contains = g0Var.f208140b.contains(h17);
                    bg5.k.f20757a.a(h17, p0Var, 0, i17, contains ? 1 : 0, g0Var.f208139a);
                    com.tencent.mars.xlog.Log.i("MicroMsg.UnreadModeReporter", "reportClickChat, username=" + h17 + ", position=" + i17 + ", inUnreadGroup=" + (contains ? 1 : 0));
                }
            }
            com.tencent.mm.ui.conversation.u2.b(d0Var.f208117e, itemView, l4Var2, i17, new com.tencent.mm.ui.conversation.unreadmode.a0(d0Var));
        }
        d0Var.f208122m.b(200);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
