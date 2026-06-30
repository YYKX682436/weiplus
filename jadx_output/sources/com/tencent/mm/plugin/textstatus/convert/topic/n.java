package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class n implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.q f173322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nj4.e f173324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173325g;

    public n(com.tencent.mm.plugin.textstatus.convert.topic.q qVar, in5.s0 s0Var, nj4.e eVar, android.view.View view) {
        this.f173322d = qVar;
        this.f173323e = s0Var;
        this.f173324f = eVar;
        this.f173325g = view;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ym3.p pVar = ((ym3.o) obj).f463177a;
        android.view.View llList = this.f173325g;
        kotlin.jvm.internal.o.f(llList, "$llList");
        com.tencent.mm.plugin.textstatus.convert.topic.q.o(this.f173322d, pVar, this.f173323e, this.f173324f, llList);
    }
}
