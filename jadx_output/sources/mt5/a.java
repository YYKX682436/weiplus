package mt5;

/* loaded from: classes8.dex */
public class a extends lt5.j {
    @Override // lt5.j
    public java.lang.String b(android.content.Context context, android.os.IBinder iBinder) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            iBinder.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // lt5.j
    public android.content.Intent e() {
        android.content.Intent intent = new android.content.Intent("com.asus.msa.action.ACCESS_DID");
        intent.setClassName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService");
        return intent;
    }
}
