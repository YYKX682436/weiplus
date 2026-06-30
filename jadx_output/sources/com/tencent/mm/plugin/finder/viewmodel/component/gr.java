package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class gr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f134545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f134547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e5 f134548g;

    public gr(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var, r45.zk2 zk2Var, com.tencent.mm.plugin.finder.feed.model.e5 e5Var) {
        this.f134545d = hsVar;
        this.f134546e = s0Var;
        this.f134547f = zk2Var;
        this.f134548g = e5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.model.e5 answer = this.f134548g;
        kotlin.jvm.internal.o.f(answer, "$answer");
        com.tencent.mm.plugin.finder.viewmodel.component.oq oqVar = com.tencent.mm.plugin.finder.viewmodel.component.hs.f134650z;
        this.f134545d.R6(this.f134546e, this.f134547f, answer, "");
    }
}
