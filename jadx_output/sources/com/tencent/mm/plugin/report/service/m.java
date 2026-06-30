package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public abstract class m extends android.os.Binder implements com.tencent.mm.plugin.report.service.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f158288d = 0;

    public m() {
        attachInterface(this, "com.tencent.mm.plugin.report.service.IKVReport_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.report.service.IKVReport_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.report.service.IKVReport_AIDL");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        android.os.Bundle bundle = (android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
        ((com.tencent.mm.plugin.report.service.b0) this).X3(bundle);
        parcel2.writeNoException();
        if (bundle != null) {
            parcel2.writeInt(1);
            bundle.writeToParcel(parcel2, 1);
        } else {
            parcel2.writeInt(0);
        }
        return true;
    }
}
