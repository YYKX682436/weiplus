package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f207875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f207876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f207877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f207878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f207879h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q f207880i;

    public n(com.tencent.mm.ui.conversation.q qVar, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5) {
        this.f207880i = qVar;
        this.f207875d = list;
        this.f207876e = list2;
        this.f207877f = list3;
        this.f207878g = list4;
        this.f207879h = list5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.q qVar = this.f207880i;
        if (qVar.f207989s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BannerHelper", "Banner has destroyed.");
            this.f207880i.e(this.f207875d);
            this.f207880i.a(this.f207875d);
            this.f207875d.clear();
            this.f207876e.clear();
            this.f207877f.clear();
            this.f207878g.clear();
            this.f207879h.clear();
            return;
        }
        ((java.util.LinkedList) qVar.f207977d).addAll(this.f207876e);
        ((java.util.LinkedList) this.f207880i.f207978e).addAll(this.f207877f);
        ((java.util.LinkedList) this.f207880i.f207979f).addAll(this.f207878g);
        ((java.util.LinkedList) this.f207880i.f207980g).addAll(this.f207879h);
        ((java.util.LinkedList) this.f207880i.f207981h).addAll(this.f207875d);
        final com.tencent.mm.ui.conversation.q qVar2 = this.f207880i;
        qVar2.f207988r = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MainUIShowListviewEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MainUIShowListviewEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.BannerHelper$5
            {
                this.__eventId = -599117475;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MainUIShowListviewEvent mainUIShowListviewEvent) {
                com.tencent.mm.ui.conversation.q qVar3 = com.tencent.mm.ui.conversation.q.this;
                if (qVar3.f207986p.getVisibility() != 0) {
                    qVar3.f207986p.setVisibility(0);
                    android.view.View view = qVar3.f207987q;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/BannerHelper$5", "callback", "(Lcom/tencent/mm/autogen/events/MainUIShowListviewEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/conversation/BannerHelper$5", "callback", "(Lcom/tencent/mm/autogen/events/MainUIShowListviewEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return false;
            }
        };
        qVar2.f207983m = iListener;
        iListener.alive();
        c01.d9.b().a(qVar2);
        java.util.Iterator it = qVar2.f207981h.iterator();
        while (it.hasNext()) {
            qVar2.f207986p.addHeaderView(((s35.b) it.next()).f402843h);
        }
        com.tencent.mm.ui.conversation.p pVar = new com.tencent.mm.ui.conversation.p(qVar2);
        qVar2.f207982i = pVar;
        gm0.j1.i();
        gm0.j1.n().a(pVar);
        s72.r0 a17 = s72.r0.a();
        synchronized (a17.f404144a) {
            ((java.util.LinkedList) a17.f404144a).add(qVar2);
        }
        qVar2.h();
    }
}
