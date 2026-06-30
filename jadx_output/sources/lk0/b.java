package lk0;

/* loaded from: classes7.dex */
public abstract class b extends android.os.Binder implements lk0.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f318994d = 0;

    public b() {
        attachInterface(this, "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
            return true;
        }
        if (i17 == 1) {
            ((com.tencent.mm.ipcinvoker.b) this).Xf((android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readString(), lk0.e.d(parcel.readStrongBinder()));
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            android.os.Bundle D5 = ((com.tencent.mm.ipcinvoker.b) this).D5((android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readString());
            parcel2.writeNoException();
            if (D5 != null) {
                parcel2.writeInt(1);
                D5.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
        }
        return true;
    }
}
