package o45;

/* loaded from: classes12.dex */
public abstract class ig extends android.os.Binder implements o45.kg {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f342953d = 0;

    public ig() {
        attachInterface(this, "com.tencent.mm.protocal.IMMBaseResp_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, final android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.protocal.IMMBaseResp_AIDL");
            return true;
        }
        switch (i17) {
            case 1:
                boolean Zd = ((com.tencent.mm.modelbase.y2) this).Zd(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(Zd ? 1 : 0);
                return true;
            case 2:
                byte[] bArr = ((com.tencent.mm.modelbase.y2) this).f70844g;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr);
                return true;
            case 3:
                ((com.tencent.mm.modelbase.y2) this).f70842e.setRetCode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                int n86 = ((com.tencent.mm.modelbase.y2) this).n8();
                parcel2.writeNoException();
                parcel2.writeInt(n86);
                return true;
            case 5:
                int dc6 = ((com.tencent.mm.modelbase.y2) this).dc();
                parcel2.writeNoException();
                parcel2.writeInt(dc6);
                return true;
            case 6:
                java.lang.String errMsg = ((com.tencent.mm.modelbase.y2) this).getErrMsg();
                parcel2.writeNoException();
                parcel2.writeString(errMsg);
                return true;
            case 7:
                ((com.tencent.mm.modelbase.y2) this).f70842e.setErrMsg(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 8:
                byte[] r17 = ((com.tencent.mm.modelbase.y2) this).r(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(r17);
                return true;
            case 9:
                byte[] oi6 = ((com.tencent.mm.modelbase.y2) this).oi();
                parcel2.writeNoException();
                parcel2.writeByteArray(oi6);
                return true;
            case 10:
                byte[] s17 = ((com.tencent.mm.modelbase.y2) this).s();
                parcel2.writeNoException();
                parcel2.writeByteArray(s17);
                return true;
            case 11:
                int uin = ((com.tencent.mm.modelbase.y2) this).getUin();
                parcel2.writeNoException();
                parcel2.writeInt(uin);
                return true;
            case 12:
                java.lang.String q17 = ((com.tencent.mm.modelbase.y2) this).q();
                parcel2.writeNoException();
                parcel2.writeString(q17);
                return true;
            case 13:
                int cmdId = ((com.tencent.mm.modelbase.y2) this).f70842e.getCmdId();
                parcel2.writeNoException();
                parcel2.writeInt(cmdId);
                return true;
            case 14:
                java.lang.String Mf = ((com.tencent.mm.modelbase.y2) this).Mf();
                parcel2.writeNoException();
                parcel2.writeString(Mf);
                return true;
            case 15:
                java.lang.String Pa = ((com.tencent.mm.modelbase.y2) this).Pa();
                parcel2.writeNoException();
                parcel2.writeString(Pa);
                return true;
            case 16:
                int c67 = ((com.tencent.mm.modelbase.y2) this).c6();
                parcel2.writeNoException();
                parcel2.writeInt(c67);
                return true;
            case 17:
                byte[] Q5 = ((com.tencent.mm.modelbase.y2) this).Q5();
                parcel2.writeNoException();
                parcel2.writeByteArray(Q5);
                return true;
            case 18:
                ((com.tencent.mm.modelbase.y2) this).s9(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 19:
                int serverSequenceId = ((com.tencent.mm.modelbase.y2) this).f70842e.getServerSequenceId();
                parcel2.writeNoException();
                parcel2.writeInt(serverSequenceId);
                return true;
            case 20:
                byte[] ij6 = ((com.tencent.mm.modelbase.y2) this).ij();
                parcel2.writeNoException();
                parcel2.writeByteArray(ij6);
                return true;
            case 21:
                int readInt = parcel.readInt();
                final java.util.HashMap hashMap = readInt < 0 ? null : new java.util.HashMap();
                java.util.stream.IntStream.range(0, readInt).forEach(new java.util.function.IntConsumer() { // from class: o45.ig$$a
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i19) {
                        android.os.Parcel parcel3 = parcel;
                        hashMap.put(parcel3.readString(), parcel3.readString());
                    }
                });
                ((com.tencent.mm.modelbase.y2) this).f70842e.setMMNativeNetTaskAdapterProfile(hashMap);
                parcel2.writeNoException();
                return true;
            case 22:
                ((com.tencent.mm.modelbase.y2) this).Y7(parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 23:
                int Fd = ((com.tencent.mm.modelbase.y2) this).Fd();
                parcel2.writeNoException();
                parcel2.writeInt(Fd);
                return true;
            case 24:
                byte[] serverIndexBuffer = ((com.tencent.mm.modelbase.y2) this).f70842e.getServerIndexBuffer();
                parcel2.writeNoException();
                parcel2.writeByteArray(serverIndexBuffer);
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
