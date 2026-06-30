package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedNoGamePlayTemplate extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedTitleDescView f140807d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f140808e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRoundImageView f140809f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f140810g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f140811h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f140812i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameDownloadView f140813m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f140814n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c f140815o;

    public GameFeedNoGamePlayTemplate(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.c cVar = this.f140815o;
        if (cVar == null || (y0Var = cVar.f140238d) == null || y0Var.f324193q == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.h_1 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f140815o.f140238d.f324193q.f323846h)) {
            int v17 = r53.f.v(getContext(), this.f140815o.f140238d.f324193q.f323846h, null, null);
            android.content.Context context = getContext();
            com.tencent.mm.plugin.game.model.c cVar2 = this.f140815o;
            com.tencent.mm.game.report.l.f(context, 10, 1024, cVar2.f140236b, v17, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.a(this.f140815o.f140238d.f324185f, "clickType", "middle"));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f140815o.f140238d.f324187h)) {
            int v18 = r53.f.v(getContext(), this.f140815o.f140238d.f324187h, null, null);
            android.content.Context context2 = getContext();
            com.tencent.mm.plugin.game.model.c cVar3 = this.f140815o;
            com.tencent.mm.game.report.l.f(context2, 10, 1024, cVar3.f140236b, v18, cVar3.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.a(this.f140815o.f140238d.f324185f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140807d = (com.tencent.mm.plugin.game.ui.GameFeedTitleDescView) findViewById(com.tencent.mm.R.id.gl7);
        this.f140808e = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.h_1);
        this.f140809f = (com.tencent.mm.plugin.game.ui.GameRoundImageView) findViewById(com.tencent.mm.R.id.f483970cl4);
        this.f140810g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ozp);
        this.f140811h = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.gje);
        this.f140812i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.glm);
        this.f140814n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gnr);
        this.f140813m = (com.tencent.mm.plugin.game.ui.GameDownloadView) findViewById(com.tencent.mm.R.id.f485112gl0);
        setOnClickListener(this);
        this.f140808e.setOnClickListener(this);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f140238d) == null || y0Var.f324193q == null) {
            setVisibility(8);
            return;
        }
        this.f140815o = cVar;
        setVisibility(0);
        com.tencent.mm.plugin.game.ui.GameFeedTitleDescView gameFeedTitleDescView = this.f140807d;
        m53.k4 k4Var = y0Var.f324193q;
        gameFeedTitleDescView.a(k4Var.f323842d, k4Var.f323845g, k4Var.f323848m);
        this.f140808e.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324193q.f323844f)) {
            this.f140808e.setVisibility(8);
        } else {
            r53.y.a().f(this.f140809f, y0Var.f324193q.f323844f, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479826gb), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479825ga), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
            if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324193q.f323846h)) {
                this.f140810g.setVisibility(8);
            } else {
                this.f140810g.setVisibility(0);
            }
        }
        if (y0Var.f324193q.f323847i != null) {
            this.f140811h.setVisibility(0);
            r53.y.a().b(this.f140812i, y0Var.f324193q.f323847i.f323717d, i65.a.g(getContext()));
            this.f140814n.setText(y0Var.f324193q.f323847i.f323719f);
            com.tencent.mm.plugin.game.model.b a17 = com.tencent.mm.plugin.game.model.t1.a(y0Var.f324193q.f323847i);
            a17.f140212o2 = 10;
            a17.f140213p2 = 1024;
            a17.f140214q2 = this.f140815o.f140236b;
            this.f140813m.setDownloadInfo(new com.tencent.mm.plugin.game.model.c0(a17));
        }
        if (this.f140815o.f140240f) {
            return;
        }
        android.content.Context context = getContext();
        com.tencent.mm.plugin.game.model.c cVar2 = this.f140815o;
        n53.a.b(context, 10, 1024, cVar2.f140236b, 1, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140815o.f140238d.f324185f));
        this.f140815o.f140240f = true;
    }
}
