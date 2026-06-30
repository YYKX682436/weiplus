package vh0;

/* loaded from: classes7.dex */
public class w0 implements vh0.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f436991d;

    public w0(android.os.IBinder iBinder) {
        this.f436991d = iBinder;
    }

    @Override // vh0.y0
    public void Ah(java.lang.String str, long j17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
            obtain.writeString(str);
            obtain.writeLong(j17);
            this.f436991d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f436991d;
    }

    @Override // vh0.y0
    public void onCancel() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
            this.f436991d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
