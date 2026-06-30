package xc1;

/* loaded from: classes7.dex */
public final class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage[i17];
    }
}
