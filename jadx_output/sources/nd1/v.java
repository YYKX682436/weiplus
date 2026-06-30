package nd1;

/* loaded from: classes7.dex */
public final class v implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs(parcel.readString(), parcel.readBundle(com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs.class.getClassLoader()), (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs[i17];
    }
}
