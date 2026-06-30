package u31;

/* loaded from: classes12.dex */
public abstract class b extends android.os.Binder implements u31.c {
    public b() {
        attachInterface(this, "com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
            return true;
        }
        if (i17 == 1) {
            gm0.j1.e().k(new com.tencent.mm.modelstat.w((com.tencent.mm.modelstat.t) this, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0), 3000L);
            parcel2.writeNoException();
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            ((com.tencent.mm.modelstat.t) this).si(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
