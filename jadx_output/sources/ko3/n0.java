package ko3;

/* loaded from: classes.dex */
public class n0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.plugin.normsg.utils.ScreenRecordDetector$ScreenRecordInfo
            public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.normsg.utils.ScreenRecordDetector$ScreenRecordInfo> CREATOR = new ko3.n0();

            /* renamed from: d, reason: collision with root package name */
            public final int f152423d;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.String f152424e;

            /* renamed from: f, reason: collision with root package name */
            public final long f152425f;

            {
                this.f152423d = parcel.readInt();
                this.f152424e = parcel.readString();
                this.f152425f = parcel.readLong();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeInt(this.f152423d);
                parcel2.writeString(this.f152424e);
                parcel2.writeLong(this.f152425f);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.normsg.utils.ScreenRecordDetector$ScreenRecordInfo[i17];
    }
}
