package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public class PpsController {
    public static final int VERSION = 1;
    private final android.os.IBinder mRemote;

    public PpsController(android.os.IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public android.os.IBinder asBinder() {
        return this.mRemote;
    }

    public com.tencent.shadow.dynamic.host.PpsStatus checkPpsId(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            obtain.writeString(str);
            this.mRemote.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return new com.tencent.shadow.dynamic.host.PpsStatus(obtain2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void exit() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public android.os.IBinder getPluginLoader() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            this.mRemote.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public com.tencent.shadow.dynamic.host.PpsStatus getPpsStatus() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return new com.tencent.shadow.dynamic.host.PpsStatus(obtain2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void initCrashHandlerByFd(android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            if (parcelFileDescriptor != null) {
                obtain.writeInt(1);
                parcelFileDescriptor.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (parcelFileDescriptor2 != null) {
                obtain.writeInt(1);
                parcelFileDescriptor2.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.Boolean isBinderAlive() {
        return java.lang.Boolean.valueOf(this.mRemote.isBinderAlive());
    }

    public void loadPluginLoader(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            int readInt = obtain2.readInt();
            if (readInt == 1) {
                throw com.tencent.shadow.dynamic.host.FailedException.CREATOR.createFromParcel(obtain2);
            }
            if (readInt == 0) {
                return;
            }
            throw new java.lang.RuntimeException("不认识的Code==" + readInt);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void loadPluginLoaderByApk(java.lang.String str, com.tencent.shadow.core.common.InstalledApk installedApk, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            obtain.writeString(str);
            obtain.writeInt(installedApk != null ? 1 : 0);
            if (installedApk != null) {
                installedApk.writeToParcel(obtain, 0);
            }
            obtain.writeInt(parcelFileDescriptor != null ? 1 : 0);
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.writeToParcel(obtain, 0);
            }
            this.mRemote.transact(8, obtain, obtain2, 0);
            int readInt = obtain2.readInt();
            if (readInt == 1) {
                throw com.tencent.shadow.dynamic.host.FailedException.CREATOR.createFromParcel(obtain2);
            }
            if (readInt == 0) {
                return;
            }
            throw new java.lang.RuntimeException("不认识的Code==" + readInt);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void loadRuntime(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            obtain.writeString(str);
            this.mRemote.transact(1, obtain, obtain2, 0);
            int readInt = obtain2.readInt();
            if (readInt == 1) {
                throw com.tencent.shadow.dynamic.host.FailedException.CREATOR.createFromParcel(obtain2);
            }
            if (readInt == 0) {
                return;
            }
            throw new java.lang.RuntimeException("不认识的Code==" + readInt);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void setHostOpenedFds(java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            obtain.writeInt(map.size());
            for (java.util.Map.Entry<java.lang.String, android.os.ParcelFileDescriptor> entry : map.entrySet()) {
                obtain.writeString(entry.getKey());
                entry.getValue().writeToParcel(obtain, 0);
            }
            this.mRemote.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void setSystemService(android.os.IBinder iBinder) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            obtain.writeStrongBinder(iBinder);
            this.mRemote.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void setUuidManager(android.os.IBinder iBinder) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.PpsBinder.DESCRIPTOR);
            obtain.writeStrongBinder(iBinder);
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
