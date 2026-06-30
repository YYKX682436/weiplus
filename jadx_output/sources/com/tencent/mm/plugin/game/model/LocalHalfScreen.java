package com.tencent.mm.plugin.game.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/model/LocalHalfScreen;", "Landroid/os/Parcelable;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class LocalHalfScreen implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.model.LocalHalfScreen> CREATOR = new com.tencent.mm.plugin.game.model.s2();

    /* renamed from: d, reason: collision with root package name */
    public final int f140169d;

    /* renamed from: e, reason: collision with root package name */
    public final int f140170e;

    /* renamed from: f, reason: collision with root package name */
    public final float f140171f;

    public LocalHalfScreen(int i17, int i18, float f17) {
        this.f140169d = i17;
        this.f140170e = i18;
        this.f140171f = f17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.game.model.LocalHalfScreen)) {
            return false;
        }
        com.tencent.mm.plugin.game.model.LocalHalfScreen localHalfScreen = (com.tencent.mm.plugin.game.model.LocalHalfScreen) obj;
        return this.f140169d == localHalfScreen.f140169d && this.f140170e == localHalfScreen.f140170e && java.lang.Float.compare(this.f140171f, localHalfScreen.f140171f) == 0;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f140169d) * 31) + java.lang.Integer.hashCode(this.f140170e)) * 31) + java.lang.Float.hashCode(this.f140171f);
    }

    public java.lang.String toString() {
        return "LocalHalfScreen(type=" + this.f140169d + ", screenHeightDp=" + this.f140170e + ", screenHeightPercent=" + this.f140171f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f140169d);
        out.writeInt(this.f140170e);
        out.writeFloat(this.f140171f);
    }
}
