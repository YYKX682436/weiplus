package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public class w implements com.tencent.tmsqmsp.oaid2.b, com.tencent.tmsqmsp.oaid2.x.b {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.x f215676a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.IVendorCallback f215677b;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.f215677b = iVendorCallback;
        this.f215676a = new com.tencent.tmsqmsp.oaid2.x(context, this);
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        java.lang.String c17;
        return (e() && (c17 = this.f215676a.c()) != null) ? c17 : "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        com.tencent.tmsqmsp.oaid2.x xVar = this.f215676a;
        if (xVar != null) {
            return xVar.b();
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
        com.tencent.tmsqmsp.oaid2.x xVar = this.f215676a;
        if (xVar != null) {
            xVar.d();
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        java.lang.String a17;
        return (e() && (a17 = this.f215676a.a()) != null) ? a17 : "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.x.b
    public void a(com.tencent.tmsqmsp.oaid2.x xVar) {
        try {
            com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback = this.f215677b;
            if (iVendorCallback != null) {
                iVendorCallback.onResult(e(), d(), a());
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback2 = this.f215677b;
            if (iVendorCallback2 != null) {
                iVendorCallback2.onResult(false, "", "");
            }
        }
    }
}
