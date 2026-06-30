package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r30 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f114076p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.RelativeLayout f114077q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f114078r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f114079s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f114080t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f114081u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f114082v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114076p = "FinderLiveOptionPanelPlugin";
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.pob);
        this.f114077q = relativeLayout;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f8f);
        this.f114078r = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f8i);
        this.f114079s = findViewById2;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.f8j);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.f8g);
        this.f114080t = root.findViewById(com.tencent.mm.R.id.isg);
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.tkh);
        this.f114081u = findViewById3;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.tki);
        if (x0()) {
            relativeLayout.post(new com.tencent.mm.plugin.finder.live.plugin.k30(this));
        } else {
            root.post(new com.tencent.mm.plugin.finder.live.plugin.j30(root));
        }
        relativeLayout.setTranslationY(com.tencent.mm.ui.bl.b(root.getContext()).y);
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.l30(this));
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.m30(this, root));
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.n30(this));
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.p30(this, root));
        if (com.tencent.mm.ui.bk.C()) {
            weImageView.r(android.graphics.Color.parseColor("#ffffff"), 0.8f);
            weImageView2.r(android.graphics.Color.parseColor("#ffffff"), 0.8f);
            weImageView3.r(android.graphics.Color.parseColor("#ffffff"), 0.8f);
        } else {
            weImageView.r(android.graphics.Color.parseColor("#000000"), 0.8f);
            weImageView2.r(android.graphics.Color.parseColor("#000000"), 0.8f);
            weImageView3.r(android.graphics.Color.parseColor("#000000"), 0.8f);
        }
    }

    public static final boolean t1(com.tencent.mm.plugin.finder.live.plugin.r30 r30Var) {
        if (!((mm2.c1) r30Var.P0(mm2.c1.class)).a8()) {
            return true;
        }
        on2.z2 z2Var = (on2.z2) r30Var.P0(on2.z2.class);
        boolean V6 = z2Var.V6();
        android.view.ViewGroup viewGroup = r30Var.f365323d;
        if (V6 || z2Var.T6()) {
            java.lang.String string = viewGroup.getContext().getString(com.tencent.mm.R.string.nrm);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Context context = viewGroup.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = string;
            e4Var.c();
        } else {
            df2.ar arVar = (df2.ar) r30Var.U0(df2.ar.class);
            if (!(arVar != null && arVar.f7())) {
                return true;
            }
            java.lang.String string2 = viewGroup.getContext().getString(com.tencent.mm.R.string.nrm);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.content.Context context2 = viewGroup.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = string2;
            e4Var2.c();
        }
        return false;
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        u1();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void u1() {
        this.f114077q.animate().translationY(com.tencent.mm.ui.bl.b(this.f365323d.getContext()).y).setDuration(200L).setListener(new com.tencent.mm.plugin.finder.live.plugin.q30(this)).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x010b, code lost:
    
        if (((mm2.c1) P0(mm2.c1.class)).o7() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x017a, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0178, code lost:
    
        if ((r5 == 1 && r5 != 0) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1(yz5.a r27) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.r30.v1(yz5.a):void");
    }
}
