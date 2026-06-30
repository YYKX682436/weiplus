package fq4;

/* loaded from: classes16.dex */
public class r implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.voiceprint.model.VertifyInfo vertifyInfo = new com.tencent.mm.plugin.voiceprint.model.VertifyInfo();
        vertifyInfo.f176154d = parcel.readInt();
        vertifyInfo.f176155e = parcel.readInt();
        vertifyInfo.f176158h = parcel.readInt();
        vertifyInfo.f176159i = parcel.readInt();
        vertifyInfo.f176156f = parcel.readString();
        vertifyInfo.f176157g = parcel.readString();
        vertifyInfo.f176160m = parcel.readString();
        vertifyInfo.f176161n = parcel.readInt() > 0;
        vertifyInfo.f176162o = parcel.readInt() > 0;
        vertifyInfo.f176159i = vertifyInfo.f176154d;
        return vertifyInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.voiceprint.model.VertifyInfo[i17];
    }
}
