package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes13.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.n0 f215641d;

    public p1(com.tencent.tmsqmsp.oaid2.n0 n0Var) {
        this.f215641d = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback2;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback3;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback4;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback5;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback6;
        android.content.Context context;
        com.tencent.tmsqmsp.oaid2.n0 n0Var = this.f215641d;
        try {
            if (!com.tencent.tmsqmsp.oaid2.m0.a()) {
                iVendorCallback3 = n0Var.f215621b;
                if (iVendorCallback3 != null) {
                    iVendorCallback4 = n0Var.f215621b;
                    iVendorCallback4.onResult(false, "", "");
                    return;
                }
                return;
            }
            iVendorCallback5 = n0Var.f215621b;
            if (iVendorCallback5 != null) {
                iVendorCallback6 = n0Var.f215621b;
                context = n0Var.f215620a;
                iVendorCallback6.onResult(true, "", com.tencent.tmsqmsp.oaid2.m0.a(context));
            }
        } catch (java.lang.Throwable unused) {
            iVendorCallback = n0Var.f215621b;
            if (iVendorCallback != null) {
                iVendorCallback2 = n0Var.f215621b;
                iVendorCallback2.onResult(false, "", "");
            }
        }
    }
}
