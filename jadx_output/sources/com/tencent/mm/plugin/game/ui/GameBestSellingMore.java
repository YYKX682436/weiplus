package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameBestSellingMore extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f140677d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f140678e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c f140679f;

    public GameBestSellingMore(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        m53.m1 m1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.c cVar = this.f140679f;
        if (cVar == null || (y0Var = cVar.f140238d) == null || (m1Var = y0Var.f324194r) == null || com.tencent.mm.sdk.platformtools.t8.K0(m1Var.f323895g)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mm.game.report.l.f(getContext(), 10, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, 999, r53.f.v(getContext(), this.f140679f.f140238d.f324194r.f323895g, null, null), null, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140679f.f140238d.f324185f));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140677d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485979jr5);
        this.f140678e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485978jr4);
        setOnClickListener(this);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        m53.m1 m1Var;
        this.f140679f = cVar;
        if (cVar == null || (y0Var = cVar.f140238d) == null || (m1Var = y0Var.f324194r) == null || com.tencent.mm.sdk.platformtools.t8.K0(m1Var.f323894f)) {
            this.f140677d.setVisibility(8);
            this.f140678e.setVisibility(8);
            setPadding(0, 0, 0, 0);
        } else {
            setPadding(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479819g4), 0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479819g4), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479819g4));
            this.f140677d.setVisibility(0);
            this.f140678e.setVisibility(0);
            this.f140677d.setText(cVar.f140238d.f324194r.f323894f);
        }
    }
}
