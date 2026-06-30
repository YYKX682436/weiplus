package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class o2 implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145494a;

    public o2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var) {
        this.f145494a = w2Var;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.vm3 vm3Var = (r45.vm3) obj;
        if (vm3Var != null) {
            r45.nm5 nm5Var = vm3Var.f388358d;
            if (nm5Var != null) {
                nm5Var.G = vm3Var.f388359e;
            }
            this.f145494a.qj(nm5Var, false);
        }
    }
}
