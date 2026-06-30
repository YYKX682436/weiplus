package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class s1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f117372d;

    /* renamed from: e, reason: collision with root package name */
    public final int f117373e;

    /* renamed from: f, reason: collision with root package name */
    public final int f117374f;

    /* renamed from: g, reason: collision with root package name */
    public final float f117375g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f117376h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f117377i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f117378m;

    /* renamed from: n, reason: collision with root package name */
    public db2.m5 f117379n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f117380o;

    /* renamed from: p, reason: collision with root package name */
    public final bm2.c f117381p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.viewmodel.e2 f117382q;

    public s1(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117372d = activity;
        this.f117373e = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        this.f117374f = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        this.f117375g = activity.getResources().getDimension(com.tencent.mm.R.dimen.f479716d9);
        this.f117380o = new java.util.ArrayList();
        this.f117381p = new bm2.c();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.s82 s82Var;
        gm0.j1.d().q(4140, this);
        java.util.ArrayList arrayList = this.f117380o;
        if (i17 == 0 && i18 == 0) {
            db2.m5 m5Var = m1Var instanceof db2.m5 ? (db2.m5) m1Var : null;
            if (m5Var != null && (s82Var = m5Var.f228075i) != null) {
                arrayList.clear();
                arrayList.addAll(s82Var.getList(1));
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveRecentPlayUIC", "recentPlayList.size:" + arrayList.size());
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.r1(this));
    }
}
