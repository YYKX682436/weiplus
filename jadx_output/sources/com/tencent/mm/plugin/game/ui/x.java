package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class x extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141838d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f141839e;

    /* renamed from: f, reason: collision with root package name */
    public int f141840f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141841g;

    public x(android.content.Context context) {
        super(context);
        this.f141838d = context;
        this.f141839e = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        setOrientation(1);
    }

    public final void a(android.view.ViewGroup viewGroup) {
        android.view.View view = (android.widget.ImageView) this.f141839e.inflate(com.tencent.mm.R.layout.bfo, viewGroup, false);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i65.a.b(this.f141838d, 20);
        view.setLayoutParams(marginLayoutParams);
        viewGroup.addView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.plugin.game.ui.w)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameBlockContentView", "getTag is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.ui.w wVar = (com.tencent.mm.plugin.game.ui.w) view.getTag();
        if (com.tencent.mm.sdk.platformtools.t8.K0(wVar.f141812b)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameBlockContentView", "jumpUrl is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mm.game.report.l.f(this.f141838d, 10, 1002, wVar.f141811a, r53.f.v(this.f141838d, wVar.f141812b, "game_center_mygame_comm", null), this.f141841g, this.f141840f, n53.a.e(wVar.f141813c));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
