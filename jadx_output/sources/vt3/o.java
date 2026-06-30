package vt3;

/* loaded from: classes5.dex */
public final class o implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(vt3.m.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem[i17];
    }
}
