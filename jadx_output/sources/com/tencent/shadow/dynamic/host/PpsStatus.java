package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public final class PpsStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.shadow.dynamic.host.PpsStatus> CREATOR = new android.os.Parcelable.Creator<com.tencent.shadow.dynamic.host.PpsStatus>() { // from class: com.tencent.shadow.dynamic.host.PpsStatus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.shadow.dynamic.host.PpsStatus createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.shadow.dynamic.host.PpsStatus(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.shadow.dynamic.host.PpsStatus[] newArray(int i17) {
            return new com.tencent.shadow.dynamic.host.PpsStatus[i17];
        }
    };
    public final boolean loaderLoaded;
    public final int pid;
    public final java.lang.String ppsId;
    public final boolean runtimeLoaded;
    public final java.lang.String uuid;
    public final boolean uuidManagerSet;

    public PpsStatus(java.lang.String str, boolean z17, boolean z18, boolean z19, java.lang.String str2) {
        this.uuid = str;
        this.runtimeLoaded = z17;
        this.loaderLoaded = z18;
        this.uuidManagerSet = z19;
        this.pid = android.os.Process.myPid();
        this.ppsId = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.uuid);
        parcel.writeByte(this.runtimeLoaded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.loaderLoaded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.uuidManagerSet ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.pid);
        parcel.writeString(this.ppsId);
    }

    public PpsStatus(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        this.uuid = str;
        this.runtimeLoaded = z17;
        this.loaderLoaded = z18;
        this.uuidManagerSet = z19;
        this.pid = android.os.Process.myPid();
        this.ppsId = "";
    }

    public PpsStatus(android.os.Parcel parcel) {
        this.uuid = parcel.readString();
        this.runtimeLoaded = parcel.readByte() != 0;
        this.loaderLoaded = parcel.readByte() != 0;
        this.uuidManagerSet = parcel.readByte() != 0;
        this.pid = parcel.readInt();
        this.ppsId = parcel.readString();
    }
}
