package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class rn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.sn f147392d;

    public rn(com.tencent.mm.plugin.luckymoney.ui.sn snVar) {
        this.f147392d = snVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.wv3 wv3Var = this.f147392d.f147432a;
        if (wv3Var.f389503i == 1 || wv3Var.f389507p == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "envelope has expired do nothing");
        }
    }
}
