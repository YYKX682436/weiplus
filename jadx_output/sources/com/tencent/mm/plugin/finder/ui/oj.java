package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class oj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(1);
        this.f129607d = finderShareFeedRelUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List incrementList;
        so2.j5 j5Var;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129607d;
        java.lang.String stringExtra = finderShareFeedRelUI.getContext().getIntent().getStringExtra("FLOAT_BALL_KEY");
        if (!(stringExtra == null || stringExtra.length() == 0) && (incrementList = it.getIncrementList()) != null && (j5Var = (so2.j5) kz5.n0.Z(incrementList)) != null) {
            java.lang.String str = finderShareFeedRelUI.R1;
            if (!(str == null || str.length() == 0) && (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                pm0.v.X(new com.tencent.mm.plugin.finder.ui.nj(finderShareFeedRelUI, j5Var));
                com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
                if (qmVar == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                qmVar.i0((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
