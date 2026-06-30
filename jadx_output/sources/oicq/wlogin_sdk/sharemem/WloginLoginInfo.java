package oicq.wlogin_sdk.sharemem;

/* loaded from: classes9.dex */
public class WloginLoginInfo implements java.io.Serializable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<oicq.wlogin_sdk.sharemem.WloginLoginInfo> CREATOR = new i36.a();
    public static int TYPE_LOACL = 1;
    public static int TYPE_REMOTE = 2;
    private static final long serialVersionUID = 5551948389726789420L;
    public java.lang.String mAccount;
    public long mAppid;
    public long mCreateTime;
    public int mType;
    public long mUin;

    private WloginLoginInfo(android.os.Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.mAccount = parcel.readString();
        this.mUin = parcel.readLong();
        this.mAppid = parcel.readLong();
        this.mCreateTime = parcel.readLong();
        this.mType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.mAccount);
        parcel.writeLong(this.mUin);
        parcel.writeLong(this.mAppid);
        parcel.writeLong(this.mCreateTime);
        parcel.writeInt(this.mType);
    }

    public /* synthetic */ WloginLoginInfo(android.os.Parcel parcel, i36.a aVar) {
        this(parcel);
    }

    public WloginLoginInfo(java.lang.String str, long j17, long j18, long j19, int i17) {
        this.mAccount = str;
        this.mUin = j17;
        this.mAppid = j18;
        this.mCreateTime = j19;
        this.mType = i17;
    }
}
