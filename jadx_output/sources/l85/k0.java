package l85;

/* loaded from: classes12.dex */
public class k0 implements l85.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f317190d;

    public k0(android.os.IBinder iBinder) {
        this.f317190d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f317190d;
    }

    @Override // l85.n0
    public void nb(android.content.Intent intent) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
            l85.m0.b(obtain, intent, 0);
            this.f317190d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l85.n0
    public void og(android.content.Intent intent, l85.j0 j0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
            l85.m0.b(obtain, intent, 0);
            obtain.writeStrongInterface(j0Var);
            this.f317190d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l85.n0
    public void startService(android.content.Intent intent) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
            l85.m0.b(obtain, intent, 0);
            this.f317190d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l85.n0
    public void stopService(android.content.Intent intent) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
            l85.m0.b(obtain, intent, 0);
            this.f317190d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
