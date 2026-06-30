package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class l8 extends com.tencent.mm.plugin.finder.live.plugin.l implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113358p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.n7 f113359q;

    /* renamed from: r, reason: collision with root package name */
    public int f113360r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f113361s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113358p = statusMonitor;
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f365323d.getVisibility() != 0) {
            return false;
        }
        int i17 = this.f113360r;
        if (i17 == 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.i8(this));
        } else if (i17 == 1) {
            this.f113360r = 0;
            qo0.c.a(this.f113358p, qo0.b.f365392o2, null, 2, null);
        } else {
            if (i17 != 2) {
                return false;
            }
            this.f113360r = 0;
            sf2.x xVar = (sf2.x) U0(sf2.x.class);
            if (xVar != null) {
                xVar.g7();
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 94) {
            u1(null);
            return;
        }
        if (ordinal != 95) {
            return;
        }
        int i17 = this.f113360r;
        if (i17 == 1) {
            qo0.c.a(this.f113358p, qo0.b.f365392o2, null, 2, null);
            this.f113360r = 0;
        } else if (i17 == 2) {
            this.f113360r = 0;
            sf2.x xVar = (sf2.x) U0(sf2.x.class);
            if (xVar != null) {
                xVar.g7();
            }
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.i8(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicSelectPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicSelectPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(boolean z17) {
        if (((mm2.c1) P0(mm2.c1.class)).a8()) {
            mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
            c1Var.N1 = z17;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", c1Var.N1);
            this.f113358p.statusChange(qo0.b.Z2, bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r2.P() ? false : true) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(yz5.a r8) {
        /*
            r7 = this;
            r0 = 0
            r7.f113360r = r0
            r7.f113361s = r8
            android.view.ViewGroup r8 = r7.f365323d
            android.content.Context r8 = r8.getContext()
            boolean r1 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L12
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            goto L13
        L12:
            r8 = 0
        L13:
            if (r8 != 0) goto L16
            goto L48
        L16:
            r1 = 1
            r7.t1(r1)
            com.tencent.mm.plugin.finder.live.widget.n7 r2 = r7.f113359q
            if (r2 == 0) goto L27
            boolean r2 = r2.P()
            if (r2 != 0) goto L25
            r0 = r1
        L25:
            if (r0 == 0) goto L3c
        L27:
            com.tencent.mm.plugin.finder.live.widget.n7 r0 = new com.tencent.mm.plugin.finder.live.widget.n7
            r0.<init>(r8, r7)
            r7.f113359q = r0
            com.tencent.mm.plugin.finder.live.plugin.j8 r8 = new com.tencent.mm.plugin.finder.live.plugin.j8
            r8.<init>(r7)
            r0.N = r8
            com.tencent.mm.plugin.finder.live.plugin.k8 r8 = new com.tencent.mm.plugin.finder.live.plugin.k8
            r8.<init>(r7)
            r0.P = r8
        L3c:
            com.tencent.mm.plugin.finder.live.widget.n7 r1 = r7.f113359q
            if (r1 == 0) goto L48
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            com.tencent.mm.plugin.finder.live.widget.e0.W(r1, r2, r3, r4, r5, r6)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.l8.u1(yz5.a):void");
    }
}
