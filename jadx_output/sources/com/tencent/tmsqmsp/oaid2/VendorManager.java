package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class VendorManager implements com.tencent.tmsqmsp.oaid2.IVendorCallback {
    private com.tencent.tmsqmsp.oaid2.b vendorInfo = null;
    private com.tencent.tmsqmsp.oaid2.IVendorCallback userCallback = null;

    public int getVendorInfo(android.content.Context context, com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback) {
        this.userCallback = iVendorCallback;
        switch (com.tencent.tmsqmsp.oaid2.l.f215605a[com.tencent.tmsqmsp.oaid2.d.b().ordinal()]) {
            case 1:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.w0();
                break;
            case 2:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.v0();
                break;
            case 3:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.t();
                break;
            case 4:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.n0();
                break;
            case 5:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.w();
                break;
            case 6:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.p();
                break;
            case 7:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.s0();
                break;
            case 8:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.i0();
                break;
            case 9:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.j0();
                break;
            case 10:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.c0();
                break;
            case 11:
                this.vendorInfo = new com.tencent.tmsqmsp.oaid2.m();
                break;
            case 12:
                if (com.tencent.tmsqmsp.oaid2.d.a(context)) {
                    this.vendorInfo = new com.tencent.tmsqmsp.oaid2.h();
                    break;
                }
                break;
        }
        if (this.vendorInfo == null && com.tencent.tmsqmsp.oaid2.e.a()) {
            this.vendorInfo = new com.tencent.tmsqmsp.oaid2.t();
        }
        if (this.vendorInfo == null) {
            onResult(false, "", "");
            return com.tencent.tmsqmsp.oaid2.a.f215553a;
        }
        com.tencent.tmsqmsp.oaid2.t0.a(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        try {
            this.vendorInfo.a(context, this);
            if (this.vendorInfo.k()) {
                com.tencent.tmsqmsp.oaid2.t0.a("sync");
                try {
                    onResult(this.vendorInfo.e(), this.vendorInfo.d(), this.vendorInfo.a());
                } catch (java.lang.Throwable unused) {
                    onResult(false, "", "");
                }
            } else {
                try {
                    this.vendorInfo.j();
                } catch (java.lang.Throwable unused2) {
                    onResult(false, "", "");
                    return com.tencent.tmsqmsp.oaid2.a.f215554b;
                }
            }
            return 0;
        } catch (java.lang.Throwable unused3) {
            onResult(false, "", "");
            return com.tencent.tmsqmsp.oaid2.a.f215554b;
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.IVendorCallback
    public void onResult(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.tmsqmsp.oaid2.t0.b("vm onResult ".concat(java.lang.String.valueOf(z17)));
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        try {
            com.tencent.tmsqmsp.oaid2.IVendorCallback iVendorCallback = this.userCallback;
            if (iVendorCallback != null) {
                iVendorCallback.onResult(z17, str, str2);
            }
            com.tencent.tmsqmsp.oaid2.b bVar = this.vendorInfo;
            if (bVar != null) {
                bVar.l();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.tmsqmsp.oaid2.t0.a(th6.toString());
        }
    }
}
