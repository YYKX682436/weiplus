package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class WebViewStubCallbackWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.ea();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.stub.z0 f183795d;

    /* renamed from: e, reason: collision with root package name */
    public final int f183796e;

    public WebViewStubCallbackWrapper(com.tencent.mm.plugin.webview.stub.z0 z0Var, int i17) {
        this.f183795d = z0Var;
        this.f183796e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) && ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) obj).f183796e == this.f183796e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStrongBinder(this.f183795d.asBinder());
    }

    public WebViewStubCallbackWrapper(android.os.IBinder iBinder, com.tencent.mm.plugin.webview.ui.tools.ea eaVar) {
        com.tencent.mm.plugin.webview.stub.z0 w0Var;
        int i17 = com.tencent.mm.plugin.webview.stub.x0.f183581d;
        if (iBinder == null) {
            w0Var = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
            if (queryLocalInterface != null && (queryLocalInterface instanceof com.tencent.mm.plugin.webview.stub.z0)) {
                w0Var = (com.tencent.mm.plugin.webview.stub.z0) queryLocalInterface;
            } else {
                w0Var = new com.tencent.mm.plugin.webview.stub.w0(iBinder);
            }
        }
        this.f183795d = w0Var;
    }
}
