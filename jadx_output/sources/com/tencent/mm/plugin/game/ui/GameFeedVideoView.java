package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedVideoView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedTitleDescView f140837d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f140838e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRoundImageView f140839f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f140840g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f140841h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f140842i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedSubscriptView f140843m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c f140844n;

    public GameFeedVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.c cVar = this.f140844n;
        if (cVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f140238d.f324187h)) {
            int v17 = r53.f.v(getContext(), this.f140844n.f140238d.f324187h, null, null);
            android.content.Context context = getContext();
            com.tencent.mm.plugin.game.model.c cVar2 = this.f140844n;
            com.tencent.mm.game.report.l.f(context, 10, 1024, cVar2.f140236b, v17, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.a(this.f140844n.f140238d.f324185f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140837d = (com.tencent.mm.plugin.game.ui.GameFeedTitleDescView) findViewById(com.tencent.mm.R.id.gl7);
        this.f140838e = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.oze);
        this.f140839f = (com.tencent.mm.plugin.game.ui.GameRoundImageView) findViewById(com.tencent.mm.R.id.oye);
        this.f140840g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.oyj);
        this.f140841h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487561p04);
        this.f140842i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyk);
        this.f140843m = (com.tencent.mm.plugin.game.ui.GameFeedSubscriptView) findViewById(com.tencent.mm.R.id.nrj);
        setOnClickListener(this);
    }

    public void setLiveData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f140238d) == null || y0Var.f324190n == null) {
            setVisibility(8);
            return;
        }
        this.f140844n = cVar;
        setVisibility(0);
        com.tencent.mm.plugin.game.ui.GameFeedTitleDescView gameFeedTitleDescView = this.f140837d;
        m53.w3 w3Var = y0Var.f324190n;
        gameFeedTitleDescView.a(w3Var.f324156d, w3Var.f324157e, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324190n.f324158f)) {
            this.f140838e.setVisibility(8);
        } else {
            this.f140838e.setVisibility(0);
            r53.y.a().f(this.f140839f, y0Var.f324190n.f324158f, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479816g1), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479815g0), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324190n.f324159g)) {
            this.f140840g.setVisibility(8);
        } else {
            this.f140840g.setVisibility(0);
            this.f140841h.setVisibility(0);
            this.f140842i.setText(y0Var.f324190n.f324159g);
        }
        this.f140843m.setData(y0Var);
        if (this.f140844n.f140240f) {
            return;
        }
        android.content.Context context = getContext();
        com.tencent.mm.plugin.game.model.c cVar2 = this.f140844n;
        n53.a.b(context, 10, 1024, cVar2.f140236b, 1, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140844n.f140238d.f324185f));
        this.f140844n.f140240f = true;
    }

    public void setVideoData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        m53.z5 z5Var;
        if (cVar == null || (y0Var = cVar.f140238d) == null || (z5Var = y0Var.f324189m) == null || com.tencent.mm.sdk.platformtools.t8.K0(z5Var.f324240g)) {
            setVisibility(8);
            return;
        }
        this.f140844n = cVar;
        m53.y0 y0Var2 = cVar.f140238d;
        setVisibility(0);
        com.tencent.mm.plugin.game.ui.GameFeedTitleDescView gameFeedTitleDescView = this.f140837d;
        m53.z5 z5Var2 = y0Var2.f324189m;
        gameFeedTitleDescView.a(z5Var2.f324237d, z5Var2.f324238e, null);
        r53.y.a().f(this.f140839f, y0Var2.f324189m.f324240g, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479816g1), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479815g0), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var2.f324189m.f324239f)) {
            this.f140840g.setVisibility(8);
        } else {
            this.f140840g.setVisibility(0);
            this.f140841h.setVisibility(8);
            this.f140842i.setText(y0Var2.f324189m.f324239f);
        }
        this.f140843m.setData(y0Var2);
    }
}
