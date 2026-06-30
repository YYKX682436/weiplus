package l4;

/* loaded from: classes13.dex */
public abstract class e extends android.os.Binder implements android.os.IInterface {
    public e() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        l4.d dVar = null;
        if (i17 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof l4.d)) ? new l4.c(readStrongBinder) : (l4.d) queryLocalInterface;
            }
            int e17 = ((l4.l) this).e(dVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(e17);
            return true;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                ((l4.l) this).d(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i17 != 1598968902) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            dVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof l4.d)) ? new l4.c(readStrongBinder2) : (l4.d) queryLocalInterface2;
        }
        int readInt = parcel.readInt();
        l4.l lVar = (l4.l) this;
        synchronized (lVar.f315729d.f12320f) {
            lVar.f315729d.f12320f.unregister(dVar);
            lVar.f315729d.f12319e.remove(java.lang.Integer.valueOf(readInt));
        }
        parcel2.writeNoException();
        return true;
    }
}
