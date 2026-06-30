package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class bx implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f133933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133934b;

    public bx(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar, java.lang.String str) {
        this.f133933a = sxVar;
        this.f133934b = str;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail before play new ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : null);
        com.tencent.mars.xlog.Log.e("FinderProjectionScreenUIC", sb6.toString());
        com.tencent.mm.plugin.finder.viewmodel.component.sx.O6(this.f133933a, this.f133934b, "StopFail");
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        com.tencent.mm.plugin.finder.viewmodel.component.sx.O6(this.f133933a, this.f133934b, "StopSuccess");
    }
}
