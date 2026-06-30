package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public final class w1 implements com.tencent.tmsqmsp.oaid2.v {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f215682d;

    public w1(android.os.IBinder iBinder) {
        this.f215682d = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f215682d;
    }

    @Override // com.tencent.tmsqmsp.oaid2.v
    public final java.lang.String b() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
            this.f215682d.transact(1, obtain, obtain2, 0);
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

    @Override // com.tencent.tmsqmsp.oaid2.v
    public final java.lang.String c(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
            obtain.writeString(str);
            this.f215682d.transact(5, obtain, obtain2, 0);
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

    @Override // com.tencent.tmsqmsp.oaid2.v
    public final boolean c() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        boolean z17 = false;
        try {
            obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
            this.f215682d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z17 = true;
            }
        } catch (android.os.RemoteException unused) {
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
        obtain2.recycle();
        obtain.recycle();
        return z17;
    }
}
