package com.tencent.mm.plugin.sns.ui.sheet;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog;", "Lhg5/d;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "refreshDataOnContextResume", "checkDismissOnContextDestroy", "Landroid/content/Context;", "uiContext", "", "mLocalId", "exposeScene", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "<init>", "(Landroid/content/Context;III)V", "SnsObjectDetailEventListener", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsGroupDialog extends hg5.d implements androidx.lifecycle.x {
    public static final /* synthetic */ int M = 0;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.SnsObjectDetailEventListener G;
    public boolean H;
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f170460J;
    public boolean K;
    public final jz5.g L;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f170461r;

    /* renamed from: s, reason: collision with root package name */
    public final int f170462s;

    /* renamed from: t, reason: collision with root package name */
    public final int f170463t;

    /* renamed from: u, reason: collision with root package name */
    public final int f170464u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f170465v;

    /* renamed from: w, reason: collision with root package name */
    public int f170466w;

    /* renamed from: x, reason: collision with root package name */
    public int f170467x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f170468y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f170469z;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$SnsObjectDetailEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ReturnSnsObjectDetailEvent;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog;", "weakRef", "<init>", "(Ljava/lang/ref/WeakReference;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class SnsObjectDetailEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent> {

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.ref.WeakReference f170470d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f170471e;

        public SnsObjectDetailEventListener(java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog> weakReference) {
            super(com.tencent.mm.app.a0.f53288d);
            this.f170470d = weakReference;
            this.f170471e = "MicroMsg.SnsObjectDetailEventListener[" + hashCode() + ']';
            this.__eventId = -1656522510;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (r2 != false) goto L18;
         */
        @Override // com.tencent.mm.sdk.event.IListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean callback(com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent r11) {
            /*
                r10 = this;
                java.lang.String r0 = "callback"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener"
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent r11 = (com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent) r11
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.String r2 = "event"
                kotlin.jvm.internal.o.g(r11, r2)
                r2 = 0
                java.lang.String r3 = r10.f170471e
                java.lang.ref.WeakReference r4 = r10.f170470d
                if (r4 != 0) goto L22
                java.lang.String r11 = "callback: snsGroupDialog weakRef null"
                com.tencent.mars.xlog.Log.i(r3, r11)
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                goto Lc5
            L22:
                java.lang.Object r4 = r4.get()
                com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog r4 = (com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog) r4
                if (r4 != 0) goto L34
                java.lang.String r11 = "callback: snsGroupDialog had destroy"
                com.tencent.mars.xlog.Log.i(r3, r11)
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                goto Lc5
            L34:
                am.as r11 = r11.f54711g
                com.tencent.mm.protocal.protobuf.SnsObject r11 = r11.f6185a
                r5 = 1
                if (r11 == 0) goto La2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "returnSnsObjectDetailEventListener snsid:"
                r6.<init>(r7)
                long r7 = r11.Id
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.mars.xlog.Log.i(r3, r6)
                com.tencent.mm.protocal.protobuf.SnsObject r6 = com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.L(r4)
                if (r6 == 0) goto L66
                com.tencent.mm.protocal.protobuf.SnsObject r6 = com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.L(r4)
                if (r6 == 0) goto L64
                long r6 = r6.Id
                long r8 = r11.Id
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 != 0) goto L64
                r2 = r5
            L64:
                if (r2 == 0) goto Lc1
            L66:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r6 = "ReturnSnsObjectDetailEvent snsObject id:"
                r2.<init>(r6)
                com.tencent.mm.protocal.protobuf.SnsObject r6 = com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.L(r4)
                if (r6 == 0) goto L7a
                long r6 = r6.Id
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                goto L7c
            L7a:
                java.lang.String r6 = "-1"
            L7c:
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                com.tencent.mars.xlog.Log.i(r3, r2)
                java.lang.String r2 = "access$setMSnsObject$p"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog"
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                r4.f170465v = r11
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                com.tencent.mm.protocal.protobuf.SnsObject r11 = com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.L(r4)
                java.lang.String r2 = "access$initView"
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                r4.P(r11)
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                goto Lc1
            La2:
                com.tencent.mm.protocal.protobuf.SnsObject r11 = com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.L(r4)
                if (r11 != 0) goto Lc1
                android.content.Context r11 = r4.getContext()
                android.content.Context r2 = r4.getContext()
                r3 = 2131776877(0x7f10556d, float:1.9185239E38)
                java.lang.String r2 = i65.a.r(r2, r3)
                com.tencent.mm.plugin.sns.ui.sheet.a r3 = new com.tencent.mm.plugin.sns.ui.sheet.a
                r3.<init>(r4)
                java.lang.String r4 = ""
                db5.e1.t(r11, r2, r4, r3)
            Lc1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                r2 = r5
            Lc5:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.SnsObjectDetailEventListener.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public void dead() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dead", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener");
            com.tencent.mars.xlog.Log.i(this.f170471e, "dead: ");
            super.dead();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dead", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnsGroupDialog(android.content.Context uiContext, int i17, int i18, int i19) {
        super(uiContext);
        kotlin.jvm.internal.o.g(uiContext, "uiContext");
        this.f170461r = uiContext;
        this.f170462s = i17;
        this.f170463t = i18;
        this.f170464u = i19;
        this.f170468y = jz5.h.b(new wd4.v2(this));
        this.f170469z = jz5.h.b(new wd4.u2(this));
        this.A = jz5.h.b(new wd4.m2(this));
        this.B = jz5.h.b(new wd4.t2(this));
        this.C = jz5.h.b(new wd4.n2(this));
        this.D = jz5.h.b(new wd4.o2(this));
        this.E = jz5.h.b(new wd4.s2(this));
        this.F = jz5.h.b(wd4.l2.f444958d);
        this.I = new java.util.ArrayList();
        this.f170460J = new java.util.ArrayList();
        this.L = jz5.h.b(new wd4.k2(this));
        androidx.lifecycle.y yVar = uiContext instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) uiContext : null;
        if (yVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", "init: addObserver to " + uiContext);
            yVar.mo133getLifecycle().a(this);
        }
    }

    public static final /* synthetic */ java.util.ArrayList K(com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItems$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        java.util.ArrayList arrayList = snsGroupDialog.f170460J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItems$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return arrayList;
    }

    public static final /* synthetic */ com.tencent.mm.protocal.protobuf.SnsObject L(com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsObject$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = snsGroupDialog.f170465v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsObject$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return snsObject;
    }

    @Override // hg5.d
    public android.view.View F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.crx, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        com.tencent.mm.view.recyclerview.WxRecyclerView O;
        android.view.View findViewById;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        super.G();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", "[" + hashCode() + "] initContentView");
        if (this.G == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", "initContentView: create SnsObjectDetailEventListener");
            this.G = new com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.SnsObjectDetailEventListener(new java.lang.ref.WeakReference(this));
        }
        com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.SnsObjectDetailEventListener snsObjectDetailEventListener = this.G;
        if (snsObjectDetailEventListener != null) {
            snsObjectDetailEventListener.alive();
        }
        android.view.View view = this.f281403i;
        if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.f483758bz2)) != null) {
            findViewById.setOnClickListener(new wd4.p2(this));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView O2 = O();
        if (O2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) this.E).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            O2.setLayoutManager(wxLinearLayoutManager);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView O3 = O();
        if ((O3 != null ? O3.getAdapter() : null) == null && (O = O()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            wd4.j2 j2Var = (wd4.j2) ((jz5.n) this.L).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            O.setAdapter(j2Var);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView O4 = O();
        if (O4 != null) {
            O4.N(new wd4.q2(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsObject", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initSnsObject mLocalId:");
        int i17 = this.f170462s;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", sb6.toString());
        com.tencent.mm.autogen.events.GetSnsObjectDetailEvent getSnsObjectDetailEvent = new com.tencent.mm.autogen.events.GetSnsObjectDetailEvent();
        getSnsObjectDetailEvent.f54410g.f7247a = i17;
        getSnsObjectDetailEvent.e();
        this.f170465v = getSnsObjectDetailEvent.f54411h.f7347a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initSnsObject try find snsObject localId:");
        sb7.append(i17);
        sb7.append(", snsObject id:");
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f170465v;
        sb7.append(snsObject != null ? java.lang.Long.valueOf(snsObject.Id) : "null");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", sb7.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsObject", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        P(this.f170465v);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    @Override // hg5.d
    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        super.J();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", "[" + hashCode() + "] onDismiss");
        com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.SnsObjectDetailEventListener snsObjectDetailEventListener = this.G;
        if (snsObjectDetailEventListener != null) {
            snsObjectDetailEventListener.dead();
        }
        java.lang.Object obj = this.f170461r;
        androidx.lifecycle.y yVar = obj instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj : null;
        if (yVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", "onDismiss: removeObserver to " + obj);
            yVar.mo133getLifecycle().c(this);
        }
        android.view.View M2 = M();
        boolean z17 = false;
        if (M2 != null && M2.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f170465v;
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.G(this.f170463t, this.H, ca4.z0.s0(snsObject != null ? snsObject.Id : 0L));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    public final android.view.View M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEditGroup", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        android.view.View view = (android.view.View) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEditGroup", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return view;
    }

    public final wd4.s0 N(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLabelItem", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        java.lang.String g17 = ((b93.b) c93.a.a()).g(java.lang.String.valueOf(i17));
        if (g17 == null) {
            g17 = "";
        }
        java.util.List j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(i17));
        wd4.s0 s0Var = new wd4.s0(z17 ? 3 : 2, null, new wd4.t0(i17, g17, j17 != null ? j17.size() : 0), null, 10, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLabelItem", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return s0Var;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f170469z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return wxRecyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x01ae, code lost:
    
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01f7, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x01f5, code lost:
    
        if (r7 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x072c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(com.tencent.mm.protocal.protobuf.SnsObject r43) {
        /*
            Method dump skipped, instructions count: 1905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.P(com.tencent.mm.protocal.protobuf.SnsObject):void");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void checkDismissOnContextDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDismissOnContextDestroy", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", "checkDismissWhenContextDestroy: dialog lifecycle state:" + ((androidx.lifecycle.b0) mo133getLifecycle()).f11605c.name());
        if (((androidx.lifecycle.b0) mo133getLifecycle()).f11605c != androidx.lifecycle.n.DESTROYED) {
            J();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDismissOnContextDestroy", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void refreshDataOnContextResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshDataOnContextResume", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", "refreshDataOnContextResume: dialog lifecycle state:" + ((androidx.lifecycle.b0) mo133getLifecycle()).f11605c.name());
        if (((androidx.lifecycle.b0) mo133getLifecycle()).f11605c == androidx.lifecycle.n.RESUMED) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refresh] localId = ");
            int i17 = this.f170462s;
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", sb6.toString());
            com.tencent.mm.plugin.sns.storage.SnsInfo i18 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
            try {
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(i18 != null ? i18.field_attrBuf : null);
                if (snsObject == null) {
                    snsObject = this.f170465v;
                }
                this.f170465v = snsObject;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsGroupDialog", e17, "", new java.lang.Object[0]);
            }
            if (i18 != null) {
                com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f170465v;
                int i19 = snsObject2 != null ? snsObject2.ExtFlag : 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                boolean z17 = (i19 & 3) == 3 || (i19 & 5) == 5 || (i19 & 1025) == 1025 || (i19 & 513) == 513 || (i19 & 4097) == 4097;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                boolean z18 = (i18.getLocalPrivate() & 1) != 0;
                boolean z19 = i18.field_pravited == 0 && !z17;
                if (z18 || z19) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("refresh private:");
                    sb7.append(i18.getLocalPrivate() & 1);
                    sb7.append(" public:");
                    sb7.append(i18.field_pravited == 0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", sb7.toString());
                    dismiss();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                } else {
                    dismiss();
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("refresh id:");
            sb8.append(i18 != null ? i18.getSnsId() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", sb8.toString());
            P(this.f170465v);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            wd4.j2 j2Var = (wd4.j2) ((jz5.n) this.L).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            j2Var.notifyDataSetChanged();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshDataOnContextResume", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }
}
