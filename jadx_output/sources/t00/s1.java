package t00;

/* loaded from: classes9.dex */
public final class s1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo[i17];
    }
}
