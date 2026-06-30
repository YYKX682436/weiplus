package j63;

/* loaded from: classes.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        final java.lang.String readString = parcel.readString();
        final java.lang.String readString2 = parcel.readString();
        final java.lang.String readString3 = parcel.readString();
        final long readLong = parcel.readLong();
        final java.lang.String readString4 = parcel.readString();
        return new android.os.Parcelable(readString, readString2, readString3, readLong, readString4) { // from class: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload
            public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload> CREATOR = new j63.m();

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f142063d;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.String f142064e;

            /* renamed from: f, reason: collision with root package name */
            public final java.lang.String f142065f;

            /* renamed from: g, reason: collision with root package name */
            public final long f142066g;

            /* renamed from: h, reason: collision with root package name */
            public final java.lang.String f142067h;

            {
                this.f142063d = readString;
                this.f142064e = readString2;
                this.f142065f = readString3;
                this.f142066g = readLong;
                this.f142067h = readString4;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload)) {
                    return false;
                }
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload gameLiveAppbrandEventService$LiveStartInfoPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload) obj;
                return kotlin.jvm.internal.o.b(this.f142063d, gameLiveAppbrandEventService$LiveStartInfoPayload.f142063d) && kotlin.jvm.internal.o.b(this.f142064e, gameLiveAppbrandEventService$LiveStartInfoPayload.f142064e) && kotlin.jvm.internal.o.b(this.f142065f, gameLiveAppbrandEventService$LiveStartInfoPayload.f142065f) && this.f142066g == gameLiveAppbrandEventService$LiveStartInfoPayload.f142066g && kotlin.jvm.internal.o.b(this.f142067h, gameLiveAppbrandEventService$LiveStartInfoPayload.f142067h);
            }

            public int hashCode() {
                java.lang.String str = this.f142063d;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.f142064e;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.f142065f;
                int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Long.hashCode(this.f142066g)) * 31;
                java.lang.String str4 = this.f142067h;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "LiveStartInfoPayload(nickname=" + this.f142063d + ", headerUrl=" + this.f142064e + ", joinLiveTips=" + this.f142065f + ", liveId=" + this.f142066g + ", finderUsrName=" + this.f142067h + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel out, int i17) {
                kotlin.jvm.internal.o.g(out, "out");
                out.writeString(this.f142063d);
                out.writeString(this.f142064e);
                out.writeString(this.f142065f);
                out.writeLong(this.f142066g);
                out.writeString(this.f142067h);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload[i17];
    }
}
