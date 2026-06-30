package u32;

/* loaded from: classes13.dex */
public abstract class z extends android.os.Binder implements u32.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f424401d = 0;

    public z() {
        attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [u32.d0] */
    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
            return true;
        }
        g32.b bVar = g32.b.INVOKE_ONCE;
        u32.j0 j0Var = null;
        u32.g1 g1Var = null;
        u32.d1 d1Var = null;
        u32.j0 j0Var2 = null;
        u32.z0 z0Var = null;
        u32.q0 q0Var = null;
        u32.b0 b0Var = null;
        u32.d0 d0Var = null;
        u32.w0 w0Var = null;
        int i19 = 0;
        i19 = 0;
        switch (i17) {
            case 1:
                boolean n76 = ((u32.a2) this).n7(parcel.readInt(), u32.f0.d(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(n76 ? 1 : 0);
                return true;
            case 2:
                boolean gi6 = ((u32.a2) this).gi(parcel.readInt(), u32.f0.d(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(gi6 ? 1 : 0);
                return true;
            case 3:
                long[] N3 = ((u32.a2) this).N3();
                parcel2.writeNoException();
                parcel2.writeLongArray(N3);
                return true;
            case 4:
                long readLong = parcel.readLong();
                int readInt = parcel.readInt();
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
                    j0Var = (queryLocalInterface == null || !(queryLocalInterface instanceof u32.j0)) ? new u32.h0(readStrongBinder) : (u32.j0) queryLocalInterface;
                }
                boolean b76 = ((u32.a2) this).b7(readLong, readInt, j0Var);
                parcel2.writeNoException();
                parcel2.writeInt(b76 ? 1 : 0);
                return true;
            case 5:
                boolean vf6 = ((u32.a2) this).vf(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(vf6 ? 1 : 0);
                return true;
            case 6:
                parcel.readLong();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 7:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
                    w0Var = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof u32.w0)) ? new u32.u0(readStrongBinder2) : (u32.w0) queryLocalInterface2;
                }
                long L1 = ((u32.a2) this).L1(w0Var);
                parcel2.writeNoException();
                parcel2.writeLong(L1);
                return true;
            case 8:
                long readLong2 = parcel.readLong();
                u32.a2 a2Var = (u32.a2) this;
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopTask, task Id = %d", java.lang.Long.valueOf(readLong2));
                if (readLong2 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "taskId < 0");
                } else {
                    com.tencent.mm.sdk.platformtools.n3 n3Var = a2Var.f424267p;
                    if (n3Var.sendMessage(n3Var.obtainMessage(1, java.lang.Long.valueOf(readLong2)))) {
                        g32.c.c(bVar);
                        i19 = 1;
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage, message what = %d", 1);
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i19);
                return true;
            case 9:
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    android.os.IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
                    d0Var = (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof u32.d0)) ? new u32.b0(readStrongBinder3) : (u32.d0) queryLocalInterface3;
                }
                boolean Di = ((u32.a2) this).Di(d0Var);
                parcel2.writeNoException();
                parcel2.writeInt(Di ? 1 : 0);
                return true;
            case 10:
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    android.os.IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
                    b0Var = (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof u32.d0)) ? new u32.b0(readStrongBinder4) : (u32.d0) queryLocalInterface4;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnDeviceRequest");
                boolean unregister = ((u32.a2) this).f424263i.unregister(b0Var);
                if (!unregister) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnDeviceReq.unregister Failed!!!");
                }
                g32.c.c(bVar);
                parcel2.writeNoException();
                parcel2.writeInt(unregister ? 1 : 0);
                return true;
            case 11:
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    android.os.IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
                    q0Var = (queryLocalInterface5 == null || !(queryLocalInterface5 instanceof u32.q0)) ? new u32.o0(readStrongBinder5) : (u32.q0) queryLocalInterface5;
                }
                ((u32.a2) this).xc(q0Var);
                parcel2.writeNoException();
                return true;
            case 12:
                ((u32.a2) this).ma(parcel.readLong(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 13:
                java.lang.String readString = parcel.readString();
                boolean z17 = parcel.readInt() != 0;
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    android.os.IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
                    z0Var = (queryLocalInterface6 == null || !(queryLocalInterface6 instanceof u32.z0)) ? new u32.x0(readStrongBinder6) : (u32.z0) queryLocalInterface6;
                }
                boolean N9 = ((u32.a2) this).N9(readString, z17, z0Var);
                parcel2.writeNoException();
                parcel2.writeInt(N9 ? 1 : 0);
                return true;
            case 14:
                boolean b57 = ((u32.a2) this).b5(parcel.readInt(), u32.f0.d(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(b57 ? 1 : 0);
                return true;
            case 15:
                boolean rc6 = ((u32.a2) this).rc(parcel.readInt(), u32.f0.d(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(rc6 ? 1 : 0);
                return true;
            case 16:
                long readLong3 = parcel.readLong();
                int readInt2 = parcel.readInt();
                android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    android.os.IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
                    j0Var2 = (queryLocalInterface7 == null || !(queryLocalInterface7 instanceof u32.j0)) ? new u32.h0(readStrongBinder7) : (u32.j0) queryLocalInterface7;
                }
                boolean oe6 = ((u32.a2) this).oe(readLong3, readInt2, j0Var2);
                parcel2.writeNoException();
                parcel2.writeInt(oe6 ? 1 : 0);
                return true;
            case 17:
                boolean Hg = ((u32.a2) this).Hg(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(Hg ? 1 : 0);
                return true;
            case 18:
                android.os.IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    android.os.IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
                    d1Var = (queryLocalInterface8 == null || !(queryLocalInterface8 instanceof u32.d1)) ? new u32.b1(readStrongBinder8) : (u32.d1) queryLocalInterface8;
                }
                boolean wi6 = ((u32.a2) this).wi(d1Var);
                parcel2.writeNoException();
                parcel2.writeInt(wi6 ? 1 : 0);
                return true;
            case 19:
                long readLong4 = parcel.readLong();
                byte[] createByteArray = parcel.createByteArray();
                android.os.IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    android.os.IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
                    g1Var = (queryLocalInterface9 == null || !(queryLocalInterface9 instanceof u32.g1)) ? new u32.e1(readStrongBinder9) : (u32.g1) queryLocalInterface9;
                }
                boolean n66 = ((u32.a2) this).n6(readLong4, createByteArray, g1Var);
                parcel2.writeNoException();
                parcel2.writeInt(n66 ? 1 : 0);
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
