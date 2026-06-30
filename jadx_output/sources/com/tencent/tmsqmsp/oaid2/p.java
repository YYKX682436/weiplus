package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class p implements com.tencent.tmsqmsp.oaid2.b, com.tencent.tmsqmsp.oaid2.o {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.IVendorCallback f215629a;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.q f215632d;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f215630b = "";

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f215631c = "";

    /* renamed from: e, reason: collision with root package name */
    private boolean f215633e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f215634f = false;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.f215629a = iVendorCallback;
        com.tencent.tmsqmsp.oaid2.q qVar = new com.tencent.tmsqmsp.oaid2.q(context);
        this.f215632d = qVar;
        qVar.a(this);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return null;
    }

    @Override // com.tencent.tmsqmsp.oaid2.o
    public void b() {
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback = this.f215629a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, null, null);
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        return this.f215631c;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        return this.f215634f;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
        this.f215632d.a(this);
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
        com.tencent.tmsqmsp.oaid2.q qVar;
        if (!this.f215633e || (qVar = this.f215632d) == null) {
            return;
        }
        qVar.a();
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String a() {
        return this.f215630b;
    }

    @Override // com.tencent.tmsqmsp.oaid2.o
    public void a(com.tencent.tmsqmsp.oaid2.n nVar) {
        try {
            java.lang.String c17 = nVar.c();
            this.f215630b = c17;
            if (c17 == null) {
                this.f215630b = "";
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            java.lang.String i17 = nVar.i();
            this.f215631c = i17;
            if (i17 == null) {
                this.f215631c = "";
            }
        } catch (java.lang.Exception unused2) {
        }
        try {
            this.f215634f = nVar.b();
        } catch (java.lang.Exception unused3) {
        }
        this.f215633e = true;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback = this.f215629a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(this.f215634f, this.f215631c, this.f215630b);
        }
    }
}
