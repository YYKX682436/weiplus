package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class v1 implements com.tencent.mm.plugin.mmsight.segment.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149434a;

    public v1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149434a = a2Var;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.g
    public void a(boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightVideoEditor", "Not Supported init SegmentSeekBar failed.");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.u1(this));
            return;
        }
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149434a;
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = a2Var.f149265a;
        if (recyclerThumbSeekBar != null) {
            a2Var.f149267c = recyclerThumbSeekBar.getDurationMs();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared success %d", java.lang.Integer.valueOf(a2Var.f149267c));
            try {
                if (a2Var.f149272h != null) {
                    a2Var.f149268d = java.lang.Math.round(a2Var.f149267c * a2Var.f149265a.c());
                    a2Var.f149269e = java.lang.Math.round(a2Var.f149267c * a2Var.f149265a.b());
                    if (a2Var.f149269e <= 0) {
                        int i17 = a2Var.f149267c;
                        int i18 = a2Var.f149283s.f71195h;
                        if (i17 <= (i18 * 1000) + 500) {
                            a2Var.f149269e = i17;
                        } else {
                            a2Var.f149269e = i18 * 1000;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared, start: %s, end: %s, duration: %s", java.lang.Integer.valueOf(a2Var.f149268d), java.lang.Integer.valueOf(a2Var.f149269e), java.lang.Integer.valueOf(a2Var.f149267c));
                }
                a2Var.getClass();
                com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.mmsight.ui.y1(a2Var), true);
                a2Var.f149271g = b4Var;
                b4Var.c(20L, 20L);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
