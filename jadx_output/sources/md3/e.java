package md3;

/* loaded from: classes.dex */
public final class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileResult(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileResult[i17];
    }
}
