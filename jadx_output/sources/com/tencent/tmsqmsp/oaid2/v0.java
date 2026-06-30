package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class v0 implements com.tencent.tmsqmsp.oaid2.b {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.tmsqmsp.oaid2.u0 f215674a;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.f215674a = new com.tencent.tmsqmsp.oaid2.u0(context);
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        return null;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        return "1".equals(a("persist.sys.identifierid.supported", "0"));
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return true;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        return this.f215674a.a(0, "");
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, str, com.eclipsesource.mmv8.Platform.UNKNOWN);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
