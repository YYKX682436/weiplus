package yn1;

/* loaded from: classes11.dex */
public final class a0 extends s35.b implements yn1.m {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f463596m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f463597n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f463598o;

    /* renamed from: p, reason: collision with root package name */
    public yn1.x f463599p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.backup.migration.MigrationBanner$entryEventListener$1 f463600q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.backup.migration.MigrationBanner$entryEventListener$1, com.tencent.mm.sdk.event.IListener] */
    public a0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        yn1.x xVar = yn1.x.f463909d;
        this.f463599p = xVar;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r17 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MigrationBannerEntryEvent>(a0Var) { // from class: com.tencent.mm.plugin.backup.migration.MigrationBanner$entryEventListener$1
            {
                this.__eventId = 762628434;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MigrationBannerEntryEvent migrationBannerEntryEvent) {
                com.tencent.mm.autogen.events.MigrationBannerEntryEvent event = migrationBannerEntryEvent;
                kotlin.jvm.internal.o.g(event, "event");
                boolean z17 = ((yn1.s) ((mv.v) i95.n0.c(mv.v.class))).f463819g;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[entryEventListener] showType=");
                yn1.a0 a0Var2 = yn1.a0.this;
                sb6.append(a0Var2.f463599p);
                sb6.append(", shouldShowBanner=");
                sb6.append(z17);
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationBanner", sb6.toString());
                if (z17) {
                    if (a0Var2.f463599p == yn1.x.f463911f) {
                        return false;
                    }
                    a0Var2.f463599p = yn1.x.f463910e;
                    a0Var2.i();
                    return false;
                }
                if (a0Var2.f463599p == yn1.x.f463910e) {
                    a0Var2.f463599p = yn1.x.f463909d;
                }
                if (a0Var2.f463599p == yn1.x.f463911f || !a0Var2.f402844i) {
                    return false;
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = a0Var2.f463598o;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("closeIcon");
                    throw null;
                }
                weImageView.setVisibility(4);
                a0Var2.d();
                return false;
            }
        };
        this.f463600q = r17;
        yn1.z0.f463933a.q(this);
        if (((yn1.s) ((mv.v) i95.n0.c(mv.v.class))).f463819g) {
            this.f463599p = yn1.x.f463910e;
        } else {
            this.f463599p = xVar;
        }
        r17.alive();
    }

    @Override // yn1.m
    public void E2() {
        this.f463599p = yn1.x.f463911f;
        i();
    }

    @Override // s35.b
    public void a() {
        yn1.z0.f463933a.u(this);
        dead();
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.f488174jk;
    }

    @Override // s35.b
    public int c() {
        return 3;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationBanner", "[onInitializeView] innerView=" + view);
        if (view == null) {
            return;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ac7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f463596m = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ac6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f463597n = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.close_icon);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f463598o = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        view.setOnClickListener(new yn1.y(this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f463598o;
        if (weImageView != null) {
            weImageView.setOnClickListener(yn1.z.f463932d);
        } else {
            kotlin.jvm.internal.o.o("closeIcon");
            throw null;
        }
    }

    @Override // s35.b
    public boolean i() {
        jz5.l lVar;
        java.lang.String string;
        int ordinal = this.f463599p.ordinal();
        if (ordinal == 0) {
            d();
            return false;
        }
        int i17 = com.tencent.mm.R.raw.icons_outlined_move_to_cellphone;
        boolean z17 = true;
        if (ordinal == 1) {
            f();
            k(0);
            android.widget.TextView textView = this.f463596m;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492537o95));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f463597n;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("bannerIcon");
                throw null;
            }
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_move_to_cellphone);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f463598o;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
                return true;
            }
            kotlin.jvm.internal.o.o("closeIcon");
            throw null;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        yn1.z0 z0Var = yn1.z0.f463933a;
        boolean n17 = z0Var.n();
        bw5.l0 l0Var = bw5.l0.AFFMIG_PC;
        if (!n17 || (z0Var.h() != l0Var && (z0Var.l() || z0Var.i() == bw5.bj0.NOTIFY_CODE_NONE))) {
            z17 = false;
        }
        if (!z17) {
            d();
            return false;
        }
        bw5.bj0 i18 = z0Var.i();
        boolean l17 = z0Var.l();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        switch (i18.ordinal()) {
            case 0:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
                com.tencent.mars.xlog.Log.w("MM.Mig.MigrationBanner", "hidden banner because status=" + i18);
                lVar = new jz5.l(java.lang.Boolean.FALSE, "");
                break;
            case 1:
            case 7:
            case 10:
            case 11:
            case 15:
                lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.tencent.mm.R.string.o98 : com.tencent.mm.R.string.o9g));
                break;
            case 2:
            case 8:
            case 18:
                bw5.o0 o0Var = yn1.z0.f463939g;
                if (o0Var == null) {
                    kotlin.jvm.internal.o.o("progressModel");
                    throw null;
                }
                float f17 = o0Var.f30864f;
                if (o0Var == null) {
                    kotlin.jvm.internal.o.o("progressModel");
                    throw null;
                }
                long j17 = o0Var.f30865g;
                if (f17 > 0.0f && j17 > 0) {
                    java.lang.String S1 = com.tencent.mm.sdk.platformtools.t8.S1(f17);
                    if (j17 > 3600) {
                        long j18 = j17 / 3600;
                        if (j18 > 999) {
                            j18 = 999;
                        }
                        string = context.getString(l17 ? com.tencent.mm.R.string.o99 : com.tencent.mm.R.string.o9h, java.lang.Long.valueOf(j18), S1);
                    } else {
                        long j19 = j17 / 60;
                        if (j19 < 1) {
                            j19 = 1;
                        }
                        string = context.getString(l17 ? com.tencent.mm.R.string.o9_ : com.tencent.mm.R.string.o9i, java.lang.Long.valueOf(j19), S1);
                    }
                    kotlin.jvm.internal.o.d(string);
                    lVar = new jz5.l(java.lang.Boolean.TRUE, string);
                    break;
                } else {
                    lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.tencent.mm.R.string.o9a : com.tencent.mm.R.string.o9j));
                    break;
                }
                break;
            case 3:
            case 6:
                lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.tencent.mm.R.string.o97 : com.tencent.mm.R.string.o9f));
                break;
            case 4:
                lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.tencent.mm.R.string.o96 : com.tencent.mm.R.string.o9d));
                break;
            case 5:
                lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.tencent.mm.R.string.o9b : com.tencent.mm.R.string.o9k));
                break;
            case 9:
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.o9e);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                lVar = new jz5.l(java.lang.Boolean.TRUE, string2);
                break;
            default:
                throw new jz5.j();
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        java.lang.String str = (java.lang.String) lVar.f302834e;
        if (booleanValue) {
            f();
            k(0);
            android.widget.TextView textView2 = this.f463596m;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView2.setText(str);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f463597n;
            if (weImageView3 == null) {
                kotlin.jvm.internal.o.o("bannerIcon");
                throw null;
            }
            if (z0Var.h() == l0Var) {
                i17 = z0Var.l() ? com.tencent.mm.R.raw.icons_outlined_migration_move_to_computer : com.tencent.mm.R.raw.icons_outlined_migration_move_to_mobile;
            }
            weImageView3.setImageResource(i17);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f463598o;
            if (weImageView4 == null) {
                kotlin.jvm.internal.o.o("closeIcon");
                throw null;
            }
            weImageView4.setVisibility(4);
        } else {
            d();
        }
        return booleanValue;
    }
}
