package oicq.wlogin_sdk.sharemem;

/* loaded from: classes13.dex */
public class WloginSigInfo implements java.io.Serializable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<oicq.wlogin_sdk.sharemem.WloginSigInfo> CREATOR = new i36.b();
    private static final long serialVersionUID = 1;
    public long _A2_expire_time;
    public byte[] _D2;
    public byte[] _D2Key;
    public byte[] _TGT;
    public byte[] _TGTKey;
    public byte[] _access_token;
    public long _app_pri;
    public long _create_time;
    public byte[] _en_A1;
    public long _expire_time;
    public byte[] _lsKey;
    public byte[] _noPicSig;
    public byte[] _openid;
    public byte[] _openkey;
    public long _ret_appid;
    public byte[] _sKey;
    public byte[] _sid;
    public byte[] _userA5;
    public byte[] _userA8;
    public byte[] _userPasswdSig;
    public byte[] _userSig64;
    public byte[] _userStSig;
    public byte[] _userStWebSig;
    public byte[] _userSt_Key;
    public byte[] _vkey;

    public WloginSigInfo(long j17, long j18, long j19, long j27, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[][] bArr13) {
        this._ret_appid = 0L;
        this._app_pri = j17;
        this._create_time = j18;
        this._expire_time = j19;
        this._A2_expire_time = j27;
        this._TGT = (byte[]) bArr.clone();
        this._TGTKey = (byte[]) bArr2.clone();
        this._userStSig = (byte[]) bArr3.clone();
        this._userSt_Key = (byte[]) bArr4.clone();
        if (bArr5 != null) {
            this._userStWebSig = (byte[]) bArr5.clone();
        } else {
            this._userStWebSig = new byte[0];
        }
        this._userPasswdSig = new byte[0];
        if (bArr6 != null) {
            this._userA5 = (byte[]) bArr6.clone();
        } else {
            this._userA5 = new byte[0];
        }
        if (bArr7 != null) {
            this._userA8 = (byte[]) bArr7.clone();
        } else {
            this._userA8 = new byte[0];
        }
        if (bArr8 != null) {
            this._lsKey = (byte[]) bArr8.clone();
        } else {
            this._lsKey = new byte[0];
        }
        if (bArr9 != null) {
            this._sKey = (byte[]) bArr9.clone();
        } else {
            this._sKey = new byte[0];
        }
        if (bArr10 != null) {
            this._userSig64 = (byte[]) bArr10.clone();
        } else {
            this._userSig64 = new byte[0];
        }
        if (bArr11 != null) {
            this._openid = (byte[]) bArr11.clone();
        } else {
            this._openid = new byte[0];
        }
        if (bArr12 != null) {
            this._openkey = (byte[]) bArr12.clone();
        } else {
            this._openkey = new byte[0];
        }
        if (bArr13 == null || bArr13.length != 7) {
            this._vkey = new byte[0];
            this._en_A1 = new byte[0];
            this._access_token = new byte[0];
            this._D2 = new byte[0];
            this._D2Key = new byte[0];
            this._sid = new byte[0];
            this._noPicSig = new byte[0];
            return;
        }
        this._vkey = (byte[]) bArr13[0].clone();
        this._en_A1 = (byte[]) bArr13[1].clone();
        this._access_token = (byte[]) bArr13[2].clone();
        this._D2 = (byte[]) bArr13[3].clone();
        this._D2Key = (byte[]) bArr13[4].clone();
        this._sid = (byte[]) bArr13[5].clone();
        this._noPicSig = (byte[]) bArr13[6].clone();
    }

    public oicq.wlogin_sdk.sharemem.WloginSigInfo Set(long j17, long j18, long j19, long j27, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[][] bArr13) {
        this._app_pri = j17;
        this._create_time = j18;
        this._expire_time = j19;
        this._A2_expire_time = j27;
        this._TGT = (byte[]) bArr.clone();
        this._TGTKey = (byte[]) bArr2.clone();
        this._userStSig = (byte[]) bArr3.clone();
        this._userSt_Key = (byte[]) bArr4.clone();
        if (bArr5 != null) {
            this._userStWebSig = (byte[]) bArr5.clone();
        } else {
            this._userStWebSig = new byte[0];
        }
        this._userPasswdSig = new byte[0];
        if (bArr6 != null) {
            this._userA5 = (byte[]) bArr6.clone();
        } else {
            this._userA5 = new byte[0];
        }
        if (bArr7 != null) {
            this._userA8 = (byte[]) bArr7.clone();
        } else {
            this._userA8 = new byte[0];
        }
        if (bArr8 != null) {
            this._lsKey = (byte[]) bArr8.clone();
        } else {
            this._lsKey = new byte[0];
        }
        if (bArr9 != null) {
            this._sKey = (byte[]) bArr9.clone();
        } else {
            this._sKey = new byte[0];
        }
        if (bArr10 != null) {
            this._userSig64 = (byte[]) bArr10.clone();
        } else {
            this._userSig64 = new byte[0];
        }
        if (bArr11 != null) {
            this._openid = (byte[]) bArr11.clone();
        } else {
            this._openid = new byte[0];
        }
        if (bArr12 != null) {
            this._openkey = (byte[]) bArr12.clone();
        } else {
            this._openkey = new byte[0];
        }
        if (bArr13 == null || bArr13.length != 7) {
            this._vkey = new byte[0];
            this._access_token = new byte[0];
            this._D2 = new byte[0];
            this._D2Key = new byte[0];
            this._sid = new byte[0];
            this._noPicSig = new byte[0];
        } else {
            this._vkey = (byte[]) bArr13[0].clone();
            bArr13[1].clone();
            if (((byte[]) bArr13[1].clone()).length > 0) {
                this._en_A1 = (byte[]) bArr13[1].clone();
                byte[] bArr14 = bArr13[6];
                if (bArr14 == null || bArr14.length <= 0) {
                    this._noPicSig = new byte[0];
                } else {
                    this._noPicSig = (byte[]) bArr14.clone();
                }
            }
            this._access_token = (byte[]) bArr13[2].clone();
            this._D2 = (byte[]) bArr13[3].clone();
            this._D2Key = (byte[]) bArr13[4].clone();
            this._sid = (byte[]) bArr13[5].clone();
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this._TGT = parcel.createByteArray();
        this._TGTKey = parcel.createByteArray();
        this._userStSig = parcel.createByteArray();
        this._userSt_Key = parcel.createByteArray();
        this._userStWebSig = parcel.createByteArray();
        this._userPasswdSig = parcel.createByteArray();
        this._userA5 = parcel.createByteArray();
        this._userA8 = parcel.createByteArray();
        this._lsKey = parcel.createByteArray();
        this._sKey = parcel.createByteArray();
        this._userSig64 = parcel.createByteArray();
        this._openid = parcel.createByteArray();
        this._openkey = parcel.createByteArray();
        this._vkey = parcel.createByteArray();
        this._en_A1 = parcel.createByteArray();
        this._access_token = parcel.createByteArray();
        this._D2 = parcel.createByteArray();
        this._D2Key = parcel.createByteArray();
        this._sid = parcel.createByteArray();
        this._noPicSig = parcel.createByteArray();
        this._expire_time = parcel.readLong();
        this._A2_expire_time = parcel.readLong();
        this._create_time = parcel.readLong();
        this._app_pri = parcel.readLong();
        this._ret_appid = parcel.readLong();
    }

    public java.lang.String toString() {
        try {
            return java.lang.String.format(java.util.Locale.getDefault(), "{A1:%d,%d,%s A2:%d,%s D2:%d,%s ext:%d-%d ct:%d}", java.lang.Integer.valueOf(this._en_A1.length), java.lang.Long.valueOf(this._create_time), oicq.wlogin_sdk.tools.util.i(this._en_A1, 2), java.lang.Integer.valueOf(this._TGT.length), oicq.wlogin_sdk.tools.util.i(this._TGT, 2), java.lang.Integer.valueOf(this._D2.length), oicq.wlogin_sdk.tools.util.i(this._D2, 2), java.lang.Long.valueOf(this._expire_time), java.lang.Long.valueOf(this._A2_expire_time), java.lang.Long.valueOf(this._create_time));
        } catch (java.lang.Exception e17) {
            oicq.wlogin_sdk.tools.util.v("WloginSigInfo.toString", e17);
            return "WloginSigInfo";
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByteArray(this._TGT);
        parcel.writeByteArray(this._TGTKey);
        parcel.writeByteArray(this._userStSig);
        parcel.writeByteArray(this._userSt_Key);
        parcel.writeByteArray(this._userStWebSig);
        parcel.writeByteArray(this._userPasswdSig);
        parcel.writeByteArray(this._userA5);
        parcel.writeByteArray(this._userA8);
        parcel.writeByteArray(this._lsKey);
        parcel.writeByteArray(this._sKey);
        parcel.writeByteArray(this._userSig64);
        parcel.writeByteArray(this._openid);
        parcel.writeByteArray(this._openkey);
        parcel.writeByteArray(this._vkey);
        parcel.writeByteArray(this._en_A1);
        parcel.writeByteArray(this._access_token);
        parcel.writeByteArray(this._D2);
        parcel.writeByteArray(this._D2Key);
        parcel.writeByteArray(this._sid);
        parcel.writeByteArray(this._noPicSig);
        parcel.writeLong(this._expire_time);
        parcel.writeLong(this._A2_expire_time);
        parcel.writeLong(this._create_time);
        parcel.writeLong(this._app_pri);
        parcel.writeLong(this._ret_appid);
    }

    private WloginSigInfo(android.os.Parcel parcel) {
        this._expire_time = 0L;
        this._A2_expire_time = 0L;
        this._create_time = 0L;
        this._app_pri = 0L;
        this._ret_appid = 0L;
        readFromParcel(parcel);
    }

    public /* synthetic */ WloginSigInfo(android.os.Parcel parcel, i36.b bVar) {
        this(parcel);
    }
}
