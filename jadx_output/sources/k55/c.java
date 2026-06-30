package k55;

/* loaded from: classes8.dex */
public class c implements k55.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f304465d;

    public c(android.os.IBinder iBinder) {
        this.f304465d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f304465d;
    }

    @Override // k55.e
    public void onCallback(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.remoteservice.ICommClientCallback");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(z17 ? 1 : 0);
            this.f304465d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                bundle.readFromParcel(obtain2);
            }
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
