package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.q f151344e;

    public o5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var, fm3.q qVar) {
        this.f151343d = z5Var;
        this.f151344e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151343d;
        int paddingStart = z5Var.Q6().getPaddingStart();
        int width = z5Var.Q6().getWidth() - (paddingStart * 2);
        z5Var.f151583v = (width * 1.0f) / ((float) z5Var.f151582u);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) z5Var.f151575n).getValue();
        int i17 = -((int) (((float) z5Var.f151580s) * z5Var.f151583v));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$setVideoData$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$setVideoData$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        fm3.o oVar = this.f151344e.f264113n;
        boolean z17 = oVar instanceof fm3.p;
        if (z17) {
            fm3.p pVar = z17 ? (fm3.p) oVar : null;
            if (pVar != null) {
                i95.m c17 = i95.n0.c(bg0.v.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                kp4.a Ai = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ai(bg0.v.Z2((bg0.v) c17, pVar.f264096b, false, 2, null));
                long j17 = z5Var.f151581t;
                Ai.f311075e = j17;
                Ai.f311071a = 80;
                Ai.f311072b = 120;
                Ai.f311076f = (z5Var.f151583v * ((float) j17)) / (((z5Var.C * 1.0f) / 120) * 80);
                Ai.f();
                com.tencent.mm.plugin.mv.ui.uic.x4 P6 = z5Var.P6();
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                P6.f151527e = new kp4.b();
                com.tencent.mm.plugin.mv.ui.uic.x4 P62 = z5Var.P6();
                java.util.List c18 = kz5.b0.c(Ai);
                P62.getClass();
                java.util.ArrayList arrayList2 = P62.f151526d;
                arrayList2.clear();
                arrayList2.addAll(c18);
                P62.notifyDataSetChanged();
            }
        } else {
            boolean z18 = oVar instanceof fm3.l;
            if (z18) {
                fm3.l lVar = z18 ? (fm3.l) oVar : null;
                if (lVar != null) {
                    kotlinx.coroutines.l.d(z5Var.E, null, null, new com.tencent.mm.plugin.mv.ui.uic.u5(z5Var, lVar, null), 3, null);
                }
            }
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar S6 = z5Var.S6();
        S6.getClass();
        S6.post(new com.tencent.mm.plugin.mv.ui.view.g4(S6, width, paddingStart, width));
        z5Var.S6().f(true, paddingStart);
        z5Var.S6().f(true, paddingStart + width);
    }
}
