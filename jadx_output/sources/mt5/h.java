package mt5;

/* loaded from: classes8.dex */
public abstract class h extends android.os.Binder implements android.os.IInterface {
    public h() {
        attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        try {
            if (i17 == 1) {
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                parcel2.writeNoException();
                return true;
            }
            if (i17 != 2) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                return true;
            }
            parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
            int readInt = parcel.readInt();
            android.os.Bundle bundle = parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null;
            mt5.f fVar = ((mt5.e) this).f331314d;
            if (readInt == 0 && bundle != null) {
                fVar.f331315d = bundle.getString("oa_id_flag");
            }
            fVar.f331318g.countDown();
            parcel2.writeNoException();
            return true;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }
}
