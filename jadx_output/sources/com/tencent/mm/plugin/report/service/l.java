package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class l implements com.tencent.mm.plugin.report.service.n {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f158286d;

    public l(android.os.IBinder iBinder) {
        this.f158286d = iBinder;
    }

    @Override // com.tencent.mm.plugin.report.service.n
    public void X3(android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.report.service.IKVReport_AIDL");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f158286d.transact(1, obtain, obtain2, 0);
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
        return this.f158286d;
    }
}
