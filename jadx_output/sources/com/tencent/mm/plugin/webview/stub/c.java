package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.plugin.webview.stub.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f183524d;

    public c(android.os.IBinder iBinder) {
        this.f183524d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f183524d;
    }

    @Override // com.tencent.mm.plugin.webview.stub.e
    public int getRet() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
            this.f183524d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.e
    public boolean k2() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
            this.f183524d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
