package oicq.wlogin_sdk.sharemem;

/* loaded from: classes13.dex */
public class WloginSimpleInfo implements java.io.Serializable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<oicq.wlogin_sdk.sharemem.WloginSimpleInfo> CREATOR = new i36.c();
    private static final long serialVersionUID = 1;
    public byte[] _age;
    public byte[] _face;
    public byte[] _gender;
    public byte[] _nick;
    public long _uin;

    public WloginSimpleInfo() {
        this._uin = 0L;
        this._face = new byte[0];
        this._age = new byte[0];
        this._gender = new byte[0];
        this._nick = new byte[0];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public oicq.wlogin_sdk.sharemem.WloginSimpleInfo get_clone() {
        oicq.wlogin_sdk.sharemem.WloginSimpleInfo wloginSimpleInfo = new oicq.wlogin_sdk.sharemem.WloginSimpleInfo();
        wloginSimpleInfo._uin = this._uin;
        wloginSimpleInfo._face = (byte[]) this._face.clone();
        wloginSimpleInfo._age = (byte[]) this._age.clone();
        wloginSimpleInfo._gender = (byte[]) this._gender.clone();
        wloginSimpleInfo._nick = (byte[]) this._nick.clone();
        return wloginSimpleInfo;
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this._uin = parcel.readLong();
        this._face = parcel.createByteArray();
        this._age = parcel.createByteArray();
        this._gender = parcel.createByteArray();
        this._nick = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this._uin);
        parcel.writeByteArray(this._face);
        parcel.writeByteArray(this._age);
        parcel.writeByteArray(this._gender);
        parcel.writeByteArray(this._nick);
    }

    public WloginSimpleInfo(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this._uin = j17;
        this._face = (byte[]) bArr.clone();
        this._age = (byte[]) bArr2.clone();
        this._gender = (byte[]) bArr3.clone();
        this._nick = (byte[]) bArr4.clone();
    }

    public void get_clone(oicq.wlogin_sdk.sharemem.WloginSimpleInfo wloginSimpleInfo) {
        this._uin = wloginSimpleInfo._uin;
        this._face = (byte[]) wloginSimpleInfo._face.clone();
        this._age = (byte[]) wloginSimpleInfo._age.clone();
        this._gender = (byte[]) wloginSimpleInfo._gender.clone();
        this._nick = (byte[]) wloginSimpleInfo._nick.clone();
    }

    private WloginSimpleInfo(android.os.Parcel parcel) {
        readFromParcel(parcel);
    }

    public /* synthetic */ WloginSimpleInfo(android.os.Parcel parcel, i36.c cVar) {
        this(parcel);
    }
}
