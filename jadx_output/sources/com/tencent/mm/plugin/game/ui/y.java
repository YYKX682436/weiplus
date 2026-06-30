package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class y extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141868d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f141869e;

    /* renamed from: f, reason: collision with root package name */
    public int f141870f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141871g;

    public y(android.content.Context context) {
        super(context);
        this.f141868d = context;
        this.f141869e = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        setOrientation(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof m53.q)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameBlockEntranceView", "getTag is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        m53.q qVar = (m53.q) view.getTag();
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f323972g)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameBlockEntranceView", "jumpUrl is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mm.game.report.l.f(this.f141868d, 10, 1002, qVar.f323973h, r53.f.v(this.f141868d, qVar.f323972g, "game_center_mygame_comm", null), this.f141871g, this.f141870f, n53.a.e(qVar.f323974i));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
