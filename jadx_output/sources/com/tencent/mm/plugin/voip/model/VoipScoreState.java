package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class VoipScoreState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.voip.model.VoipScoreState> CREATOR = new com.tencent.mm.plugin.voip.model.g2();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f176311d;

    /* renamed from: e, reason: collision with root package name */
    public int f176312e;

    /* renamed from: f, reason: collision with root package name */
    public int f176313f;

    /* renamed from: g, reason: collision with root package name */
    public long f176314g;

    /* renamed from: h, reason: collision with root package name */
    public long f176315h;

    /* renamed from: i, reason: collision with root package name */
    public long f176316i;

    public VoipScoreState() {
        this.f176311d = "";
        this.f176312e = -1;
        this.f176313f = -1;
        this.f176314g = -1L;
        this.f176315h = -1L;
        this.f176316i = 0L;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoipScoreState", "create VoipScoreState", new java.lang.Object[0]);
    }

    public void a() {
        long p17 = c01.w9.p();
        this.f176315h = p17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipScoreState", "markStartTalk, startTalkTime:%s", java.lang.Long.valueOf(p17));
    }

    public void b(java.lang.String str, int i17, int i18, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipScoreState", "setScoreState, roomId:%s, roomKey:%s, title:%s, interval:%s", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(i17));
        this.f176313f = i18;
        this.f176314g = j17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            java.lang.String str2 = new java.lang.String(android.util.Base64.decode(str.getBytes(), 0));
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoipScoreState", "setScoreState, title:%s, interval:%s", str2, java.lang.Integer.valueOf(i17));
            this.f176312e = i17;
            this.f176311d = str2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipScoreState", e17, "setScoreState error: %s", e17.getMessage());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "VoipScoreState{scoreTitle='" + this.f176311d + "', scoreIntervalDay=" + this.f176312e + ", roomId=" + this.f176313f + ", roomKey=" + this.f176314g + ", startTalkTime=" + this.f176315h + ", lastShowScoreTime=" + this.f176316i + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f176311d);
        parcel.writeInt(this.f176312e);
        parcel.writeInt(this.f176313f);
        parcel.writeLong(this.f176314g);
        parcel.writeLong(this.f176315h);
        parcel.writeLong(this.f176316i);
    }

    public VoipScoreState(android.os.Parcel parcel) {
        this.f176311d = "";
        this.f176312e = -1;
        this.f176313f = -1;
        this.f176314g = -1L;
        this.f176315h = -1L;
        this.f176316i = 0L;
        this.f176311d = parcel.readString();
        this.f176312e = parcel.readInt();
        this.f176313f = parcel.readInt();
        this.f176314g = parcel.readLong();
        this.f176315h = parcel.readLong();
        this.f176316i = parcel.readLong();
    }
}
