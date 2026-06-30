package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameRecomBlockView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140954d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f140955e;

    /* renamed from: f, reason: collision with root package name */
    public int f140956f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f140957g;

    public GameRecomBlockView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f140954d = context;
        this.f140955e = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f140957g = this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.plugin.game.ui.o5)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecomBlockView", "getTag is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.ui.o5 o5Var = (com.tencent.mm.plugin.game.ui.o5) view.getTag();
        if (com.tencent.mm.sdk.platformtools.t8.K0(o5Var.f141697c)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecomBlockView", "jumpUrl is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mm.game.report.l.f(this.f140954d, 10, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER, o5Var.f141696b, r53.f.v(this.f140954d, o5Var.f141697c, o5Var.f141699e, null), o5Var.f141695a, this.f140956f, n53.a.e(o5Var.f141698d));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecomBlockView", "initView finished");
    }
}
