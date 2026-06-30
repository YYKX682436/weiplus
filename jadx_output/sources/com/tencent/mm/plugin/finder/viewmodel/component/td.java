package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class td implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.yd f136012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136014f;

    public td(com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        this.f136012d = ydVar;
        this.f136013e = baseFinderFeed;
        this.f136014f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar = this.f136012d;
        ydVar.getClass();
        qs2.e eVar = new qs2.e(1, 65, 5);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f136013e;
        eVar.f366262d = baseFinderFeed.getItemId();
        eVar.f366263e = baseFinderFeed.w();
        eVar.f366277s = this.f136014f;
        eVar.f366276r = 9;
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        w40.e.Df((w40.e) c17, ydVar.getContext(), eVar, null, 4, null);
        return java.lang.Boolean.TRUE;
    }
}
