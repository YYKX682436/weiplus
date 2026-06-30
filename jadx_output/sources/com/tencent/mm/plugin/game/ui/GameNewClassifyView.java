package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameNewClassifyView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f140943d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.LayoutInflater f140944e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f140945f;

    public GameNewClassifyView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.plugin.game.ui.m5)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.ui.m5 m5Var = (com.tencent.mm.plugin.game.ui.m5) view.getTag();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(m5Var.f141473a)) {
            r53.f.u(getContext(), m5Var.f141473a);
            com.tencent.mm.game.report.l.f(getContext(), 10, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT, m5Var.f141474b, 7, null, this.f140943d, n53.a.e(m5Var.f141475c));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140944e = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f140945f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485125gn0);
    }
}
