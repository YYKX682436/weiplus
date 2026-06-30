package td1;

/* loaded from: classes4.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        kotlin.jvm.internal.o.d(readString);
        int readInt = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        kotlin.jvm.internal.o.d(readString2);
        return new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result(readString, readInt, readString2);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result[i17];
    }
}
