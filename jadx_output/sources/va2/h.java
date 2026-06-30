package va2;

/* loaded from: classes2.dex */
public final class h extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public final long f434242g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f434243h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f434244i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f434242g = getIntent().getLongExtra("key_ref_object_id", 0L);
        this.f434243h = getIntent().getStringExtra("key_ref_object_dup_flag");
        this.f434244i = getIntent().getBooleanExtra("KEY_IS_HIGH_LIGHT_TOPIC", false);
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        android.widget.FrameLayout frameLayout = this.f452720e;
        android.view.View findViewById = frameLayout != null ? frameLayout.findViewById(com.tencent.mm.R.id.qdr) : null;
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() == 0) {
            r45.r03 r03Var = (r45.r03) this.f452719d;
            java.lang.String string = r03Var != null ? r03Var.getString(0) : null;
            stringExtra = string != null ? string : "";
        }
        com.tencent.mm.plugin.finder.report.p2.O(com.tencent.mm.plugin.finder.report.p2.f125237a, findViewById, "topic_post_feed", 0, kz5.b1.e(new jz5.l("topic_name", stringExtra)), null, 20, null);
        if (findViewById != null) {
            findViewById.setOnClickListener(new va2.g(this));
        }
        if (!this.f434244i || findViewById == null) {
            return;
        }
        findViewById.setBackgroundResource(com.tencent.mm.R.drawable.f481557wj);
        int color = getResources().getColor(com.tencent.mm.R.color.f478553an);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.qds);
        if (weImageView != null) {
            weImageView.setIconColor(color);
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.qdt);
        if (textView != null) {
            textView.setText(getResources().getString(com.tencent.mm.R.string.m19));
            textView.setTextColor(color);
        }
    }

    @Override // x92.r
    public void S6(com.tencent.mm.protobuf.f fVar) {
        r45.r03 r03Var = (r45.r03) fVar;
        super.S6(r03Var);
        java.lang.String u17 = pm0.v.u(r03Var != null ? r03Var.getLong(1) : 0L);
        android.widget.FrameLayout frameLayout = this.f452720e;
        if (frameLayout != null && frameLayout.findViewById(com.tencent.mm.R.id.qdu) != null) {
            ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
            xy2.c.e(getActivity());
            if (r03Var != null) {
                r03Var.getString(0);
            }
            xVar.getClass();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(getActivity(), "page_topicid", u17);
    }
}
