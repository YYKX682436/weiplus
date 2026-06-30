package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class AllRemindMsgUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f196568i = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f196569d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f196570e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f196571f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.h0 f196572g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f196573h;

    static {
        new jt0.j(32);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487997dw;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.hy_);
        this.f196569d = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f482941sf);
        this.f196570e = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.lbl);
        this.f196571f = findViewById(com.tencent.mm.R.id.h0g);
        this.f196569d.setVisibility(8);
        this.f196569d.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        com.tencent.mm.ui.h0 h0Var = new com.tencent.mm.ui.h0(this);
        this.f196572g = h0Var;
        this.f196569d.setAdapter(h0Var);
        this.f196572g.registerAdapterDataObserver(new com.tencent.mm.ui.f0(this));
        setBackBtn(new com.tencent.mm.ui.g0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(795L, 3L, 1L, false);
        initView();
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.AllRemindMsgUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.ui.AllRemindMsgUI.f196568i;
                final com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI = com.tencent.mm.ui.AllRemindMsgUI.this;
                kotlinx.coroutines.y0 lifecycleScope = allRemindMsgUI.getLifecycleAsyncScope();
                yz5.r rVar = new yz5.r() { // from class: com.tencent.mm.ui.AllRemindMsgUI$$b
                    @Override // yz5.r
                    public final java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        final com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI2 = com.tencent.mm.ui.AllRemindMsgUI.this;
                        java.lang.Integer num = (java.lang.Integer) obj;
                        java.lang.Integer num2 = (java.lang.Integer) obj2;
                        java.lang.String str = (java.lang.String) obj3;
                        final java.util.LinkedList linkedList = (java.util.LinkedList) obj4;
                        int i18 = com.tencent.mm.ui.AllRemindMsgUI.f196568i;
                        allRemindMsgUI2.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, errType: s, errCode: %s, errMsg: %s", num, num2, str);
                        if (num.intValue() == 0 && num2.intValue() == 0) {
                            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.AllRemindMsgUI$$c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI3 = com.tencent.mm.ui.AllRemindMsgUI.this;
                                    java.util.LinkedList linkedList2 = linkedList;
                                    int i19 = com.tencent.mm.ui.AllRemindMsgUI.f196568i;
                                    allRemindMsgUI3.getClass();
                                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                                    if (linkedList2 != null) {
                                        java.util.Iterator it = linkedList2.iterator();
                                        while (it.hasNext()) {
                                            r45.lo5 lo5Var = (r45.lo5) it.next();
                                            com.tencent.mm.ui.o0 o0Var = new com.tencent.mm.ui.o0(allRemindMsgUI3);
                                            o0Var.f209442i = lo5Var;
                                            o0Var.f209437d = lo5Var.f379677f * 1000;
                                            int i27 = lo5Var.f379678g;
                                            o0Var.f209438e = i27;
                                            o0Var.f209443j = lo5Var.f379675d;
                                            if (i27 == 1) {
                                                r45.wq4 wq4Var = new r45.wq4();
                                                try {
                                                    wq4Var.parseFrom(lo5Var.f379679h.f192156a);
                                                } catch (java.io.IOException e17) {
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, %s", e17.toString());
                                                }
                                                o0Var.f209436c = wq4Var.f389388d;
                                                java.lang.String str2 = wq4Var.f389390f;
                                                o0Var.f209434a = str2;
                                                o0Var.f209439f = wq4Var.f389391g;
                                                if (str2 != null) {
                                                    if (com.tencent.mm.storage.z3.R4(str2)) {
                                                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(o0Var.f209434a, true);
                                                        if (n17 != null) {
                                                            o0Var.f209435b = com.tencent.mm.sdk.platformtools.t8.K0(n17.w0()) ? n17.P0() : n17.w0();
                                                        }
                                                        o0Var.f209435b = com.tencent.mm.sdk.platformtools.t8.K0(o0Var.f209435b) ? allRemindMsgUI3.getString(com.tencent.mm.R.string.b5v) : o0Var.f209435b;
                                                    } else {
                                                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(o0Var.f209434a, true);
                                                        o0Var.f209435b = n18.g2() == null ? n18.f2() : n18.g2();
                                                    }
                                                }
                                            } else if (i27 == 2) {
                                                r45.cq0 cq0Var = new r45.cq0();
                                                try {
                                                    cq0Var.parseFrom(lo5Var.f379679h.f192156a);
                                                } catch (java.io.IOException e18) {
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, %s", e18.toString());
                                                }
                                                o0Var.f209436c = cq0Var.f371780d;
                                                o0Var.f209440g = cq0Var.f371782f;
                                                o0Var.f209441h = cq0Var.f371783g;
                                            }
                                            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, getRemind:%s", o0Var);
                                            linkedList3.add(o0Var);
                                        }
                                        allRemindMsgUI3.f196573h = linkedList3;
                                    }
                                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.AllRemindMsgUI$$d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI4 = com.tencent.mm.ui.AllRemindMsgUI.this;
                                            allRemindMsgUI4.f196569d.setVisibility(0);
                                            allRemindMsgUI4.f196570e.setVisibility(8);
                                            allRemindMsgUI4.f196572g.notifyDataSetChanged();
                                        }
                                    });
                                }
                            }, "MicroMsg.emoji.AllRemindMsgUIGetRemindCgi");
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, errType: %s, errCode: %s, errMsg: %s", num, num2, str);
                            allRemindMsgUI2.f196569d.setVisibility(0);
                            allRemindMsgUI2.f196570e.setVisibility(8);
                        }
                        return jz5.f0.f302826a;
                    }
                };
                kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
                kotlinx.coroutines.l.d(lifecycleScope, null, null, new com.tencent.mm.modelsimple.w(rVar, null), 3, null);
            }
        }, "load remind data!");
    }
}
