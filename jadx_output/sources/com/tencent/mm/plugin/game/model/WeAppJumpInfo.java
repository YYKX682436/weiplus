package com.tencent.mm.plugin.game.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/model/WeAppJumpInfo;", "Landroid/os/Parcelable;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class WeAppJumpInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.model.WeAppJumpInfo> CREATOR = new com.tencent.mm.plugin.game.model.a4();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f140187d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f140188e;

    public WeAppJumpInfo(java.lang.String str, java.lang.String str2) {
        this.f140187d = str;
        this.f140188e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.game.model.WeAppJumpInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.model.WeAppJumpInfo weAppJumpInfo = (com.tencent.mm.plugin.game.model.WeAppJumpInfo) obj;
        return kotlin.jvm.internal.o.b(this.f140187d, weAppJumpInfo.f140187d) && kotlin.jvm.internal.o.b(this.f140188e, weAppJumpInfo.f140188e);
    }

    public int hashCode() {
        java.lang.String str = this.f140187d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f140188e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WeAppJumpInfo(appId=" + this.f140187d + ", path=" + this.f140188e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f140187d);
        out.writeString(this.f140188e);
    }
}
