package oicq.wlogin_sdk.request;

/* loaded from: classes13.dex */
public class WloginAllSigInfo implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 1;
    public oicq.wlogin_sdk.sharemem.WloginSimpleInfo _useInfo = new oicq.wlogin_sdk.sharemem.WloginSimpleInfo();
    public java.util.TreeMap<java.lang.Long, oicq.wlogin_sdk.sharemem.WloginSigInfo> _tk_map = new java.util.TreeMap<>();
    public long _uin = 0;

    public oicq.wlogin_sdk.request.WloginAllSigInfo get_clone() {
        try {
            return (oicq.wlogin_sdk.request.WloginAllSigInfo) clone();
        } catch (java.lang.Exception e17) {
            oicq.wlogin_sdk.tools.util.a(e17.toString());
            return null;
        }
    }

    public int put_siginfo(long j17, long j18, long j19, long j27, long j28, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[][] bArr13) {
        oicq.wlogin_sdk.sharemem.WloginSigInfo wloginSigInfo = this._tk_map.get(new java.lang.Long(j17));
        java.util.TreeMap<java.lang.Long, oicq.wlogin_sdk.sharemem.WloginSigInfo> treeMap = this._tk_map;
        if (wloginSigInfo != null) {
            treeMap.put(new java.lang.Long(j17), wloginSigInfo.Set(j18, j19, j27, j28, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13));
            return 0;
        }
        treeMap.put(new java.lang.Long(j17), new oicq.wlogin_sdk.sharemem.WloginSigInfo(j18, j19, j27, j28, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13));
        return 0;
    }
}
