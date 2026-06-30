package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f112643a;

    /* renamed from: b, reason: collision with root package name */
    public final int f112644b;

    /* renamed from: c, reason: collision with root package name */
    public final int f112645c;

    /* renamed from: d, reason: collision with root package name */
    public final long f112646d;

    public g8(int i17, int i18, int i19, long j17) {
        this.f112643a = i17;
        this.f112644b = i18;
        this.f112645c = i19;
        this.f112646d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.g8)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.g8 g8Var = (com.tencent.mm.plugin.finder.live.plugin.g8) obj;
        return this.f112643a == g8Var.f112643a && this.f112644b == g8Var.f112644b && this.f112645c == g8Var.f112645c && this.f112646d == g8Var.f112646d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f112643a) * 31) + java.lang.Integer.hashCode(this.f112644b)) * 31) + java.lang.Integer.hashCode(this.f112645c)) * 31) + java.lang.Long.hashCode(this.f112646d);
    }

    public java.lang.String toString() {
        return "songId:" + this.f112643a + ", playStatus:" + this.f112644b + ", songVolume:" + this.f112645c + ", songOptVersion:" + this.f112646d;
    }
}
