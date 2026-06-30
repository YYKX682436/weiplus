package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class j0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.l0 f141574a;

    public j0(com.tencent.mm.plugin.game.ui.message.l0 l0Var) {
        this.f141574a = l0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.game.ui.message.l0 l0Var = this.f141574a;
        l0Var.f141582f.f141602o.setBackgroundResource(com.tencent.mm.R.drawable.aev);
        l0Var.f141580d.field_relationType = 2;
        l0Var.f141582f.f141602o.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmj));
        l0Var.f141582f.f141602o.setBackgroundResource(com.tencent.mm.R.drawable.aew);
        com.tencent.mm.plugin.game.ui.message.o0 o0Var = l0Var.f141582f;
        o0Var.C = (android.graphics.drawable.GradientDrawable) o0Var.f141602o.getBackground();
        if (com.tencent.mm.ui.bk.C()) {
            com.tencent.mm.plugin.game.ui.message.o0 o0Var2 = l0Var.f141582f;
            o0Var2.C.setColor(o0Var2.D.getResources().getColor(com.tencent.mm.R.color.f479184s8));
        }
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.q1(l0Var.f141582f.D, l0Var.f141580d.K2.f140565w, 3, "", 0, 2);
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = l0Var.f141582f.D;
        com.tencent.mm.plugin.game.model.e1 e1Var = l0Var.f141580d;
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.l1(interactiveMsgMRecycleView, e1Var.K2.f140565w, e1Var.field_isGreet, 2);
    }
}
