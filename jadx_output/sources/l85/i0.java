package l85;

/* loaded from: classes12.dex */
public abstract class i0 extends android.os.Binder implements l85.j0 {
    public i0() {
        attachInterface(this, "com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        bd(parcel.readStrongBinder());
        parcel2.writeNoException();
        return true;
    }
}
