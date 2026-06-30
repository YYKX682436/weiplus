package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class aa implements com.tencent.mm.pluginsdk.ui.tools.w6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f200794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation f200795e;

    public aa(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation) {
        this.f200794d = jaVar;
        this.f200795e = redesignVideoPlayerSeekBarWithAnimation;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.w6
    public void a(float f17) {
        pk4.d dVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.util.HashMap hashMap4;
        com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f200794d;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = jaVar.f200886d;
        com.tencent.mm.ui.chatting.gallery.ta v17 = k1Var != null ? k1Var.v() : null;
        if (v17 == null || (dVar = (pk4.d) v17.f201438p) == null) {
            return;
        }
        float f18 = dVar.getF();
        yd5.p pVar = jaVar.f201042e;
        if (pVar == null || (hashMap4 = pVar.f461139k) == null || (arrayList = (java.util.ArrayList) hashMap4.get(java.lang.Float.valueOf(f18))) == null) {
            arrayList = new java.util.ArrayList();
        }
        yd5.p pVar2 = jaVar.f201042e;
        if (pVar2 == null || (hashMap3 = pVar2.f461140l) == null || (arrayList2 = (java.util.ArrayList) hashMap3.get(java.lang.Float.valueOf(f18))) == null) {
            arrayList2 = new java.util.ArrayList();
        }
        long currentPosition = dVar.getCurrentPosition() - jaVar.A;
        jaVar.B += currentPosition;
        arrayList.add(java.lang.Long.valueOf(currentPosition));
        yd5.p pVar3 = jaVar.f201042e;
        if (pVar3 != null && (hashMap2 = pVar3.f461139k) != null) {
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - jaVar.f201084y;
        jaVar.f201084y = currentTimeMillis;
        arrayList2.add(java.lang.Long.valueOf(j17));
        yd5.p pVar4 = jaVar.f201042e;
        if (pVar4 != null && (hashMap = pVar4.f461140l) != null) {
        }
        jaVar.A = dVar.getCurrentPosition();
        dVar.setVideoSpeedRatio(f17);
        float f19 = dVar.getF();
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation = this.f200795e;
        redesignVideoPlayerSeekBarWithAnimation.setSpeedRatio(f19);
        jaVar.f200886d.f201092g.o9(false);
        if (!jaVar.f200886d.f201092g.z8()) {
            jaVar.A(jaVar.f200886d.w(), jaVar.f200886d.f201092g.I7());
        }
        float f27 = 1.0f;
        if (f19 == 1.0f) {
            f27 = 1.5f;
        } else {
            if (f19 == 1.5f) {
                f27 = 2.0f;
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(redesignVideoPlayerSeekBarWithAnimation.getSpeedRatioTextView(), kz5.c1.k(new jz5.l("before_speed_select", java.lang.Float.valueOf(f19)), new jz5.l("speed_select", java.lang.Float.valueOf(f27))));
    }
}
