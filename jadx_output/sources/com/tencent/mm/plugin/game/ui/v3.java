package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f141798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameIndexSearchView f141799e;

    public v3(com.tencent.mm.plugin.game.ui.GameIndexSearchView gameIndexSearchView, int i17) {
        this.f141799e = gameIndexSearchView;
        this.f141798d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        com.tencent.mm.plugin.game.ui.GameIndexSearchView gameIndexSearchView = this.f141799e;
        if (tag == null || !(view.getTag() instanceof java.lang.String)) {
            android.content.Intent intent = new android.content.Intent(gameIndexSearchView.f140866d, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameSearchUI.class);
            intent.putExtra("game_report_from_scene", 1001);
            android.content.Context context = gameIndexSearchView.f140866d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i17 = 6;
        } else {
            i17 = r53.f.v(gameIndexSearchView.f140866d, (java.lang.String) view.getTag(), "game_center_msgcenter", null);
        }
        com.tencent.mm.game.report.l.d(gameIndexSearchView.f140866d, 14, 1401, 1, i17, 0, null, this.f141798d, 0, null, null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
