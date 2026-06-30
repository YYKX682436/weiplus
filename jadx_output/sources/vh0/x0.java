package vh0;

/* loaded from: classes7.dex */
public abstract class x0 extends android.os.Binder implements vh0.y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f436996d = 0;

    public x0() {
        attachInterface(this, "com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
            return true;
        }
        if (i17 == 1) {
            ((vh0.t2) this).Ah(parcel.readString(), parcel.readLong());
            parcel2.writeNoException();
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            ((vh0.t2) this).onCancel();
            parcel2.writeNoException();
        }
        return true;
    }
}
