package com.tencent.mm.plugin.game.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/model/LocalTabCornerSetting;", "Landroid/os/Parcelable;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class LocalTabCornerSetting implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.model.LocalTabCornerSetting> CREATOR = new com.tencent.mm.plugin.game.model.u2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f140176d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f140177e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f140178f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.LocalJumpInfo f140179g;

    public LocalTabCornerSetting(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo) {
        this.f140176d = str;
        this.f140177e = str2;
        this.f140178f = str3;
        this.f140179g = localJumpInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.game.model.LocalTabCornerSetting)) {
            return false;
        }
        com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting = (com.tencent.mm.plugin.game.model.LocalTabCornerSetting) obj;
        return kotlin.jvm.internal.o.b(this.f140176d, localTabCornerSetting.f140176d) && kotlin.jvm.internal.o.b(this.f140177e, localTabCornerSetting.f140177e) && kotlin.jvm.internal.o.b(this.f140178f, localTabCornerSetting.f140178f) && kotlin.jvm.internal.o.b(this.f140179g, localTabCornerSetting.f140179g);
    }

    public int hashCode() {
        java.lang.String str = this.f140176d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f140177e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f140178f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo = this.f140179g;
        return hashCode3 + (localJumpInfo != null ? localJumpInfo.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LocalTabCornerSetting(key=" + this.f140176d + ", iconUrl=" + this.f140177e + ", darkModeIconUrl=" + this.f140178f + ", jumpInfo=" + this.f140179g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f140176d);
        out.writeString(this.f140177e);
        out.writeString(this.f140178f);
        com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo = this.f140179g;
        if (localJumpInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            localJumpInfo.writeToParcel(out, i17);
        }
    }
}
