package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedImageTextView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedTitleDescView f140789d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRoundImageView f140790e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f140791f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRoundImageView f140792g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRoundImageView f140793h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRoundImageView f140794i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f140795m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedSubscriptView f140796n;

    /* renamed from: o, reason: collision with root package name */
    public int f140797o;

    /* renamed from: p, reason: collision with root package name */
    public int f140798p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c f140799q;

    public GameFeedImageTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140797o = 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.c cVar = this.f140799q;
        if (cVar == null || (y0Var = cVar.f140238d) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324187h)) {
            int v17 = r53.f.v(getContext(), this.f140799q.f140238d.f324187h, null, null);
            android.content.Context context = getContext();
            com.tencent.mm.plugin.game.model.c cVar2 = this.f140799q;
            com.tencent.mm.game.report.l.f(context, 10, 1024, cVar2.f140236b, v17, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.a(this.f140799q.f140238d.f324185f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140789d = (com.tencent.mm.plugin.game.ui.GameFeedTitleDescView) findViewById(com.tencent.mm.R.id.gl7);
        this.f140790e = (com.tencent.mm.plugin.game.ui.GameRoundImageView) findViewById(com.tencent.mm.R.id.ahg);
        this.f140791f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.n0i);
        this.f140792g = (com.tencent.mm.plugin.game.ui.GameRoundImageView) findViewById(com.tencent.mm.R.id.g6r);
        this.f140793h = (com.tencent.mm.plugin.game.ui.GameRoundImageView) findViewById(com.tencent.mm.R.id.f486776mg0);
        this.f140794i = (com.tencent.mm.plugin.game.ui.GameRoundImageView) findViewById(com.tencent.mm.R.id.f487294o65);
        this.f140795m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jr7);
        this.f140796n = (com.tencent.mm.plugin.game.ui.GameFeedSubscriptView) findViewById(com.tencent.mm.R.id.nrj);
        setOnClickListener(this);
        this.f140797o = (((r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight()) - (i65.a.b(getContext(), 10) * 2)) / 3;
        int b17 = i65.a.b(getContext(), 105);
        this.f140798p = b17;
        int i17 = this.f140797o;
        if (i17 < b17) {
            this.f140798p = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f140792g.getLayoutParams();
        int i18 = this.f140798p;
        layoutParams.width = i18;
        layoutParams.height = i18;
        this.f140792g.setLayoutParams(layoutParams);
        this.f140793h.setLayoutParams(layoutParams);
        this.f140794i.setLayoutParams(layoutParams);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f140238d) == null || y0Var.f324188i == null) {
            setVisibility(8);
            return;
        }
        this.f140799q = cVar;
        setVisibility(0);
        com.tencent.mm.plugin.game.ui.GameFeedTitleDescView gameFeedTitleDescView = this.f140789d;
        m53.m3 m3Var = y0Var.f324188i;
        gameFeedTitleDescView.a(m3Var.f323902d, m3Var.f323903e, null);
        if (com.tencent.mm.sdk.platformtools.t8.L0(y0Var.f324188i.f323904f)) {
            this.f140790e.setVisibility(8);
            this.f140791f.setVisibility(8);
        } else {
            int size = y0Var.f324188i.f323904f.size();
            if (size == 1) {
                this.f140791f.setVisibility(8);
                this.f140790e.setVisibility(0);
                r53.y.a().f(this.f140790e, (java.lang.String) y0Var.f324188i.f323904f.get(0), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479816g1), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479815g0), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f140790e.setVisibility(8);
                this.f140791f.setVisibility(0);
                this.f140795m.setVisibility(8);
                r53.v vVar = new r53.v();
                vVar.f392706d = true;
                r53.w a17 = vVar.a();
                r53.y.a().e(this.f140792g, (java.lang.String) y0Var.f324188i.f323904f.get(0), a17, null);
                r53.y.a().e(this.f140793h, (java.lang.String) y0Var.f324188i.f323904f.get(1), a17, null);
                if (size > 2) {
                    r53.y.a().e(this.f140794i, (java.lang.String) y0Var.f324188i.f323904f.get(2), a17, null);
                    this.f140794i.setVisibility(0);
                    if (size > 3) {
                        this.f140795m.setVisibility(0);
                        this.f140795m.setText(java.lang.String.format("共%d张", java.lang.Integer.valueOf(size)));
                    }
                } else {
                    this.f140794i.setVisibility(4);
                }
            }
        }
        this.f140796n.setData(y0Var);
        if (this.f140799q.f140240f) {
            return;
        }
        android.content.Context context = getContext();
        com.tencent.mm.plugin.game.model.c cVar2 = this.f140799q;
        n53.a.b(context, 10, 1024, cVar2.f140236b, 1, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140799q.f140238d.f324185f));
        this.f140799q.f140240f = true;
    }
}
