package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes3.dex */
public final class j8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f143627a;

    public j8(int i17) {
        this.f143627a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.lite.jsapi.comms.j8) && this.f143627a == ((com.tencent.mm.plugin.lite.jsapi.comms.j8) obj).f143627a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f143627a);
    }

    public java.lang.String toString() {
        return "VideoInfo(durationS=" + this.f143627a + ')';
    }
}
