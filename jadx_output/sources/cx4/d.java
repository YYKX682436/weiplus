package cx4;

/* loaded from: classes8.dex */
public final class d implements android.os.Parcelable.Creator {
    public d(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount webViewKeyWordAuditReport$TimeStampedCount = new com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount();
        webViewKeyWordAuditReport$TimeStampedCount.f183465d = parcel.readLong();
        webViewKeyWordAuditReport$TimeStampedCount.f183466e = parcel.readInt();
        return webViewKeyWordAuditReport$TimeStampedCount;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount[i17];
    }
}
