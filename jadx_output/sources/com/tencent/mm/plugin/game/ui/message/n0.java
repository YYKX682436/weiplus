package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.e1 f141591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.o0 f141592e;

    public n0(com.tencent.mm.plugin.game.ui.message.o0 o0Var, com.tencent.mm.plugin.game.model.e1 e1Var) {
        this.f141592e = o0Var;
        this.f141591d = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.e1 e1Var = this.f141591d;
        com.tencent.mm.plugin.game.model.r0 r0Var = (com.tencent.mm.plugin.game.model.r0) e1Var.f140282g2.get(e1Var.K2.f140567y);
        com.tencent.mm.plugin.game.ui.message.o0 o0Var = this.f141592e;
        if (r0Var != null) {
            r0Var.jump_type = 1;
            r53.f.s(o0Var.D.f141493f2, r0Var, "", "", null);
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", "获取reply JumpInfo失败");
        com.tencent.mm.plugin.game.model.r0 r0Var2 = (com.tencent.mm.plugin.game.model.r0) e1Var.f140282g2.get(e1Var.K2.f140543a);
        if (r0Var2 != null) {
            r0Var2.jump_type = 1;
            s33.y.h(o0Var.D.f141493f2, r0Var2);
            com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", "获取post JumpInfo失败");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
