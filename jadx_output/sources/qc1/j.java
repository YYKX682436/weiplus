package qc1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f361467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qc1.k f361470g;

    public j(qc1.k kVar, java.lang.ref.WeakReference weakReference, int i17, int i18) {
        this.f361470g = kVar;
        this.f361467d = weakReference;
        this.f361468e = i17;
        this.f361469f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f361467d.get();
        if (v5Var == null) {
            return;
        }
        if (v5Var.F1() != null) {
            v5Var.F1().hideVKB();
        }
        com.tencent.mm.plugin.appbrand.widget.input.p4 a17 = com.tencent.mm.plugin.appbrand.widget.input.r1.a(v5Var, this.f361468e);
        v5Var.a(this.f361469f, this.f361470g.o(a17 != null && a17.a() ? "ok" : "fail"));
    }
}
