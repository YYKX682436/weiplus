package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class l4 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.m4 f149692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.n4 f149694c;

    public l4(com.tencent.mm.plugin.multitalk.ilinkservice.n4 n4Var, com.tencent.mm.plugin.multitalk.ilinkservice.m4 m4Var, java.lang.String str) {
        this.f149694c = n4Var;
        this.f149692a = m4Var;
        this.f149693b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f70711b.f70700a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkSessionMgr", "hy: get sessionkey fail,errType:" + i17 + ",errCode:" + i18);
            this.f149694c.a(i17, i18, str, null, false, this.f149692a);
            return;
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.j4 j4Var = new com.tencent.mm.plugin.multitalk.ilinkservice.j4();
        j4Var.f149665a = ((r45.n07) fVar).f380980d.i();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        j4Var.f149667c = android.os.SystemClock.elapsedRealtime();
        j4Var.f149666b = 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkSessionMgr", "hy: getSession sessionKey: %s", j4Var);
        ((java.util.concurrent.ConcurrentHashMap) this.f149694c.f149733a).put(this.f149693b, j4Var);
        this.f149694c.a(0, 0, "", j4Var, true, this.f149692a);
    }
}
