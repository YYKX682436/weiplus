package com.tencent.shadow.dynamic.host;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class PpsBinder extends android.os.Binder {
    static final java.lang.String DESCRIPTOR = "com.tencent.shadow.dynamic.host.PpsBinder";
    static final int TRANSACTION_CODE_FAILED_EXCEPTION = 1;
    static final int TRANSACTION_CODE_NO_EXCEPTION = 0;
    static final int TRANSACTION_checkPpsId = 10;
    static final int TRANSACTION_exit = 4;
    static final int TRANSACTION_getPluginLoader = 6;
    static final int TRANSACTION_getPpsStatus = 5;
    static final int TRANSACTION_initCrashHandlerByFd = 9;
    static final int TRANSACTION_loadPluginLoader = 2;
    static final int TRANSACTION_loadPluginLoaderByApk = 8;
    static final int TRANSACTION_loadRuntime = 1;
    static final int TRANSACTION_setHostOpenedFds = 11;
    static final int TRANSACTION_setSystemService = 7;
    static final int TRANSACTION_setUuidManager = 3;
    private final com.tencent.shadow.dynamic.host.PluginProcessService mPps;

    public PpsBinder(com.tencent.shadow.dynamic.host.PluginProcessService pluginProcessService) {
        this.mPps = pluginProcessService;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1598968902) {
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
        switch (i17) {
            case 1:
                parcel.enforceInterface(DESCRIPTOR);
                try {
                    this.mPps.loadRuntime(parcel.readString());
                    parcel2.writeInt(0);
                } catch (com.tencent.shadow.dynamic.host.FailedException e17) {
                    parcel2.writeInt(1);
                    e17.writeToParcel(parcel2, 0);
                }
                return true;
            case 2:
                parcel.enforceInterface(DESCRIPTOR);
                try {
                    this.mPps.loadPluginLoader(parcel.readString());
                    parcel2.writeInt(0);
                } catch (com.tencent.shadow.dynamic.host.FailedException e18) {
                    parcel2.writeInt(1);
                    e18.writeToParcel(parcel2, 0);
                }
                return true;
            case 3:
                parcel.enforceInterface(DESCRIPTOR);
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                this.mPps.setUuidManager(readStrongBinder != null ? new com.tencent.shadow.dynamic.host.BinderUuidManager(readStrongBinder) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface(DESCRIPTOR);
                this.mPps.exit();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface(DESCRIPTOR);
                com.tencent.shadow.dynamic.host.PpsStatus ppsStatus = this.mPps.getPpsStatus();
                parcel2.writeNoException();
                ppsStatus.writeToParcel(parcel2, 1);
                return true;
            case 6:
                parcel.enforceInterface(DESCRIPTOR);
                android.os.IBinder pluginLoader = this.mPps.getPluginLoader();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(pluginLoader);
                return true;
            case 7:
                parcel.enforceInterface(DESCRIPTOR);
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                this.mPps.setSystemService(readStrongBinder2 != null ? new com.tencent.shadow.dynamic.host.ISystemServiceManager.Proxy(readStrongBinder2) : null);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface(DESCRIPTOR);
                try {
                    this.mPps.loadPluginLoaderByApk(parcel.readString(), parcel.readInt() != 0 ? com.tencent.shadow.core.common.InstalledApk.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeInt(0);
                } catch (com.tencent.shadow.dynamic.host.FailedException e19) {
                    parcel2.writeInt(1);
                    e19.writeToParcel(parcel2, 0);
                }
                return true;
            case 9:
                parcel.enforceInterface(DESCRIPTOR);
                this.mPps.initCrashHandlerByFd(parcel.readInt() != 0 ? (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface(DESCRIPTOR);
                com.tencent.shadow.dynamic.host.PpsStatus checkPpsId = this.mPps.checkPpsId(parcel.readString());
                parcel2.writeNoException();
                checkPpsId.writeToParcel(parcel2, 1);
                return true;
            case 11:
                parcel.enforceInterface(DESCRIPTOR);
                int readInt = parcel.readInt();
                java.util.HashMap hashMap = new java.util.HashMap();
                for (int i19 = 0; i19 < readInt; i19++) {
                    hashMap.put(parcel.readString(), (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel));
                }
                this.mPps.setHostOpenedFds(hashMap);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
