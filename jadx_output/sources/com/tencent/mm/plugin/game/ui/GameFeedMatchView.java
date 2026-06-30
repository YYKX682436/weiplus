package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedMatchView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedTitleDescView f140800d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRoundImageView f140801e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedSubscriptView f140802f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c f140803g;

    public GameFeedMatchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedMatchView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.c cVar = this.f140803g;
        if (cVar == null || (y0Var = cVar.f140238d) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedMatchView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324187h)) {
            int v17 = r53.f.v(getContext(), this.f140803g.f140238d.f324187h, null, null);
            android.content.Context context = getContext();
            com.tencent.mm.plugin.game.model.c cVar2 = this.f140803g;
            com.tencent.mm.game.report.l.f(context, 10, 1024, cVar2.f140236b, v17, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.a(this.f140803g.f140238d.f324185f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedMatchView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140800d = (com.tencent.mm.plugin.game.ui.GameFeedTitleDescView) findViewById(com.tencent.mm.R.id.gl7);
        this.f140801e = (com.tencent.mm.plugin.game.ui.GameRoundImageView) findViewById(com.tencent.mm.R.id.ahg);
        this.f140802f = (com.tencent.mm.plugin.game.ui.GameFeedSubscriptView) findViewById(com.tencent.mm.R.id.nrj);
        setOnClickListener(this);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f140238d) == null || y0Var.f324191o == null) {
            setVisibility(8);
            return;
        }
        this.f140803g = cVar;
        setVisibility(0);
        com.tencent.mm.plugin.game.ui.GameFeedTitleDescView gameFeedTitleDescView = this.f140800d;
        m53.x3 x3Var = y0Var.f324191o;
        gameFeedTitleDescView.a(x3Var.f324172d, x3Var.f324174f, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324191o.f324173e)) {
            setVisibility(8);
        } else {
            this.f140801e.setVisibility(0);
            r53.y.a().f(this.f140801e, y0Var.f324191o.f324173e, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479826gb), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479825ga), (r53.f.h(getContext()) - getPaddingLeft()) - getPaddingRight());
        }
        this.f140802f.setData(y0Var);
        if (this.f140803g.f140240f) {
            return;
        }
        android.content.Context context = getContext();
        com.tencent.mm.plugin.game.model.c cVar2 = this.f140803g;
        n53.a.b(context, 10, 1024, cVar2.f140236b, 1, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140803g.f140238d.f324185f));
        this.f140803g.f140240f = true;
    }
}
