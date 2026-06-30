package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public abstract class b6 implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.ThreadLocal f198491f = new java.lang.ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f198492d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.er f198493e;

    public b6(yb5.d dVar) {
        this.f198493e = null;
        this.f198492d = dVar;
    }

    public abstract void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var);

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.storage.f9 c17;
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f198492d;
        com.tencent.mm.ui.chatting.viewitems.er erVar2 = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar2 == null) {
            c17 = null;
        } else {
            try {
                c17 = com.tencent.mm.ui.chatting.viewitems.er.b(erVar2.f203908d, dVar);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("ItemDataTag", th6, "getCurrentMsg err", new java.lang.Object[0]);
                c17 = erVar2.c();
            }
        }
        if (c17 == null && (erVar = this.f198493e) != null) {
            c17 = erVar.c();
        }
        if (c17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.ThreadLocal threadLocal = f198491f;
        threadLocal.set(c17);
        a(view, this.f198492d, c17);
        threadLocal.set(null);
        if (this.f198492d.f460708c.a(com.tencent.mm.ui.chatting.component.fg.class) != null) {
            ((com.tencent.mm.ui.chatting.component.f1) ((com.tencent.mm.ui.chatting.component.fg) this.f198492d.f460708c.a(com.tencent.mm.ui.chatting.component.fg.class))).getClass();
            sc5.f fVar = sc5.f.f406567a;
            ((ku5.t0) ku5.t0.f312615d).h(new sc5.b(c17), "ChatMsgReadReportManager");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public b6(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        this.f198493e = null;
        this.f198492d = dVar;
        this.f198493e = erVar;
    }
}
