package fd3;

/* loaded from: classes.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType((com.tencent.mm.ipcinvoker.type.IPCString) parcel.readParcelable(com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType.class.getClassLoader()), (com.tencent.mm.ipcinvoker.type.IPCString) parcel.readParcelable(com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType[i17];
    }
}
