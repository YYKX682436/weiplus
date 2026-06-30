package com.tencent.mm.plugin.game.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;", "Landroid/os/Parcelable;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class LocalJumpInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.model.LocalJumpInfo> CREATOR = new com.tencent.mm.plugin.game.model.t2();

    /* renamed from: d, reason: collision with root package name */
    public final int f140172d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f140173e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.WeAppJumpInfo f140174f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.LocalHalfScreen f140175g;

    public LocalJumpInfo(int i17, java.lang.String str, com.tencent.mm.plugin.game.model.WeAppJumpInfo weAppJumpInfo, com.tencent.mm.plugin.game.model.LocalHalfScreen localHalfScreen) {
        this.f140172d = i17;
        this.f140173e = str;
        this.f140174f = weAppJumpInfo;
        this.f140175g = localHalfScreen;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.game.model.LocalJumpInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo = (com.tencent.mm.plugin.game.model.LocalJumpInfo) obj;
        return this.f140172d == localJumpInfo.f140172d && kotlin.jvm.internal.o.b(this.f140173e, localJumpInfo.f140173e) && kotlin.jvm.internal.o.b(this.f140174f, localJumpInfo.f140174f) && kotlin.jvm.internal.o.b(this.f140175g, localJumpInfo.f140175g);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f140172d) * 31;
        java.lang.String str = this.f140173e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.tencent.mm.plugin.game.model.WeAppJumpInfo weAppJumpInfo = this.f140174f;
        int hashCode3 = (hashCode2 + (weAppJumpInfo == null ? 0 : weAppJumpInfo.hashCode())) * 31;
        com.tencent.mm.plugin.game.model.LocalHalfScreen localHalfScreen = this.f140175g;
        return hashCode3 + (localHalfScreen != null ? localHalfScreen.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LocalJumpInfo(jumpType=" + this.f140172d + ", jumpUrl=" + this.f140173e + ", weAppJumpInfo=" + this.f140174f + ", halfScreen=" + this.f140175g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f140172d);
        out.writeString(this.f140173e);
        com.tencent.mm.plugin.game.model.WeAppJumpInfo weAppJumpInfo = this.f140174f;
        if (weAppJumpInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            weAppJumpInfo.writeToParcel(out, i17);
        }
        com.tencent.mm.plugin.game.model.LocalHalfScreen localHalfScreen = this.f140175g;
        if (localHalfScreen == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            localHalfScreen.writeToParcel(out, i17);
        }
    }
}
