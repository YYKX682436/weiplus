package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class k0 implements com.tencent.mm.plugin.mmsight.segment.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149050a;

    public k0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend) {
        this.f149050a = recyclerThumbSeekBarExtend;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void a(boolean z17) {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149050a;
        com.tencent.mm.plugin.mmsight.segment.h hVar = recyclerThumbSeekBarExtend.f148893i;
        if (hVar != null && recyclerThumbSeekBarExtend.f148894m != null) {
            kotlin.jvm.internal.o.d(hVar);
            hVar.d(z17, recyclerThumbSeekBarExtend.c(), recyclerThumbSeekBarExtend.b());
        }
        if (z17) {
            com.tencent.mm.plugin.mmsight.segment.f0 f0Var = recyclerThumbSeekBarExtend.f148894m;
            kotlin.jvm.internal.o.d(f0Var);
            com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar = recyclerThumbSeekBarExtend.f148898q;
            if (finderSliderSeekBar != null) {
                f0Var.x(true, finderSliderSeekBar.getLeftSliderBound());
                return;
            } else {
                kotlin.jvm.internal.o.o("innerSeekBar");
                throw null;
            }
        }
        com.tencent.mm.plugin.mmsight.segment.f0 f0Var2 = recyclerThumbSeekBarExtend.f148894m;
        kotlin.jvm.internal.o.d(f0Var2);
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar2 = recyclerThumbSeekBarExtend.f148898q;
        if (finderSliderSeekBar2 == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        int width = finderSliderSeekBar2.getWidth();
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar3 = recyclerThumbSeekBarExtend.f148898q;
        if (finderSliderSeekBar3 != null) {
            f0Var2.x(false, width - finderSliderSeekBar3.getRightSliderBound());
        } else {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void b(boolean z17) {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149050a;
        com.tencent.mm.plugin.mmsight.segment.h hVar = recyclerThumbSeekBarExtend.f148893i;
        if (hVar == null || recyclerThumbSeekBarExtend.f148894m == null) {
            return;
        }
        kotlin.jvm.internal.o.d(hVar);
        hVar.j(z17, recyclerThumbSeekBarExtend.c(), recyclerThumbSeekBarExtend.b());
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void c(boolean z17) {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149050a;
        com.tencent.mm.plugin.mmsight.segment.h hVar = recyclerThumbSeekBarExtend.f148893i;
        if (hVar == null || recyclerThumbSeekBarExtend.f148894m == null) {
            return;
        }
        kotlin.jvm.internal.o.d(hVar);
        hVar.p(z17, recyclerThumbSeekBarExtend.c(), recyclerThumbSeekBarExtend.b());
    }
}
