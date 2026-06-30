package com.tencent.qqmusic.mediaplayer.audioplaylist;

/* loaded from: classes13.dex */
public class TrackInfo extends com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo {
    public static final android.os.Parcelable.Creator<com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo>() { // from class: com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo createFromParcel(android.os.Parcel parcel) {
            int readInt = parcel.readInt();
            java.lang.String readString = parcel.readString();
            java.lang.String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            java.lang.String readString3 = parcel.readString();
            java.lang.String readString4 = parcel.readString();
            com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo = new com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo(readInt);
            trackInfo.setFilePath(readString);
            trackInfo.setTitle(readString2);
            trackInfo.setStartPosition(readLong);
            trackInfo.setEndPostion(readLong2);
            trackInfo.setPerformer(readString3);
            trackInfo.setAlbum(readString4);
            return trackInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo[] newArray(int i17) {
            return new com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo[i17];
        }
    };
    private long mEndPostion;
    private long mStartPosition;
    private java.lang.String mTitle = "";
    private java.lang.String mPerformer = "";
    private java.lang.String mAlbum = "";

    public TrackInfo(int i17) {
        this.mType = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getAlbum() {
        return this.mAlbum;
    }

    public java.lang.String getPerformer() {
        return this.mPerformer;
    }

    public android.util.Pair<java.lang.Long, java.lang.Long> getRange() {
        return new android.util.Pair<>(java.lang.Long.valueOf(this.mStartPosition), java.lang.Long.valueOf(this.mEndPostion));
    }

    public java.lang.String getTitle() {
        return this.mTitle;
    }

    public java.lang.String getUri() {
        return this.mUri;
    }

    public void setAlbum(java.lang.String str) {
        this.mAlbum = str;
    }

    public void setEndPostion(long j17) {
        this.mEndPostion = j17;
    }

    public void setFilePath(java.lang.String str) {
        this.mUri = str;
    }

    public void setPerformer(java.lang.String str) {
        this.mPerformer = str;
    }

    public void setStartPosition(long j17) {
        this.mStartPosition = j17;
    }

    public void setTitle(java.lang.String str) {
        this.mTitle = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.mType);
        parcel.writeString(this.mUri);
        parcel.writeString(this.mTitle);
        parcel.writeLong(this.mStartPosition);
        parcel.writeLong(this.mEndPostion);
        parcel.writeString(this.mPerformer);
        parcel.writeString(this.mAlbum);
    }
}
