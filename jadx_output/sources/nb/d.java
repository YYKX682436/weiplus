package nb;

/* loaded from: classes8.dex */
public class d implements nb.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f336027d;

    public d(android.os.IBinder iBinder) {
        this.f336027d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f336027d;
    }

    public android.os.Bundle e() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.iqoo.secure.antifraud.thirdpart.IAntiFraudDetectService");
            this.f336027d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return (android.os.Bundle) (obtain2.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int g(nb.c cVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.iqoo.secure.antifraud.thirdpart.IAntiFraudDetectService");
            obtain.writeStrongInterface(cVar);
            this.f336027d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
