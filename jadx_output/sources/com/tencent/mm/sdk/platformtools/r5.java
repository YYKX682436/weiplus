package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class r5 implements com.tencent.mm.sdk.platformtools.w5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.t5 f192958a;

    public r5(com.tencent.mm.sdk.platformtools.t5 t5Var) {
        this.f192958a = t5Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.w5
    public void onCompletion() {
        com.tencent.mm.sdk.platformtools.t5 t5Var = this.f192958a;
        if (t5Var != null) {
            t5Var.onCompletion();
        }
    }
}
