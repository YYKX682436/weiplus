package ir1;

/* loaded from: classes11.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f294042d;

    public r0(ir1.i1 i1Var) {
        this.f294042d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ir1.i1 i1Var = this.f294042d;
        i1Var.f293984d.B();
        if (i1Var.f293986f == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            a17 = jr1.j.c(((ox.r) d0Var).Bi(2).c());
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            a17 = jr1.j.a(((ox.r) d0Var2).Bi(1).c());
        }
        android.content.Intent intent = new android.content.Intent();
        hr1.a aVar = i1Var.P;
        kotlin.jvm.internal.o.d(aVar);
        intent.putExtra("Chat_User", aVar.field_openid);
        intent.putExtra("Chat_Self", a17);
        intent.putExtra("finish_direct", true);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        intent.putExtra("chat_from_scene", 1);
        yn.g.a(intent, com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent.class);
        j45.l.u(i1Var.getContext(), ".ui.chatting.ChattingUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
