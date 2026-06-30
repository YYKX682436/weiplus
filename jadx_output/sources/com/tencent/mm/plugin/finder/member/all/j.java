package com.tencent.mm.plugin.finder.member.all;

/* loaded from: classes2.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.all.m f121084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121085f;

    public j(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.member.all.m mVar, in5.s0 s0Var) {
        this.f121083d = baseFinderFeed;
        this.f121084e = mVar;
        this.f121085f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        in5.s0 s0Var = this.f121085f;
        com.tencent.mm.plugin.finder.member.all.m mVar = this.f121084e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f121083d;
        if (itemId == 1) {
            int i18 = baseFinderFeed.getFeedObject().isQAFeed() ? 104 : 0;
            com.tencent.mm.ui.MMActivity context = mVar.f121088d;
            java.lang.String string = context.getString(com.tencent.mm.R.string.mqn);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = mVar.f121088d.getString(com.tencent.mm.R.string.f490367t0);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            com.tencent.mm.plugin.finder.member.all.i iVar = new com.tencent.mm.plugin.finder.member.all.i(mVar, s0Var, baseFinderFeed, i18);
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, true);
            k0Var.r(string, 17, i65.a.b(context, 14), null);
            k0Var.f211872n = new ko2.a(1, context, string2);
            k0Var.f211881s = new ko2.b(1, iVar);
            k0Var.v();
            return;
        }
        if (itemId == 2) {
            bd2.b.f19244a.d(mVar.f121088d, baseFinderFeed.getFeedObject().getId(), (r22 & 4) != 0 ? 0L : 0L, baseFinderFeed.getFeedObject().isQAFeed() ? 10001 : 58, (r22 & 16) != 0 ? false : false, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : null);
            return;
        }
        if (itemId == 3) {
            com.tencent.mm.ui.MMActivity activity = mVar.f121088d;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.q8) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.q8.class)).P6(mVar.f121088d, baseFinderFeed, null, s0Var);
        } else {
            if (itemId != 4) {
                return;
            }
            ko2.e eVar = ko2.e.f309926a;
            com.tencent.mm.ui.MMActivity mMActivity = mVar.f121088d;
            java.lang.String str = mVar.f121089e;
            long id6 = baseFinderFeed.getFeedObject().getId();
            ya2.b2 contact = baseFinderFeed.getContact();
            eVar.a(mMActivity, str, id6, contact != null ? contact.D0() : "");
        }
    }
}
