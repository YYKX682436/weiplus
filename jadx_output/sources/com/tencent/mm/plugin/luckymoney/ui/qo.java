package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class qo implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.no f147358a;

    public qo(com.tencent.mm.plugin.luckymoney.ui.no noVar) {
        this.f147358a = noVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[openSkinPlazaLiteApp] OpenLiteApp failed, do open local envelopeLayout");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.oo(this.f147358a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[openSkinPlazaLiteApp] OpenLiteApp success");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.po(this.f147358a));
    }
}
