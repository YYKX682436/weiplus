package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class gm extends com.tencent.mm.plugin.finder.convert.df {
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm A1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(com.tencent.mm.plugin.finder.ui.qm qmVar, boolean z17, int i17) {
        super(qmVar, z17, i17, false, 8, null);
        this.A1 = qmVar;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void D0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, long j17, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, int i17, int i18, boolean z18, long j18, int i19, int i27) {
        so2.d1 item = (so2.d1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.D0(holder, item, z17, j17, yj0Var, i17, i18, z18, j18, i19, i27);
        com.tencent.mm.ui.MMActivity activity = this.A1.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        qt2.b0 b0Var = (qt2.b0) pf5.z.f353948a.a(activity).e(qt2.b0.class);
        if (b0Var != null) {
            b0Var.b7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.df, in5.r
    /* renamed from: P1 */
    public void h(in5.s0 holder, so2.d1 item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        if (this.A1.f129747p0) {
            bd2.s.f19286a.a(holder);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void n0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View it, int i17) {
        so2.d1 item = (so2.d1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(it, "it");
        super.n0(holder, item, it, i17);
        com.tencent.mm.ui.MMActivity activity = this.A1.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        qt2.b0 b0Var = (qt2.b0) pf5.z.f353948a.a(activity).e(qt2.b0.class);
        if (b0Var != null) {
            b0Var.b7();
        }
    }
}
