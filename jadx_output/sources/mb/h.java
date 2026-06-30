package mb;

/* loaded from: classes9.dex */
public class h implements mb.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f325286d;

    public h(android.os.IBinder iBinder) {
        this.f325286d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f325286d;
    }

    public void d(mb.g gVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
            obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
            this.f325286d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int[] e(mb.g gVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
            obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
            this.f325286d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void g(mb.g gVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
            obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
            this.f325286d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int j(mb.g gVar, int[] iArr, byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
            obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
            obtain.writeIntArray(iArr);
            obtain.writeByteArray(bArr);
            this.f325286d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
