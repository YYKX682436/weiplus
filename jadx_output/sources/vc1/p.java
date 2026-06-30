package vc1;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f435054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o91.d f435055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435056g;

    public p(vc1.p1 p1Var, java.lang.String str, vc1.q2 q2Var, o91.d dVar) {
        this.f435056g = p1Var;
        this.f435053d = str;
        this.f435054e = q2Var;
        this.f435055f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f435056g.c(this.f435053d, this.f435054e, this.f435055f);
    }
}
