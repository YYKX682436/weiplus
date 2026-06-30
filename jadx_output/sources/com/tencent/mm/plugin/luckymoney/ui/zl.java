package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class zl implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147791a;

    public zl(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f147791a = luckyMoneyPickEnvelopeUI;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[setRightTextOptionMenu] LiteAppStore onDispatch actionName: %s", str);
        if (!"returntomakeredenvelopspage".equals(str)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.T6(this.f147791a);
        return false;
    }
}
