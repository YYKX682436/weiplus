package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.e1 f141580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f141581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.o0 f141582f;

    public l0(com.tencent.mm.plugin.game.ui.message.o0 o0Var, com.tencent.mm.plugin.game.model.e1 e1Var, com.tencent.mm.ui.widget.dialog.u1 u1Var) {
        this.f141582f = o0Var;
        this.f141580d = e1Var;
        this.f141581e = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.message.o0 o0Var = this.f141582f;
        android.view.ViewGroup.LayoutParams layoutParams = o0Var.f141602o.getLayoutParams();
        layoutParams.width = i65.a.b(o0Var.D.f141493f2, 66);
        o0Var.f141602o.setTextColor(o0Var.D.f141493f2.getResources().getColor(com.tencent.mm.R.color.BW_100));
        com.tencent.mm.plugin.game.model.e1 e1Var = this.f141580d;
        int i17 = e1Var.field_relationType;
        if (i17 == 0) {
            o0Var.f141602o.setBackgroundResource(com.tencent.mm.R.drawable.aev);
            o0Var.f141602o.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmk));
            o0Var.f141602o.setTextColor(o0Var.D.f141493f2.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
            e1Var.field_relationType = 1;
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.q1(o0Var.D, e1Var.K2.f140565w, 3, "", 0, 1);
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.l1(o0Var.D, e1Var.K2.f140565w, e1Var.field_isGreet, 1);
        } else if (i17 != 2) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = this.f141581e;
            if (i17 != 3) {
                u1Var.q(false);
                u1Var.l(new com.tencent.mm.plugin.game.ui.message.k0(this));
            } else {
                u1Var.q(false);
                u1Var.l(new com.tencent.mm.plugin.game.ui.message.j0(this));
            }
        } else {
            o0Var.f141602o.setBackgroundResource(com.tencent.mm.R.drawable.aev);
            o0Var.f141602o.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fme));
            o0Var.f141602o.setTextColor(o0Var.D.f141493f2.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
            layoutParams.width = i65.a.b(o0Var.D.f141493f2, 80);
            e1Var.field_relationType = 3;
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.q1(o0Var.D, e1Var.K2.f140565w, 3, "", 0, 1);
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.l1(o0Var.D, e1Var.K2.f140565w, e1Var.field_isGreet, 3);
        }
        o0Var.f141602o.setLayoutParams(layoutParams);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
