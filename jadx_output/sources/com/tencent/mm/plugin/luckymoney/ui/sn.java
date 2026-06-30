package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class sn implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147433b;

    public sn(com.tencent.mm.plugin.luckymoney.ui.co coVar, r45.wv3 wv3Var) {
        this.f147433b = coVar;
        this.f147432a = wv3Var;
    }

    @Override // gb3.i
    public void onComplete(boolean z17) {
        com.tencent.mm.plugin.luckymoney.ui.rn rnVar = new com.tencent.mm.plugin.luckymoney.ui.rn(this);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            rnVar.run();
        } else {
            this.f147433b.D.post(rnVar);
        }
    }
}
