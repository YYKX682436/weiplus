package jn2;

/* loaded from: classes5.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.j f300620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f300621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f300622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f300623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.zw1 f300624h;

    public h(jn2.j jVar, int i17, java.util.LinkedList linkedList, int i18, r45.zw1 zw1Var) {
        this.f300620d = jVar;
        this.f300621e = i17;
        this.f300622f = linkedList;
        this.f300623g = i18;
        this.f300624h = zw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jn2.j jVar = this.f300620d;
        int i17 = this.f300621e;
        jVar.h0(i17, this.f300622f, this.f300623g, this.f300624h);
        if (i17 != 0) {
            com.google.android.material.tabs.TabLayout tabLayout = jVar.f300632J;
            if (tabLayout == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            oa.i k17 = tabLayout.k(i17);
            if (k17 != null) {
                k17.b();
            }
        }
    }
}
