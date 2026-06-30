package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class w6 extends com.tencent.mm.sdk.platformtools.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.OutputStream[] f193051a;

    public w6(java.io.OutputStream[] outputStreamArr) {
        this.f193051a = outputStreamArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void a(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        super.a(a7Var);
        this.f193051a[0] = null;
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void b(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        java.io.OutputStream b17 = a7Var.b();
        java.io.OutputStream[] outputStreamArr = this.f193051a;
        outputStreamArr[0] = b17;
        if (outputStreamArr[0] == null) {
            a(a7Var);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public boolean c() {
        return false;
    }
}
