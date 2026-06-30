package qc3;

/* loaded from: classes7.dex */
public class d implements qc3.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f361511d;

    public d(android.os.IBinder iBinder) {
        this.f361511d = iBinder;
    }

    @Override // qc3.f
    public void D1() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            this.f361511d.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void J5(int i17, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeInt(i17);
            obtain.writeString(str);
            this.f361511d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void M1(int i17, int i18, int i19, long j17, int[] iArr, float[] fArr, float[] fArr2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeLong(j17);
            obtain.writeIntArray(iArr);
            obtain.writeFloatArray(fArr);
            obtain.writeFloatArray(fArr2);
            this.f361511d.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void Oc(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeInt(i17);
            this.f361511d.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f361511d;
    }

    @Override // qc3.f
    public void cj(int i17, int i18, int i19) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            this.f361511d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void fj(int i17, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeInt(i17);
            obtain.writeString(str);
            this.f361511d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeInt(i17);
            if (surface != null) {
                obtain.writeInt(1);
                surface.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            this.f361511d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void s2(java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f361511d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void setMute(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeInt(z17 ? 1 : 0);
            this.f361511d.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void uc() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            this.f361511d.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void w3(com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            if (mBBuildConfig != null) {
                obtain.writeInt(1);
                mBBuildConfig.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f361511d.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void w9(java.lang.String str, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeString(str);
            obtain.writeInt(i17);
            this.f361511d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void yd(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            obtain.writeInt(i17);
            this.f361511d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.f
    public void z3() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            this.f361511d.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
