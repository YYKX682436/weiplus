package j6;

/* loaded from: classes15.dex */
public class a implements j6.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f297838d;

    public a(android.os.IBinder iBinder) {
        this.f297838d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f297838d;
    }

    public int d(int i17, java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
            obtain.writeInt(i17);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f297838d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public android.os.Bundle e(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
            obtain.writeInt(i17);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            this.f297838d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return (android.os.Bundle) (obtain2.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public android.os.Bundle g(int i17, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
            obtain.writeInt(i17);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f297838d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return (android.os.Bundle) (obtain2.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int j(int i17, java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
            obtain.writeInt(i17);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f297838d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
