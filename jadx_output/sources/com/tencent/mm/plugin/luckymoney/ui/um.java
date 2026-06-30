package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class um implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.vm f147515b;

    public um(com.tencent.mm.plugin.luckymoney.ui.vm vmVar, r45.wv3 wv3Var) {
        this.f147515b = vmVar;
        this.f147514a = wv3Var;
    }

    @Override // gb3.i
    public void onComplete(boolean z17) {
        com.tencent.mm.plugin.luckymoney.ui.tm tmVar = new com.tencent.mm.plugin.luckymoney.ui.tm(this, z17);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            tmVar.run();
        } else {
            this.f147515b.f147571n.post(tmVar);
        }
    }
}
