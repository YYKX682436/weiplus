package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes2.dex */
public class p3 implements com.tencent.mm.ipcinvoker.wx_extension.v {
    public p3(com.tencent.mm.plugin.multitalk.ilinkservice.q3 q3Var) {
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.v07 v07Var = (r45.v07) oVar.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "videoScreenSharingStart callback roomId %d errCode %d checkRet %d", java.lang.Long.valueOf(v07Var.f387791d), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(v07Var.f387792e));
    }
}
