package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class qy implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ty f135744a;

    public qy(com.tencent.mm.plugin.finder.viewmodel.component.ty tyVar) {
        this.f135744a = tyVar;
    }

    @Override // qj5.q
    public p15.n b(boolean z17) {
        com.tencent.mm.plugin.finder.viewmodel.component.ty tyVar = this.f135744a;
        androidx.appcompat.app.AppCompatActivity activity = tyVar.getActivity();
        androidx.appcompat.app.AppCompatActivity activity2 = tyVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) pf5.z.f353948a.a(activity2).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
        boolean z18 = false;
        boolean z19 = finderProfileDrawerUIC != null && finderProfileDrawerUIC.f133626n;
        androidx.appcompat.app.AppCompatActivity activity3 = tyVar.getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.s4 s4Var = (com.tencent.mm.plugin.finder.viewmodel.component.s4) pf5.z.f353948a.a(activity3).e(com.tencent.mm.plugin.finder.viewmodel.component.s4.class);
        if (s4Var != null && s4Var.P6()) {
            z18 = true;
        }
        if (z18) {
            return com.tencent.mm.plugin.finder.viewmodel.component.ty.O6(tyVar, 2);
        }
        if (((activity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) && !((com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) activity).isFragmentMode()) || z19) {
            return com.tencent.mm.plugin.finder.viewmodel.component.ty.O6(tyVar, 1);
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = tyVar.f136068e;
        if (baseFinderFeed != null) {
            if (!hc2.o0.d(baseFinderFeed.getFeedObject().getFeedObject()) || baseFinderFeed.getFeedObject().getFeedObject().getPrivateFlag() == 1 || baseFinderFeed.getFeedObject().isOnlySelfSee() || baseFinderFeed.getFeedObject().isNotShare()) {
                return new p15.n();
            }
            long id6 = baseFinderFeed.getFeedObject().getId();
            if (id6 != 0) {
                android.net.Uri.Builder buildUpon = android.net.Uri.parse("https://weixin.qq.com/finderFeed").buildUpon();
                kotlin.jvm.internal.o.f(buildUpon, "buildUpon(...)");
                java.lang.String format = java.lang.String.format("0x%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                android.net.Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("version", format).appendQueryParameter("feedid", pm0.v.u(id6)).appendQueryParameter("nonceid", baseFinderFeed.getFeedObject().getObjectNonceId());
                ya2.b2 contact = baseFinderFeed.getContact();
                appendQueryParameter.appendQueryParameter("nickname", contact != null ? contact.w0() : null).appendQueryParameter("snapshottype", java.lang.String.valueOf(tyVar.Q6()));
                p15.n nVar = new p15.n();
                p15.m mVar = new p15.m();
                mVar.n(buildUpon.toString());
                mVar.l(12);
                nVar.n(mVar);
                return nVar;
            }
        }
        return new p15.n();
    }
}
