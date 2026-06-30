package nb;

/* loaded from: classes.dex */
public abstract class b extends android.os.Binder implements nb.c {
    public b() {
        attachInterface(this, "com.iqoo.secure.antifraud.thirdpart.IAntiFraudDetectListener");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.iqoo.secure.antifraud.thirdpart.IAntiFraudDetectListener");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.iqoo.secure.antifraud.thirdpart.IAntiFraudDetectListener");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        parcel2.writeNoException();
        parcel2.writeString("1");
        return true;
    }
}
