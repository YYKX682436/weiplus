package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class p0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.y0 f173337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nj4.e f173339f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f173340g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173341h;

    public p0(com.tencent.mm.plugin.textstatus.convert.topic.y0 y0Var, in5.s0 s0Var, nj4.e eVar, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.lang.String str) {
        this.f173337d = y0Var;
        this.f173338e = s0Var;
        this.f173339f = eVar;
        this.f173340g = mvvmList;
        this.f173341h = str;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.textstatus.convert.topic.y0.o(this.f173337d, ((ym3.o) obj).f463177a, this.f173338e, this.f173339f, this.f173340g, this.f173341h);
    }
}
