package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes13.dex */
public class n0 implements com.tencent.tmsqmsp.oaid2.b {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f215620a = null;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.IVendorCallback f215621b = null;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        return "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        return "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        return com.tencent.tmsqmsp.oaid2.m0.a();
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
        new java.lang.Thread(new com.tencent.tmsqmsp.oaid2.p1(this)).start();
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.f215620a = context;
        this.f215621b = iVendorCallback;
        com.tencent.tmsqmsp.oaid2.m0.b(context);
    }
}
