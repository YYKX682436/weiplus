package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w5 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.app.Activity f114873p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.e5 f114874q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        this.f114873p = (android.app.Activity) context;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        t1(this.f114873p.getIntent());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            t1(this.f114873p.getIntent());
        } else {
            if (ordinal != 223) {
                return;
            }
            u1(bundle);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        com.tencent.mm.plugin.finder.live.widget.e5 e5Var = this.f114874q;
        if (e5Var != null) {
            e5Var.f118226a.i();
            e5Var.f118227b.f118003J = null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void k1(android.content.Intent intent) {
        t1(intent);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.content.Intent intent) {
        com.tencent.mm.plugin.finder.live.widget.cf cfVar;
        if (intent == null) {
            return;
        }
        boolean z17 = false;
        if (intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) == 2) {
            intent.removeExtra("KEY_PARAMS_DO_ACTION");
            if (this.f114874q == null) {
                com.tencent.mm.plugin.finder.live.widget.e5 e5Var = new com.tencent.mm.plugin.finder.live.widget.e5(this.f114873p, this.f365323d, S0());
                this.f114874q = e5Var;
                e5Var.f118226a.a(this);
            }
            r45.eq1 eq1Var = ((mm2.n2) P0(mm2.n2.class)).f329279g;
            if (eq1Var != null && eq1Var.getBoolean(1)) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.plugin.finder.live.widget.e5 e5Var2 = this.f114874q;
                if (e5Var2 != null) {
                    e5Var2.f118226a.h(null, true);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.finder.live.widget.e5 e5Var3 = this.f114874q;
            if (e5Var3 == null || (cfVar = e5Var3.f118227b) == null) {
                return;
            }
            cfVar.f0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r0.getBoolean(1) == true) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(android.os.Bundle r5) {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.live.widget.e5 r0 = r4.f114874q
            if (r0 != 0) goto L18
            com.tencent.mm.plugin.finder.live.widget.e5 r0 = new com.tencent.mm.plugin.finder.live.widget.e5
            gk2.e r1 = r4.S0()
            android.app.Activity r2 = r4.f114873p
            android.view.ViewGroup r3 = r4.f365323d
            r0.<init>(r2, r3, r1)
            r4.f114874q = r0
            com.tencent.mm.plugin.finder.live.widget.bh r0 = r0.f118226a
            r0.a(r4)
        L18:
            com.tencent.mm.plugin.finder.live.widget.e5 r0 = r4.f114874q
            r1 = 0
            if (r0 == 0) goto L20
            com.tencent.mm.plugin.finder.live.widget.cf r0 = r0.f118227b
            goto L21
        L20:
            r0 = r1
        L21:
            r2 = 0
            if (r0 != 0) goto L25
            goto L31
        L25:
            if (r5 == 0) goto L2e
            java.lang.String r3 = "PARAM_FINDER_LIVE_SHOW_FANS_FROM_WISH"
            boolean r3 = r5.getBoolean(r3)
            goto L2f
        L2e:
            r3 = r2
        L2f:
            r0.T = r3
        L31:
            java.lang.Class<mm2.n2> r0 = mm2.n2.class
            androidx.lifecycle.c1 r0 = r4.P0(r0)
            mm2.n2 r0 = (mm2.n2) r0
            r45.eq1 r0 = r0.f329279g
            if (r0 == 0) goto L45
            r3 = 1
            boolean r0 = r0.getBoolean(r3)
            if (r0 != r3) goto L45
            goto L46
        L45:
            r3 = r2
        L46:
            if (r3 == 0) goto L5a
            com.tencent.mm.plugin.finder.live.widget.e5 r0 = r4.f114874q
            if (r0 == 0) goto L65
            if (r5 == 0) goto L54
            java.lang.String r2 = "PARAM_FINDER_LIVE_SHOW_FANS_MODIFY"
            boolean r2 = r5.getBoolean(r2)
        L54:
            com.tencent.mm.plugin.finder.live.widget.bh r5 = r0.f118226a
            r5.h(r1, r2)
            goto L65
        L5a:
            com.tencent.mm.plugin.finder.live.widget.e5 r5 = r4.f114874q
            if (r5 == 0) goto L65
            com.tencent.mm.plugin.finder.live.widget.cf r5 = r5.f118227b
            if (r5 == 0) goto L65
            r5.f0()
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.w5.u1(android.os.Bundle):void");
    }

    @Override // qo0.a
    public void y0(boolean z17, int i17) {
        com.tencent.mm.plugin.finder.live.widget.e5 e5Var = this.f114874q;
        if (e5Var != null) {
            e5Var.a(i17, z17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.widget.e5 e5Var = this.f114874q;
        if (e5Var != null) {
            e5Var.f118226a.a(this);
        }
    }
}
