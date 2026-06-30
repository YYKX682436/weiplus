package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class GameIconViewTipPreference extends com.tencent.mm.ui.FinderIconViewTipPreference {
    public GameIconViewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = false;
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference
    public int M() {
        return ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().a() ? com.tencent.mm.R.layout.bzh : com.tencent.mm.R.layout.bzi;
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
        if (((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().a()) {
            super.e5(rVar, z17);
        }
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.Z1;
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        if (((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().a()) {
            return super.o0(z17);
        }
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
    }

    public GameIconViewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.V1 = false;
    }

    public GameIconViewTipPreference(android.content.Context context) {
        super(context, null);
        this.V1 = false;
    }
}
