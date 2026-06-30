package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f119484a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.oo0 f119485b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f119486c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f119487d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f119488e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f119489f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f119490g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f119491h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f119492i;

    /* renamed from: j, reason: collision with root package name */
    public zy2.g5 f119493j;

    public q4(android.view.View root, com.tencent.mm.plugin.finder.live.plugin.oo0 plugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f119484a = root;
        this.f119485b = plugin;
        this.f119486c = "FinderLiveAfterReplayWidget";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.dzc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119487d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.e0i);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119488e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.gsh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f119489f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.rlh);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f119490g = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.rli);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f119491h = findViewById5;
        android.view.View findViewById6 = findViewById5.findViewById(com.tencent.mm.R.id.s2b);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f119492i = (android.view.ViewGroup) findViewById6;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.widget.q4 q4Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        q4Var.getClass();
        i95.m c17 = i95.n0.c(com.tencent.mm.feature.finder.live.v4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = q4Var.f119484a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s40.w0.ba((s40.w0) c17, context, finderObject, true, null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.tencent.mm.plugin.finder.live.widget.q4 r24, com.tencent.mm.protocal.protobuf.FinderObject r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.q4.b(com.tencent.mm.plugin.finder.live.widget.q4, com.tencent.mm.protocal.protobuf.FinderObject, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.tencent.mm.protocal.protobuf.FinderObject r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.tencent.mm.plugin.finder.live.widget.i4
            if (r2 == 0) goto L17
            r2 = r1
            com.tencent.mm.plugin.finder.live.widget.i4 r2 = (com.tencent.mm.plugin.finder.live.widget.i4) r2
            int r3 = r2.f118634g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f118634g = r3
            goto L1c
        L17:
            com.tencent.mm.plugin.finder.live.widget.i4 r2 = new com.tencent.mm.plugin.finder.live.widget.i4
            r2.<init>(r0, r1)
        L1c:
            r15 = r2
            java.lang.Object r1 = r15.f118632e
            pz5.a r2 = pz5.a.f359186d
            int r3 = r15.f118634g
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            java.lang.Object r2 = r15.f118631d
            com.tencent.mm.plugin.finder.live.widget.q4 r2 = (com.tencent.mm.plugin.finder.live.widget.q4) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L76
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            zy2.g5 r1 = r0.f119493j
            if (r1 != 0) goto L7a
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            i95.m r1 = i95.n0.c(r1)
            r3 = r1
            zy2.b6 r3 = (zy2.b6) r3
            if (r3 == 0) goto L79
            long r5 = r19.getId()
            java.lang.String r1 = r19.getObjectNonceId()
            if (r1 != 0) goto L56
            java.lang.String r1 = ""
        L56:
            r7 = 25
            r8 = 600000(0x927c0, double:2.964394E-318)
            r10 = 0
            com.tencent.mm.plugin.finder.live.widget.j4 r11 = new com.tencent.mm.plugin.finder.live.widget.j4
            r11.<init>(r0)
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 448(0x1c0, float:6.28E-43)
            r17 = 0
            r15.f118631d = r0
            r15.f118634g = r4
            r4 = r5
            r6 = r1
            java.lang.Object r1 = zy2.b6.Tf(r3, r4, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != r2) goto L75
            return r2
        L75:
            r2 = r0
        L76:
            zy2.g5 r1 = (zy2.g5) r1
            goto L7b
        L79:
            r1 = 0
        L7a:
            r2 = r0
        L7b:
            r2.f119493j = r1
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.q4.c(com.tencent.mm.protocal.protobuf.FinderObject, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
        zy2.g5 g5Var = this.f119493j;
        boolean z17 = false;
        if (g5Var != null && g5Var.isPlaying()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f119486c, "player " + this.f119493j + " paused");
            zy2.g5 g5Var2 = this.f119493j;
            if (g5Var2 != null) {
                g5Var2.pause();
            }
        }
    }

    public final void e(r45.l71 l71Var) {
        r45.nw1 nw1Var;
        r45.i72 i72Var;
        java.lang.Long l17 = null;
        r45.nw1 nw1Var2 = l71Var != null ? (r45.nw1) l71Var.getCustom(1) : null;
        if (nw1Var2 != null) {
            nw1Var = nw1Var2;
        } else {
            r45.v74 v74Var = this.f119485b.Y().f410663r;
            nw1Var = v74Var != null ? (r45.nw1) v74Var.getCustom(1) : null;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (nw1Var != null && (i72Var = (r45.i72) nw1Var.getCustom(44)) != null) {
            l17 = java.lang.Long.valueOf(i72Var.getLong(12));
        }
        h0Var.f310123d = l17;
        if (nw1Var != null) {
            nw1Var.getInteger(31);
        }
        java.lang.Long l18 = (java.lang.Long) h0Var.f310123d;
        if ((l18 != null && l18.longValue() == 0) || h0Var.f310123d == null || this.f119484a.getVisibility() == 0) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(this.f119485b, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.widget.l4(h0Var, nw1Var2, this, l71Var, null), 2, null);
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i(this.f119486c, "player " + this.f119493j + " release");
        zy2.g5 g5Var = this.f119493j;
        if (g5Var != null) {
            g5Var.d();
        }
        zy2.g5 g5Var2 = this.f119493j;
        if (g5Var2 != null) {
            g5Var2.b();
        }
    }

    public final void g() {
        zy2.g5 g5Var;
        if (this.f119491h.getVisibility() == 0) {
            zy2.g5 g5Var2 = this.f119493j;
            boolean z17 = false;
            if (g5Var2 != null && g5Var2.isPlaying()) {
                z17 = true;
            }
            if (z17 || (g5Var = this.f119493j) == null) {
                return;
            }
            g5Var.play();
        }
    }
}
