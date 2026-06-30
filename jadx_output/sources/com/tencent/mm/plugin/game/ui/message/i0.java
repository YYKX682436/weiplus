package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f141568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.e1 f141569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f141570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.o0 f141571g;

    public i0(com.tencent.mm.plugin.game.ui.message.o0 o0Var, android.widget.TextView textView, com.tencent.mm.plugin.game.model.e1 e1Var, android.widget.ImageView imageView) {
        this.f141571g = o0Var;
        this.f141568d = textView;
        this.f141569e = e1Var;
        this.f141570f = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = this.f141568d;
        boolean equals = textView.getText().equals(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fml));
        android.widget.ImageView imageView = this.f141570f;
        com.tencent.mm.plugin.game.ui.message.o0 o0Var = this.f141571g;
        com.tencent.mm.plugin.game.model.e1 e1Var = this.f141569e;
        if (equals) {
            e1Var.field_isGreet = true;
            textView.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmm));
            textView.setTextColor(o0Var.D.f141493f2.getResources().getColor(com.tencent.mm.R.color.f479173rx));
            imageView.setImageResource(com.tencent.mm.R.raw.game_comment_liked);
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.q1(o0Var.D, e1Var.K2.f140565w, 2, "", 1, 0);
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.l1(o0Var.D, e1Var.K2.f140565w, true, e1Var.field_relationType);
        } else {
            e1Var.field_isGreet = false;
            textView.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fml));
            textView.setTextColor(o0Var.D.f141493f2.getResources().getColor(com.tencent.mm.R.color.FG_0));
            if (com.tencent.mm.ui.bk.C()) {
                imageView.setImageResource(com.tencent.mm.R.raw.game_comment_like_dark);
            } else {
                imageView.setImageResource(com.tencent.mm.R.raw.game_comment_like);
            }
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.q1(o0Var.D, e1Var.K2.f140565w, 2, "", 2, 0);
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.l1(o0Var.D, e1Var.K2.f140565w, false, e1Var.field_relationType);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
