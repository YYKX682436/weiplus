package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class m implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.q f173315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nj4.e f173317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173318g;

    public m(com.tencent.mm.plugin.textstatus.convert.topic.q qVar, in5.s0 s0Var, nj4.e eVar, android.view.View view) {
        this.f173315d = qVar;
        this.f173316e = s0Var;
        this.f173317f = eVar;
        this.f173318g = view;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ym3.p pVar = ((ym3.o) obj).f463177a;
        android.view.View llList = this.f173318g;
        kotlin.jvm.internal.o.f(llList, "$llList");
        com.tencent.mm.plugin.textstatus.convert.topic.q.o(this.f173315d, pVar, this.f173316e, this.f173317f, llList);
    }
}
