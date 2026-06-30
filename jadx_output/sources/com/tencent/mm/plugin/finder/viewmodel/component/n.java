package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.s f135221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t f135225h;

    public n(com.tencent.mm.plugin.finder.viewmodel.component.s sVar, android.content.Context context, java.lang.String str, in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.t tVar) {
        this.f135221d = sVar;
        this.f135222e = context;
        this.f135223f = str;
        this.f135224g = s0Var;
        this.f135225h = tVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.viewmodel.component.s sVar = this.f135221d;
        sVar.getClass();
        if (itemId == 10021) {
            android.content.Context context = this.f135222e;
            kotlin.jvm.internal.o.f(context, "$context");
            com.tencent.mm.plugin.finder.viewmodel.component.s.n(sVar, context, this.f135223f, false);
            sVar.o(this.f135224g, this.f135225h);
            sVar.f135845e = null;
        }
    }
}
