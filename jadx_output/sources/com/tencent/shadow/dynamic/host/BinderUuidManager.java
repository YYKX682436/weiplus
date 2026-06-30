package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
class BinderUuidManager implements com.tencent.shadow.dynamic.host.UuidManager {
    private android.os.IBinder mRemote;

    public BinderUuidManager(android.os.IBinder iBinder) {
        this.mRemote = iBinder;
    }

    private void checkException(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == 1) {
            throw com.tencent.shadow.dynamic.host.FailedException.CREATOR.createFromParcel(parcel);
        }
        if (readInt == 2) {
            throw new com.tencent.shadow.dynamic.host.NotFoundException(parcel);
        }
        if (readInt == 0) {
            return;
        }
        throw new java.lang.RuntimeException("不认识的Code==" + readInt);
    }

    @Override // com.tencent.shadow.dynamic.host.UuidManager
    public android.os.ParcelFileDescriptor getAndroidJar() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.UuidManager.DESCRIPTOR);
            this.mRemote.transact(4, obtain, obtain2, 0);
            checkException(obtain2);
            return obtain2.readInt() != 0 ? (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.shadow.dynamic.host.UuidManager
    public com.tencent.shadow.core.common.InstalledApk getPlugin(java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.UuidManager.DESCRIPTOR);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.mRemote.transact(1, obtain, obtain2, 0);
            checkException(obtain2);
            return obtain2.readInt() != 0 ? com.tencent.shadow.core.common.InstalledApk.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.shadow.dynamic.host.UuidManager
    public com.tencent.shadow.core.common.InstalledApk getPluginLoader(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.UuidManager.DESCRIPTOR);
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            checkException(obtain2);
            return obtain2.readInt() != 0 ? com.tencent.shadow.core.common.InstalledApk.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.shadow.dynamic.host.UuidManager
    public com.tencent.shadow.core.common.InstalledApk getRuntime(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.UuidManager.DESCRIPTOR);
            obtain.writeString(str);
            this.mRemote.transact(3, obtain, obtain2, 0);
            checkException(obtain2);
            return obtain2.readInt() != 0 ? com.tencent.shadow.core.common.InstalledApk.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
