package yz0;

/* loaded from: classes15.dex */
public final class a extends dm.x7 {
    public static final l75.e0 Y = dm.x7.initAutoDBInfo(yz0.a.class);

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof yz0.a) {
            return kotlin.jvm.internal.o.b(this.field_mediaId, ((yz0.a) obj).field_mediaId);
        }
        return false;
    }

    @Override // dm.x7, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = Y;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public int hashCode() {
        return this.field_mediaId.hashCode();
    }

    public final java.lang.String t0() {
        return zz0.a.f477696a.a("", this.field_originMediaId, this.field_url);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.field_mediaId);
        sb6.append(", ");
        sb6.append(this.field_codecFormat);
        sb6.append(' ');
        sb6.append(this.field_moovReady);
        sb6.append(" state:");
        sb6.append(this.field_state);
        sb6.append(" specFormat=");
        sb6.append(this.field_specFormat);
        sb6.append(" cacheSize=");
        sb6.append(this.field_cacheSize);
        sb6.append(" totalSize=");
        sb6.append(this.field_totalSize);
        sb6.append(" percent=");
        long j17 = this.field_totalSize;
        sb6.append(j17 <= 0 ? 0 : (int) ((((float) this.field_cacheSize) / ((float) j17)) * 100));
        sb6.append(", ");
        sb6.append(t0());
        sb6.append(", ");
        sb6.append(this.field_url);
        return sb6.toString();
    }
}
