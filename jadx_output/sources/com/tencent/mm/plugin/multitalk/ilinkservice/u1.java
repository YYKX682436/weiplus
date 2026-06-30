package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class u1 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.v1 f149828a;

    public u1(com.tencent.mm.plugin.multitalk.ilinkservice.v1 v1Var) {
        this.f149828a = v1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "on invite result: %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f149828a.f149836e.f149847a.J(new com.tencent.mm.plugin.multitalk.ilinkservice.t1(this, i17, i18, str, oVar));
    }
}
