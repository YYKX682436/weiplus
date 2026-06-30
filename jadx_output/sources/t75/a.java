package t75;

/* loaded from: classes15.dex */
public class a implements t75.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f416317d;

    public a(android.os.IBinder iBinder) {
        this.f416317d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f416317d;
    }

    public java.lang.String d(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
            obtain.writeMap(map);
            this.f416317d.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String e(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
            obtain.writeMap(map);
            this.f416317d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String g(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
            obtain.writeMap(map);
            this.f416317d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String j(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
            obtain.writeMap(map);
            this.f416317d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String k(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
            obtain.writeMap(map);
            this.f416317d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String l(java.lang.String str, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
            obtain.writeString(str);
            obtain.writeInt(i17);
            this.f416317d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String p(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
            obtain.writeMap(map);
            this.f416317d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String w(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
            obtain.writeMap(map);
            this.f416317d.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
