package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f164458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f164461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f164462i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f164463m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s7 f164464n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164465o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.c2 f164466p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164467q;

    public m1(com.tencent.mm.plugin.sns.model.i1 i1Var, java.lang.String str, android.view.View view, java.lang.String str2, int i17, boolean z17, r45.jj4 jj4Var, boolean z18, com.tencent.mm.storage.s7 s7Var, java.lang.String str3, com.tencent.mm.plugin.sns.model.c2 c2Var) {
        this.f164467q = i1Var;
        this.f164457d = str;
        this.f164458e = view;
        this.f164459f = str2;
        this.f164460g = i17;
        this.f164461h = z17;
        this.f164462i = jj4Var;
        this.f164463m = z18;
        this.f164464n = s7Var;
        this.f164465o = str3;
        this.f164466p = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$12");
        com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.model.l1(this, ca4.z0.o(this.f164457d)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$12");
    }
}
