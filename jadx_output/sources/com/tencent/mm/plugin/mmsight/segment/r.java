package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.s f149083d;

    public r(com.tencent.mm.plugin.mmsight.segment.s sVar) {
        this.f149083d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.mmsight.segment.s sVar = this.f149083d;
        try {
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = sVar.f149085d;
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar2 = sVar.f149085d;
            com.tencent.mm.plugin.mmsight.segment.j a17 = recyclerThumbSeekBar.f148884s.a();
            recyclerThumbSeekBar2.f148874f = a17.getDurationMs();
            recyclerThumbSeekBar2.f148884s.c(a17);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("RecyclerThumbSeekBar", e17, "Try to init fetcher error : %s", e17.getMessage());
            z17 = false;
        }
        if (!z17) {
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar3 = sVar.f149085d;
            int i17 = com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.f148871w;
            recyclerThumbSeekBar3.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.u(recyclerThumbSeekBar3));
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar4 = sVar.f149085d;
        int i18 = recyclerThumbSeekBar4.f148874f;
        if (i18 >= 10000) {
            recyclerThumbSeekBar4.f148873e = (recyclerThumbSeekBar4.f148883r.f71195h * 1000) / 10;
        } else {
            if (i18 <= 0) {
                com.tencent.mars.xlog.Log.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", java.lang.Integer.valueOf(i18));
                com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar5 = sVar.f149085d;
                recyclerThumbSeekBar5.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.u(recyclerThumbSeekBar5));
                return;
            }
            recyclerThumbSeekBar4.f148873e = i18 / 10;
        }
        int i19 = recyclerThumbSeekBar4.f148873e;
        recyclerThumbSeekBar4.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.t(recyclerThumbSeekBar4));
    }
}
