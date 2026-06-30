package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class cj extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f128996g;

    public cj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f128996g = finderShareFeedRelUI;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof ec2.f;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f128996g;
        if (z17) {
            if (finderShareFeedRelUI.M1.length() > 0) {
                pm0.v.X(new com.tencent.mm.plugin.finder.ui.zi(ev6, finderShareFeedRelUI));
            }
        } else if (ev6 instanceof fc2.t) {
            pm0.v.X(new com.tencent.mm.plugin.finder.ui.aj(ev6, finderShareFeedRelUI));
        } else if (ev6 instanceof ec2.a) {
            pm0.v.X(new com.tencent.mm.plugin.finder.ui.bj(ev6, finderShareFeedRelUI));
        }
    }
}
