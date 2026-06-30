package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class bo implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f146767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f146768b;

    public bo(com.tencent.mm.plugin.luckymoney.ui.co coVar, r45.wv3 wv3Var) {
        this.f146768b = coVar;
        this.f146767a = wv3Var;
    }

    @Override // gb3.i
    public void onComplete(boolean z17) {
        com.tencent.mm.plugin.luckymoney.ui.ao aoVar = new com.tencent.mm.plugin.luckymoney.ui.ao(this, z17);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            aoVar.run();
        } else {
            this.f146768b.D.post(aoVar);
        }
    }
}
