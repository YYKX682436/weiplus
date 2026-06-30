package rg5;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.ArrayList f395285i = kz5.c0.d("find_friends_by_ting", "find_friends_by_ting_play_state");

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.FindMoreFriendsUI f395286a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f395287b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f395288c;

    /* renamed from: d, reason: collision with root package name */
    public final rg5.u f395289d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.FinderIconViewTipPreference f395290e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.k0 f395291f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.lp0 f395292g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f395293h;

    public x(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, boolean z17) {
        kotlin.jvm.internal.o.g(findMoreFriendsUI, "findMoreFriendsUI");
        this.f395286a = findMoreFriendsUI;
        this.f395287b = z17;
        jz5.g b17 = jz5.h.b(rg5.w.f395284d);
        this.f395288c = b17;
        rg5.u uVar = new rg5.u(this);
        this.f395289d = uVar;
        this.f395293h = jz5.h.b(new rg5.t(this));
        if (z17) {
            ef0.k2 k2Var = (ef0.k2) ((qk.n8) i95.n0.c(qk.n8.class));
            k2Var.getClass();
            k2Var.f252255g.add(uVar);
            this.f395292g = ((ef0.k2) ((qk.n8) i95.n0.c(qk.n8.class))).f252252d;
            if (((ef0.k2) ((qk.n8) ((jz5.n) b17).getValue())).Di()) {
                e(qk.m8.f364252f, qk.ia.f364171g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.plugin.finder.extension.reddot.a r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rg5.x.a(com.tencent.mm.plugin.finder.extension.reddot.a, boolean):void");
    }

    public final void b() {
        if (this.f395291f != null) {
            a(new com.tencent.mm.plugin.finder.extension.reddot.a(false, null, null, ""), true);
            return;
        }
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f395286a;
        com.tencent.mm.ui.base.preference.Preference h17 = findMoreFriendsUI.f196656w.h((java.lang.String) ((jz5.n) this.f395293h).getValue());
        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = h17 instanceof com.tencent.mm.ui.FinderIconViewTipPreference ? (com.tencent.mm.ui.FinderIconViewTipPreference) h17 : null;
        this.f395290e = finderIconViewTipPreference;
        if (finderIconViewTipPreference == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingEntryPreferenceMgr", "observeTingEntranceRedDot tingPreference null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeTingEntranceRedDot preference: ");
        sb6.append(this.f395290e);
        sb6.append(", ");
        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference2 = this.f395290e;
        sb6.append(finderIconViewTipPreference2 != null ? java.lang.Integer.valueOf(finderIconViewTipPreference2.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryPreferenceMgr", sb6.toString());
        rg5.v vVar = new rg5.v(this);
        this.f395291f = vVar;
        ef0.z3 z3Var = (ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class));
        z3Var.getClass();
        androidx.lifecycle.j0 j0Var = z3Var.f252380e;
        j0Var.observe(findMoreFriendsUI, vVar);
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) j0Var.getValue();
        if (aVar != null) {
            vVar.onChanged(aVar);
        }
    }

    public final void c(java.lang.String str, boolean z17) {
        for (java.lang.String str2 : f395285i) {
            boolean b17 = kotlin.jvm.internal.o.b(str, str2);
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f395286a;
            if (b17) {
                findMoreFriendsUI.f196656w.m(str2, true ^ z17);
            } else {
                findMoreFriendsUI.f196656w.m(str2, true);
            }
        }
    }

    public final void d(boolean z17, qk.ia iaVar) {
        if (this.f395287b) {
            com.tencent.mm.ui.base.preference.Preference h17 = this.f395286a.f196656w.h((java.lang.String) ((jz5.n) this.f395293h).getValue());
            this.f395290e = h17 instanceof com.tencent.mm.ui.FinderIconViewTipPreference ? (com.tencent.mm.ui.FinderIconViewTipPreference) h17 : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryPreferenceMgr", "showTingPlayStateView show: " + z17 + ", curObservePreference: " + this.f395290e);
            com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = this.f395290e;
            boolean z18 = finderIconViewTipPreference instanceof com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipWithPlayStatePreference;
            if (z18) {
                com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipWithPlayStatePreference tingIconViewTipWithPlayStatePreference = z18 ? (com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipWithPlayStatePreference) finderIconViewTipPreference : null;
                if (tingIconViewTipWithPlayStatePreference != null) {
                    bw5.lp0 lp0Var = z17 ? this.f395292g : null;
                    if (iaVar == null) {
                        iaVar = qk.ia.f364170f;
                    }
                    tingIconViewTipWithPlayStatePreference.h1(lp0Var, z17, iaVar);
                }
            }
        }
    }

    public final void e(qk.m8 m8Var, qk.ia iaVar) {
        java.util.Objects.toString(m8Var);
        java.util.Objects.toString(iaVar);
        if (m8Var == qk.m8.f364250d) {
            d(false, iaVar);
            b();
            return;
        }
        if (m8Var == qk.m8.f364251e || m8Var == qk.m8.f364252f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryPreferenceMgr", "hideAllTingEntryRedDot");
            com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = this.f395290e;
            if (finderIconViewTipPreference != null) {
                finderIconViewTipPreference.Z3(false, new r45.pm6());
            }
            com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference2 = this.f395290e;
            if (finderIconViewTipPreference2 != null) {
                finderIconViewTipPreference2.y(false);
            }
            ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).Ni("Listen.Entrance", false);
            ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).Ni("Listen.MentionEntrance", false);
            d(true, iaVar);
        }
    }
}
