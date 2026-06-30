package r10;

/* loaded from: classes4.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsAsyncRequest(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsAsyncRequest[i17];
    }
}
