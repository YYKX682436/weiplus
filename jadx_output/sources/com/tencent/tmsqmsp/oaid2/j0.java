package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class j0 implements com.tencent.tmsqmsp.oaid2.b {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f215601a;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.f215601a = context;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public java.lang.String d() {
        android.content.Context context = this.f215601a;
        return com.tencent.tmsqmsp.oaid2.k0.a(context, com.tencent.tmsqmsp.oaid2.e.a(context));
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        return com.tencent.tmsqmsp.oaid2.k0.a(this.f215601a);
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
        return com.tencent.tmsqmsp.oaid2.k0.b(this.f215601a);
    }
}
