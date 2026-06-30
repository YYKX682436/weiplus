package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class fd implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.cd f146904a;

    public fd(com.tencent.mm.plugin.luckymoney.ui.cd cdVar) {
        this.f146904a = cdVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[openSkinPlazaLiteApp] OpenLiteApp failed, do open local envelopeLayout");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.dd(this.f146904a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[openSkinPlazaLiteApp] OpenLiteApp success");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.ed(this.f146904a));
    }
}
