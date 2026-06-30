package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedAddTopicView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameFeedTitleDescView f140775d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f140776e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c f140777f;

    public GameFeedAddTopicView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.c cVar = this.f140777f;
        if (cVar == null || (y0Var = cVar.f140238d) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324187h)) {
            int v17 = r53.f.v(getContext(), this.f140777f.f140238d.f324187h, null, null);
            android.content.Context context = getContext();
            com.tencent.mm.plugin.game.model.c cVar2 = this.f140777f;
            com.tencent.mm.game.report.l.f(context, 10, 1024, cVar2.f140236b, v17, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.a(this.f140777f.f140238d.f324185f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140775d = (com.tencent.mm.plugin.game.ui.GameFeedTitleDescView) findViewById(com.tencent.mm.R.id.gl7);
        this.f140776e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482720m3);
        setOnClickListener(this);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f140238d) == null || y0Var.f324195s == null) {
            setVisibility(8);
            return;
        }
        this.f140777f = cVar;
        setVisibility(0);
        com.tencent.mm.plugin.game.ui.GameFeedTitleDescView gameFeedTitleDescView = this.f140775d;
        m53.x xVar = cVar.f140238d.f324195s;
        gameFeedTitleDescView.a(xVar.f324164d, xVar.f324165e, null);
        this.f140776e.setText(cVar.f140238d.f324195s.f324166f);
        if (this.f140777f.f140240f) {
            return;
        }
        android.content.Context context = getContext();
        com.tencent.mm.plugin.game.model.c cVar2 = this.f140777f;
        n53.a.b(context, 10, 1024, cVar2.f140236b, 1, cVar2.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140777f.f140238d.f324185f));
        this.f140777f.f140240f = true;
    }
}
