package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class o2 implements com.tencent.mm.ipcinvoker.wx_extension.v {
    public o2(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        if (i17 == 0 && i18 == 0 && oVar.f70711b.f70700a != null) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "hy: cgiReportLog fail, errType:" + i17 + ",errCode:" + i18);
    }
}
