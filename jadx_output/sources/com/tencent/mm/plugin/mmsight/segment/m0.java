package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149058d;

    public m0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend) {
        this.f149058d = recyclerThumbSeekBarExtend;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a17;
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149058d;
        try {
            com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar = recyclerThumbSeekBarExtend.f148898q;
            if (finderSliderSeekBar == null) {
                kotlin.jvm.internal.o.o("innerSeekBar");
                throw null;
            }
            finderSliderSeekBar.setCursorPos(-1.0f);
            java.util.ArrayList a18 = com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend.a(recyclerThumbSeekBarExtend, recyclerThumbSeekBarExtend.f148889e, recyclerThumbSeekBarExtend.f148901t);
            recyclerThumbSeekBarExtend.f148896o = a18;
            recyclerThumbSeekBarExtend.f148894m = new com.tencent.mm.plugin.mmsight.segment.f0(recyclerThumbSeekBarExtend, a18);
            if (recyclerThumbSeekBarExtend.f148889e >= recyclerThumbSeekBarExtend.f148899r) {
                a17 = recyclerThumbSeekBarExtend.getWidth() - (recyclerThumbSeekBarExtend.f148895n * 2);
            } else {
                double d17 = 0.0d;
                while (recyclerThumbSeekBarExtend.f148896o.iterator().hasNext()) {
                    d17 += ((com.tencent.mm.plugin.mmsight.segment.e0) r3.next()).f149009b / recyclerThumbSeekBarExtend.f148901t;
                }
                a17 = a06.d.a(d17 * recyclerThumbSeekBarExtend.f148891g);
            }
            float width = ((((float) recyclerThumbSeekBarExtend.f148900s) * 1.0f) / ((float) recyclerThumbSeekBarExtend.f148899r)) * (recyclerThumbSeekBarExtend.getWidth() - (recyclerThumbSeekBarExtend.f148895n * 2));
            com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar2 = recyclerThumbSeekBarExtend.f148898q;
            if (finderSliderSeekBar2 == null) {
                kotlin.jvm.internal.o.o("innerSeekBar");
                throw null;
            }
            int b17 = a06.d.b(width);
            int i17 = recyclerThumbSeekBarExtend.f148895n;
            com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar3 = recyclerThumbSeekBarExtend.f148898q;
            if (finderSliderSeekBar3 == null) {
                kotlin.jvm.internal.o.o("innerSeekBar");
                throw null;
            }
            finderSliderSeekBar2.post(new com.tencent.mm.plugin.mmsight.segment.i1(finderSliderSeekBar2, a17, i17 - finderSliderSeekBar3.f148948p, b17));
            com.tencent.mm.plugin.mmsight.segment.f0 f0Var = recyclerThumbSeekBarExtend.f148894m;
            kotlin.jvm.internal.o.d(f0Var);
            f0Var.f149015g = (recyclerThumbSeekBarExtend.getWidth() - recyclerThumbSeekBarExtend.f148895n) - a17;
            com.tencent.mm.plugin.mmsight.segment.f0 f0Var2 = recyclerThumbSeekBarExtend.f148894m;
            kotlin.jvm.internal.o.d(f0Var2);
            f0Var2.f149014f = recyclerThumbSeekBarExtend.f148895n;
            androidx.recyclerview.widget.RecyclerView recyclerView = recyclerThumbSeekBarExtend.f148897p;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView.setAdapter(recyclerThumbSeekBarExtend.f148894m);
            com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "notifySuccess durationMs:" + recyclerThumbSeekBarExtend.f148889e + ", intervalMs:" + recyclerThumbSeekBarExtend.f148901t + " itemCount:" + recyclerThumbSeekBarExtend.f148896o.size() + " horizontalPadding:" + recyclerThumbSeekBarExtend.f148895n + " seekBarDurationMs:[" + recyclerThumbSeekBarExtend.f148900s + ", " + recyclerThumbSeekBarExtend.f148899r + "] seekBarDurationPx:[" + width + ", " + a17 + "] thumbView:[" + recyclerThumbSeekBarExtend.f148891g + ", " + recyclerThumbSeekBarExtend.f148890f + "] logicMax:" + (recyclerThumbSeekBarExtend.getWidth() - (recyclerThumbSeekBarExtend.f148895n * 2)) + " view:[" + recyclerThumbSeekBarExtend.getWidth() + ", " + recyclerThumbSeekBarExtend.getHeight() + ']');
            com.tencent.mm.plugin.mmsight.segment.g gVar = recyclerThumbSeekBarExtend.f148892h;
            if (gVar != null) {
                gVar.a(false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar notifySuccess error : %s", e17.getMessage());
            com.tencent.mm.plugin.mmsight.segment.g gVar2 = recyclerThumbSeekBarExtend.f148892h;
            if (gVar2 != null) {
                gVar2.a(true);
            }
        }
    }
}
