package p16;

/* loaded from: classes16.dex */
public final class t implements p16.m {

    /* renamed from: d, reason: collision with root package name */
    public final int f351346d;

    /* renamed from: e, reason: collision with root package name */
    public final p16.g1 f351347e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f351348f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f351349g;

    public t(p16.x xVar, int i17, p16.g1 g1Var, boolean z17, boolean z18) {
        this.f351346d = i17;
        this.f351347e = g1Var;
        this.f351348f = z17;
        this.f351349g = z18;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f351346d - ((p16.t) obj).f351346d;
    }
}
