package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class j1 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f141575d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.message.i1 f141576e;

    public j1(int i17, com.tencent.mm.plugin.game.ui.message.i1 i1Var) {
        this.f141575d = i17;
        this.f141576e = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.model.r0 r0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.ui.message.h1)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.ui.message.h1 h1Var = (com.tencent.mm.plugin.game.ui.message.h1) view.getTag();
        if (h1Var.f141562a == null || (r0Var = h1Var.f141563b) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Context context = view.getContext();
        com.tencent.mm.plugin.game.model.e1 e1Var = h1Var.f141562a;
        int a17 = com.tencent.mm.plugin.game.model.g1.a(context, e1Var, r0Var, e1Var.field_appId, this.f141575d);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tab", "2");
        hashMap.put("isnew", h1Var.f141565d ? "1" : "2");
        hashMap.put("fold", java.lang.String.valueOf(e1Var.field_hasMergedCount));
        hashMap.put("ext_data", e1Var.U2);
        com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, h1Var.f141564c, a17, 0, e1Var.field_appId, this.f141575d, e1Var.S2, e1Var.field_gameMsgId, e1Var.T2, com.tencent.mm.game.report.l.b(hashMap));
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.ui.message.h1)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.tencent.mm.plugin.game.ui.message.h1 h1Var = (com.tencent.mm.plugin.game.ui.message.h1) view.getTag();
        if (h1Var.f141562a == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        rl5.r rVar = new rl5.r(view.getContext(), view);
        rVar.f397351u = new com.tencent.mm.plugin.game.ui.message.d1(this, h1Var);
        rVar.f397354x = new com.tencent.mm.plugin.game.ui.message.g1(this, h1Var, view);
        rVar.m();
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
