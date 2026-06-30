package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class BizContactEntranceView extends android.widget.RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f206320n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f206321d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f206322e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f206323f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f206324g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f206325h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f206326i;

    /* renamed from: m, reason: collision with root package name */
    public final int f206327m;

    public BizContactEntranceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f206322e = null;
        this.f206326i = true;
        this.f206327m = 251658241;
        this.f206321d = context;
        a();
        setStatus(true);
    }

    private void setStatus(final boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.ui.contact.BizContactEntranceView$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17;
                long j17;
                final com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = com.tencent.mm.ui.contact.BizContactEntranceView.this;
                final boolean z18 = z17;
                int i18 = com.tencent.mm.ui.contact.BizContactEntranceView.f206320n;
                bizContactEntranceView.getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                r01.x cj6 = r01.q3.cj();
                int i19 = bizContactEntranceView.f206327m;
                cj6.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("select count(bizinfo.username) from rcontact, bizinfo where rcontact.username = bizinfo.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0  and bizinfo.type = ");
                com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
                sb6.append(i19);
                java.lang.Object[] objArr = {"gh_43f2581f6fd6", "schedule_message", "gh_3dfda90e39d6", "gh_b4af18eac3d5", "gh_f0a92aa7146c", "gh_e087bb5b95e6", "gh_579db1f2cf89", "weixin", "gh_9639b5a92773"};
                java.util.ArrayList arrayList = new java.util.ArrayList(9);
                for (int i27 = 0; i27 < 9; i27++) {
                    java.lang.Object obj = objArr[i27];
                    java.util.Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                cj6.y0(sb6, java.util.Collections.unmodifiableList(arrayList));
                com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getServiceBizCount, %s", sb6.toString());
                android.database.Cursor rawQuery = cj6.rawQuery(sb6.toString(), new java.lang.String[0]);
                if (rawQuery != null) {
                    int i28 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
                    rawQuery.close();
                    i17 = i28;
                } else {
                    i17 = 0;
                }
                bizContactEntranceView.f206326i = i17 > 0;
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.contact.BizContactEntranceView$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView2 = com.tencent.mm.ui.contact.BizContactEntranceView.this;
                        android.view.View view = bizContactEntranceView2.f206323f;
                        int i29 = bizContactEntranceView2.f206326i ? 0 : 8;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(java.lang.Integer.valueOf(i29));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/contact/BizContactEntranceView", "lambda$setStatus$0", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/ui/contact/BizContactEntranceView", "lambda$setStatus$0", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        bizContactEntranceView2.setVisible(z18);
                    }
                });
                if (bizContactEntranceView.f206326i) {
                    r01.x cj7 = r01.q3.cj();
                    cj7.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getLastNewBizUpdateTime, sql %s", "select updateTime from BizInfo where type = 1 and status = 1 ORDER BY updateTime DESC");
                    android.database.Cursor rawQuery2 = cj7.rawQuery("select updateTime from BizInfo where type = 1 and status = 1 ORDER BY updateTime DESC", new java.lang.String[0]);
                    if (rawQuery2 != null) {
                        if (rawQuery2.moveToFirst()) {
                            j17 = rawQuery2.getLong(0);
                            rawQuery2.close();
                            final long p17 = com.tencent.mm.sdk.platformtools.t8.p1(c01.d9.b().p().l(233473, null), 0L);
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizContactEntranceView", "last updateTime %d, enterTime %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(p17));
                            final long j18 = j17;
                            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable(j18, p17) { // from class: com.tencent.mm.ui.contact.BizContactEntranceView$$c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.tencent.mm.ui.contact.BizContactEntranceView.this.f206324g.setVisibility(4);
                                }
                            });
                        } else {
                            rawQuery2.close();
                        }
                    }
                    j17 = 0;
                    final long p172 = com.tencent.mm.sdk.platformtools.t8.p1(c01.d9.b().p().l(233473, null), 0L);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizContactEntranceView", "last updateTime %d, enterTime %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(p172));
                    final long j182 = j17;
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable(j182, p172) { // from class: com.tencent.mm.ui.contact.BizContactEntranceView$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.ui.contact.BizContactEntranceView.this.f206324g.setVisibility(4);
                        }
                    });
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BizContactEntranceView", "biz contact Count %d, isEntranceShow %s, setStatus cost %d", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(bizContactEntranceView.f206326i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
        });
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488215kr, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cg7);
        this.f206322e = findViewById;
        this.f206323f = findViewById.findViewById(com.tencent.mm.R.id.ajz);
        this.f206325h = (android.widget.LinearLayout) this.f206322e.findViewById(com.tencent.mm.R.id.f483424as2);
        android.view.ViewGroup.LayoutParams layoutParams = this.f206323f.getLayoutParams();
        layoutParams.height = (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479613ao) * i65.a.A(getContext()));
        this.f206323f.setLayoutParams(layoutParams);
        android.view.View view = this.f206322e;
        int i17 = this.f206327m;
        tf5.m.O6(view, i17 == 1 ? 6 : 5);
        this.f206322e.setOnClickListener(new com.tencent.mm.ui.contact.k0(this));
        this.f206323f.setOnTouchListener(new com.tencent.mm.ui.contact.l0(this));
        com.tencent.mm.ui.base.MaskLayout maskLayout = (com.tencent.mm.ui.base.MaskLayout) this.f206323f.findViewById(com.tencent.mm.R.id.ajy);
        java.lang.String str = i17 == 0 ? "officialaccounts" : "service_officialaccounts";
        if (((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).bj(str)) {
            ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).Di((android.widget.ImageView) maskLayout.getContentView(), str);
        } else {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView = (android.widget.ImageView) maskLayout.getContentView();
            ((com.tencent.mm.feature.avatar.w) zVar).getClass();
            com.tencent.mm.pluginsdk.ui.u.a(imageView, str);
        }
        this.f206324g = (android.widget.TextView) maskLayout.findViewById(com.tencent.mm.R.id.o_u);
        if (i17 == 1) {
            ((android.widget.TextView) this.f206322e.findViewById(com.tencent.mm.R.id.sny)).setText(getContext().getString(com.tencent.mm.R.string.me9));
        }
    }

    public void b(boolean z17) {
        setStatus(z17);
    }

    public void c(boolean z17) {
        android.view.View view = this.f206323f;
        if (view == null || this.f206325h == null) {
            return;
        }
        android.content.Context context = this.f206321d;
        if (!z17) {
            view.setBackground(null);
            this.f206325h.setBackground(com.tencent.mm.ui.zk.d(context, com.tencent.mm.R.attr.f478322gp));
        } else {
            int paddingLeft = view.getPaddingLeft();
            this.f206323f.setBackground(com.tencent.mm.ui.zk.d(context, com.tencent.mm.R.attr.f478322gp));
            this.f206323f.setPadding(paddingLeft, 0, 0, 0);
            this.f206325h.setBackground(null);
        }
    }

    public void setVisible(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizContactEntranceView", "setVisible visible = %s, isEntranceShow = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f206326i));
        android.view.View view = this.f206322e;
        int i17 = (z17 && this.f206326i) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/BizContactEntranceView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/BizContactEntranceView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public BizContactEntranceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206322e = null;
        this.f206326i = true;
        this.f206327m = 251658241;
        this.f206321d = context;
        a();
        setStatus(true);
    }

    public BizContactEntranceView(android.content.Context context, int i17) {
        super(context);
        this.f206322e = null;
        this.f206326i = true;
        this.f206327m = 251658241;
        this.f206321d = context;
        this.f206327m = i17;
        a();
        setStatus(true);
    }
}
