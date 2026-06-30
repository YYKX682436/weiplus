package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w9 implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f114888d;

    /* renamed from: e, reason: collision with root package name */
    public final cm2.t f114889e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f114890f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f114891g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f114892h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f114893i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f114894m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f114895n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f114896o;

    public w9(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114888d = buContext;
        this.f114889e = tVar;
        this.f114890f = "FinderLiveAnchorRandomMicBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dmh, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f114891g = viewGroup;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.odb);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        this.f114892h = textView;
        this.f114893i = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.cus);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.qz9);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        this.f114894m = textView2;
        this.f114895n = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.s9(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f114889e;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(cm2.e0 r12) {
        /*
            r11 = this;
            r45.gw1 r0 = r12.f43337v
            r1 = 2
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r11.f114892h
            r1.setText(r0)
            r45.gw1 r12 = r12.f43337v
            r0 = 3
            java.lang.String r1 = r12.getString(r0)
            r2 = 1
            android.widget.TextView r3 = r11.f114893i
            r4 = 0
            if (r1 == 0) goto L36
            int r5 = r1.length()
            r6 = 0
            if (r5 <= 0) goto L22
            r5 = r2
            goto L23
        L22:
            r5 = r6
        L23:
            if (r5 == 0) goto L26
            goto L27
        L26:
            r1 = r4
        L27:
            if (r1 == 0) goto L36
            java.lang.String r12 = r12.getString(r0)
            r3.setText(r12)
            r3.setVisibility(r6)
            jz5.f0 r12 = jz5.f0.f302826a
            goto L37
        L36:
            r12 = r4
        L37:
            if (r12 != 0) goto L3e
            r12 = 8
            r3.setVisibility(r12)
        L3e:
            ml2.q2 r12 = ml2.q2.K
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "report21054 op: "
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveMicReportUtil"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.Class<ml2.j0> r0 = ml2.j0.class
            i95.m r0 = i95.n0.c(r0)
            ml2.j0 r0 = (ml2.j0) r0
            java.lang.String r1 = ""
            r3 = -1
            r0.Vj(r12, r1, r3, r3)
            com.tencent.mm.plugin.finder.live.plugin.t9 r12 = new com.tencent.mm.plugin.finder.live.plugin.t9
            r12.<init>(r11)
            android.widget.TextView r0 = r11.f114894m
            r0.setOnClickListener(r12)
            kotlinx.coroutines.r2 r12 = r11.f114896o
            if (r12 == 0) goto L79
            kotlinx.coroutines.p2.a(r12, r4, r2, r4)
        L79:
            gk2.e r12 = r11.f114888d
            yg2.b r5 = r12.f272475i
            kotlinx.coroutines.p0 r12 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r6 = kotlinx.coroutines.internal.b0.f310484a
            r7 = 0
            com.tencent.mm.plugin.finder.live.plugin.u9 r8 = new com.tencent.mm.plugin.finder.live.plugin.u9
            r8.<init>(r11, r4)
            r9 = 2
            r10 = 0
            kotlinx.coroutines.r2 r12 = kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
            r11.f114896o = r12
            jz5.g r12 = r11.f114895n
            jz5.n r12 = (jz5.n) r12
            java.lang.Object r12 = r12.getValue()
            android.view.View r12 = (android.view.View) r12
            com.tencent.mm.plugin.finder.live.plugin.v9 r0 = new com.tencent.mm.plugin.finder.live.plugin.v9
            r0.<init>(r11)
            r12.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.w9.a(cm2.e0):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.e0) {
            a((cm2.e0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        return this.f114891g;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.e0) {
            a((cm2.e0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
        kotlinx.coroutines.r2 r2Var = this.f114896o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
