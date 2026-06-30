package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class AudioInformation implements android.os.Parcelable {
    public static final int CBR = 1;
    public static final int CORRECT = 1;
    public static final android.os.Parcelable.Creator<com.tencent.qqmusic.mediaplayer.AudioInformation> CREATOR = new android.os.Parcelable.Creator<com.tencent.qqmusic.mediaplayer.AudioInformation>() { // from class: com.tencent.qqmusic.mediaplayer.AudioInformation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.qqmusic.mediaplayer.AudioInformation createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.qqmusic.mediaplayer.AudioInformation(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.qqmusic.mediaplayer.AudioInformation[] newArray(int i17) {
            return new com.tencent.qqmusic.mediaplayer.AudioInformation[i17];
        }
    };
    public static final int INCORRECT = 2;
    public static final int VBR_VBRI = 3;
    public static final int VBR_XING = 2;
    private int bitrate;
    private int channels;
    private int mAudioTypeValue;
    private long sampleRate;
    private long duration = 0;
    private int bitDept = 0;
    private long mPlaySample = 0;
    private int isCbr = 0;
    private int durationIsCorrect = 2;

    public AudioInformation() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean durationIsCorrect() {
        return this.durationIsCorrect == 1;
    }

    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return com.tencent.qqmusic.mediaplayer.AudioFormat.getAudioType(this.mAudioTypeValue);
    }

    public int getBitDepth() {
        return this.bitDept;
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public int getChannels() {
        return this.channels;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getPlaySample() {
        if (this.mPlaySample == 0) {
            this.mPlaySample = this.sampleRate;
        }
        return this.mPlaySample;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public int getVbrType() {
        return this.isCbr;
    }

    public boolean isCbr() {
        return this.isCbr == 1;
    }

    public boolean isVbr() {
        int i17 = this.isCbr;
        return i17 == 2 || i17 == 3;
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.sampleRate = parcel.readLong();
        this.channels = parcel.readInt();
        this.duration = parcel.readLong();
        this.bitrate = parcel.readInt();
        this.bitDept = parcel.readInt();
        this.mAudioTypeValue = parcel.readInt();
        this.mPlaySample = parcel.readLong();
        this.isCbr = parcel.readInt();
        this.durationIsCorrect = parcel.readInt();
    }

    public void setAudioType(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType) {
        this.mAudioTypeValue = audioType.getValue();
    }

    public void setBitDept(int i17) {
        this.bitDept = i17;
        if (i17 >= 3) {
            this.bitDept = 3;
        }
    }

    public void setBitrate(int i17) {
        this.bitrate = i17;
    }

    public void setCbr(int i17) {
        this.isCbr = i17;
    }

    public void setChannels(int i17) {
        this.channels = i17;
    }

    public void setDuration(long j17) {
        this.duration = j17;
    }

    public void setPlaySample(long j17) {
        this.mPlaySample = j17;
    }

    public void setSampleRate(long j17) {
        this.sampleRate = j17;
    }

    public java.lang.String toString() {
        return "[ sampleRate = " + this.sampleRate + ",channels = " + this.channels + ",bitrate = " + this.bitrate + ",bitDept = " + this.bitDept + ",isCbr = " + this.isCbr + ",durationIsCorrect = " + this.durationIsCorrect + ",duration = " + this.duration + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.sampleRate);
        parcel.writeInt(this.channels);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.bitDept);
        parcel.writeInt(this.mAudioTypeValue);
        parcel.writeLong(this.mPlaySample);
        parcel.writeInt(this.isCbr);
        parcel.writeInt(this.durationIsCorrect);
    }

    public AudioInformation(android.os.Parcel parcel) {
        readFromParcel(parcel);
    }
}
