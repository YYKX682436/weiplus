package p31;

/* loaded from: classes9.dex */
public final class d implements android.os.Parcelable.Creator {
    public d(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        long readLong = parcel.readLong();
        java.lang.String readString = parcel.readString();
        kotlin.jvm.internal.o.d(readString);
        return new com.tencent.mm.msgsubscription.voice.PlayVoiceData(readLong, readString, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.msgsubscription.voice.PlayVoiceData[i17];
    }
}
