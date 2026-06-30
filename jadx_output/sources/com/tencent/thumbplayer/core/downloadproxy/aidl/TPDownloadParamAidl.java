package com.tencent.thumbplayer.core.downloadproxy.aidl;

/* loaded from: classes16.dex */
public class TPDownloadParamAidl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl> CREATOR = new android.os.Parcelable.Creator<com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl>() { // from class: com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl[] newArray(int i17) {
            return new com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl[i17];
        }
    };
    private int dlType;
    private java.util.Map<java.lang.String, java.lang.Object> extInfoMap;
    private java.util.ArrayList<java.lang.String> urlList;

    public TPDownloadParamAidl(java.util.ArrayList<java.lang.String> arrayList, int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.urlList = arrayList;
        this.dlType = i17;
        this.extInfoMap = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDlType() {
        return this.dlType;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getExtInfoMap() {
        return this.extInfoMap;
    }

    public java.util.ArrayList<java.lang.String> getUrlList() {
        return this.urlList;
    }

    public void setDlType(int i17) {
        this.dlType = i17;
    }

    public void setExtInfoMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.extInfoMap = map;
    }

    public void setUrlList(java.util.ArrayList<java.lang.String> arrayList) {
        this.urlList = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStringList(this.urlList);
        parcel.writeInt(this.dlType);
        parcel.writeMap(this.extInfoMap);
    }

    public TPDownloadParamAidl(android.os.Parcel parcel) {
        try {
            this.urlList = parcel.createStringArrayList();
            this.dlType = parcel.readInt();
            this.extInfoMap = parcel.readHashMap(com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl.class.getClassLoader());
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e("TPDownloadParamAidl", 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, th6.toString());
            this.urlList = new java.util.ArrayList<>();
            this.dlType = 0;
            this.extInfoMap = new java.util.HashMap();
        }
    }
}
