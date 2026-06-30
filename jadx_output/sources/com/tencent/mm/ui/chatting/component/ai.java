package com.tencent.mm.ui.chatting.component;

/* loaded from: classes4.dex */
public final class ai extends com.tencent.mm.modelbase.i {
    public ai(java.lang.String userName, java.lang.String url) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(url, "url");
        jz5.g b17 = jz5.h.b(new com.tencent.mm.ui.chatting.component.zh(userName, url));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = (r45.tj3) ((jz5.n) b17).getValue();
        lVar.f70665b = new r45.uj3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getopenimarchivepopupinfo";
        lVar.f70667d = 6987;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetArchiveInfo", "onCgiBack errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
    }
}
