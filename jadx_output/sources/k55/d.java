package k55;

/* loaded from: classes8.dex */
public abstract class d extends android.os.Binder implements k55.e {
    public d() {
        attachInterface(this, "com.tencent.mm.remoteservice.ICommClientCallback");
    }

    public static k55.e asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommClientCallback");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof k55.e)) ? new k55.c(iBinder) : (k55.e) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.remoteservice.ICommClientCallback");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.remoteservice.ICommClientCallback");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        java.lang.String readString = parcel.readString();
        android.os.Bundle bundle = (android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
        onCallback(readString, bundle, parcel.readInt() != 0);
        parcel2.writeNoException();
        if (bundle != null) {
            parcel2.writeInt(1);
            bundle.writeToParcel(parcel2, 1);
        } else {
            parcel2.writeInt(0);
        }
        return true;
    }
}
