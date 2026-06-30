package com.tencent.wechat.aff.emoticon;

/* loaded from: classes15.dex */
class ZIDL__QyxtZkpB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.emoticon.m f216634a;

    public void ZIDL_A(byte[] bArr) {
        com.tencent.wechat.aff.emoticon.m mVar = this.f216634a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.tencent.mm.feature.emoji.s2) mVar).getClass();
        com.tencent.wechat.aff.emoticon.k kVar = com.tencent.wechat.aff.emoticon.l.f216651c;
        com.tencent.wechat.aff.emoticon.i iVar = (com.tencent.wechat.aff.emoticon.i) kVar.a().f216653a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (iVar != null) {
            java.util.ArrayList arrayList = iVar.f216646c;
            int size = arrayList.size();
            java.util.ArrayList arrayList2 = iVar.f216647d;
            arrayList2.clear();
            arrayList2.addAll(kz5.n0.R(kVar.a().a(iVar.f216644a), size));
            arrayList.clear();
            arrayList.addAll(kVar.a().a(iVar.f216644a));
            yz5.l lVar = iVar.f216648e;
            if (lVar != null) {
                lVar.invoke(com.tencent.wechat.aff.emoticon.g.f216640d);
            }
            iVar.f216648e = null;
        }
    }

    public void ZIDL_B(byte[] bArr) {
        com.tencent.wechat.aff.emoticon.m mVar = this.f216634a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.tencent.mm.feature.emoji.s2) mVar).getClass();
        com.tencent.wechat.aff.emoticon.i iVar = (com.tencent.wechat.aff.emoticon.i) com.tencent.wechat.aff.emoticon.l.f216651c.a().f216653a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (iVar != null) {
            yz5.l lVar = iVar.f216648e;
            if (lVar != null) {
                lVar.invoke(com.tencent.wechat.aff.emoticon.g.f216641e);
            }
            iVar.f216648e = null;
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f216634a = (com.tencent.wechat.aff.emoticon.m) obj;
    }
}
