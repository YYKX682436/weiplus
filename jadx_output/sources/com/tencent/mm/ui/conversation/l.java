package com.tencent.mm.ui.conversation;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q f207818e;

    public l(com.tencent.mm.ui.conversation.q qVar, android.content.Context context) {
        this.f207818e = qVar;
        this.f207817d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.tencent.mm.ui.conversation.q qVar = this.f207818e;
        android.content.Context context = this.f207817d;
        if (context == null) {
            qVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.BannerHelper", "The context is null and stop initializing.");
            return;
        }
        if (qVar.f207989s) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BannerHelper", "TabView has destroyed, return.");
            return;
        }
        final java.util.LinkedList linkedList = new java.util.LinkedList();
        final java.util.LinkedList linkedList2 = new java.util.LinkedList();
        final java.util.LinkedList linkedList3 = new java.util.LinkedList();
        final java.util.LinkedList linkedList4 = new java.util.LinkedList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BannerToAddEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BannerToAddEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.BannerHelper$2
            {
                this.__eventId = 1216409744;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent) {
                com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent2 = bannerToAddEvent;
                s35.b bVar = bannerToAddEvent2.f53998g.f7500c;
                if (bVar == null || bVar.f402843h == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BannerHelper", "banner is null, event:%s", bannerToAddEvent2);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BannerHelper", "now add banner:%s, hc:%d", bVar, java.lang.Integer.valueOf(com.tencent.mm.ui.conversation.q.this.hashCode()));
                am.o0 o0Var = bannerToAddEvent2.f53998g;
                if (o0Var.f7498a) {
                    linkedList.add(bVar);
                    return false;
                }
                int i17 = o0Var.f7499b;
                if (i17 == 1) {
                    linkedList2.add(bVar);
                    return false;
                }
                if (i17 != 2) {
                    linkedList4.add(bVar);
                    return false;
                }
                linkedList3.add(bVar);
                return false;
            }
        };
        qVar.f207984n = iListener;
        iListener.alive();
        com.tencent.mm.autogen.events.BannerOnInitEvent bannerOnInitEvent = new com.tencent.mm.autogen.events.BannerOnInitEvent();
        bannerOnInitEvent.f53997g.f7384a = (android.app.Activity) context;
        bannerOnInitEvent.e();
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent = new com.tencent.mm.autogen.events.BannerToAddEvent();
        bannerToAddEvent.f53998g.f7500c = (s35.b) com.tencent.mm.ui.conversation.banner.j.a(context, com.tencent.mm.ui.conversation.banner.i.MAIN_FRAME_BANNER, null);
        bannerToAddEvent.e();
        s35.b bVar = (s35.b) com.tencent.mm.ui.conversation.banner.j.a(context, com.tencent.mm.ui.conversation.banner.i.NET_WARN_BANNER, null);
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent2 = new com.tencent.mm.autogen.events.BannerToAddEvent();
        am.o0 o0Var = bannerToAddEvent2.f53998g;
        o0Var.f7500c = bVar;
        o0Var.f7499b = 1;
        bannerToAddEvent2.e();
        if (android.os.Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone")) {
            s35.b bVar2 = (s35.b) com.tencent.mm.ui.conversation.banner.j.a(context, com.tencent.mm.ui.conversation.banner.i.STORAGE_PERMISSION_BANNER, null);
            com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent3 = new com.tencent.mm.autogen.events.BannerToAddEvent();
            am.o0 o0Var2 = bannerToAddEvent3.f53998g;
            o0Var2.f7500c = bVar2;
            o0Var2.f7499b = 1;
            bannerToAddEvent3.e();
        }
        s35.b bVar3 = (s35.b) com.tencent.mm.ui.conversation.banner.j.a(context, com.tencent.mm.ui.conversation.banner.i.OTHER_ONLINE_BANNER, null);
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent4 = new com.tencent.mm.autogen.events.BannerToAddEvent();
        am.o0 o0Var3 = bannerToAddEvent4.f53998g;
        o0Var3.f7500c = bVar3;
        o0Var3.f7498a = false;
        o0Var3.f7499b = 1;
        bannerToAddEvent4.e();
        com.tencent.mm.ui.conversation.banner.q0 q0Var = (com.tencent.mm.ui.conversation.banner.q0) com.tencent.mm.ui.conversation.banner.j.a(context, com.tencent.mm.ui.conversation.banner.i.TRY_NEW_INIT_BANNER, null);
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent5 = new com.tencent.mm.autogen.events.BannerToAddEvent();
        am.o0 o0Var4 = bannerToAddEvent5.f53998g;
        o0Var4.f7500c = q0Var;
        o0Var4.f7498a = false;
        o0Var4.f7499b = 2;
        bannerToAddEvent5.e();
        com.tencent.mm.ui.conversation.banner.e eVar = (com.tencent.mm.ui.conversation.banner.e) com.tencent.mm.ui.conversation.banner.j.a(context, com.tencent.mm.ui.conversation.banner.i.AD_BANNER, null);
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent6 = new com.tencent.mm.autogen.events.BannerToAddEvent();
        am.o0 o0Var5 = bannerToAddEvent6.f53998g;
        o0Var5.f7500c = eVar;
        o0Var5.f7498a = false;
        o0Var5.f7499b = 3;
        bannerToAddEvent6.e();
        cb5.e eVar2 = (cb5.e) com.tencent.mm.ui.conversation.banner.j.a(context, com.tencent.mm.ui.conversation.banner.i.CHATTING_MONITORED_HINT, new java.lang.Object[]{e01.c.Main});
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent7 = new com.tencent.mm.autogen.events.BannerToAddEvent();
        am.o0 o0Var6 = bannerToAddEvent7.f53998g;
        o0Var6.f7500c = eVar2;
        o0Var6.f7498a = true;
        bannerToAddEvent7.e();
        qVar.f207984n.dead();
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        linkedList5.addAll(linkedList);
        linkedList5.addAll(linkedList2);
        linkedList5.addAll(linkedList3);
        linkedList5.addAll(linkedList4);
        java.util.Collections.sort(linkedList5, new com.tencent.mm.ui.conversation.m(qVar));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.conversation.n(qVar, linkedList5, linkedList, linkedList2, linkedList3, linkedList4));
    }
}
