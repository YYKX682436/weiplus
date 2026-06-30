package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public class c0 implements com.tencent.tmsqmsp.oaid2.a0, com.tencent.tmsqmsp.oaid2.b {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.z f215558a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f215559b;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.IVendorCallback f215560c;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        if (com.tencent.tmsqmsp.oaid2.z.a(context)) {
            java.lang.String a17 = com.tencent.tmsqmsp.oaid2.e.a(context);
            if (!android.text.TextUtils.isEmpty(a17)) {
                com.tencent.tmsqmsp.oaid2.z.a(context, a17);
            }
            this.f215558a = new com.tencent.tmsqmsp.oaid2.z(context, this);
        }
        this.f215560c = iVendorCallback;
        this.f215559b = context;
    }

    @Override // com.tencent.tmsqmsp.oaid2.a0
    public void b() {
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback = this.f215560c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, "", "");
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        java.lang.String a17;
        return (!e() || (a17 = this.f215558a.a()) == null) ? "" : a17;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        com.tencent.tmsqmsp.oaid2.z zVar = this.f215558a;
        if (zVar != null) {
            return zVar.c();
        }
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
        com.tencent.tmsqmsp.oaid2.z zVar = this.f215558a;
        if (zVar != null) {
            zVar.a(com.tencent.tmsqmsp.oaid2.e.a(this.f215559b));
        } else {
            b();
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
        com.tencent.tmsqmsp.oaid2.z zVar = this.f215558a;
        if (zVar != null) {
            zVar.d();
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        java.lang.String b17;
        return (!e() || (b17 = this.f215558a.b()) == null) ? "" : b17;
    }

    @Override // com.tencent.tmsqmsp.oaid2.a0
    public void a(boolean z17) {
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback = this.f215560c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), d(), a());
        }
    }
}
