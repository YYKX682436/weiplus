package org.chromium.base;

/* loaded from: classes13.dex */
public class UnguessableToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<org.chromium.base.UnguessableToken> CREATOR = new android.os.Parcelable.Creator<org.chromium.base.UnguessableToken>() { // from class: org.chromium.base.UnguessableToken.1
        @Override // android.os.Parcelable.Creator
        public org.chromium.base.UnguessableToken createFromParcel(android.os.Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new org.chromium.base.UnguessableToken(readLong, readLong2);
        }

        @Override // android.os.Parcelable.Creator
        public org.chromium.base.UnguessableToken[] newArray(int i17) {
            return new org.chromium.base.UnguessableToken[i17];
        }
    };
    private final long mHigh;
    private final long mLow;

    private static org.chromium.base.UnguessableToken create(long j17, long j18) {
        return new org.chromium.base.UnguessableToken(j17, j18);
    }

    private org.chromium.base.UnguessableToken parcelAndUnparcelForTesting() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        org.chromium.base.UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.chromium.base.UnguessableToken unguessableToken = (org.chromium.base.UnguessableToken) obj;
        return unguessableToken.mHigh == this.mHigh && unguessableToken.mLow == this.mLow;
    }

    public long getHighForSerialization() {
        return this.mHigh;
    }

    public long getLowForSerialization() {
        return this.mLow;
    }

    public int hashCode() {
        long j17 = this.mLow;
        long j18 = this.mHigh;
        return (((int) (j17 ^ (j17 >>> 32))) * 31) + ((int) ((j18 >>> 32) ^ j18));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.mHigh);
        parcel.writeLong(this.mLow);
    }

    private UnguessableToken(long j17, long j18) {
        this.mHigh = j17;
        this.mLow = j18;
    }
}
