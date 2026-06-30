package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class pd implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.qd f147314a;

    public pd(com.tencent.mm.plugin.luckymoney.ui.qd qdVar) {
        this.f147314a = qdVar;
    }

    @Override // gb3.i
    public final void onComplete(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUISkinUIC", "[doSourceStyle] load thumbView result : " + z17);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.od(z17, this.f147314a));
    }
}
