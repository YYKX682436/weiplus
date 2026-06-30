package sc2;

/* loaded from: classes2.dex */
public final class o6 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f406130e;

    public o6(xc2.p0 p0Var, ad2.h hVar, java.lang.String str, in5.s0 s0Var, long j17) {
        this.f406126a = p0Var;
        this.f406127b = hVar;
        this.f406128c = str;
        this.f406129d = s0Var;
        this.f406130e = j17;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f406130e;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (j17 == -1 && j18 == -1) {
            return;
        }
        xc2.p0 p0Var = this.f406126a;
        xc2.o0 o0Var = p0Var.f453246h;
        boolean z18 = true;
        boolean z19 = (o0Var == null || o0Var.a()) ? false : true;
        ad2.h hVar = this.f406127b;
        if (!z19) {
            java.lang.String wording = p0Var.f453234a.getWording();
            if (wording != null && wording.length() != 0) {
                z18 = false;
            }
            if (z18 && !hVar.m(p0Var)) {
                com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "[onViewExposed] isExposed=" + z17 + ", jumper info is invalid, feedId=" + this.f406128c);
                return;
            }
        }
        hVar.u(z17, this.f406129d, view, p0Var);
    }
}
