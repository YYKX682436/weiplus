package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsMsgUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.sns.model.h0, com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int Z = 0;
    public java.util.ArrayList D;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public long f167266J;
    public int N;
    public long P;
    public long Q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f167267d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.bm f167268e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f167269f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.kj f167271h;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f167274n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f167275o;

    /* renamed from: q, reason: collision with root package name */
    public gc4.i f167277q;

    /* renamed from: r, reason: collision with root package name */
    public int f167278r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.storage.e8 f167279s;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f167282v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f167283w;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f167270g = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f167272i = com.tencent.mm.plugin.sns.model.l4.Tj();

    /* renamed from: m, reason: collision with root package name */
    public boolean f167273m = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f167276p = false;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.data.SnsCmdList f167280t = new com.tencent.mm.plugin.sns.data.SnsCmdList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f167281u = false;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f167284x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int f167285y = 86400;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f167286z = l44.a0.a();
    public android.view.View A = null;
    public boolean B = true;
    public boolean C = false;
    public final com.tencent.mm.sdk.event.IListener E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsCommentUpdateEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.sns.ui.SnsMsgUI.1
        {
            this.__eventId = -1499688230;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.SnsCommentUpdateEvent snsCommentUpdateEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
            com.tencent.mm.autogen.events.SnsCommentUpdateEvent snsCommentUpdateEvent2 = snsCommentUpdateEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
            am.nv nvVar = snsCommentUpdateEvent2.f54805g;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "msg comment update commentUniqueId: %s snsId: %s", nvVar.f7464b, nvVar.f7463a);
            int i17 = 0;
            while (true) {
                com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = com.tencent.mm.plugin.sns.ui.SnsMsgUI.this;
                if (i17 >= com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).getCount()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
                    break;
                }
                com.tencent.mm.plugin.sns.storage.v1 v1Var = (com.tencent.mm.plugin.sns.storage.v1) com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).getItem(i17);
                if (v1Var != null) {
                    com.tencent.mm.plugin.sns.ui.widget.q2 q2Var = com.tencent.mm.plugin.sns.ui.widget.q2.f171251d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                    com.tencent.mm.plugin.sns.ui.widget.q2 q2Var2 = com.tencent.mm.plugin.sns.ui.widget.q2.f171251d;
                    java.lang.String k17 = q2Var2.k(q2Var2.t(v1Var));
                    if (k17 == null) {
                        k17 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                    if (k17.equals(snsCommentUpdateEvent2.f54805g.f7464b)) {
                        com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).notifyDataSetChanged();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
                        break;
                    }
                }
                i17++;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
            return false;
        }
    };
    public final android.view.View.OnClickListener F = new com.tencent.mm.plugin.sns.ui.rl(this);
    public long G = 0;
    public long H = 0;
    public final db5.t4 K = new com.tencent.mm.plugin.sns.ui.kl(this);
    public final l75.q0 L = new com.tencent.mm.plugin.sns.ui.pl(this);
    public final java.lang.Runnable M = new com.tencent.mm.plugin.sns.ui.ql(this);
    public int R = 0;
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public final java.util.HashMap V = new java.util.HashMap();
    public final java.util.HashMap W = new java.util.HashMap();
    public final java.util.HashMap X = new java.util.HashMap();
    public boolean Y = false;

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.bm T6(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.bm bmVar = snsMsgUI.f167268e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return bmVar;
    }

    public static /* synthetic */ int[] U6(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        int[] iArr = snsMsgUI.f167284x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return iArr;
    }

    public static void V6(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        r45.j96 j96Var = new r45.j96();
        j96Var.f377675d = z17 ? 1 : 0;
        com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(snsMsgUI.f167266J, 12, j96Var);
        gm0.j1.i();
        if (gm0.j1.n().f273288b.h(q2Var, 0)) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = snsMsgUI.f167282v;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(snsMsgUI, snsMsgUI.getString(com.tencent.mm.R.string.f490573yv), snsMsgUI.getString(com.tencent.mm.R.string.hbx), true, true, new com.tencent.mm.plugin.sns.ui.ml(snsMsgUI, q2Var));
            snsMsgUI.f167282v = Q;
            Q.show();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public static /* synthetic */ android.view.View.OnClickListener W6(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        android.view.View.OnClickListener onClickListener = snsMsgUI.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return onClickListener;
    }

    public static /* synthetic */ java.util.HashMap X6(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        java.util.HashMap hashMap = snsMsgUI.X;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return hashMap;
    }

    public static /* synthetic */ com.tencent.mm.storage.e8 Y6(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.storage.e8 e8Var = snsMsgUI.f167279s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return e8Var;
    }

    public static /* synthetic */ java.lang.String Z6(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI, com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        java.lang.String g76 = snsMsgUI.g7(v1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return g76;
    }

    public static com.tencent.mm.plugin.sns.storage.SnsInfo a7(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI, com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = null;
        if (v1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        } else {
            try {
                com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(v1Var.field_snsID);
                snsInfo = (W0 != null || (y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(v1Var.field_snsID)) == null) ? W0 : y07.convertToSnsInfo();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            } catch (java.lang.Throwable unused) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return snsInfo;
    }

    public static void b7(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI, com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToCommentDetailWithCheck", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (snsMsgUI.f7(v1Var).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "goToCommentDetailWithCheck: can check later");
            snsMsgUI.l7(v1Var);
        } else {
            snsMsgUI.q7(v1Var, true, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "goToCommentDetailWithCheck: try doScene NetSceneSnsObjectDetial");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToCommentDetailWithCheck", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public static void c7(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.model.l4.Aj().delete(i17);
        snsMsgUI.f167268e.onNotifyChange(null, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490353sl), new com.tencent.mm.plugin.sns.ui.tl(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            onBackPressed();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return dispatchKeyEvent;
    }

    public com.tencent.mm.plugin.sns.ui.bm e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsMsgAdapter", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.bm bmVar = new com.tencent.mm.plugin.sns.ui.bm(this, this, new com.tencent.mm.plugin.sns.storage.v1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsMsgAdapter", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return bmVar;
    }

    public final java.lang.Boolean f7(com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableCheckVisibilityOnLaterPage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        boolean z17 = true;
        boolean z18 = c01.id.e() - v1Var.field_createTime < this.f167285y;
        if (!z18) {
            z17 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(v1Var.field_snsID) != null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "enableCheckVisibilityOnLaterPage: [%b], timeInLimit=[%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableCheckVisibilityOnLaterPage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return valueOf;
    }

    public final java.lang.String g7(com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genFeedId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j17 = v1Var.field_parentID;
        java.lang.String t07 = j17 == 0 ? ca4.z0.t0(v1Var.field_snsID) : ca4.z0.t0(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFeedId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return t07;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.tencent.mm.R.id.n_c;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.tencent.mm.R.layout.csu;
    }

    public int h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.tencent.mm.R.color.f479461zy;
    }

    public java.util.List i7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKeysWithForbidValue", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.bm bmVar = this.f167268e;
        if (bmVar == null || !((java.util.HashMap) bmVar.f167960u).isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeysWithForbidValue", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return arrayList;
        }
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f167268e.f167960u).entrySet()) {
            if (entry != null && ((java.lang.Integer) entry.getValue()).intValue() == 2) {
                arrayList.add((java.lang.String) entry.getKey());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeysWithForbidValue", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return arrayList;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        setMMTitle(k7());
        d7();
        setBackGroundColorResource(h7());
        this.f167271h = new com.tencent.mm.plugin.sns.ui.kj(this);
        this.f167274n = findViewById(com.tencent.mm.R.id.n_a);
        this.f167267d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.n_c);
        t7();
        this.f167269f = com.tencent.mm.ui.id.b(this).inflate(j7(), (android.view.ViewGroup) null);
        this.f167270g = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.byg, (android.view.ViewGroup) null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "autoLoad " + this.f167281u);
        if (!this.f167281u || m7()) {
            this.f167267d.addFooterView(this.f167269f);
        } else {
            this.f167267d.addFooterView(this.f167270g);
        }
        this.f167268e = e7();
        java.util.ArrayList arrayList = this.D;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    this.f167268e.B(str);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.bm bmVar = this.f167268e;
        gc4.h hVar = new gc4.h(this);
        bmVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnreadCommentFetchCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar.f167959t = hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "setUnreadCommentFetchCallback null:%b", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnreadCommentFetchCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mm.plugin.sns.ui.bm bmVar2 = this.f167268e;
        com.tencent.mm.plugin.sns.ui.vl vlVar = new com.tencent.mm.plugin.sns.ui.vl(this);
        bmVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGetViewPositionCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar2.f167957r = vlVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGetViewPositionCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mm.plugin.sns.ui.bm bmVar3 = this.f167268e;
        com.tencent.mm.plugin.sns.ui.wl wlVar = new com.tencent.mm.plugin.sns.ui.wl(this);
        bmVar3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPerformItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar3.f167956q = wlVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPerformItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mm.plugin.sns.ui.bm bmVar4 = this.f167268e;
        com.tencent.mm.plugin.sns.ui.xl xlVar = new com.tencent.mm.plugin.sns.ui.xl(this);
        bmVar4.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemDelListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar4.f167958s = xlVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemDelListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mm.plugin.sns.ui.bm bmVar5 = this.f167268e;
        bmVar5.f212611h = new com.tencent.mm.plugin.sns.ui.yl(this);
        this.f167267d.setAdapter((android.widget.ListAdapter) bmVar5);
        this.f167267d.setOnItemClickListener(new com.tencent.mm.plugin.sns.ui.zl(this));
        android.view.LayoutInflater.from(this);
        new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        new db5.g4(this);
        new db5.g4(this);
        this.f167267d.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.hl(this));
        this.f167267d.setOnItemLongClickListener(new com.tencent.mm.plugin.sns.ui.il(this));
        this.f167267d.setOnScrollListener(new com.tencent.mm.plugin.sns.ui.jl(this));
        if (m7() || this.f167268e.getCount() != 0) {
            this.f167267d.setVisibility(0);
            android.view.View view = this.f167274n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(true);
        } else {
            this.f167267d.setVisibility(8);
            android.view.View view2 = this.f167274n;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(n7());
        }
        if (!m7() && ((this.f167268e.H() && com.tencent.mm.plugin.sns.model.l4.Aj().f() == 0) || com.tencent.mm.plugin.sns.model.l4.Aj().f() == com.tencent.mm.plugin.sns.model.l4.Aj().J0(false))) {
            android.view.View view3 = this.f167269f;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f167268e.H() && this.f167281u) {
            this.f167267d.removeFooterView(this.f167270g);
        }
        r7();
        if (this.f167268e.H() && this.f167281u) {
            this.f167267d.removeFooterView(this.f167270g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public int j7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getListFooterLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getListFooterLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.tencent.mm.R.layout.css;
    }

    public int k7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return com.tencent.mm.R.string.jcy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void l7(com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        java.lang.String str;
        int i17;
        ?? r37;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToCommentDetail", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j17 = v1Var.field_snsID;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "goToCommentDetail: comment field_type:%d", java.lang.Integer.valueOf(v1Var.field_type));
        int i18 = v1Var.field_type;
        com.tencent.mm.plugin.sns.ui.widget.r2 r2Var = com.tencent.mm.plugin.sns.ui.widget.r2.f171259a;
        java.util.HashMap hashMap = this.X;
        if (i18 == 1) {
            this.R++;
            r45.k76 k76Var = (r45.k76) hashMap.get(java.lang.Integer.valueOf(v1Var.S));
            if (k76Var != null) {
                str = "goToCommentDetail";
                r2Var.j("view_clk", g7(v1Var), 1, -1, k76Var.f378467p, "");
                r37 = 1;
            } else {
                str = "goToCommentDetail";
                r37 = 1;
            }
        } else {
            str = "goToCommentDetail";
            if (i18 == 2) {
                r45.e86 r17 = com.tencent.mm.plugin.sns.ui.widget.q2.r(v1Var);
                if (com.tencent.mm.plugin.sns.ui.widget.q2.b(r17)) {
                    i17 = 1;
                    this.T++;
                } else {
                    i17 = 1;
                    if (com.tencent.mm.plugin.sns.ui.widget.q2.d(r17)) {
                        this.U++;
                    }
                }
                this.S += i17;
                r37 = i17;
                r2Var.j("view_clk", g7(v1Var), 2, r17.f373144y, r17.f373132m, r17.f373130h);
            }
            r37 = 1;
        }
        java.util.HashMap hashMap2 = this.W;
        if (hashMap2.containsKey(java.lang.Integer.valueOf(v1Var.S))) {
            hashMap2.put(java.lang.Integer.valueOf(v1Var.S), java.lang.Integer.valueOf(((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(v1Var.S))).intValue() + r37));
        } else {
            hashMap2.put(java.lang.Integer.valueOf(v1Var.S), java.lang.Integer.valueOf((int) r37));
        }
        r45.k76 k76Var2 = (r45.k76) hashMap.get(java.lang.Integer.valueOf(v1Var.S));
        xa4.b.f452821a.f("view_clk", g7(v1Var), v1Var, (k76Var2 != null && xa4.g.I() && xa4.g.i(java.lang.Integer.valueOf(k76Var2.f378476y))) ? false : r37);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        boolean z17 = (v1Var.field_commentflag & 2) > 0 ? r37 : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "skip goToCommentDetail, comment.isSnsDelFlag");
            this.f167268e.B(java.lang.String.valueOf(j17));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_COMMENT_TYPE", v1Var.field_type);
        int i19 = v1Var.field_type;
        if (i19 == 3 || i19 == 5) {
            intent.setClass(this, com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.class);
            intent.putExtra("INTENT_TALKER", v1Var.field_talker);
            try {
                intent.putExtra("INTENT_SOURCE", ((r45.k76) new r45.k76().parseFrom(v1Var.field_curActionBuf)).f378463i);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsMsgUI", e17, "", new java.lang.Object[0]);
            }
        } else {
            intent.putExtra("intent_show_bless_bubble", i19 == 22 ? r37 : false);
            intent.setClass(this, com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
        }
        int i27 = v1Var.field_type;
        if (i27 != 7 && i27 != 8 && i27 != 16) {
            intent.putExtra("INTENT_SNSID", com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", j17));
            str2 = str;
        } else {
            if (!com.tencent.mm.sdk.platformtools.f9.MomentAds.k(getContext(), null)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
            str2 = str;
            intent.putExtra("INTENT_SNSID", com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", j17));
            com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", j17));
            if (b17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "sns id " + j17 + "was not exist!");
                if (v1Var.field_type == 16) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 2);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
            int q17 = gm0.j1.u().c().q(14, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "current client version %s, [%s, %s]", java.lang.Integer.valueOf(q17), java.lang.Integer.valueOf(b17.getAdXml().clientMinVersion), java.lang.Integer.valueOf(b17.getAdXml().clientMaxVersion));
            if (q17 < b17.getAdXml().clientMinVersion || (b17.getAdXml().clientMaxVersion > 0 && q17 > b17.getAdXml().clientMaxVersion)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17.getAdXml().compatibleUrl)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsMsgUI", "compatible jump url is null!");
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", b17.getAdXml().compatibleUrl);
                    intent2.putExtra("showShare", false);
                    intent2.putExtra("show_bottom", false);
                    intent2.putExtra("needRedirect", false);
                    intent2.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent2, this);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
        }
        int i28 = v1Var.field_type;
        if (i28 == 2) {
            intent.putExtra("INTENT_FROMSUI", (boolean) r37);
            intent.putExtra("INTENT_FROMSUI_COMMENTID", v1Var.field_commentSvrID);
        } else if (i28 == 8 || i28 == 16) {
            intent.putExtra("INTENT_FROMSUI", (boolean) r37);
            intent.putExtra("INTENT_FROMSUI_COMMENTID", v1Var.field_commentSvrID);
        }
        if (this.f167268e.w(java.lang.String.valueOf(v1Var.field_snsID))) {
            intent.putExtra("INTENT_COMMENT_forbid_access", (boolean) r37);
        }
        intent.putExtra("intent_content_enable_show_access_view", (boolean) r37);
        startActivityForResult(intent, (int) r37);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public boolean m7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAllMsgFooter", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllMsgFooter", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return false;
    }

    public boolean n7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAlwaysEnableOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAlwaysEnableOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return false;
    }

    public boolean o7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return;
        }
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("result_forbid_access", false);
            long longExtra = intent.getLongExtra("result_access_sns_id", 0L);
            java.lang.String valueOf = java.lang.String.valueOf(longExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(valueOf) && longExtra != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onActivityResult: need forbid:%b, snsId:%s", java.lang.Boolean.valueOf(booleanExtra), valueOf);
                if (booleanExtra) {
                    this.f167268e.B(valueOf);
                } else {
                    com.tencent.mm.plugin.sns.ui.bm bmVar = this.f167268e;
                    bmVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markSnsIdEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                    ((java.util.HashMap) bmVar.f167960u).put(valueOf, 1);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markSnsIdEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                }
            }
            boolean booleanExtra2 = intent.getBooleanExtra("result_finish", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onActivityResult: isFinish=[%b]", java.lang.Boolean.valueOf(booleanExtra2));
            if (booleanExtra2) {
                finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
        }
        if (intent != null) {
            this.f167280t.a(intent.getIntExtra("sns_gallery_op_id", 0));
        }
        if (intent != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("sns_msg_forbid_access_snsid_list");
            this.D = stringArrayListExtra;
            if (stringArrayListExtra != null) {
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(next)) {
                        this.f167268e.B(next);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onBackPressed");
        if (this.B && com.tencent.mm.plugin.sns.model.l4.Aj().f() > 0) {
            com.tencent.mm.plugin.sns.model.l4.Aj().p1();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", this.f167280t);
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onCreate");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(210, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(683, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(218, this);
        this.f167275o = c01.z1.r();
        this.f167279s = com.tencent.mm.plugin.sns.model.l4.pj();
        this.f167276p = getIntent().getBooleanExtra("sns_msg_force_show_all", false);
        this.B = getIntent().getBooleanExtra("sns_msg_can_update_to_read", true);
        this.D = getIntent().getStringArrayListExtra("sns_msg_forbid_access_snsid_list");
        this.C = false;
        if (this.f167276p) {
            this.f167281u = true;
        }
        com.tencent.mm.plugin.sns.model.l4.Aj().add(this.L);
        setActionbarColor(getActionbarColor());
        initView();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.P = java.lang.System.currentTimeMillis();
        this.N = getIntent().getIntExtra("sns_msg_comment_list_scene", 0);
        if (com.tencent.mm.ui.bk.y()) {
            com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
            Aj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            Aj.f166157e = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            com.tencent.mm.plugin.sns.model.c3.I();
        }
        this.E.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarActionReporter", "setEntranceType >> 2");
        ta4.g1.f416748b = 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String r17 = c01.z1.r();
        java.lang.String format = java.lang.String.format("%s", java.lang.Long.valueOf(c01.id.a() / 1000));
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.K(r17, 7, "MomentsUnreadMsgStatus", format);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        com.tencent.mm.plugin.sns.storage.v1 v1Var = (com.tencent.mm.plugin.sns.storage.v1) this.f167268e.getItem(adapterContextMenuInfo.position);
        if (v1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return;
        }
        this.I = v1Var.S;
        this.f167266J = v1Var.field_snsID;
        try {
            r45.k76 k76Var = (r45.k76) new r45.k76().parseFrom(v1Var.field_curActionBuf);
            if (k76Var != null) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) this.f167279s).n(k76Var.f378458d, true);
                java.lang.String g27 = n17 != null ? n17.g2() : !com.tencent.mm.sdk.platformtools.t8.K0(k76Var.f378460f) ? k76Var.f378460f : k76Var.f378458d;
                if (g27 == null) {
                    g27 = "";
                }
                contextMenu.setHeaderTitle(g27);
                if (v1Var.field_isSilence == 0) {
                    contextMenu.add(adapterContextMenuInfo.position, 1, 1, getString(com.tencent.mm.R.string.hbt));
                } else {
                    contextMenu.add(adapterContextMenuInfo.position, 2, 1, getString(com.tencent.mm.R.string.hbs));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsMsgUI", e17, "", new java.lang.Object[0]);
        }
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, getString(com.tencent.mm.R.string.f490367t0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.lang.String str;
        java.lang.String str2;
        long j17;
        java.util.HashMap hashMap3;
        java.util.Iterator it;
        boolean z17;
        java.lang.String str3 = "onDestroy";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.Q = super.getActivityBrowseTimeMs();
        if (com.tencent.mm.plugin.sns.model.l4.Aj().f() > 0 && this.B && o7()) {
            com.tencent.mm.plugin.sns.model.l4.Aj().p1();
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.q(210, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(683, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(218, this);
        com.tencent.mm.plugin.sns.model.l4.Aj().remove(this.L);
        this.f167268e.c();
        com.tencent.mm.plugin.sns.model.l4.hj().N(this);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167282v;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f167282v = null;
        }
        java.lang.String str4 = "reportBrowseMsgListInfo";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportBrowseMsgListInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.HashMap hashMap4 = this.V;
        java.util.Iterator it6 = hashMap4.values().iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            boolean hasNext = it6.hasNext();
            hashMap = this.X;
            hashMap2 = this.W;
            str = str3;
            java.lang.String str5 = "";
            str2 = str4;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.sns.storage.v1 v1Var = (com.tencent.mm.plugin.sns.storage.v1) it6.next();
            if (v1Var != null) {
                it = it6;
                j17 = elapsedRealtime;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                hashMap3 = hashMap4;
                if (v1Var.field_isRead == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                    z17 = false;
                }
                if (!z17) {
                    int i27 = v1Var.field_type;
                    if (i27 == 1) {
                        i18++;
                    } else if (i27 == 2) {
                        i17++;
                    }
                }
                int i28 = i17;
                int intValue = hashMap2.containsKey(java.lang.Integer.valueOf(v1Var.S)) ? ((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(v1Var.S))).intValue() : 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createCommentJson", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                r45.k76 k76Var = (r45.k76) hashMap.get(java.lang.Integer.valueOf(v1Var.S));
                boolean z19 = (k76Var != null && xa4.g.I() && xa4.g.i(java.lang.Integer.valueOf(k76Var.f378476y))) ? false : true;
                int i29 = v1Var.field_msgRelevanceType == 1 ? 1 : 0;
                cl0.g gVar = new cl0.g();
                try {
                    gVar.h("fid", g7(v1Var));
                    gVar.o("cid", v1Var.S);
                    gVar.h("usr", v1Var.field_talker);
                    gVar.o("type", v1Var.field_type);
                    gVar.o("ig", v1Var.field_isSilence);
                    gVar.o("is_expired", z19 ? 1 : 0);
                    gVar.o("is_relate", i29);
                    if (intValue > 0) {
                        gVar.o("click", intValue);
                    }
                    if (v1Var.field_type == 2) {
                        r45.e86 r17 = com.tencent.mm.plugin.sns.ui.widget.q2.r(v1Var);
                        gVar.o("CommentType", r17.f373144y);
                        gVar.o("cmt_text_length", android.text.TextUtils.isEmpty(r17.f373130h) ? 0 : r17.f373130h.length());
                    }
                    str5 = gVar.toString().replaceAll(",", ";");
                } catch (cl0.f e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUI", "browseJson, json error:" + e17.getMessage());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createCommentJson", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(";");
                    stringBuffer.append(str5);
                } else {
                    stringBuffer.append(str5);
                }
                i17 = i28;
            } else {
                j17 = elapsedRealtime;
                hashMap3 = hashMap4;
                it = it6;
            }
            i19++;
            str3 = str;
            str4 = str2;
            it6 = it;
            elapsedRealtime = j17;
            hashMap4 = hashMap3;
        }
        long j18 = elapsedRealtime;
        java.util.HashMap hashMap5 = hashMap4;
        if (this.f167277q == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "create empty stopRemindReportInfo");
            this.f167277q = new gc4.i(false, "");
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsMsgListActionStruct snsMsgListActionStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsMsgListActionStruct();
        snsMsgListActionStruct.f60627j = this.P;
        snsMsgListActionStruct.f60621d = this.N;
        snsMsgListActionStruct.f60624g = this.Q;
        snsMsgListActionStruct.f60625h = this.R;
        snsMsgListActionStruct.f60626i = this.S;
        snsMsgListActionStruct.f60633p = this.T;
        snsMsgListActionStruct.f60634q = this.U;
        snsMsgListActionStruct.f60623f = i17;
        snsMsgListActionStruct.f60622e = i18;
        gc4.i iVar = this.f167277q;
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBlockNotifyEduFlag", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBlockNotifyEduFlag", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        snsMsgListActionStruct.f60629l = iVar.f270456a ? 1L : 0L;
        gc4.i iVar2 = this.f167277q;
        iVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEduTriggerFeedid", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEduTriggerFeedid", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        snsMsgListActionStruct.f60630m = snsMsgListActionStruct.b("EduTriggerFeedid", iVar2.f270457b, true);
        snsMsgListActionStruct.f60628k = snsMsgListActionStruct.b("BrowseJson", "[" + stringBuffer.toString() + "]", true);
        snsMsgListActionStruct.f60631n = this.Y ? 1L : 0L;
        snsMsgListActionStruct.f60632o = com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr.X6().booleanValue() ? 1L : 0L;
        snsMsgListActionStruct.k();
        hashMap5.clear();
        hashMap2.clear();
        hashMap.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "reportBrowseMsgListInfo debugLog [%d] cost[%d]", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j18));
        snsMsgListActionStruct.n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        Aj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Aj.f166157e = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        this.A = null;
        this.E.dead();
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        kj.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollEnable(), this.f167278r);
        this.f167278r = 0;
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onPause");
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f232817n) != null) {
            this.G = java.lang.Math.max(0L, ((int) mVar.f308243e) - this.G);
        }
        this.H = com.tencent.mm.sdk.platformtools.t8.i1() > this.H ? com.tencent.mm.sdk.platformtools.t8.i1() - this.H : 1L;
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().reportFPS(705, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollAction(), 1, this.G, this.H);
        this.G = 0L;
        this.H = 0L;
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        kj.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.H = com.tencent.mm.sdk.platformtools.t8.i1();
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f232817n) != null) {
            this.G = (int) mVar.f308243e;
        }
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.c();
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onResume");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fd, code lost:
    
        if (r7.booleanValue() != false) goto L38;
     */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, com.tencent.mm.modelbase.m1 r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsMsgUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.f167268e.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void p7() {
        int t17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onListFooterClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (com.tencent.mm.plugin.sns.model.l4.Aj().f() > 0) {
            if (this.B) {
                com.tencent.mm.plugin.sns.model.l4.Aj().p1();
            }
            this.C = true;
            t17 = !this.f167268e.H() ? 1 : 0;
        } else {
            t17 = this.f167268e.t();
        }
        this.f167268e.onNotifyChange(null, null);
        if (!this.f167281u) {
            if (this.f167269f.getParent() != null) {
                this.f167267d.removeFooterView(this.f167269f);
            }
            if (this.f167270g.getParent() == null && t17 > 0) {
                this.f167267d.addFooterView(this.f167270g);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "add mLoadingFooterView");
            }
        }
        this.f167281u = true;
        android.view.View view = this.f167269f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "onListFooterClick", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "onListFooterClick", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListFooterClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public final void q7(com.tencent.mm.plugin.sns.storage.v1 v1Var, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestCheckVisibility", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j17 = v1Var.field_snsID;
        com.tencent.mm.plugin.sns.model.p2 p2Var = new com.tencent.mm.plugin.sns.model.p2(j17);
        p2Var.f164573g = true;
        p2Var.f164574h = v1Var;
        p2Var.f164575i = z18;
        if (z17) {
            this.f167283w = db5.e1.Q(this, "", getContext().getResources().getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.sns.ui.ll(this, p2Var));
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(p2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "requestCheckVisibility: feedId=%s, showLoading=%b, fromPhotoClick:%b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestCheckVisibility", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void r7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        setBackBtn(new com.tencent.mm.plugin.sns.ui.ul(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void s7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEmptyViewForClearMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.f167267d.setVisibility(8);
        android.view.View view = this.f167274n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "setEmptyViewForClearMsg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "setEmptyViewForClearMsg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.Y = true;
        enableOptionMenu(n7());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEmptyViewForClearMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void t7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.f167267d.setBackground(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }
}
