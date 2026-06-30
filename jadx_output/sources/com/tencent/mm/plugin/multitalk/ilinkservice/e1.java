package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.f1 f149559d;

    public e1(com.tencent.mm.plugin.multitalk.ilinkservice.f1 f1Var) {
        this.f149559d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.f1 f1Var = this.f149559d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f1Var.f149576a.f149641p)) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = f1Var.f149576a;
            if (i4Var.f149637n != 1) {
                i4Var.f149619d.b(i4Var.f149641p);
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = f1Var.f149576a;
                com.tencent.mm.plugin.multitalk.ilinkservice.n4 n4Var = i4Var2.f149619d;
                java.lang.String str = i4Var2.f149641p;
                com.tencent.mm.plugin.multitalk.ilinkservice.d1 d1Var = new com.tencent.mm.plugin.multitalk.ilinkservice.d1(this);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) n4Var.f149733a;
                com.tencent.mm.plugin.multitalk.ilinkservice.j4 j4Var = (com.tencent.mm.plugin.multitalk.ilinkservice.j4) concurrentHashMap.get(str);
                if (j4Var != null && j4Var.a()) {
                    n4Var.a(0, 0, "", j4Var, false, d1Var);
                    return;
                }
                concurrentHashMap.remove(str);
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new r45.m07();
                lVar.f70665b = new r45.n07();
                lVar.f70667d = 3773;
                lVar.f70666c = "/cgi-bin/micromsg-bin/voipmtgensession";
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                ((r45.m07) a17.f70710a.f70684a).f380053e = str;
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.multitalk.ilinkservice.l4(n4Var, d1Var, str));
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Multitalk.ILinkService", "hy: not in room now");
    }
}
