package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f215397a;

    /* renamed from: b, reason: collision with root package name */
    public final double f215398b;

    public h(double d17, double d18) {
        this.f215397a = d17;
        this.f215398b = d18;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h)) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar = (com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h) obj;
        return this.f215397a == hVar.f215397a && this.f215398b == hVar.f215398b;
    }

    public java.lang.String toString() {
        return "Point{x=" + this.f215397a + ", y=" + this.f215398b + '}';
    }
}
