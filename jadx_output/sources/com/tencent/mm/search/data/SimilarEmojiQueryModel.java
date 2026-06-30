package com.tencent.mm.search.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/search/data/SimilarEmojiQueryModel;", "Landroid/os/Parcelable;", "emojisdk-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class SimilarEmojiQueryModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.search.data.SimilarEmojiQueryModel> CREATOR = new x75.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193149d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f193150e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f193151f;

    /* renamed from: g, reason: collision with root package name */
    public final long f193152g;

    /* renamed from: h, reason: collision with root package name */
    public final int f193153h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f193154i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f193155m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f193156n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f193157o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.v9 f193158p;

    public SimilarEmojiQueryModel(java.lang.String query, java.lang.String emojiMD5, java.lang.String chatID, long j17, int i17, java.lang.String toUser, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, boolean z17, com.tencent.mm.pluginsdk.ui.chat.v9 v9Var) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(emojiMD5, "emojiMD5");
        kotlin.jvm.internal.o.g(chatID, "chatID");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        this.f193149d = query;
        this.f193150e = emojiMD5;
        this.f193151f = chatID;
        this.f193152g = j17;
        this.f193153h = i17;
        this.f193154i = toUser;
        this.f193155m = gVar;
        this.f193156n = gVar2;
        this.f193157o = z17;
        this.f193158p = v9Var;
    }

    public final boolean a() {
        java.lang.String str = this.f193149d;
        return str == null || str.length() == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.search.data.SimilarEmojiQueryModel)) {
            return false;
        }
        com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = (com.tencent.mm.search.data.SimilarEmojiQueryModel) obj;
        return kotlin.jvm.internal.o.b(this.f193149d, similarEmojiQueryModel.f193149d) && kotlin.jvm.internal.o.b(this.f193150e, similarEmojiQueryModel.f193150e) && kotlin.jvm.internal.o.b(this.f193151f, similarEmojiQueryModel.f193151f) && this.f193152g == similarEmojiQueryModel.f193152g && this.f193153h == similarEmojiQueryModel.f193153h && kotlin.jvm.internal.o.b(this.f193154i, similarEmojiQueryModel.f193154i) && kotlin.jvm.internal.o.b(this.f193155m, similarEmojiQueryModel.f193155m) && kotlin.jvm.internal.o.b(this.f193156n, similarEmojiQueryModel.f193156n) && this.f193157o == similarEmojiQueryModel.f193157o && kotlin.jvm.internal.o.b(this.f193158p, similarEmojiQueryModel.f193158p);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f193149d.hashCode() * 31) + this.f193150e.hashCode()) * 31) + this.f193151f.hashCode()) * 31) + java.lang.Long.hashCode(this.f193152g)) * 31) + java.lang.Integer.hashCode(this.f193153h)) * 31) + this.f193154i.hashCode()) * 31;
        com.tencent.mm.protobuf.g gVar = this.f193155m;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.tencent.mm.protobuf.g gVar2 = this.f193156n;
        int hashCode3 = (((hashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f193157o)) * 31;
        com.tencent.mm.pluginsdk.ui.chat.v9 v9Var = this.f193158p;
        return hashCode3 + (v9Var != null ? v9Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SimilarEmojiQueryModel(query=" + this.f193149d + ", emojiMD5=" + this.f193150e + ", chatID=" + this.f193151f + ", timestamp=" + this.f193152g + ", scene=" + this.f193153h + ", toUser=" + this.f193154i + ", panelEmojiCtx=" + this.f193155m + ", PageBuff=" + this.f193156n + ", enableSos=" + this.f193157o + ", panelCallbackImpl=" + this.f193158p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f193149d);
        dest.writeString(this.f193150e);
        dest.writeString(this.f193151f);
        dest.writeLong(this.f193152g);
        dest.writeInt(this.f193153h);
        dest.writeString(this.f193154i);
    }
}
