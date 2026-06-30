package com.tencent.mm.plugin.normsg.api;

/* loaded from: classes13.dex */
public class AudioModeStatus implements android.os.Parcelable, java.lang.Cloneable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.normsg.api.AudioModeStatus> CREATOR = new fo3.a();

    /* renamed from: d, reason: collision with root package name */
    public int f152401d;

    /* renamed from: e, reason: collision with root package name */
    public long f152402e;

    /* renamed from: f, reason: collision with root package name */
    public int f152403f;

    /* renamed from: g, reason: collision with root package name */
    public long f152404g;

    public AudioModeStatus() {
        this.f152401d = -1;
        this.f152402e = 0L;
        this.f152403f = -1;
        this.f152404g = 0L;
    }

    public static com.tencent.mm.plugin.normsg.api.AudioModeStatus a() {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus = new com.tencent.mm.plugin.normsg.api.AudioModeStatus();
        audioModeStatus.f152401d = audioManager.getMode();
        return audioModeStatus;
    }

    public com.tencent.mm.normsg.a b() {
        return new com.tencent.mm.normsg.a(this.f152401d, this.f152402e, this.f152403f, this.f152404g);
    }

    public java.lang.Object clone() {
        com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus;
        synchronized (this) {
            audioModeStatus = new com.tencent.mm.plugin.normsg.api.AudioModeStatus();
            audioModeStatus.f152401d = this.f152401d;
            audioModeStatus.f152402e = this.f152402e;
            audioModeStatus.f152403f = this.f152403f;
            audioModeStatus.f152404g = this.f152404g;
        }
        return audioModeStatus;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f152401d);
        parcel.writeLong(this.f152402e);
        parcel.writeInt(this.f152403f);
        parcel.writeLong(this.f152404g);
    }

    public AudioModeStatus(android.os.Parcel parcel) {
        this.f152401d = -1;
        this.f152402e = 0L;
        this.f152403f = -1;
        this.f152404g = 0L;
        this.f152401d = parcel.readInt();
        this.f152402e = parcel.readLong();
        this.f152403f = parcel.readInt();
        this.f152404g = parcel.readLong();
    }
}
