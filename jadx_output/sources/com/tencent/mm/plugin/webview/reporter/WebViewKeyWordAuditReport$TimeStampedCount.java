package com.tencent.mm.plugin.webview.reporter;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/reporter/WebViewKeyWordAuditReport$TimeStampedCount", "Landroid/os/Parcelable;", "CREATOR", "cx4/d", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WebViewKeyWordAuditReport$TimeStampedCount implements android.os.Parcelable {
    public static final cx4.d CREATOR = new cx4.d(null);

    /* renamed from: d, reason: collision with root package name */
    public long f183465d;

    /* renamed from: e, reason: collision with root package name */
    public int f183466e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        try {
            parcel.writeLong(this.f183465d);
            parcel.writeInt(this.f183466e);
        } catch (java.lang.RuntimeException unused) {
        }
    }
}
