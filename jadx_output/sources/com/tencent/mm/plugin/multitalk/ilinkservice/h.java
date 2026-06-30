package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c0 f149594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149595e;

    public h(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        this.f149595e = cVar;
        this.f149594d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149595e;
        if (cVar.f149514a != null) {
            com.tencent.mm.modeltalkroom.MultiTalkGroup a17 = cVar.a(this.f149594d);
            com.tencent.mm.plugin.multitalk.model.v0 v0Var = cVar.f149514a;
            v0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onMemberChange: %s", com.tencent.mm.plugin.multitalk.model.o2.b(a17));
            if (v0Var.x() && v0Var.c0(a17)) {
                java.util.Iterator it = v0Var.f150177t.f71611i.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    int i18 = ((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) it.next()).f71614f;
                    if (i18 == 10 || i18 == 1) {
                        i17++;
                    }
                }
                boolean z17 = i17 > 1;
                sj3.e4 e4Var = sj3.e4.Inviting;
                if (!z17) {
                    if (v0Var.f150176s == e4Var) {
                        v0Var.f(false, true);
                        return;
                    } else {
                        v0Var.f(false, false);
                        return;
                    }
                }
                java.util.List list = a17.f71611i;
                if (list != null) {
                    zj3.g.f473302a.c(list);
                }
                int i19 = a17.f71611i.size() > 2 ? 1 : 0;
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
                kotlin.jvm.internal.o.f(M, "getMMKV(...)");
                M.putInt("mmkv_multitalk_member_list", i19);
                sj3.e4 e4Var2 = v0Var.f150176s;
                sj3.e4 e4Var3 = sj3.e4.Talking;
                if (e4Var2 != e4Var3 && com.tencent.mm.plugin.multitalk.model.o2.f(a17)) {
                    v0Var.D(e4Var3);
                }
                com.tencent.mm.plugin.multitalk.model.z zVar = v0Var.C;
                if (zVar != null) {
                    sj3.e4 e4Var4 = v0Var.f150176s;
                    if (e4Var4 == sj3.e4.Starting || e4Var4 == e4Var3 || e4Var4 == e4Var) {
                        zVar.x5();
                    }
                }
                if (v0Var.f150176s == e4Var) {
                    com.tencent.mm.plugin.multitalk.ui.h hVar = v0Var.S;
                    hVar.getClass();
                    hVar.f150286x = a17;
                    android.view.View view = hVar.f301236e;
                    if (view != null) {
                        view.post(new com.tencent.mm.plugin.multitalk.ui.g(hVar));
                    }
                }
                java.lang.String r17 = c01.z1.r();
                zj3.g gVar = zj3.g.f473302a;
                zj3.g.f473310i = zj3.j.c(r17);
            }
        }
    }
}
