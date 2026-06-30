package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class s0 implements com.tencent.tmsqmsp.oaid2.b, com.tencent.tmsqmsp.oaid2.r0.b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.IVendorCallback f215662a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.r0 f215663b;

    @Override // com.tencent.tmsqmsp.oaid2.r0.b
    public void a(com.tencent.tmsqmsp.oaid2.r0 r0Var) {
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback = this.f215662a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), d(), a());
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        java.lang.String a17;
        return (e() && (a17 = this.f215663b.a()) != null) ? a17 : "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        com.tencent.tmsqmsp.oaid2.r0 r0Var = this.f215663b;
        if (r0Var != null) {
            return r0Var.d();
        }
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
        com.tencent.tmsqmsp.oaid2.r0 r0Var = this.f215663b;
        if (r0Var != null) {
            r0Var.e();
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.f215662a = iVendorCallback;
        com.tencent.tmsqmsp.oaid2.r0 r0Var = new com.tencent.tmsqmsp.oaid2.r0(context, this);
        this.f215663b = r0Var;
        r0Var.c();
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        java.lang.String b17;
        return (e() && (b17 = this.f215663b.b()) != null) ? b17 : "";
    }
}
