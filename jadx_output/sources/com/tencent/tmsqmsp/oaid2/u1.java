package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.t f215673d;

    public u1(com.tencent.tmsqmsp.oaid2.t tVar) {
        this.f215673d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback2;
        boolean z17;
        java.lang.String str2;
        android.content.Context context;
        java.lang.String str3;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback3;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback4;
        boolean z18;
        java.lang.String str4;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback5;
        com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback6;
        com.tencent.tmsqmsp.oaid2.t tVar = this.f215673d;
        try {
            context = tVar.f215665a;
            com.tencent.tmsqmsp.oaid2.r.a a17 = com.tencent.tmsqmsp.oaid2.r.a(context);
            if (a17 == null) {
                iVendorCallback5 = tVar.f215666b;
                if (iVendorCallback5 != null) {
                    iVendorCallback6 = tVar.f215666b;
                    iVendorCallback6.onResult(false, "", "");
                    return;
                }
                return;
            }
            tVar.f215667c = a17.a();
            a17.b();
            str3 = tVar.f215667c;
            if (!android.text.TextUtils.isEmpty(str3)) {
                tVar.f215668d = true;
            }
            iVendorCallback3 = tVar.f215666b;
            if (iVendorCallback3 != null) {
                iVendorCallback4 = tVar.f215666b;
                z18 = tVar.f215668d;
                str4 = tVar.f215667c;
                iVendorCallback4.onResult(z18, "", str4);
            }
        } catch (java.lang.Throwable unused) {
            str = tVar.f215667c;
            if (android.text.TextUtils.isEmpty(str)) {
                tVar.f215668d = false;
            }
            iVendorCallback = tVar.f215666b;
            if (iVendorCallback != null) {
                iVendorCallback2 = tVar.f215666b;
                z17 = tVar.f215668d;
                str2 = tVar.f215667c;
                iVendorCallback2.onResult(z17, "", str2);
            }
        }
    }
}
