package zs5;

/* loaded from: classes13.dex */
public final class w0 implements android.os.Parcelable.Creator {
    public w0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.qbar.WxQBarPoint(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.qbar.WxQBarPoint[i17];
    }
}
