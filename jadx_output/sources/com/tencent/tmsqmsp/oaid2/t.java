package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class t implements com.tencent.tmsqmsp.oaid2.b {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f215665a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.IVendorCallback f215666b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f215667c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f215668d = false;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        return "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
        new java.lang.Thread(new com.tencent.tmsqmsp.oaid2.u1(this)).start();
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
        this.f215665a = context;
        this.f215666b = iVendorCallback;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        return this.f215667c;
    }
}
