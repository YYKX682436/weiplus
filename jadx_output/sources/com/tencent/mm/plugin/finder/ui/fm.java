package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class fm extends com.tencent.mm.plugin.finder.convert.bh {
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1 A1;

    /* renamed from: z1, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm f129246z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(com.tencent.mm.plugin.finder.ui.qm qmVar, com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1 shareRelPresenter$buildItemCoverts$1, cw2.f8 f8Var, boolean z17, int i17) {
        super(f8Var, qmVar, z17, i17, false, 16, null);
        this.f129246z1 = qmVar;
        this.A1 = shareRelPresenter$buildItemCoverts$1;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void D0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, long j17, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, int i17, int i18, boolean z18, long j18, int i19, int i27) {
        so2.u1 item = (so2.u1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.D0(holder, item, z17, j17, yj0Var, i17, i18, z18, j18, i19, i27);
        com.tencent.mm.ui.MMActivity activity = this.f129246z1.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        qt2.b0 b0Var = (qt2.b0) pf5.z.f353948a.a(activity).e(qt2.b0.class);
        if (b0Var != null) {
            b0Var.b7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.bh, in5.r
    /* renamed from: P1 */
    public void h(in5.s0 holder, so2.u1 item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.f129246z1;
        if (qmVar.f129747p0) {
            bd2.s.f19286a.a(holder);
        }
        com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1 shareRelPresenter$buildItemCoverts$1 = this.A1;
        shareRelPresenter$buildItemCoverts$1.addListener(holder, i17);
        r45.nv2 nv2Var = qmVar.X;
        if (nv2Var != null) {
            shareRelPresenter$buildItemCoverts$1.refreshThankForwardButton(holder, item, nv2Var);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void n0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View it, int i17) {
        so2.u1 item = (so2.u1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(it, "it");
        super.n0(holder, item, it, i17);
        com.tencent.mm.ui.MMActivity activity = this.f129246z1.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        qt2.b0 b0Var = (qt2.b0) pf5.z.f353948a.a(activity).e(qt2.b0.class);
        if (b0Var != null) {
            b0Var.b7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public boolean y(int i17) {
        boolean z17;
        r45.nv2 nv2Var = this.f129246z1.X;
        boolean z18 = false;
        java.lang.String string = nv2Var != null ? nv2Var.getString(0) : null;
        java.lang.String r17 = c01.z1.r();
        if (i17 == 0) {
            if (string != null) {
                if (string.length() > 0) {
                    z17 = true;
                    if (z17 && !string.equals(r17)) {
                        z18 = true;
                    }
                }
            }
            z17 = false;
            if (z17) {
                z18 = true;
            }
        }
        return !z18;
    }
}
