package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class j2 extends com.tencent.mm.plugin.finder.live.view.k2 {

    /* renamed from: h, reason: collision with root package name */
    public final lj2.r0 f116400h;

    /* renamed from: i, reason: collision with root package name */
    public final nj2.p f116401i;

    /* renamed from: m, reason: collision with root package name */
    public final mj2.j f116402m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f116403n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f116404o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j2(gk2.e r12, android.view.View r13, zh2.e r14, zh2.c r15) {
        /*
            r11 = this;
            java.lang.String r0 = "liveData"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "root"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "userInterface"
            kotlin.jvm.internal.o.g(r14, r0)
            java.lang.String r0 = "micLinkPluginAbility"
            kotlin.jvm.internal.o.g(r15, r0)
            android.content.Context r0 = r13.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r11.<init>(r12, r0)
            com.tencent.mm.plugin.finder.live.view.i2 r0 = new com.tencent.mm.plugin.finder.live.view.i2
            r0.<init>(r11, r12, r15)
            jz5.g r0 = jz5.h.b(r0)
            r11.f116404o = r0
            android.content.Context r0 = r11.getContext()
            r2 = 2131495283(0x7f0c0973, float:1.8614098E38)
            android.view.View r0 = android.view.View.inflate(r0, r2, r11)
            lj2.r0 r2 = new lj2.r0
            android.content.Context r3 = r13.getContext()
            kotlin.jvm.internal.o.f(r3, r1)
            kotlin.jvm.internal.o.d(r0)
            r2.<init>(r3, r12, r0, r15)
            r11.f116400h = r2
            r2 = 2131310814(0x7f0938de, float:1.823995E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r10 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r2, r10)
            r11.f116403n = r2
            mj2.j r2 = new mj2.j
            android.content.Context r4 = r13.getContext()
            kotlin.jvm.internal.o.f(r4, r1)
            com.tencent.mm.plugin.finder.live.view.f2 r9 = new com.tencent.mm.plugin.finder.live.view.f2
            r9.<init>(r11)
            r3 = r2
            r5 = r12
            r6 = r0
            r7 = r15
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.f116402m = r2
            nj2.p r15 = new nj2.p
            r1 = 2131315759(0x7f094c2f, float:1.824998E38)
            android.view.View r0 = r0.findViewById(r1)
            kotlin.jvm.internal.o.f(r0, r10)
            r15.<init>(r13, r0, r12, r14)
            r11.f116401i = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.j2.<init>(gk2.e, android.view.View, zh2.e, zh2.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kj2.o getInviteWidget() {
        return (kj2.o) ((jz5.n) this.f116404o).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void a(int i17) {
        boolean z17 = this.f116433f == i17;
        this.f116432e = z17;
        if (z17) {
            q();
        } else {
            p();
        }
        if (i17 == 0) {
            fj2.s.c(fj2.s.f263183a, ml2.q2.f327835v, "1", null, 0, 0, 28, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void e() {
        in0.q e17;
        zn0.a0 U;
        this.f116434g = true;
        if (this.f116432e) {
            q();
        }
        lj2.r0 r0Var = this.f116400h;
        zh2.c cVar = r0Var.f318928g;
        boolean z17 = ((mm2.c1) cVar.g().a(mm2.c1.class)).S4;
        android.view.View view = r0Var.f318930i;
        if (z17) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveSetMicModeWidget", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveSetMicModeWidget", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((lj2.n) ((jz5.n) r0Var.f318935q).getValue()).b();
            int i17 = (((qf2.l) cVar.getController(qf2.l.class)) == null || (e17 = dk2.ef.f233372a.e()) == null || (U = e17.U()) == null) ? 1 : U.f474317u;
            r0Var.f318929h = i17;
            r0Var.b(i17);
            com.tencent.mars.xlog.Log.i("FinderLiveSetMicModeWidget", "onBind: " + z17 + ", curMicModeType: " + r0Var.f318929h);
        } else {
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveSetMicModeWidget", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveSetMicModeWidget", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.e("FinderLiveSetMicModeWidget", "onBind: " + z17);
        }
        this.f116401i.n();
        this.f116402m.r("onBind");
        android.view.View view2 = this.f116403n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("inviteListLayout");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (o()) {
            getInviteWidget().f();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void f() {
        this.f116434g = false;
        if (this.f116432e) {
            p();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void g(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveApplyLinkVisitorView", "keyboardChange show:" + z17 + " height:" + i17);
        this.f116401i.o(z17, i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void h(long j17) {
        this.f116401i.p(j17);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void i(gk2.e eVar) {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void j() {
        this.f116401i.q();
        this.f116402m.r("onNotifyDataChanged");
        if (o()) {
            getInviteWidget().c();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void k(boolean z17, km2.q qVar) {
        this.f116401i.r(z17, qVar);
        this.f116402m.o(z17, qVar);
        if (o()) {
            getInviteWidget().c();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void l(gk2.e eVar) {
        nj2.p pVar = this.f116401i;
        pVar.getClass();
        pm0.v.X(new nj2.l(pVar));
        this.f116402m.r("onTimerUpdateData");
        if (o()) {
            getInviteWidget().c();
        }
    }

    public final boolean o() {
        return (((mm2.e1) getLiveData().a(mm2.e1.class)).c7() || ((mm2.c1) getLiveData().a(mm2.c1.class)).L) && this.f116434g;
    }

    public final void p() {
        if (this.f116400h.f318936r) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.g3[] g3VarArr = ml2.g3.f327478d;
            jSONObject.put("type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.O2, jSONObject.toString(), null, 4, null);
        }
    }

    public final void q() {
        lj2.r0 r0Var = this.f116400h;
        if (((mm2.c1) r0Var.f318928g.g().a(mm2.c1.class)).S4) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.u3[] u3VarArr = ml2.u3.f328110d;
            jSONObject.put("type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.N2, jSONObject.toString(), null, 4, null);
        }
        r0Var.f318936r = false;
    }
}
