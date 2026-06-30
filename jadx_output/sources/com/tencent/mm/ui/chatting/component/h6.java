package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = com.tencent.mm.ui.chatting.component.kg.class)
/* loaded from: classes5.dex */
public class h6 extends com.tencent.mm.ui.chatting.component.a implements com.tencent.mm.ui.chatting.component.kg {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f199146e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f199147f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.view.animation.Animation f199148g = android.view.animation.AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.anim.f477733u);

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Vibrator f199149h = (android.os.Vibrator) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");

    /* renamed from: i, reason: collision with root package name */
    public int f199150i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f199151m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f199152n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f199153o = 0;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        this.f199150i = 0;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
    }

    @Override // yn.d
    public void Z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingPatMsgUpdateComponent", "onFinish");
        ((java.util.HashSet) this.f199146e).clear();
        ((java.util.HashMap) ((lp3.r) i95.n0.c(lp3.r.class)).f320304d).clear();
        if (!((java.util.HashMap) this.f199147f).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingPatMsgUpdateComponent", "updatedPatMsg id: %s", ((java.util.HashMap) this.f199147f).keySet());
            java.util.HashMap hashMap = new java.util.HashMap(this.f199147f);
            ((java.util.HashMap) this.f199147f).clear();
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.component.g6(this, hashMap), "updatePatMsgWhenExitChatting");
        }
        this.f199151m = 0;
        this.f199152n = 0;
        this.f199153o = 0;
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f199151m = i17;
        this.f199152n = i18;
        this.f199153o = i19;
        if (this.f199150i < 3) {
            m0(i17, i18, i19);
            this.f199150i++;
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            m0(this.f199151m, this.f199152n, this.f199153o);
        }
    }

    public final void m0(int i17, int i18, int i19) {
        java.lang.String str;
        java.lang.String str2;
        this.f198580d.m();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.lang.String r17 = c01.z1.r();
            com.tencent.mm.storage.f9 f9Var = null;
            int i27 = 0;
            while (i27 < i18) {
                android.view.View f17 = this.f198580d.f(i27);
                if (f17 != null && f17.getTag() != null) {
                    if (f17.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.vc) {
                        if (f9Var == null) {
                            f9Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(this.f198580d.x());
                        }
                        android.os.SystemClock.elapsedRealtime();
                        com.tencent.mm.ui.chatting.viewitems.vc vcVar = (com.tencent.mm.ui.chatting.viewitems.vc) f17.getTag();
                        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) vcVar.f205847c.getTag();
                        android.widget.LinearLayout linearLayout = vcVar.f205846b;
                        int i28 = Integer.MAX_VALUE;
                        int i29 = Integer.MIN_VALUE;
                        for (int i37 = 0; i37 < linearLayout.getChildCount(); i37++) {
                            android.view.View childAt = linearLayout.getChildAt(i37);
                            android.graphics.Rect rect = new android.graphics.Rect();
                            childAt.getLocalVisibleRect(rect);
                            if (rect.height() > 0) {
                                if (i37 < i28) {
                                    i28 = i37;
                                }
                                if (i37 > i29) {
                                    i29 = i37;
                                }
                            }
                        }
                        android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                        erVar.c().getMsgId();
                        java.lang.Object obj = create.first;
                        com.tencent.mm.storage.f9 Li = pt0.f0.Li(erVar.c().Q0(), erVar.c().getMsgId());
                        erVar.c().getMsgId();
                        android.os.SystemClock.elapsedRealtime();
                        android.os.SystemClock.elapsedRealtime();
                        java.util.Map map = this.f199147f;
                        r45.k55 k55Var = (r45.k55) ((java.util.HashMap) map).get(java.lang.Long.valueOf(erVar.c().getMsgId()));
                        if (k55Var == null) {
                            mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
                            java.lang.String j17 = Li.j();
                            ((lp3.l) jVar).getClass();
                            k55Var = bm5.d1.e(j17);
                        }
                        if (erVar.c().getMsgId() == f9Var.getMsgId()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingPatMsgUpdateComponent", "merge last pat msg %d", java.lang.Long.valueOf(erVar.c().getMsgId()));
                            mp3.j jVar2 = (mp3.j) i95.n0.c(mp3.j.class);
                            java.lang.String j18 = f9Var.j();
                            ((lp3.l) jVar2).getClass();
                            k55Var = n0(k55Var, bm5.d1.e(j18));
                        } else if (((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).ij(erVar.c().getMsgId(), erVar.c().Q0())) {
                            erVar.c().getMsgId();
                            android.os.SystemClock.elapsedRealtime();
                        }
                        if (!android.text.TextUtils.equals(k55Var.f378385d, erVar.c().Q0())) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingPatMsgUpdateComponent", "patMsgContent's talker[%s] is not same with chatting talker[%s]", k55Var.f378385d, erVar.c().Q0());
                            k55Var.f378385d = erVar.c().Q0();
                        }
                        erVar.c().getMsgId();
                        android.os.SystemClock.elapsedRealtime();
                        android.os.SystemClock.elapsedRealtime();
                        if (((java.lang.Integer) create.first).intValue() <= ((java.lang.Integer) create.second).intValue()) {
                            int intValue = ((java.lang.Integer) create.first).intValue();
                            while (intValue <= ((java.lang.Integer) create.second).intValue()) {
                                if (intValue >= 0) {
                                    java.util.LinkedList linkedList = k55Var.f378386e;
                                    if (intValue < linkedList.size()) {
                                        if (r17.equals(((r45.l55) linkedList.get(intValue)).f379152d) || !r17.equals(((r45.l55) linkedList.get(intValue)).f379153e) || ((r45.l55) linkedList.get(intValue)).f379156h != 0 || hashMap.containsKey(java.lang.Integer.valueOf(i27))) {
                                            str2 = r17;
                                        } else {
                                            str2 = r17;
                                            hashMap.put(java.lang.Integer.valueOf(i27), -1);
                                        }
                                        ((r45.l55) linkedList.get(intValue)).f379156h = 1;
                                        ((r45.l55) linkedList.get(intValue)).f379159n = 1;
                                        intValue++;
                                        r17 = str2;
                                    }
                                }
                                str2 = r17;
                                intValue++;
                                r17 = str2;
                            }
                        }
                        str = r17;
                        erVar.c().getMsgId();
                        android.os.SystemClock.elapsedRealtime();
                        ((java.util.HashMap) map).put(java.lang.Long.valueOf(Li.getMsgId()), k55Var);
                    } else {
                        str = r17;
                        if ((f17.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.g0) && ((com.tencent.mm.ui.chatting.viewitems.g0) f17.getTag()).chattingItem.M()) {
                            hashSet.add(java.lang.Integer.valueOf(i27));
                        }
                    }
                    i27++;
                    r17 = str;
                }
                str = r17;
                i27++;
                r17 = str;
            }
            android.os.SystemClock.elapsedRealtime();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Integer) it.next()).intValue();
                java.util.Iterator it6 = hashMap.keySet().iterator();
                while (it6.hasNext()) {
                    int intValue3 = ((java.lang.Integer) it6.next()).intValue();
                    int intValue4 = ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue3))).intValue();
                    if (intValue4 == -1) {
                        hashMap.put(java.lang.Integer.valueOf(intValue3), java.lang.Integer.valueOf(intValue2));
                    } else if (java.lang.Math.abs(intValue3 - intValue2) < java.lang.Math.abs(intValue3 - intValue4)) {
                        hashMap.put(java.lang.Integer.valueOf(intValue3), java.lang.Integer.valueOf(intValue2));
                    }
                }
            }
            java.util.HashSet hashSet2 = new java.util.HashSet(hashMap.values());
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingPatMsgUpdateComponent", "%s are going to shake", hashSet2);
            java.util.Iterator it7 = hashSet2.iterator();
            while (it7.hasNext()) {
                int intValue5 = ((java.lang.Integer) it7.next()).intValue();
                if (intValue5 >= 0) {
                    com.tencent.mm.ui.chatting.viewitems.g0 g0Var = (com.tencent.mm.ui.chatting.viewitems.g0) this.f198580d.f(intValue5).getTag();
                    if (g0Var.avatarIV.getAnimation() == null || g0Var.avatarIV.getAnimation().hasEnded()) {
                        g0Var.avatarIV.startAnimation(this.f199148g);
                        if (!ip.l.d(this.f198580d.x())) {
                            this.f199149h.vibrate(10L);
                        }
                    }
                }
            }
            hashMap.clear();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingPatMsgUpdateComponent", e17, "", new java.lang.Object[0]);
        }
    }

    public final r45.k55 n0(r45.k55 k55Var, r45.k55 k55Var2) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        r45.k55 k55Var3 = new r45.k55();
        int min = java.lang.Math.min(k55Var2.f378386e.size(), k55Var.f378386e.size());
        if (android.text.TextUtils.isEmpty(k55Var2.f378385d) || android.text.TextUtils.equals(k55Var2.f378385d, k55Var.f378385d)) {
            k55Var3.f378385d = k55Var.f378385d;
        } else {
            k55Var3.f378385d = k55Var2.f378385d;
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingPatMsgUpdateComponent", "mergePatMsg err db:%s updatedPatMsg:%s", k55Var2.f378385d, k55Var.f378385d);
        }
        int i17 = 0;
        while (true) {
            linkedList = k55Var3.f378386e;
            linkedList2 = k55Var2.f378386e;
            linkedList3 = k55Var.f378386e;
            if (i17 >= min) {
                break;
            }
            linkedList.add((r45.l55) linkedList2.get(i17));
            ((r45.l55) linkedList.get(i17)).f379156h = ((r45.l55) linkedList3.get(i17)).f379156h;
            i17++;
        }
        if (linkedList2.size() >= linkedList3.size()) {
            while (min < linkedList2.size()) {
                linkedList.add((r45.l55) linkedList2.get(min));
                min++;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingPatMsgUpdateComponent", "db record list %d, updated record list %d", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(linkedList3.size()));
        }
        return k55Var3;
    }
}
