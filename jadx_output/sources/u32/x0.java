package u32;

/* loaded from: classes13.dex */
public class x0 implements u32.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f424394d;

    public x0(android.os.IBinder iBinder) {
        this.f424394d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f424394d;
    }

    @Override // u32.z0
    public void di(double d17, int i17, int i18, byte[] bArr, double d18, int i19, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
            obtain.writeDouble(d17);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeByteArray(bArr);
            obtain.writeDouble(d18);
            obtain.writeInt(i19);
            obtain.writeString(str);
            this.f424394d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
