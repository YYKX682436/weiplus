package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h10 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f112748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f112749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.y f112750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f112751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112752h;

    public h10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, r45.h32 h32Var, cm2.y yVar, int i17, java.lang.String str) {
        this.f112748d = z10Var;
        this.f112749e = h32Var;
        this.f112750f = yVar;
        this.f112751g = i17;
        this.f112752h = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 4) {
            com.tencent.mm.plugin.finder.live.plugin.i10.d(this.f112748d, this.f112749e, this.f112750f, this.f112751g, this.f112752h);
        }
    }
}
