package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.s f121338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121340f;

    public o(com.tencent.mm.plugin.finder.member.question.s sVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f121338d = sVar;
        this.f121339e = baseFinderFeed;
        this.f121340f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        boolean z17 = true;
        in5.s0 s0Var = this.f121340f;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f121339e;
        com.tencent.mm.plugin.finder.member.question.s sVar = this.f121338d;
        switch (itemId) {
            case 1:
                com.tencent.mm.ui.MMActivity mMActivity = sVar.f121344d;
                java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.mqn);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = sVar.f121344d.getString(com.tencent.mm.R.string.f490367t0);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                com.tencent.mm.plugin.finder.member.question.l lVar = new com.tencent.mm.plugin.finder.member.question.l(sVar, s0Var, baseFinderFeed);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity, 1, true);
                k0Var.r(string, 17, i65.a.b(mMActivity, 14), null);
                k0Var.f211872n = new ko2.a(1, mMActivity, string2);
                k0Var.f211881s = new ko2.b(1, lVar);
                k0Var.v();
                return;
            case 2:
                bd2.b bVar = bd2.b.f19244a;
                com.tencent.mm.ui.MMActivity mMActivity2 = sVar.f121344d;
                long id6 = baseFinderFeed.getFeedObject().getId();
                int i18 = sVar.f121346f.f107514f;
                if (i18 != 5 && i18 != 6 && i18 != 7) {
                    z17 = false;
                }
                bVar.d(mMActivity2, id6, (r22 & 4) != 0 ? 0L : 0L, z17 ? 10001 : 91, (r22 & 16) != 0 ? false : false, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : null);
                return;
            case 3:
                com.tencent.mm.ui.MMActivity activity = sVar.f121344d;
                kotlin.jvm.internal.o.g(activity, "activity");
                ((com.tencent.mm.plugin.finder.viewmodel.component.q8) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.q8.class)).P6(sVar.f121344d, baseFinderFeed, null, s0Var);
                return;
            case 4:
                ho2.h hVar = new ho2.h(5, xy2.c.e(sVar.f121344d), sVar.f121345e, baseFinderFeed.getFeedObject(), "FinderLocal_" + java.lang.System.nanoTime());
                com.tencent.mm.ui.MMActivity mMActivity3 = sVar.f121344d;
                hVar.t(mMActivity3, mMActivity3.getResources().getString(com.tencent.mm.R.string.f9y), 0L);
                pm0.v.T(hVar.l(), new com.tencent.mm.plugin.finder.member.question.n(sVar, baseFinderFeed));
                return;
            case 5:
                ho2.h hVar2 = new ho2.h(105, xy2.c.e(sVar.f121344d), sVar.f121345e, baseFinderFeed.getFeedObject(), "FinderLocal_" + java.lang.System.nanoTime());
                com.tencent.mm.ui.MMActivity mMActivity4 = sVar.f121344d;
                hVar2.t(mMActivity4, mMActivity4.getResources().getString(com.tencent.mm.R.string.f9y), 0L);
                pm0.v.T(hVar2.l(), new com.tencent.mm.plugin.finder.member.question.m(sVar, baseFinderFeed));
                return;
            case 6:
                ko2.e eVar = ko2.e.f309926a;
                com.tencent.mm.ui.MMActivity mMActivity5 = sVar.f121344d;
                java.lang.String str = sVar.f121345e;
                long id7 = baseFinderFeed.getFeedObject().getId();
                ya2.b2 contact = baseFinderFeed.getContact();
                eVar.a(mMActivity5, str, id7, contact != null ? contact.D0() : "");
                return;
            default:
                return;
        }
    }
}
