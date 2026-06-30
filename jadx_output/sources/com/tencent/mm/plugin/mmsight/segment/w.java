package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class w implements com.tencent.mm.plugin.mmsight.segment.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149095a;

    public w(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar) {
        this.f149095a = recyclerThumbSeekBar;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void a(boolean z17) {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149095a;
        com.tencent.mm.plugin.mmsight.segment.h hVar = recyclerThumbSeekBar.f148878m;
        if (hVar != null && recyclerThumbSeekBar.f148880o != null) {
            hVar.d(z17, recyclerThumbSeekBar.c(), recyclerThumbSeekBar.b());
        }
        if (z17) {
            recyclerThumbSeekBar.f148880o.x(true, recyclerThumbSeekBar.f148881p.getLeftSliderBound());
        } else {
            recyclerThumbSeekBar.f148880o.x(false, recyclerThumbSeekBar.f148881p.getWidth() - recyclerThumbSeekBar.f148881p.getRightSliderBound());
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void b(boolean z17) {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149095a;
        com.tencent.mm.plugin.mmsight.segment.h hVar = recyclerThumbSeekBar.f148878m;
        if (hVar == null || recyclerThumbSeekBar.f148880o == null) {
            return;
        }
        hVar.j(z17, recyclerThumbSeekBar.c(), recyclerThumbSeekBar.b());
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void c(boolean z17) {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149095a;
        com.tencent.mm.plugin.mmsight.segment.h hVar = recyclerThumbSeekBar.f148878m;
        if (hVar == null || recyclerThumbSeekBar.f148880o == null) {
            return;
        }
        hVar.p(z17, recyclerThumbSeekBar.c(), recyclerThumbSeekBar.b());
    }
}
