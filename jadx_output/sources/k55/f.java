package k55;

/* loaded from: classes8.dex */
public class f implements k55.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f304466d;

    public f(android.os.IBinder iBinder) {
        this.f304466d = iBinder;
    }

    @Override // k55.h
    public void Na(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, k55.e eVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.remoteservice.ICommRemoteServer");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongInterface(eVar);
            this.f304466d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                bundle.readFromParcel(obtain2);
            }
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f304466d;
    }
}
