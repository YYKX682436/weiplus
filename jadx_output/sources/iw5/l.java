package iw5;

/* loaded from: classes12.dex */
public abstract class l extends android.os.Binder implements android.os.IInterface {
    public l() {
        attachInterface(this, "com.tencent.wechat.zrpc.ext_channel.IAidlZChannelFactory");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelFactory");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelFactory");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        jw5.d dVar = (jw5.d) this;
        jw5.b bVar = new jw5.b(dVar.f302351d, dVar.f302352e);
        parcel2.writeNoException();
        parcel2.writeStrongInterface(bVar);
        return true;
    }
}
