package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f215391a;

    /* renamed from: b, reason: collision with root package name */
    public final double f215392b;

    /* renamed from: c, reason: collision with root package name */
    public final double f215393c;

    /* renamed from: d, reason: collision with root package name */
    public final double f215394d;

    /* renamed from: e, reason: collision with root package name */
    public final double f215395e;

    /* renamed from: f, reason: collision with root package name */
    public final double f215396f;

    public g(double d17, double d18, double d19, double d27) {
        this.f215391a = d17;
        this.f215392b = d19;
        this.f215393c = d18;
        this.f215394d = d27;
        this.f215395e = (d17 + d18) / 2.0d;
        this.f215396f = (d19 + d27) / 2.0d;
    }

    public boolean a(double d17, double d18) {
        return this.f215391a <= d17 && d17 <= this.f215393c && this.f215392b <= d18 && d18 <= this.f215394d;
    }

    public boolean b(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar) {
        return a(gVar.f215391a, gVar.f215393c, gVar.f215392b, gVar.f215394d);
    }

    public boolean a(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar) {
        return a(hVar.f215397a, hVar.f215398b);
    }

    public boolean a(double d17, double d18, double d19, double d27) {
        return d17 < this.f215393c && this.f215391a < d18 && d19 < this.f215394d && this.f215392b < d27;
    }

    public boolean a(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar) {
        return gVar.f215391a >= this.f215391a && gVar.f215393c <= this.f215393c && gVar.f215392b >= this.f215392b && gVar.f215394d <= this.f215394d;
    }
}
