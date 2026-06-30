package mv5;

/* loaded from: classes.dex */
public abstract class a extends android.os.Binder implements android.os.IInterface {
    public a() {
        attachInterface(this, "com.tencent.tinker.lib.IForeService");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            parcel.enforceInterface("com.tencent.tinker.lib.IForeService");
            parcel2.writeNoException();
            return true;
        }
        if (i17 != 1598968902) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        parcel2.writeString("com.tencent.tinker.lib.IForeService");
        return true;
    }
}
