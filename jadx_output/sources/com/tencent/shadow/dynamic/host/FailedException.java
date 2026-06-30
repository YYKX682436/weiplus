package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public class FailedException extends java.lang.Exception implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.shadow.dynamic.host.FailedException> CREATOR = new android.os.Parcelable.Creator<com.tencent.shadow.dynamic.host.FailedException>() { // from class: com.tencent.shadow.dynamic.host.FailedException.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.shadow.dynamic.host.FailedException createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.shadow.dynamic.host.FailedException(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.shadow.dynamic.host.FailedException[] newArray(int i17) {
            return new com.tencent.shadow.dynamic.host.FailedException[i17];
        }
    };
    public static final int ERROR_CODE_FILE_NOT_FOUND_EXCEPTION = 3003;
    public static final int ERROR_CODE_RELOAD_LOADER_EXCEPTION = 3008;
    public static final int ERROR_CODE_RELOAD_RUNTIME_EXCEPTION = 3007;
    public static final int ERROR_CODE_REMOTE_EXCEPTION = 3001;
    public static final int ERROR_CODE_RESET_UUID_EXCEPTION = 3006;
    public static final int ERROR_CODE_RUNTIME_EXCEPTION = 3002;
    public static final int ERROR_CODE_UUID_MANAGER_DEAD_EXCEPTION = 3005;
    public static final int ERROR_CODE_UUID_MANAGER_NULL_EXCEPTION = 3004;
    public static final int ERROR_PLUGIN_PROCESS_LOADER_NOT_LOADED = 3010;
    public static final int FRAMEWORK_MANAGER_LOAD_ERROR = 1008;
    public final int errorCode;
    public final java.lang.String errorMessage;

    public FailedException(android.os.RemoteException remoteException) {
        super("3001:" + remoteException.getClass().getSimpleName() + ":" + remoteException.getMessage());
        this.errorCode = 3001;
        this.errorMessage = getMessage();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.errorMessage);
        parcel.writeInt(this.errorCode);
    }

    public FailedException(java.lang.RuntimeException runtimeException) {
        super("3002:" + runtimeException.getClass().getSimpleName() + ":" + runtimeException.getMessage());
        this.errorCode = 3002;
        this.errorMessage = getMessage();
    }

    public FailedException(int i17, java.lang.String str) {
        super(i17 + ":" + str);
        this.errorCode = i17;
        this.errorMessage = str;
    }

    public FailedException(com.tencent.shadow.dynamic.host.ErrorInfo errorInfo) {
        super(errorInfo.errno + ":" + errorInfo.errMsg);
        this.errorCode = errorInfo.errno;
        this.errorMessage = errorInfo.errMsg;
    }
}
