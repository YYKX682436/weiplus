package lb;

/* loaded from: classes13.dex */
public abstract class f extends android.os.Binder implements android.os.IInterface {
    public f() {
        attachInterface(this, "com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 > 0 && i17 <= 16777215) {
            parcel.enforceInterface("com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService");
            return true;
        }
        if (i17 == 1) {
            lb.e eVar = ((lb.a) this).f317649d;
            eVar.getClass();
            if (eVar.f317658e) {
                eVar.b();
            }
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel.readString();
            parcel.readString();
            lb.e eVar2 = ((lb.a) this).f317649d;
            eVar2.getClass();
            if (eVar2.f317658e) {
                eVar2.b();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
