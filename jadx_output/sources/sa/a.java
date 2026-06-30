package sa;

/* loaded from: classes8.dex */
public class a implements sa.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f405247d;

    public a(android.os.IBinder iBinder) {
        this.f405247d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f405247d;
    }

    public boolean d(android.content.Intent intent, android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f405247d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
