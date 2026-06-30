package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class f2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.g2 f149577a;

    public f2(com.tencent.mm.plugin.multitalk.ilinkservice.g2 g2Var) {
        this.f149577a = g2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "on cgiSendCloudIlinkRequest result: %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.v27 v27Var = (r45.v27) oVar.f70711b.f70700a;
        com.tencent.mm.plugin.multitalk.ilinkservice.g2 g2Var = this.f149577a;
        if (v27Var == null || (gVar = v27Var.f387834d) == null) {
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.sendResponse(null, 0, -1, g2Var.f149589d.f383719d);
        } else {
            byte[] bArr = gVar.f192156a;
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.sendResponse(bArr, bArr.length, i18, g2Var.f149589d.f383719d);
        }
    }
}
