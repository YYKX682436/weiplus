package np1;

/* loaded from: classes11.dex */
public final class a extends r45.yd {
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof np1.a) && this.f390973d == ((np1.a) obj).f390973d;
    }

    public int hashCode() {
        int i17 = (this.f390973d + 31) * 31;
        com.tencent.mm.protobuf.g gVar = this.f390974e;
        int hashCode = (((((i17 + (gVar == null ? 0 : gVar.hashCode())) * 31) + (this.f390975f ? 1 : 0)) * 31) + (this.f390976g ? 1 : 0)) * 31;
        java.lang.String str = this.f390977h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f390979m;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f390978i;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AudioPanelPlayInfo{isPlaying: " + this.f390975f + ", showFloatingView: " + this.f390976g + ", title: " + this.f390977h + '}';
    }
}
