package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class r9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC f135779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC, boolean z17) {
        super(0);
        this.f135779d = finderDescPanelUIC;
        this.f135780e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = this.f135779d;
        finderDescPanelUIC.f133528t = this.f135780e;
        ((java.util.ArrayList) finderDescPanelUIC.f133529u).clear();
        ((java.util.LinkedHashMap) finderDescPanelUIC.f133530v).clear();
        finderDescPanelUIC.O6((com.tencent.mm.plugin.finder.viewmodel.component.qc) ((jz5.n) finderDescPanelUIC.f133521m).getValue());
        finderDescPanelUIC.O6((com.tencent.mm.plugin.finder.viewmodel.component.ld) ((jz5.n) finderDescPanelUIC.f133525q).getValue());
        finderDescPanelUIC.O6((com.tencent.mm.plugin.finder.viewmodel.component.yd) ((jz5.n) finderDescPanelUIC.f133522n).getValue());
        finderDescPanelUIC.O6((com.tencent.mm.plugin.finder.viewmodel.component.oe) ((jz5.n) finderDescPanelUIC.f133523o).getValue());
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127877p8).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "setupPanelList multiImageDescCommentItem added");
            finderDescPanelUIC.O6((com.tencent.mm.plugin.finder.viewmodel.component.qp) ((jz5.n) finderDescPanelUIC.f133527s).getValue());
        }
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127606af).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.DescPanelUIC", "setupPanelList emojiDescCommentItem added");
            finderDescPanelUIC.O6((com.tencent.mm.plugin.finder.viewmodel.component.e9) ((jz5.n) finderDescPanelUIC.f133526r).getValue());
        }
        if (!finderDescPanelUIC.f133528t || ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ze).getValue()).r()).booleanValue()) {
            finderDescPanelUIC.O6(finderDescPanelUIC.U6());
        }
        return jz5.f0.f302826a;
    }
}
