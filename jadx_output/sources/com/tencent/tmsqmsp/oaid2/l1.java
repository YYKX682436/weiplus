package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public final class l1 implements com.tencent.tmsqmsp.oaid2.g {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f215610d;

    public l1(android.os.IBinder iBinder) {
        this.f215610d = iBinder;
    }

    @Override // com.tencent.tmsqmsp.oaid2.g
    public final java.lang.String a(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
            obtain.writeString(str);
            this.f215610d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            java.lang.String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (android.os.RemoteException unused) {
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return null;
    }

    @Override // com.tencent.tmsqmsp.oaid2.g
    public final java.lang.String b(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
            obtain.writeString(str);
            this.f215610d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            java.lang.String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (android.os.RemoteException unused) {
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }
}
