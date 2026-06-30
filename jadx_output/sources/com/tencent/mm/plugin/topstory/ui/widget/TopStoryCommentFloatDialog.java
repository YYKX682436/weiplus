package com.tencent.mm.plugin.topstory.ui.widget;

/* loaded from: classes8.dex */
public class TopStoryCommentFloatDialog extends android.widget.RelativeLayout implements com.tencent.mm.ui.tools.c5, com.tencent.mm.modelbase.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f175255t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f175256d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f175257e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f175258f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsEditText f175259g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f175260h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f175261i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f175262m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f175263n;

    /* renamed from: o, reason: collision with root package name */
    public long f175264o;

    /* renamed from: p, reason: collision with root package name */
    public sm4.f f175265p;

    /* renamed from: q, reason: collision with root package name */
    public in4.a0 f175266q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f175267r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f175268s;

    public TopStoryCommentFloatDialog(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175262m = null;
        this.f175263n = false;
        this.f175264o = 0L;
        this.f175268s = new in4.z(this);
        c();
    }

    public void a() {
        this.f175259g.setText("");
        setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f175256d.getLayoutParams();
        layoutParams.bottomMargin = 0;
        this.f175256d.setLayoutParams(layoutParams);
        this.f175261i.hideVKB();
        this.f175263n = false;
        in4.a0 a0Var = this.f175266q;
        if (a0Var != null) {
            a0Var.onDismiss();
        }
    }

    public void b() {
        if (this.f175259g.getText().toString().length() > 0) {
            db5.e1.l(this.f175261i, com.tencent.mm.R.string.k0g, 0, com.tencent.mm.R.string.f490608zu, com.tencent.mm.R.string.f490503wx, true, new in4.x(this), new in4.y(this), com.tencent.mm.R.color.f478734fp);
        } else {
            a();
        }
    }

    public final void c() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.d1l, this);
        this.f175256d = findViewById(com.tencent.mm.R.id.c6u);
        this.f175259g = (com.tencent.mm.plugin.sns.ui.SnsEditText) findViewById(com.tencent.mm.R.id.c86);
        this.f175257e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483765c00);
        this.f175258f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483766c01);
    }

    public void d(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f175261i = mMActivity;
        this.f175260h = new com.tencent.mm.ui.tools.f5(mMActivity);
        setOnClickListener(this.f175268s);
        findViewById(com.tencent.mm.R.id.b5k).setOnClickListener(new in4.s(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486361l04);
        this.f175267r = textView;
        textView.setOnClickListener(new in4.t(this, mMActivity));
        f();
        g();
        this.f175259g.addTextChangedListener(new in4.u(this));
        post(new in4.v(this));
    }

    public void e(sm4.f fVar, in4.a0 a0Var, int i17, int i18) {
        this.f175263n = true;
        this.f175265p = fVar;
        setVisibility(0);
        this.f175259g.requestFocus();
        this.f175261i.showVKB();
        this.f175266q = a0Var;
        r45.kn6 kn6Var = (r45.kn6) fVar.f409938e.f70710a.f70684a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17080, 7, 2, "action=14&channelId=" + i17 + "&mpScene=0&kykScene=" + kn6Var.f378870o + "&kykSubScene=0&itemType=" + i18 + "&searchId=" + kn6Var.f378869n + "&docId=" + kn6Var.f378863e + "&byPass=" + kn6Var.f378872q);
    }

    public final void f() {
        int length = this.f175259g.getText().toString().length();
        if (length < 180) {
            this.f175257e.setVisibility(8);
            this.f175258f.setVisibility(8);
            return;
        }
        this.f175257e.setVisibility(0);
        this.f175258f.setVisibility(0);
        int color = length <= 200 ? getResources().getColor(com.tencent.mm.R.color.a96) : getResources().getColor(com.tencent.mm.R.color.a2y);
        this.f175257e.setText("" + length);
        this.f175257e.setTextColor(color);
    }

    public final void g() {
        int length = this.f175259g.getText().toString().length();
        int length2 = this.f175259g.getText().toString().trim().length();
        if (length > 200 || length <= 0 || length2 <= 0) {
            this.f175267r.setBackgroundResource(com.tencent.mm.R.drawable.b7u);
        } else {
            this.f175267r.setBackgroundResource(com.tencent.mm.R.drawable.b7t);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f175262m;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f175262m = null;
        }
        if (!(i17 == 0 && i18 == 0)) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f175261i;
            db5.e1.s(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490391to), "");
            return;
        }
        a();
        in4.a0 a0Var = this.f175266q;
        if (a0Var != null) {
            a0Var.a();
        }
        if (m1Var instanceof sm4.f) {
            sm4.f fVar = (sm4.f) m1Var;
            cl0.g gVar = new cl0.g();
            try {
                com.tencent.mm.modelbase.o oVar = fVar.f409938e;
                com.tencent.mm.modelbase.o oVar2 = fVar.f409938e;
                r45.kn6 kn6Var = (r45.kn6) oVar.f70710a.f70684a;
                gVar.h("content", kn6Var != null ? kn6Var.f378864f : "");
                gVar.h(dm.i4.COL_ID, ((r45.ln6) oVar2.f70711b.f70700a).f379667d);
                r45.kn6 kn6Var2 = (r45.kn6) oVar2.f70710a.f70684a;
                gVar.h("docId", kn6Var2 != null ? kn6Var2.f378863e : "");
                gVar.h("opType", "REPLY_ARTICLE_BY_ME");
                com.tencent.mm.autogen.events.HaoKanActionEvent haoKanActionEvent = new com.tencent.mm.autogen.events.HaoKanActionEvent();
                am.gh ghVar = haoKanActionEvent.f54431g;
                ghVar.f6762a = gVar.toString();
                ghVar.f6763b = "";
                haoKanActionEvent.e();
            } catch (cl0.f unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TopStoryCommentFloatDialog", "notify tl failed");
            }
        }
        db5.t7.makeText(this.f175261i, com.tencent.mm.R.string.k0i, 0).show();
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryCommentFloatDialog", "onKeyboardHeightChanged in pixels: " + i17);
        if (this.f175263n) {
            android.view.View view = this.f175256d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog", "show", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog", "show", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (((android.widget.RelativeLayout.LayoutParams) this.f175256d.getLayoutParams()).bottomMargin != i17) {
                in4.w wVar = new in4.w(this, i17);
                if (i17 != 0) {
                    wVar.setDuration(200L);
                } else {
                    wVar.setDuration(300L);
                }
                this.f175256d.startAnimation(wVar);
            }
            this.f175259g.requestFocus();
            setVisibility(0);
        }
    }

    public TopStoryCommentFloatDialog(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175262m = null;
        this.f175263n = false;
        this.f175264o = 0L;
        this.f175268s = new in4.z(this);
        c();
    }
}
