package so2;

/* loaded from: classes10.dex */
public final class i3 extends dm.w4 {
    public static final l75.e0 L1 = dm.w4.initAutoDBInfo(so2.i3.class);

    public final boolean A0() {
        return this.field_totalSize > 0 && this.field_cacheSize > 0 && this.field_state == 3;
    }

    public final boolean D0() {
        long j17 = this.field_totalSize;
        return j17 > 0 && this.field_cacheSize == j17;
    }

    public final boolean F0() {
        if (this.field_totalSize > 0) {
            long j17 = this.field_cacheSize;
            if (j17 > 0) {
                long j18 = this.field_firstStagePreloadSize;
                if (j18 > 0 && j17 >= j18) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean G0() {
        if (this.field_twoStagePreloadPercent == 0) {
            this.field_twoStagePreloadPercent = ((c61.l7) i95.n0.c(c61.l7.class)).ek().r(this.field_duration * 1000);
        }
        if (this.field_totalSize > 0) {
            if (this.field_cacheSize > 0 && this.field_twoStagePreloadPercent > 0 && ((float) java.lang.Math.ceil((((float) r4) * 100.0f) / ((float) r0))) >= this.field_twoStagePreloadPercent) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String I0() {
        return this.field_mediaId + ", " + this.field_fileFormat + ' ' + this.field_moovReady + " state:" + this.field_state + " codingFormat=" + this.field_reqFormat + " cacheSize=" + this.field_cacheSize + " totalSize=" + this.field_totalSize + " percent=" + w0() + ", oneStage:" + this.field_firstStagePreloadSize + " twoStage:" + this.field_twoStagePreloadPercent + " progress=" + this.field_playProgress;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof so2.i3) {
            return kotlin.jvm.internal.o.b(this.field_mediaId, ((so2.i3) obj).field_mediaId);
        }
        return false;
    }

    @Override // dm.w4, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = L1;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public int hashCode() {
        return this.field_mediaId.hashCode();
    }

    public void reset() {
        this.field_cacheSize = 0L;
        this.field_totalSize = 0L;
        this.field_hasPlayed = false;
        this.field_reqFormat = 0;
        this.field_fileFormat = "";
        this.field_state = 0;
        this.field_moovReady = false;
        this.field_audioBitrate = 0;
        this.field_videoBitrate = 0;
        this.field_frameRate = 0;
        this.field_netProfile = "";
        this.field_enhanceStrategy = 0;
        this.field_enhanceStrength = 0;
        this.field_enhanceGPUScore = 0;
    }

    public final long t0() {
        return this.field_cacheSize;
    }

    public java.lang.String toString() {
        return I0() + u0() + ", " + this.field_url;
    }

    public final java.lang.String u0() {
        return com.tencent.mm.plugin.finder.assist.e9.f102140i + com.tencent.mm.plugin.finder.assist.e9.f102132a.k(this.field_fileFormat, this.field_originMediaId, this.field_url);
    }

    public final java.lang.String v0() {
        java.lang.String str = this.field_netProfile;
        return str == null ? "" : str;
    }

    public final int w0() {
        long j17 = this.field_totalSize;
        if (j17 <= 0) {
            return 0;
        }
        return (int) ((((float) this.field_cacheSize) / ((float) j17)) * 100);
    }

    public final float y0() {
        long j17 = this.field_totalSize;
        if (j17 <= 0) {
            return 0.0f;
        }
        return (((float) this.field_cacheSize) * 1.0f) / ((float) j17);
    }

    public final long z0() {
        return this.field_totalSize;
    }
}
