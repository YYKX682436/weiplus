package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class j implements com.tencent.tmsqmsp.oaid2.k {

    /* renamed from: a, reason: collision with root package name */
    public android.os.IBinder f215600a;

    public j(android.os.IBinder iBinder) {
        this.f215600a = iBinder;
    }

    @Override // com.tencent.tmsqmsp.oaid2.k
    public void a(com.tencent.tmsqmsp.oaid2.i iVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
            obtain.writeStrongBinder(iVar != null ? (com.tencent.tmsqmsp.oaid2.i.a) iVar : null);
            this.f215600a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (java.lang.Exception unused) {
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f215600a;
    }

    @Override // com.tencent.tmsqmsp.oaid2.k
    public void b(com.tencent.tmsqmsp.oaid2.i iVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
            obtain.writeStrongBinder(iVar != null ? (com.tencent.tmsqmsp.oaid2.i.a) iVar : null);
            this.f215600a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (java.lang.Exception unused) {
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
