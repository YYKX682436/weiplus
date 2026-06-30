package com.tencent.paymars.smc;

/* loaded from: classes12.dex */
public class IDKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.paymars.smc.IDKey> CREATOR = new android.os.Parcelable.Creator<com.tencent.paymars.smc.IDKey>() { // from class: com.tencent.paymars.smc.IDKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.paymars.smc.IDKey createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.paymars.smc.IDKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.paymars.smc.IDKey[] newArray(int i17) {
            return new com.tencent.paymars.smc.IDKey[i17];
        }
    };

    /* renamed from: id, reason: collision with root package name */
    protected long f215218id;
    protected long key;
    protected long value;

    public IDKey(int i17, int i18) {
        this(i17, i18, 1);
    }

    public long GetID() {
        return this.f215218id;
    }

    public long GetKey() {
        return this.key;
    }

    public long GetValue() {
        return this.value;
    }

    public void SetID(int i17) {
        this.f215218id = i17;
    }

    public void SetKey(int i17) {
        this.key = i17;
    }

    public void SetValue(long j17) {
        this.value = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f215218id);
        parcel.writeLong(this.key);
        parcel.writeLong(this.value);
    }

    public IDKey(int i17, int i18, int i19) {
        this.f215218id = i17;
        this.key = i18;
        this.value = i19;
    }

    public IDKey(long j17, long j18, long j19) {
        this.f215218id = j17;
        this.key = j18;
        this.value = j19;
    }

    public IDKey() {
        this.f215218id = 0L;
        this.key = 0L;
        this.value = 0L;
    }

    public IDKey(android.os.Parcel parcel) {
        this.f215218id = parcel.readLong();
        this.key = parcel.readLong();
        this.value = parcel.readLong();
    }
}
