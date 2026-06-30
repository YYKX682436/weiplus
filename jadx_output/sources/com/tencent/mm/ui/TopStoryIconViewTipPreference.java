package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class TopStoryIconViewTipPreference extends com.tencent.mm.ui.FinderIconViewTipPreference {
    public TopStoryIconViewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.Z1;
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
    }

    public TopStoryIconViewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public TopStoryIconViewTipPreference(android.content.Context context) {
        super(context, null);
    }
}
