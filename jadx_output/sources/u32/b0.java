package u32;

/* loaded from: classes13.dex */
public class b0 implements u32.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f424275d;

    public b0(android.os.IBinder iBinder) {
        this.f424275d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f424275d;
    }

    @Override // u32.d0
    public void p5(int i17, long j17, int i18, int i19, byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
            obtain.writeInt(i17);
            obtain.writeLong(j17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeByteArray(bArr);
            this.f424275d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
