package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hz extends com.tencent.mm.plugin.finder.live.plugin.l implements vd2.j5 {

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.RelativeLayout f112879p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f112880q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f112881r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f112882s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f112883t;

    /* renamed from: u, reason: collision with root package name */
    public int f112884u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.c8q);
        this.f112879p = relativeLayout;
        this.f112880q = root.findViewById(com.tencent.mm.R.id.c8r);
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.c8s);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.c8p);
        this.f112881r = findViewById;
        this.f112883t = true;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.bz(this));
        relativeLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.cz(this));
        textView.setText(root.getContext().getResources().getString(com.tencent.mm.R.string.f491702dz1));
    }

    @Override // vd2.j5
    public void C4() {
        K0(0);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.dz.f112354a[status.ordinal()] == 1) {
            pm0.v.V(100L, new com.tencent.mm.plugin.finder.live.plugin.gz(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        this.f112882s = false;
        this.f112883t = true;
    }

    @Override // vd2.j5
    public java.lang.String Q() {
        return "FinderLiveMultiStreamBubblePlugin";
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // vd2.j5
    public void o1() {
        K0(8);
    }

    @Override // vd2.j5
    public int priority() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r3 != 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t1() {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.hz.t1():void");
    }

    public final java.lang.String u1() {
        return "MultiStream_" + ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0);
    }

    public final void v1() {
        df2.pv pvVar = (df2.pv) U0(df2.pv.class);
        if (pvVar != null) {
            pvVar.b7(this);
        }
    }

    public final void w1() {
        com.tencent.mars.xlog.Log.i("FinderLiveMultiStreamBubblePlugin", "markUse hasMarkUse: " + this.f112882s + " key: " + u1());
        v1();
        if (this.f112882s) {
            return;
        }
        this.f112882s = true;
        zl2.r4.f473950a.I0().putInt(u1(), 1);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.z0();
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        if (k0Var == null || (liveMutableData = k0Var.f299387v) == null) {
            return;
        }
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ez(this));
    }
}
