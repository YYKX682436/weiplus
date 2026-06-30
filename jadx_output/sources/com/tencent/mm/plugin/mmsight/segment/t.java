package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149086d;

    public t(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar) {
        this.f149086d = recyclerThumbSeekBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149086d;
        try {
            recyclerThumbSeekBar.f148881p.setCursorPos(-1.0f);
            recyclerThumbSeekBar.f148880o = new com.tencent.mm.plugin.mmsight.segment.z(recyclerThumbSeekBar, null);
            int i17 = 1000;
            int a17 = com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.a(recyclerThumbSeekBar, (recyclerThumbSeekBar.f148883r.f71195h * 1000) + 1000);
            int max = java.lang.Math.max(recyclerThumbSeekBar.f148883r.f71196i * 1000, 2500);
            if (max > 1000) {
                i17 = max;
            }
            int a18 = com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.a(recyclerThumbSeekBar, i17);
            int width = (recyclerThumbSeekBar.getWidth() - a17) / 2;
            recyclerThumbSeekBar.f148882q = width;
            com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = recyclerThumbSeekBar.f148881p;
            sliderSeekBar.getClass();
            sliderSeekBar.post(new com.tencent.mm.plugin.mmsight.segment.i1(sliderSeekBar, a17, width, a18));
            com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "RecyclerThumbSeekBar.run(212) width %d", java.lang.Integer.valueOf(recyclerThumbSeekBar.getWidth()));
            com.tencent.mm.plugin.mmsight.segment.z zVar = recyclerThumbSeekBar.f148880o;
            int width2 = recyclerThumbSeekBar.getWidth();
            int i18 = recyclerThumbSeekBar.f148882q;
            zVar.f149113f = (width2 - i18) - a17;
            com.tencent.mm.plugin.mmsight.segment.z zVar2 = recyclerThumbSeekBar.f148880o;
            zVar2.f149112e = i18;
            recyclerThumbSeekBar.f148879n.setAdapter(zVar2);
            recyclerThumbSeekBar.f148880o.getItemCount();
            com.tencent.mm.plugin.mmsight.segment.g gVar = recyclerThumbSeekBar.f148877i;
            if (gVar != null) {
                gVar.a(false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("RecyclerThumbSeekBar", e17, "RecyclerThumbSeekBar notifySuccess error : %s", e17.getMessage());
            com.tencent.mm.plugin.mmsight.segment.g gVar2 = recyclerThumbSeekBar.f148877i;
            if (gVar2 != null) {
                gVar2.a(true);
            }
        }
    }
}
