package fv1;

/* loaded from: classes8.dex */
public abstract class b extends android.os.Binder implements fv1.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f266970d = 0;

    public b() {
        attachInterface(this, "com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
            return true;
        }
        fv1.f fVar = null;
        fv1.f fVar2 = null;
        switch (i17) {
            case 1:
                int y27 = y2(parcel.readInt() != 0 ? com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(y27);
                return true;
            case 2:
                int aa6 = aa(parcel.readInt() != 0 ? com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(aa6);
                return true;
            case 3:
                boolean Je = Je(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Je ? 1 : 0);
                return true;
            case 4:
                boolean Ba = Ba(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Ba ? 1 : 0);
                return true;
            case 5:
                com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState p66 = p6(parcel.readString());
                parcel2.writeNoException();
                if (p66 != null) {
                    parcel2.writeInt(1);
                    p66.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 6:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
                    fVar2 = (queryLocalInterface == null || !(queryLocalInterface instanceof fv1.f)) ? new fv1.d(readStrongBinder) : (fv1.f) queryLocalInterface;
                }
                ca(fVar2);
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
                    fVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof fv1.f)) ? new fv1.d(readStrongBinder2) : (fv1.f) queryLocalInterface2;
                }
                d3(fVar);
                parcel2.writeNoException();
                return true;
            case 8:
                X8(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 9:
                Wb();
                parcel2.writeNoException();
                return true;
            case 10:
                m5();
                parcel2.writeNoException();
                return true;
            case 11:
                Vf();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
