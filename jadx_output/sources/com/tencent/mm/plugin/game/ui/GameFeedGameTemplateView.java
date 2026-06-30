package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedGameTemplateView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f140778d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f140779e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.widget.GameTagListView f140780f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f140781g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f140782h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRoundImageView f140783i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f140784m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedSubscriptView f140785n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameDownloadView f140786o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c f140787p;

    /* renamed from: q, reason: collision with root package name */
    public int f140788q;

    public GameFeedGameTemplateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(android.widget.ImageView imageView, java.lang.String str) {
        r53.y.a().f(imageView, str, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479826gb), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479825ga), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.c cVar = this.f140787p;
        if (cVar == null || cVar.f140238d == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.oze && !com.tencent.mm.sdk.platformtools.t8.K0(this.f140787p.f140238d.f324192p.f324047i)) {
            int v17 = r53.f.v(getContext(), this.f140787p.f140238d.f324192p.f324047i, null, null);
            android.content.Context context = getContext();
            com.tencent.mm.plugin.game.model.c cVar2 = this.f140787p;
            com.tencent.mm.game.report.l.f(context, 10, 1024, cVar2.f140236b, v17, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.a(this.f140787p.f140238d.f324185f, "clickType", "middle"));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f140787p.f140238d.f324187h)) {
            int v18 = r53.f.v(getContext(), this.f140787p.f140238d.f324187h, null, null);
            android.content.Context context2 = getContext();
            com.tencent.mm.plugin.game.model.c cVar3 = this.f140787p;
            com.tencent.mm.game.report.l.f(context2, 10, 1024, cVar3.f140236b, v18, cVar3.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.a(this.f140787p.f140238d.f324185f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140778d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.glm);
        this.f140779e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gnr);
        this.f140780f = (com.tencent.mm.plugin.game.widget.GameTagListView) findViewById(com.tencent.mm.R.id.f485139gp2);
        this.f140781g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f140782h = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.oze);
        this.f140783i = (com.tencent.mm.plugin.game.ui.GameRoundImageView) findViewById(com.tencent.mm.R.id.h88);
        this.f140784m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ozp);
        this.f140785n = (com.tencent.mm.plugin.game.ui.GameFeedSubscriptView) findViewById(com.tencent.mm.R.id.nrj);
        this.f140786o = (com.tencent.mm.plugin.game.ui.GameDownloadView) findViewById(com.tencent.mm.R.id.f485112gl0);
        setOnClickListener(this);
        this.f140788q = r53.f.h(getContext()) - i65.a.b(getContext(), 175);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f140238d) == null || y0Var.f324192p == null) {
            setVisibility(8);
            return;
        }
        this.f140787p = cVar;
        setVisibility(0);
        r53.y.a().b(this.f140778d, y0Var.f324192p.f324050o.f323717d, i65.a.g(getContext()));
        this.f140779e.setText(y0Var.f324192p.f324050o.f323719f);
        this.f140780f.a(y0Var.f324192p.f324050o.C, this.f140788q);
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324192p.f324045g)) {
            this.f140781g.setVisibility(8);
        } else {
            this.f140781g.setText(y0Var.f324192p.f324045g);
            this.f140781g.setVisibility(0);
        }
        this.f140782h.setVisibility(0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324192p.f324048m)) {
            a(this.f140783i, y0Var.f324192p.f324046h);
            this.f140784m.setVisibility(0);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324192p.f324046h)) {
            this.f140782h.setVisibility(8);
        } else {
            a(this.f140783i, y0Var.f324192p.f324046h);
            this.f140784m.setVisibility(8);
        }
        this.f140782h.setOnClickListener(this);
        this.f140785n.setData(y0Var);
        com.tencent.mm.plugin.game.model.b a17 = com.tencent.mm.plugin.game.model.t1.a(this.f140787p.f140238d.f324192p.f324050o);
        a17.f140212o2 = 10;
        a17.f140213p2 = 1024;
        a17.f140214q2 = this.f140787p.f140236b;
        this.f140786o.setDownloadInfo(new com.tencent.mm.plugin.game.model.c0(a17));
        if (this.f140787p.f140240f) {
            return;
        }
        android.content.Context context = getContext();
        com.tencent.mm.plugin.game.model.c cVar2 = this.f140787p;
        n53.a.b(context, 10, 1024, cVar2.f140236b, 1, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140787p.f140238d.f324185f));
        this.f140787p.f140240f = true;
    }
}
