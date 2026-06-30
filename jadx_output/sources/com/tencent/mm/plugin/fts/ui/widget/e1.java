package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class e1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl f138264d;

    public e1(com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl) {
        this.f138264d = fTSVoiceInputLayoutImpl;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = this.f138264d;
        if (action != 0) {
            if (action == 1) {
                if (fTSVoiceInputLayoutImpl.f138227u) {
                    fTSVoiceInputLayoutImpl.f138227u = false;
                } else {
                    if (fTSVoiceInputLayoutImpl.f138226t) {
                        fTSVoiceInputLayoutImpl.l(true, false);
                        fTSVoiceInputLayoutImpl.f138226t = false;
                        fTSVoiceInputLayoutImpl.getClass();
                    } else {
                        fTSVoiceInputLayoutImpl.l(false, true);
                    }
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.fts.ui.widget.c1(fTSVoiceInputLayoutImpl), 100L);
                    com.tencent.mm.plugin.fts.ui.widget.y0 y0Var = (com.tencent.mm.plugin.fts.ui.widget.y0) ((com.tencent.mm.plugin.fts.ui.widget.j1) fTSVoiceInputLayoutImpl.f138231d);
                    y0Var.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.fts.ui.widget.b1 b1Var = y0Var.f138366c;
                    b1Var.f138253h = currentTimeMillis;
                    if (b1Var.f138248c && !com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f138364a)) {
                        b1Var.f138249d.setVisibility(8);
                    }
                }
            }
        } else if (com.tencent.mars.comm.NetStatusUtil.isConnected(fTSVoiceInputLayoutImpl.getContext())) {
            fTSVoiceInputLayoutImpl.f138227u = false;
            fTSVoiceInputLayoutImpl.f138226t = false;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            fTSVoiceInputLayoutImpl.getClass();
            com.tencent.mm.plugin.fts.ui.widget.y0 y0Var2 = (com.tencent.mm.plugin.fts.ui.widget.y0) ((com.tencent.mm.plugin.fts.ui.widget.j1) fTSVoiceInputLayoutImpl.f138231d);
            y0Var2.getClass();
            y0Var2.f138366c.f138252g = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.fts.ui.widget.x0 x0Var = fTSVoiceInputLayoutImpl.f138225s;
            x0Var.f138358n = 6;
            x0Var.invalidateSelf();
            fTSVoiceInputLayoutImpl.l(false, false);
            fTSVoiceInputLayoutImpl.f138224r.setVisibility(8);
        } else {
            fTSVoiceInputLayoutImpl.f138227u = true;
            ((com.tencent.mm.plugin.fts.ui.widget.y0) fTSVoiceInputLayoutImpl.f138231d).a(12, 0, 0);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
