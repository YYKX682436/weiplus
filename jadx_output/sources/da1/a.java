package da1;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent((android.content.Intent) parcel.readParcelable(com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent[i17];
    }
}
