package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/plugin/textstatus/convert/topic/f0;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/ce", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusOtherTopicFriendsActivity extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.plugin.textstatus.convert.topic.f0 {

    /* renamed from: z, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.ce f173656z = new com.tencent.mm.plugin.textstatus.ui.ce(null);

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f173660g;

    /* renamed from: h, reason: collision with root package name */
    public int f173661h;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f173666p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f173667q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f173668r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f173669s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f173670t;

    /* renamed from: u, reason: collision with root package name */
    public long f173671u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1 f173672v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f173673w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f173674x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.a f173675y;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f173657d = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.bf(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f173658e = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.af(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f173659f = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.me(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f173662i = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.cf(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f173663m = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.ze(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f173664n = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.fe(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f173665o = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.je(this));

    /* JADX WARN: Type inference failed for: r1v7, types: [com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1] */
    public TextStatusOtherTopicFriendsActivity() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f173666p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusExpandMiniCardEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$expandCallback$1
            {
                this.__eventId = -786997033;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusExpandMiniCardEvent statusExpandMiniCardEvent) {
                java.util.ArrayList arrayList;
                com.tencent.mm.autogen.events.StatusExpandMiniCardEvent event = statusExpandMiniCardEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54865g.f8226a;
                com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.this;
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = textStatusOtherTopicFriendsActivity.f173670t;
                if (mvvmList != null && (arrayList = mvvmList.f152065o) != null) {
                    kotlin.jvm.internal.o.d(str);
                    try {
                        if (!r26.n0.N(str)) {
                            new com.tencent.mm.plugin.textstatus.ui.ie(textStatusOtherTopicFriendsActivity, str, arrayList).run();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", th6, "handleMiniCardExpand Error", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        };
        this.f173667q = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.le(this));
        this.f173668r = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.df(this));
        this.f173669s = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.ke(this));
        this.f173672v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1
            {
                this.__eventId = 484873098;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent statusCardFeedItemScrollEvent) {
                com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent event = statusCardFeedItemScrollEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54864g.f8141a;
                com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.this;
                com.tencent.mm.plugin.textstatus.ui.he heVar = new com.tencent.mm.plugin.textstatus.ui.he(textStatusOtherTopicFriendsActivity, str);
                com.tencent.mm.plugin.textstatus.ui.ce ceVar = com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.f173656z;
                textStatusOtherTopicFriendsActivity.getClass();
                heVar.run();
                return false;
            }
        };
        this.f173673w = true;
        this.f173675y = new com.tencent.mm.plugin.textstatus.ui.ne(this);
    }

    public static final android.widget.LinearLayout U6(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        java.lang.Object value = ((jz5.n) textStatusOtherTopicFriendsActivity.f173669s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    public static final void V6(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity, long j17) {
        textStatusOtherTopicFriendsActivity.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", "goToSetTextStatus: ");
        bi4.d1 d1Var = new bi4.d1();
        d1Var.f354942i = j17;
        d1Var.f354941h = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Bi();
        java.lang.String a17 = en1.a.a();
        java.lang.String str = d1Var.f354941h;
        kotlin.jvm.internal.o.d(a17);
        kotlin.jvm.internal.o.d(str);
        qj4.l lVar = new qj4.l(a17, false, j17, null, str, null, null, 40, null);
        bi4.o1.f21075a.b(textStatusOtherTopicFriendsActivity.getContext(), d1Var, 1001);
        qj4.s.f363958a.u(lVar);
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView W6() {
        java.lang.Object value = ((jz5.n) this.f173657d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    public final int X6() {
        return ((java.lang.Number) ((jz5.n) this.f173662i).getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.czy;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            if (i17 == 1001) {
                if (!bi4.v1.l()) {
                    finish();
                }
                this.f173674x = true;
            } else if (i17 == 1002 && bi4.v1.i()) {
                if (intent != null ? intent.getBooleanExtra("VALUE_EXIT_HAS_GO_EDIT", false) : false) {
                    this.f173674x = true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$onCreate$dataList$1, com.tencent.mm.plugin.mvvmlist.MvvmList] */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.sdk.event.IListener iListener;
        super.onCreate(bundle);
        alive();
        if (bi4.v1.i() && (iListener = this.f173666p) != null) {
            iListener.alive();
        }
        this.f173671u = c01.id.c();
        setBackBtn(new com.tencent.mm.plugin.textstatus.ui.pe(this));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setMMTitle(com.tencent.mm.R.string.f493370jx1);
        di4.j jVar = di4.j.f232790a;
        boolean a17 = jVar.a();
        qj4.s sVar = qj4.s.f363958a;
        if (a17) {
            setActionbarColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478490b));
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.textstatus.ui.qe(this));
            java.lang.String a18 = en1.a.a();
            kotlin.jvm.internal.o.d(a18);
            sVar.v(new qj4.l(a18, false, 17L, null, null, null, null, 120, null));
        } else {
            addTextOptionMenu(0, getResources().getString(com.tencent.mm.R.string.f493369jx0), new com.tencent.mm.plugin.textstatus.ui.re(this), null, com.tencent.mm.ui.fb.BLUE_TEXT_MEDIUM);
            java.lang.String a19 = en1.a.a();
            kotlin.jvm.internal.o.d(a19);
            sVar.v(new qj4.l(a19, false, 16L, null, null, null, null, 120, null));
        }
        java.lang.String stringExtra = getIntent().getStringExtra("exclude_topic_id");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a27 = zVar.a(this).a(com.tencent.mm.plugin.textstatus.ui.ac.class);
        kotlin.jvm.internal.o.f(a27, "get(...)");
        com.tencent.mm.plugin.textstatus.ui.ac acVar = (com.tencent.mm.plugin.textstatus.ui.ac) a27;
        W6().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
        final ij4.o oVar = new ij4.o(this, stringExtra, X6(), ((java.lang.Number) ((jz5.n) this.f173663m).getValue()).longValue(), ((java.lang.Number) ((jz5.n) this.f173664n).getValue()).intValue(), ((java.lang.Boolean) ((jz5.n) this.f173665o).getValue()).booleanValue());
        final xm3.n0 n0Var = new xm3.n0();
        ?? r17 = new com.tencent.mm.plugin.mvvmlist.MvvmList<nj4.i>(oVar, this, n0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$onCreate$dataList$1
        };
        this.f173670t = r17;
        r17.f152071u.observe(this, new com.tencent.mm.plugin.textstatus.ui.ve(this, r17));
        final int X6 = X6();
        com.tencent.mm.plugin.textstatus.ui.we weVar = new com.tencent.mm.plugin.textstatus.ui.we(r17, new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$buildItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type != -3 ? type != -2 ? type != 2 ? type != 3 ? type != 5 ? type != 6 ? bi4.v1.i() ? new com.tencent.mm.plugin.textstatus.convert.topic.q(X6, com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.this) : new com.tencent.mm.plugin.textstatus.convert.topic.y0(X6) : new com.tencent.mm.plugin.textstatus.convert.topic.l0(X6, com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.this) : new com.tencent.mm.plugin.textstatus.convert.topic.n0(X6) : new com.tencent.mm.plugin.textstatus.convert.topic.b0() : new com.tencent.mm.plugin.textstatus.convert.topic.e0() : new com.tencent.mm.plugin.textstatus.convert.topic.c(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.this.f173675y) : new pi4.a();
            }
        });
        acVar.f173728f = weVar;
        weVar.setHasStableIds(true);
        W6().setAdapter(acVar.f173728f);
        W6().setAnimation(null);
        androidx.recyclerview.widget.n2 itemAnimator = W6().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        W6().setItemAnimator(null);
        boolean a28 = jVar.a();
        jz5.g gVar = this.f173658e;
        if (a28) {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.widget.RelativeLayout) value).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478490b));
        } else {
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.widget.RelativeLayout) value2).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        W6().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        if (bi4.v1.i()) {
            boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusStrengthenHistory()) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopicExptConfig", "getTopicStrengthHistoryEntrance >> " + z17);
            int i17 = z17 ? 2 : 0;
            com.tencent.mm.plugin.textstatus.convert.topic.y yVar = new com.tencent.mm.plugin.textstatus.convert.topic.y(i17, 4);
            yVar.f173391g = new com.tencent.mm.plugin.textstatus.ui.de(this);
            yVar.f173392h = new com.tencent.mm.plugin.textstatus.ui.ee(this);
            W6().N(yVar);
            W6().P(new com.tencent.mm.plugin.textstatus.convert.topic.a0(this, W6(), i17));
        }
        int b17 = (((com.tencent.mm.ui.bh.a(this).f197135a - (i65.a.b(this, 24) * 2)) - i65.a.b(this, 32)) - i65.a.b(this, 24)) / (i65.a.b(this, 8) + i65.a.b(this, 32));
        ((com.tencent.mm.plugin.textstatus.ui.yd) zVar.a(this).a(com.tencent.mm.plugin.textstatus.ui.yd.class)).getClass();
        com.tencent.mm.plugin.textstatus.ui.mg mgVar = (com.tencent.mm.plugin.textstatus.ui.mg) component(com.tencent.mm.plugin.textstatus.ui.mg.class);
        com.tencent.mm.view.recyclerview.WxRecyclerView W6 = W6();
        mgVar.getClass();
        mgVar.f174108e = W6;
        W6.setOnTouchListener(new com.tencent.mm.plugin.textstatus.ui.lg(mgVar));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TextStatusOtherTopicFriendsActivity)).Rj(this, iy1.a.TextState);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.sdk.event.IListener iListener;
        qj4.s.n(qj4.s.f363958a, 9L, null, 0, null, null, null, 0, c01.id.c() - this.f173671u, 0L, null, null, null, null, null, 16254, null);
        super.onDestroy();
        dead();
        if (bi4.v1.i() && (iListener = this.f173666p) != null) {
            iListener.dead();
        }
        com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p.clear();
        ej4.d0 d0Var = ej4.e0.f253344c;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopicSelfItemHelper", "clearCache");
        ej4.e0.f253347f.clear();
        ej4.e0.f253346e.clear();
        ej4.e0.f253348g = "";
        if (bi4.v1.i()) {
            java.util.HashSet hashSet = (java.util.HashSet) ((com.tencent.mm.plugin.textstatus.ui.od) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.textstatus.ui.od.class)).f174152d;
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((bi4.n0) it.next()).c();
            }
            hashSet.clear();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (bi4.v1.i()) {
            if (this.f173674x) {
                pm0.v.O("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", new com.tencent.mm.plugin.textstatus.ui.ye(this));
                this.f173674x = false;
                return;
            }
            return;
        }
        if (!this.f173673w) {
            pm0.v.O("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", new com.tencent.mm.plugin.textstatus.ui.xe(this));
        }
        if (this.f173673w) {
            this.f173673w = false;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.textstatus.ui.yd.class);
        set.add(com.tencent.mm.plugin.textstatus.ui.ac.class);
        set.add(com.tencent.mm.plugin.textstatus.ui.k2.class);
        set.add(qj4.t.class);
        set.add(com.tencent.mm.plugin.textstatus.ui.mg.class);
        set.add(com.tencent.mm.plugin.textstatus.ui.kd.class);
        set.add(com.tencent.mm.plugin.textstatus.ui.od.class);
    }
}
