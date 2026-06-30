package yw;

/* loaded from: classes9.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f466387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f466388g;

    public l(yw.y yVar, int i17, boolean z17, boolean z18) {
        this.f466385d = yVar;
        this.f466386e = i17;
        this.f466387f = z17;
        this.f466388g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.g(new yw.k(this.f466385d, this.f466386e, this.f466387f, this.f466388g, e17));
        }
    }
}
