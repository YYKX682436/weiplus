package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f164526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f164529h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f164530i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f164531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s7 f164532n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164533o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f164534p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.c2 f164535q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164536r;

    public o1(com.tencent.mm.plugin.sns.model.i1 i1Var, java.lang.String str, android.view.View view, java.lang.String str2, int i17, boolean z17, int i18, r45.jj4 jj4Var, com.tencent.mm.storage.s7 s7Var, java.lang.String str3, boolean z18, com.tencent.mm.plugin.sns.model.c2 c2Var) {
        this.f164536r = i1Var;
        this.f164525d = str;
        this.f164526e = view;
        this.f164527f = str2;
        this.f164528g = i17;
        this.f164529h = z17;
        this.f164530i = i18;
        this.f164531m = jj4Var;
        this.f164532n = s7Var;
        this.f164533o = str3;
        this.f164534p = z18;
        this.f164535q = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$13");
        com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.model.n1(this, com.tencent.mm.plugin.sns.storage.m2.m0(ca4.z0.o(this.f164525d))));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$13");
    }
}
