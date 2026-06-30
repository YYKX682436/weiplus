package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149035d;

    public i0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend) {
        this.f149035d = recyclerThumbSeekBarExtend;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149035d;
        try {
            com.tencent.mm.plugin.mmsight.segment.j a17 = recyclerThumbSeekBarExtend.f148902u.a();
            recyclerThumbSeekBarExtend.f148889e = a17.getDurationMs();
            recyclerThumbSeekBarExtend.f148902u.c(a17);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("RecyclerThumbSeekBar", e17, "Try to init fetcher error : %s", e17.getMessage());
            z17 = false;
        }
        if (!z17) {
            int i17 = com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend.B;
            recyclerThumbSeekBarExtend.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.l0(recyclerThumbSeekBarExtend));
        } else {
            int i18 = recyclerThumbSeekBarExtend.f148889e;
            if (i18 > 0) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.m0(recyclerThumbSeekBarExtend));
            } else {
                com.tencent.mars.xlog.Log.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", java.lang.Integer.valueOf(i18));
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.l0(recyclerThumbSeekBarExtend));
            }
        }
    }
}
