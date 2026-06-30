package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public class TMAssistantDownloadTaskInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo>() { // from class: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo[] newArray(int i17) {
            return new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo[i17];
        }
    };
    public java.lang.String mContentType;
    public long mReceiveDataLen;
    public java.lang.String mSavePath;
    public int mState;
    public long mTotalDataLen;
    public java.lang.String mUrl;

    public TMAssistantDownloadTaskInfo(java.lang.String str, java.lang.String str2, int i17, long j17, long j18, java.lang.String str3) {
        this.mUrl = str;
        this.mSavePath = str2;
        this.mState = i17;
        this.mReceiveDataLen = j17;
        this.mTotalDataLen = j18;
        this.mContentType = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.mUrl;
        if (str != null) {
            parcel.writeString(str);
        } else {
            parcel.writeString("");
        }
        java.lang.String str2 = this.mSavePath;
        if (str2 != null) {
            parcel.writeString(str2);
        } else {
            parcel.writeString("");
        }
        parcel.writeInt(this.mState);
        parcel.writeLong(this.mReceiveDataLen);
        parcel.writeLong(this.mTotalDataLen);
        parcel.writeString(this.mContentType);
    }
}
