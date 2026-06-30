package od5;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od5.g f344657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f344658e;

    public d(od5.g gVar, com.tencent.mm.storage.f9 f9Var) {
        this.f344657d = gVar;
        this.f344658e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/mvvm/MvvmChattingItem$dealItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sb5.g1 g1Var = (sb5.g1) this.f344657d.f344662f.f460708c.a(sb5.g1.class);
        long createTime = this.f344658e.getCreateTime();
        com.tencent.mm.ui.chatting.component.f6 f6Var = (com.tencent.mm.ui.chatting.component.f6) g1Var;
        f6Var.getClass();
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigTimeDetailEnable()) != 0) {
            f6Var.f199013e = !f6Var.f199013e;
            ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) f6Var.f198580d.f460708c.a(sb5.z.class))).h(new java.lang.Object());
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("view_id", "in_chat_time_button");
            lVarArr[1] = new jz5.l("chat_name", f6Var.f198580d.x());
            lVarArr[2] = new jz5.l("after_click_time_status", java.lang.Integer.valueOf(f6Var.f199013e ? 1 : 2));
            lVarArr[3] = new jz5.l("message_timestamp", java.lang.Long.valueOf(createTime));
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 35480);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMsgTimeDetailComponent", "changeShowTimeDetailState: " + f6Var.f199013e);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/mvvm/MvvmChattingItem$dealItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
