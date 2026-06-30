package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class q0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.y0 f173357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nj4.e f173359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f173360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173361h;

    public q0(com.tencent.mm.plugin.textstatus.convert.topic.y0 y0Var, in5.s0 s0Var, nj4.e eVar, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.lang.String str) {
        this.f173357d = y0Var;
        this.f173358e = s0Var;
        this.f173359f = eVar;
        this.f173360g = mvvmList;
        this.f173361h = str;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.textstatus.convert.topic.y0.o(this.f173357d, ((ym3.o) obj).f463177a, this.f173358e, this.f173359f, this.f173360g, this.f173361h);
    }
}
