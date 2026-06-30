package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/c9;", "Lcom/tencent/mm/plugin/finder/ui/tl;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderShareFeedDetailUI extends com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI<com.tencent.mm.plugin.finder.feed.c9, com.tencent.mm.plugin.finder.ui.tl> {
    public static final /* synthetic */ int M = 0;
    public int A;
    public com.tencent.mm.protobuf.g G;
    public int H;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f128759J;
    public android.view.View K;
    public boolean L;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.tl f128761v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.c9 f128762w;

    /* renamed from: x, reason: collision with root package name */
    public long f128763x;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f128760u = "Finder.FinderShareFeedDetailUI";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f128764y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f128765z = "";
    public final int B = 2;
    public java.lang.String C = "";
    public final jz5.g D = jz5.h.b(new com.tencent.mm.plugin.finder.ui.ki(this));
    public final jz5.g E = jz5.h.b(new com.tencent.mm.plugin.finder.ui.li(this));
    public boolean F = true;
    public final boolean I = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 25;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI
    public com.tencent.mm.plugin.finder.feed.c0 c7() {
        com.tencent.mm.plugin.finder.ui.tl tlVar = this.f128761v;
        if (tlVar != null) {
            return tlVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI
    public com.tencent.mm.plugin.finder.feed.i0 d7() {
        com.tencent.mm.plugin.finder.feed.c9 c9Var = this.f128762w;
        if (c9Var != null) {
            return c9Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI
    public void e7() {
        setMMTitle(com.tencent.mm.R.string.f8e);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mss);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.K = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI
    public void f7() {
        fc2.c n17;
        fc2.c n18;
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        this.f128763x = getIntent().getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("feed_encrypted_object_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f128764y = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("feed_object_nonceId");
        this.f128765z = stringExtra2 != null ? stringExtra2 : "";
        this.A = getIntent().getIntExtra("report_scene", 0);
        this.C = getIntent().getStringExtra("from_user");
        this.F = getIntent().getBooleanExtra("key_show_jump_entry", true);
        this.H = getIntent().getIntExtra("key_source_comment_scene", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_like_buffer");
        if (stringExtra3 != null && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
            this.G = com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.h(stringExtra3));
        }
        if (this.f128763x == 0 && com.tencent.mm.sdk.platformtools.t8.K0(this.f128764y)) {
            com.tencent.mars.xlog.Log.w(this.f128760u, "objectId " + this.f128763x + ", encryptedObjectId " + this.f128764y + ", finish");
            finish();
        }
        boolean z17 = !this.I;
        int i17 = this.B;
        com.tencent.mm.plugin.finder.ui.tl tlVar = new com.tencent.mm.plugin.finder.ui.tl(i17, this, z17);
        this.f128761v = tlVar;
        this.f128762w = new com.tencent.mm.plugin.finder.feed.c9(this, tlVar, this.B, 25, z17);
        long j17 = this.f128763x;
        if (j17 != 0 && (h17 = bu2.j.f24534a.h(j17)) != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(h17);
            com.tencent.mm.plugin.finder.ui.tl tlVar2 = this.f128761v;
            if (tlVar2 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            java.util.ArrayList arrayList = tlVar2.f106364u;
            if (arrayList != null) {
                arrayList.add(p17);
            }
        }
        if (this.A != 0) {
            jx3.f.INSTANCE.idkeyStat(1278L, 14L, 1L, false);
        }
        g7().N0(i17, 25, new com.tencent.mm.plugin.finder.ui.mi(this));
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(g7());
        }
        jz5.g gVar = this.E;
        zy2.h8 h8Var = (zy2.h8) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.finder.ui.ni niVar = new com.tencent.mm.plugin.finder.ui.ni(this);
        com.tencent.mm.plugin.finder.feed.c9 c9Var = this.f128762w;
        if (c9Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(niVar, c9Var.getRecyclerView());
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar2 == null || (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) ((zy2.h8) ((jz5.n) gVar).getValue());
        s3Var.getClass();
        n17.a(s3Var);
    }

    public final com.tencent.mm.plugin.finder.feed.model.l0 g7() {
        return (com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) this.D).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489093b91;
    }

    public final void h7(java.lang.Integer num, java.lang.String str) {
        com.tencent.mm.plugin.finder.feed.c9 c9Var = this.f128762w;
        if (c9Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        c9Var.getRecyclerView().setVisibility(8);
        android.view.View view = this.K;
        if (view == null) {
            kotlin.jvm.internal.o.o("tipsLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "showErrorUi", "(Ljava/lang/Integer;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "showErrorUi", "(Ljava/lang/Integer;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.K;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("tipsLayout");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.cti);
        if (num != null && num.intValue() == -4011) {
            if (str != null) {
                if (!(str.length() == 0)) {
                    textView.setText(str);
                    return;
                }
            }
            textView.setText(com.tencent.mm.R.string.cv_);
            return;
        }
        if (num != null && num.intValue() == -4033) {
            if (str != null) {
                if (!(str.length() == 0)) {
                    textView.setText(str);
                    return;
                }
            }
            textView.setText(com.tencent.mm.R.string.cwu);
            return;
        }
        if (num == null || num.intValue() != -4036) {
            textView.setText(com.tencent.mm.R.string.cv_);
            return;
        }
        if (str != null) {
            if (!(str.length() == 0)) {
                textView.setText(str);
                return;
            }
        }
        textView.setText(com.tencent.mm.R.string.f492069f45);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        fc2.c n17;
        fc2.c n18;
        if (this.A != 0 && !this.L) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            long j17 = this.f128763x;
            int i17 = this.A;
            java.lang.String str = this.C;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            o3Var.Rj(j17, i17, str2, 0, (r27 & 16) != 0 ? 0 : 0, (r27 & 32) != 0 ? null : nyVar != null ? nyVar.V6().getString(1) : null, (r27 & 64) != 0 ? 0 : this.H, (r27 & 128) != 0 ? 0L : 0L, (r27 & 256) != 0 ? null : null);
            this.L = true;
        }
        g7().onDetach();
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar2 != null && (n18 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            n18.d(g7());
        }
        jz5.g gVar = this.E;
        ((com.tencent.mm.plugin.finder.feed.model.s3) ((zy2.h8) ((jz5.n) gVar).getValue())).onDetach();
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar3 != null && (n17 = zy2.ra.n1(nyVar3, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) ((zy2.h8) ((jz5.n) gVar).getValue());
            s3Var.getClass();
            n17.d(s3Var);
        }
        com.tencent.mm.plugin.finder.ui.tl tlVar = this.f128761v;
        if (tlVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        tlVar.onDetach();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai() && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.O().r()).intValue() == 1) {
            h7(-4036, getContext().getResources().getString(com.tencent.mm.R.string.f7n));
            return;
        }
        long j17 = this.f128763x;
        java.lang.String str = this.f128765z;
        java.lang.String str2 = this.f128764y;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        new db2.g4(j17, str, 25, 2, "", true, null, null, 0L, null, false, false, str2, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536858560, null).l().h(new com.tencent.mm.plugin.finder.ui.pi(this));
    }
}
