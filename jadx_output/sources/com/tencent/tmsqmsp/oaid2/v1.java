package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public final class v1 implements com.tencent.tmsqmsp.oaid2.u {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f215675d;

    public v1(android.os.IBinder iBinder) {
        this.f215675d = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f215675d;
    }

    @Override // com.tencent.tmsqmsp.oaid2.u
    public final boolean h() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f215675d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.u
    public final java.lang.String m() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f215675d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
