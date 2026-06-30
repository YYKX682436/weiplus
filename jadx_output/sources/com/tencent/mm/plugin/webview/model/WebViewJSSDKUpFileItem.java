package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class WebViewJSSDKUpFileItem extends com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.model.WebViewJSSDKUpFileItem> CREATOR = new com.tencent.mm.plugin.webview.model.o4();

    /* renamed from: w, reason: collision with root package name */
    public int f182752w = -1;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f182753x;

    public WebViewJSSDKUpFileItem() {
        this.f182742n = 3;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public java.lang.String b() {
        return "file";
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public java.lang.String c() {
        return "nomal";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
    public void e(dn.h hVar) {
        super.e(hVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f182752w + "");
        arrayList.add(this.f182753x);
        arrayList.add(hVar.field_fileId);
        arrayList.add(hVar.field_aesKey);
        arrayList.add(hVar.field_fileLength + "");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            arrayList.add("1");
        } else if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            arrayList.add("4");
        } else if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            arrayList.add("5");
        } else if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
            arrayList.add("6");
        } else if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            arrayList.add("3");
        } else if (com.tencent.mars.comm.NetStatusUtil.isWap(context)) {
            arrayList.add("2");
        } else {
            arrayList.add("0");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.l(12018, arrayList);
        java.lang.String str = this.f182738g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            r6Var.l();
        }
    }

    @Override // com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    public WebViewJSSDKUpFileItem(android.os.Parcel parcel, com.tencent.mm.plugin.webview.model.o4 o4Var) {
    }
}
