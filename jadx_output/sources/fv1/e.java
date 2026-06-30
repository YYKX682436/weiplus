package fv1;

/* loaded from: classes8.dex */
public abstract class e extends android.os.Binder implements fv1.f {
    public e() {
        attachInterface(this, "com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
            return true;
        }
        if (i17 == 1) {
            ((iv1.d) this).L2(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            ((iv1.d) this).Ue(parcel.readString(), parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
        }
        return true;
    }
}
