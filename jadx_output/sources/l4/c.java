package l4;

/* loaded from: classes13.dex */
public class c implements l4.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f315711d;

    public c(android.os.IBinder iBinder) {
        this.f315711d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f315711d;
    }

    @Override // l4.d
    public void h2(java.lang.String[] strArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f315711d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
