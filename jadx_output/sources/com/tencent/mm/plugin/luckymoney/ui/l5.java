package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class l5 implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f147127a;

    public l5(com.tencent.mm.plugin.luckymoney.ui.t5 t5Var, in5.s0 s0Var) {
        this.f147127a = s0Var;
    }

    @Override // gb3.i
    public void onComplete(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "load ok: %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.luckymoney.ui.k5 k5Var = new com.tencent.mm.plugin.luckymoney.ui.k5(this, z17);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            k5Var.run();
        } else {
            this.f147127a.p(com.tencent.mm.R.id.ikz).post(k5Var);
        }
    }
}
