package lk0;

/* loaded from: classes7.dex */
public class a implements lk0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f318993d;

    public a(android.os.IBinder iBinder) {
        this.f318993d = iBinder;
    }

    @Override // lk0.c
    public android.os.Bundle D5(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f318993d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return (android.os.Bundle) (obtain2.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // lk0.c
    public void Xf(android.os.Bundle bundle, java.lang.String str, lk0.f fVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeStrongInterface(fVar);
            this.f318993d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f318993d;
    }
}
