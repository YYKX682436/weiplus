package com.tencent.mm.plugin.wallet.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/wallet/api/JsApiRequestWCPayRealnameVerifyParameter;", "Landroid/os/Parcelable;", "wallet-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiRequestWCPayRealnameVerifyParameter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter> CREATOR = new pr4.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f177553d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f177554e;

    public JsApiRequestWCPayRealnameVerifyParameter(java.lang.String scene, java.lang.String token) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(token, "token");
        this.f177553d = scene;
        this.f177554e = token;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter)) {
            return false;
        }
        com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter = (com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) obj;
        return kotlin.jvm.internal.o.b(this.f177553d, jsApiRequestWCPayRealnameVerifyParameter.f177553d) && kotlin.jvm.internal.o.b(this.f177554e, jsApiRequestWCPayRealnameVerifyParameter.f177554e);
    }

    public int hashCode() {
        return (this.f177553d.hashCode() * 31) + this.f177554e.hashCode();
    }

    public java.lang.String toString() {
        return "JsApiRequestWCPayRealnameVerifyParameter(scene=" + this.f177553d + ", token=" + this.f177554e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f177553d);
        out.writeString(this.f177554e);
    }
}
