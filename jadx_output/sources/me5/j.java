package me5;

/* loaded from: classes4.dex */
public class j extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325971i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325972m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f325973n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f325974o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325975p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ me5.n f325976q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(me5.n nVar, int i17, r35.m3 m3Var, java.lang.ref.WeakReference weakReference, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f325976q = nVar;
        this.f325967e = weakReference;
        this.f325968f = str;
        this.f325969g = str2;
        this.f325970h = str3;
        this.f325971i = str4;
        this.f325972m = str5;
        this.f325973n = map;
        this.f325974o = bundle;
        this.f325975p = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        android.content.Context context = (android.content.Context) this.f325967e.get();
        if (context == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.r(com.tencent.mm.sdk.platformtools.t8.z1(context.getString(com.tencent.mm.R.string.ayh), this.f325968f, this.f325969g), 17, i65.a.b(context, 14), null);
        k0Var.f211872n = new me5.h(this, context);
        k0Var.f211881s = new me5.i(this, k0Var, context);
        k0Var.v();
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        this.f325976q.getClass();
        ((ih3.e) k1Var).Di("link_revoke_unbindapp", this.f325973n, this.f325974o, this.f325967e, this.f325975p);
    }
}
