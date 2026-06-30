package com.tencent.mm.plugin.gamelife.conversation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gamelife/conversation/GameLifeOutputDataWrapper;", "Landroid/os/Parcelable;", "CREATOR", "z53/b0", "game-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class GameLifeOutputDataWrapper implements android.os.Parcelable {
    public static final z53.b0 CREATOR = new z53.b0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f141984d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f141985e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f141986f;

    public GameLifeOutputDataWrapper(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f141984d = str;
        this.f141985e = str2;
        this.f141986f = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper)) {
            return false;
        }
        com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper gameLifeOutputDataWrapper = (com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper) obj;
        return kotlin.jvm.internal.o.b(this.f141984d, gameLifeOutputDataWrapper.f141984d) && kotlin.jvm.internal.o.b(this.f141985e, gameLifeOutputDataWrapper.f141985e) && kotlin.jvm.internal.o.b(this.f141986f, gameLifeOutputDataWrapper.f141986f);
    }

    public int hashCode() {
        java.lang.String str = this.f141984d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f141985e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f141986f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GameLifeOutputDataWrapper(sessionId=" + this.f141984d + ", talker=" + this.f141985e + ", selfUsername=" + this.f141986f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f141984d);
        parcel.writeString(this.f141985e);
        parcel.writeString(this.f141986f);
    }
}
