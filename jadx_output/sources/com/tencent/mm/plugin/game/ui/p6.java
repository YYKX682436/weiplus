package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class p6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141718d;

    /* renamed from: e, reason: collision with root package name */
    public int f141719e;

    /* renamed from: f, reason: collision with root package name */
    public int f141720f;

    /* renamed from: g, reason: collision with root package name */
    public int f141721g;

    public p6(android.content.Context context, int i17) {
        this.f141718d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = view.getTag() instanceof com.tencent.mm.plugin.game.model.e1;
        android.content.Context context = this.f141718d;
        if (z17) {
            com.tencent.mm.plugin.game.model.e1 e1Var = (com.tencent.mm.plugin.game.model.e1) view.getTag();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(e1Var.f140275b2)) {
                ((com.tencent.mm.plugin.game.model.v0) e1Var.f140275b2.get(0)).getClass();
                if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameURLClickListener", "message's jumpurl is null");
                } else {
                    com.tencent.mm.game.report.l.d(this.f141718d, 13, this.f141720f, this.f141721g, r53.f.v(context, null, null, null), 0, e1Var.field_appId, this.f141719e, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, com.tencent.mm.game.report.l.a(null, null, e1Var.U2, null));
                }
            }
        } else if (view.getTag() instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) view.getTag();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                com.tencent.mm.game.report.l.c(this.f141718d, 13, this.f141720f, this.f141721g, r53.f.v(context, str, null, null), this.f141719e, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
