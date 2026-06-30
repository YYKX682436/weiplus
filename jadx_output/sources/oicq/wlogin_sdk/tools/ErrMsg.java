package oicq.wlogin_sdk.tools;

/* loaded from: classes13.dex */
public class ErrMsg implements java.lang.Cloneable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<oicq.wlogin_sdk.tools.ErrMsg> CREATOR = new k36.b();

    /* renamed from: d, reason: collision with root package name */
    public int f345659d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f345660e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f345661f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f345662g;

    public ErrMsg() {
        this.f345659d = 0;
        this.f345660e = "";
        this.f345661f = "";
        this.f345662g = "";
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f345659d);
        parcel.writeString(this.f345660e);
        parcel.writeString(this.f345661f);
        parcel.writeString(this.f345662g);
    }

    public ErrMsg(android.os.Parcel parcel, k36.b bVar) {
        this.f345659d = parcel.readInt();
        this.f345660e = parcel.readString();
        this.f345661f = parcel.readString();
        this.f345662g = parcel.readString();
    }
}
