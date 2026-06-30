package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public class h implements com.tencent.tmsqmsp.oaid2.b, com.tencent.tmsqmsp.oaid2.f.b {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.IVendorCallback f215594a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.f f215595b;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.f215594a = iVendorCallback;
        com.tencent.tmsqmsp.oaid2.f fVar = new com.tencent.tmsqmsp.oaid2.f(context, this);
        this.f215595b = fVar;
        fVar.c();
    }

    @Override // com.tencent.tmsqmsp.oaid2.f.b
    public void b() {
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback = this.f215594a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), d(), a());
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        java.lang.String a17;
        return (e() && (a17 = this.f215595b.a()) != null) ? a17 : "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        com.tencent.tmsqmsp.oaid2.f fVar = this.f215595b;
        if (fVar != null) {
            return fVar.d();
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
        com.tencent.tmsqmsp.oaid2.f fVar = this.f215595b;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        java.lang.String b17;
        return (e() && (b17 = this.f215595b.b()) != null) ? b17 : "";
    }
}
