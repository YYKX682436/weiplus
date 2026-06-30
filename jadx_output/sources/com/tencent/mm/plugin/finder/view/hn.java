package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class hn implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f132255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.lz0 f132256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e1 f132257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f132258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f132259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f132260g;

    public hn(java.lang.String str, android.os.Bundle bundle, r45.lz0 lz0Var, com.tencent.mm.plugin.finder.view.e1 e1Var, com.tencent.mm.plugin.finder.view.e3 e3Var, boolean z17, yz5.l lVar) {
        this.f132254a = str;
        this.f132255b = bundle;
        this.f132256c = lz0Var;
        this.f132257d = e1Var;
        this.f132258e = e3Var;
        this.f132259f = z17;
        this.f132260g = lVar;
    }

    @Override // zy2.c6
    public final void a(zy2.dc dcVar) {
        ya2.b2 b2Var = (ya2.b2) dcVar;
        java.lang.String D0 = b2Var.D0();
        java.lang.String str = this.f132254a;
        if (!kotlin.jvm.internal.o.b(str, D0)) {
            pm0.v.X(new com.tencent.mm.plugin.finder.view.gn(this.f132257d, this.f132258e, this.f132255b, this.f132259f, this.f132260g));
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderWxProfileHelper", "get contact success %s", str);
            pm0.v.X(new com.tencent.mm.plugin.finder.view.fn(b2Var, this.f132255b, this.f132256c, this.f132257d, this.f132258e, this.f132259f, this.f132260g));
        }
    }
}
