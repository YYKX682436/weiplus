package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public class NotFoundException extends java.lang.Exception implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.shadow.dynamic.host.NotFoundException> CREATOR = new android.os.Parcelable.Creator<com.tencent.shadow.dynamic.host.NotFoundException>() { // from class: com.tencent.shadow.dynamic.host.NotFoundException.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.shadow.dynamic.host.NotFoundException createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.shadow.dynamic.host.NotFoundException(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.shadow.dynamic.host.NotFoundException[] newArray(int i17) {
            return new com.tencent.shadow.dynamic.host.NotFoundException[i17];
        }
    };

    public NotFoundException(java.lang.String str) {
        super(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(getMessage());
    }

    public NotFoundException(android.os.Parcel parcel) {
        super(parcel.readString());
    }
}
