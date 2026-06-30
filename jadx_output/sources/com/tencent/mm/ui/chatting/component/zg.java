package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.d1.class)
/* loaded from: classes9.dex */
public class zg extends com.tencent.mm.ui.chatting.component.a implements yn.e, sb5.d1 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f200375e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f200376f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f200377g = false;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f200378h = new android.graphics.Rect();

    /* renamed from: i, reason: collision with root package name */
    public boolean f200379i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f200380m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f200381n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f200382o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f200383p = false;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        this.f200379i = false;
        if (c01.e2.L(this.f198580d.x())) {
            return;
        }
        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).oj(this.f198580d.x());
        n0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        if (!c01.e2.L(this.f198580d.x())) {
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).oj(this.f198580d.x());
        }
        p0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (!c01.e2.L(this.f198580d.x())) {
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).oj(this.f198580d.x());
        }
        p0();
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (c01.e2.L(this.f198580d.x())) {
            return;
        }
        if (i17 == 0) {
            n0();
        }
        this.f200377g = i17 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0048, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r18.f389501g.f390493w) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r18.f389501g.E) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m0(int r17, r45.wv3 r18, com.tencent.mm.ui.chatting.viewitems.a4 r19, int r20) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.zg.m0(int, r45.wv3, com.tencent.mm.ui.chatting.viewitems.a4, int):void");
    }

    public final void n0() {
        int o17 = this.f198580d.o();
        for (int j17 = this.f198580d.j(); j17 < o17 + 1; j17++) {
            android.view.View C = this.f198580d.p().C(j17, 0);
            if (C != null && (C.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.a4)) {
                com.tencent.mm.ui.chatting.viewitems.a4 a4Var = (com.tencent.mm.ui.chatting.viewitems.a4) C.getTag();
                if (a4Var.f203280x != null && !com.tencent.mm.sdk.platformtools.t8.K0(a4Var.f203282z) && a4Var.E) {
                    r45.wv3 wv3Var = new r45.wv3();
                    wv3Var.f389499e = a4Var.B;
                    r45.xv3 xv3Var = new r45.xv3();
                    wv3Var.f389501g = xv3Var;
                    xv3Var.f390493w = a4Var.f203282z;
                    xv3Var.A = a4Var.A;
                    m0(0, wv3Var, a4Var, 0);
                }
                if (a4Var.G != null && !com.tencent.mm.sdk.platformtools.t8.K0(a4Var.F) && a4Var.K) {
                    r45.wv3 wv3Var2 = new r45.wv3();
                    wv3Var2.f389499e = a4Var.B;
                    r45.xv3 xv3Var2 = new r45.xv3();
                    wv3Var2.f389501g = xv3Var2;
                    xv3Var2.E = a4Var.F;
                    m0(9, wv3Var2, a4Var, 0);
                }
            }
        }
    }

    public boolean o0(int i17, long j17) {
        java.util.HashSet hashSet = i17 == 9 ? this.f200376f : this.f200375e;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return hashSet.contains(java.lang.Long.valueOf(j17));
    }

    public final void p0() {
        java.util.HashSet hashSet = this.f200375e;
        if (hashSet != null) {
            hashSet.clear();
        }
        java.util.HashSet hashSet2 = this.f200376f;
        if (hashSet2 != null) {
            hashSet2.clear();
        }
        if (this.f198580d.p() == null) {
            return;
        }
        int childCount = this.f198580d.p().getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = this.f198580d.p().getChildAt(i17);
            if (childAt != null && (childAt.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.a4)) {
                com.tencent.mm.ui.chatting.viewitems.a4 a4Var = (com.tencent.mm.ui.chatting.viewitems.a4) childAt.getTag();
                if (a4Var.f203280x != null && !com.tencent.mm.sdk.platformtools.t8.K0(a4Var.f203282z) && a4Var.E) {
                    a4Var.f203279w.n();
                    android.view.View view = a4Var.f203280x;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/LuckyMoneyComponent", "releasePagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/component/LuckyMoneyComponent", "releasePagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (a4Var.D) {
                        a4Var.f203279w.setProgress(0.0d);
                        a4Var.f203281y.setVisibility(8);
                    } else {
                        a4Var.f203281y.setVisibility(0);
                    }
                }
                if (a4Var.G != null && !com.tencent.mm.sdk.platformtools.t8.K0(a4Var.F) && a4Var.K) {
                    a4Var.I.n();
                    a4Var.G.setVisibility(8);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f200379i = true;
        this.f200380m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_lucky_money_dynamic_bubble_close_switch, false);
        this.f200381n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_dynamic_atmosphere_bubble_close_switch, false);
        this.f200382o = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_dynamic_atmosphere_bubble_clip_close_switch, false);
        this.f200383p = ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).Ri();
    }
}
