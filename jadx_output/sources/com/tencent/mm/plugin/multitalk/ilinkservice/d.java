package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c0 f149539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149540e;

    public d(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        this.f149540e = cVar;
        this.f149539d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149540e;
        if (cVar.f149514a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onEnterMultiTalk");
            com.tencent.mm.modeltalkroom.MultiTalkGroup a17 = cVar.a(this.f149539d);
            com.tencent.mm.plugin.multitalk.model.v0 v0Var = cVar.f149514a;
            v0Var.getClass();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_mutex_adjust, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk: %s checkInVoip %b isIPCallStarted %b isIPCallStarted %b", com.tencent.mm.plugin.multitalk.model.o2.b(a17), java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(vq4.p0.c()), java.lang.Boolean.valueOf(vq4.p0.d()));
            if (fj6) {
                boolean z17 = vq4.p0.c() || vq4.p0.d();
                if (z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk isInVoip %b ipcall %b voip %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(vq4.p0.c()), java.lang.Boolean.valueOf(vq4.p0.d()));
                    v0Var.f(false, false);
                    return;
                }
            }
            com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent();
            refreshMainUIMultitalkIconEvent.f54671g.f7358a = 1;
            refreshMainUIMultitalkIconEvent.e();
            com.tencent.mm.plugin.multitalk.model.u0.d(true);
            if (v0Var.f150176s != sj3.e4.Inviting) {
                v0Var.D(sj3.e4.Starting);
                v0Var.e(a17, java.lang.Boolean.TRUE);
            }
            if (v0Var.x() && v0Var.c0(a17)) {
                zj3.g gVar = zj3.g.f473302a;
                gVar.a(v0Var.v());
                if (!android.text.TextUtils.isEmpty(a17.f71606d)) {
                    java.lang.String groupId = a17.f71606d;
                    kotlin.jvm.internal.o.g(groupId, "groupId");
                    zj3.g.f473308g = groupId;
                }
                java.util.List list = a17.f71611i;
                if (list != null) {
                    gVar.c(list);
                }
                v0Var.H();
            }
        }
    }
}
