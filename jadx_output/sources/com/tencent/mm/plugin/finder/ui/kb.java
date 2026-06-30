package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class kb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI f129427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f129428e;

    public kb(com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI, long j17) {
        this.f129427d = finderMsgFeedDetailUI;
        this.f129428e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI activity = this.f129427d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = activity.E;
        if (baseFinderFeed != null) {
            long j17 = this.f129428e;
            kotlin.jvm.internal.o.g(activity, "activity");
            java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                ec2.a aVar = new ec2.a(6, baseFinderFeed.getItemId(), baseFinderFeed.w());
                aVar.f250950h = new ec2.c(0, false, false, 0, 0L, 0, 52, null);
                e27.a(aVar);
            }
            if (activity.f128640z || hc2.b0.i(baseFinderFeed) || !hc2.s.f(baseFinderFeed.getContact())) {
                z17 = false;
            } else {
                com.tencent.mm.plugin.finder.storage.t70.f127590a.b3(2);
                z17 = true;
            }
            int i17 = activity.D ? 10002 : 0;
            com.tencent.mm.plugin.finder.feed.c9 c9Var = activity.f128637w;
            if (c9Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.plugin.finder.view.f5 g17 = c9Var.g();
            if (g17 != null) {
                com.tencent.mm.plugin.finder.feed.c9 c9Var2 = activity.f128637w;
                if (c9Var2 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                androidx.recyclerview.widget.k3 q07 = c9Var2.getRecyclerView().q0(0, false);
                in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                if (s0Var != null) {
                    androidx.appcompat.app.AppCompatActivity context = activity.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    ((com.tencent.mm.plugin.finder.viewmodel.component.a4) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class)).P6(null, baseFinderFeed, s0Var, g17);
                }
                com.tencent.mm.plugin.finder.view.f5.c(g17, baseFinderFeed.getFeedObject(), false, j17, true, false, null, z17, i17, null, false, 0L, 0, ((java.lang.Number) ((jz5.n) activity.G).getValue()).intValue(), null, 0, 28466, null);
            }
        }
    }
}
