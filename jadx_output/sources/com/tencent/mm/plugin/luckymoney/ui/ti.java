package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ti implements tl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147463a;

    public ti(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147463a = luckyMoneyNewYearSendUIV2;
    }

    @Override // tl.f
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "voicePlayer onError");
        android.view.View view = this.f147463a.f146405h;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.luckymoney.ui.si(this));
        }
    }
}
