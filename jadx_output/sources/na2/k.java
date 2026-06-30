package na2;

/* loaded from: classes2.dex */
public final class k extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f335966g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f335967h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f335968i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f335969m;

    /* renamed from: n, reason: collision with root package name */
    public int f335970n;

    /* renamed from: o, reason: collision with root package name */
    public long f335971o;

    /* renamed from: p, reason: collision with root package name */
    public long f335972p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f335973q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f335974r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f335975s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f335976t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f335970n = 1;
        this.f335974r = "";
        this.f335975s = "";
        this.f335976t = "";
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewHeaderUIC", "initViews");
        this.f335971o = getIntent().getLongExtra("topic_id", 0L);
        this.f335972p = getIntent().getLongExtra("from_object_id", 0L);
        this.f335973q = getIntent().getStringExtra("from_object_dup_flag");
        java.lang.String stringExtra = getIntent().getStringExtra("source_session_buffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f335974r = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f335975s = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("sub_title");
        this.f335976t = stringExtra3 != null ? stringExtra3 : "";
        android.widget.FrameLayout frameLayout = this.f452720e;
        this.f335966g = frameLayout != null ? (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.urx) : null;
        android.widget.FrameLayout frameLayout2 = this.f452720e;
        this.f335967h = frameLayout2 != null ? (android.widget.TextView) frameLayout2.findViewById(com.tencent.mm.R.id.urw) : null;
        android.widget.FrameLayout frameLayout3 = this.f452720e;
        this.f335968i = frameLayout3 != null ? frameLayout3.findViewById(com.tencent.mm.R.id.urq) : null;
        android.widget.FrameLayout frameLayout4 = this.f452720e;
        android.view.View findViewById = frameLayout4 != null ? frameLayout4.findViewById(com.tencent.mm.R.id.urt) : null;
        this.f335969m = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new na2.g(this));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewHeaderUIC", "initViews: initialTitle=" + this.f335975s + ", initialSubTitle=" + this.f335976t + " sourceFeedId=" + this.f335972p);
        android.widget.TextView textView = this.f335966g;
        if (textView != null) {
            textView.setText(this.f335975s);
        }
        android.widget.TextView textView2 = this.f335967h;
        if (textView2 != null) {
            textView2.setText(this.f335976t);
        }
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[3] = new jz5.l("source_comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(7)) : null);
        lVarArr[4] = new jz5.l("source_feedid", pm0.v.u(this.f335972p));
        lVarArr[5] = new jz5.l("source_session_buffer", this.f335974r);
        lVarArr[6] = new jz5.l("cluster_id", pm0.v.u(this.f335971o));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        h0Var.f310123d = k17;
        android.view.View view = this.f335969m;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        if (view != null) {
            d2Var.n(view, "cluster_post", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : k17, (r20 & 128) != 0 ? null : new na2.h(this));
        }
        android.view.View view2 = this.f335968i;
        if (view2 != null) {
            d2Var.n(view2, "cluster_shoot", (r20 & 4) != 0 ? 40 : 32, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : (java.util.Map) h0Var.f310123d, (r20 & 128) != 0 ? null : new na2.i(this));
            view2.setOnClickListener(new na2.j(this, h0Var));
        }
    }

    @Override // x92.r
    public void U6() {
        z5();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewHeaderUIC", "updateViews");
    }

    public final void V6(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewHeaderUIC", "updateFavStatus: favStatus=" + i17);
        this.f335970n = i17;
        android.widget.FrameLayout frameLayout = this.f452720e;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = frameLayout != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) frameLayout.findViewById(com.tencent.mm.R.id.urr) : null;
        android.widget.FrameLayout frameLayout2 = this.f452720e;
        android.widget.TextView textView = frameLayout2 != null ? (android.widget.TextView) frameLayout2.findViewById(com.tencent.mm.R.id.urs) : null;
        if (i17 == 1) {
            if (textView != null) {
                textView.setText(getString(com.tencent.mm.R.string.p4g));
            }
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icon_filled_subtract);
                return;
            }
            return;
        }
        if (i17 != 2) {
            return;
        }
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_done);
        }
        if (textView == null) {
            return;
        }
        textView.setText(getString(com.tencent.mm.R.string.p4i));
    }
}
