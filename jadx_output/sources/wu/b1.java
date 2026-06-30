package wu;

/* loaded from: classes9.dex */
public final class b1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.b0 b0Var = new z01.b0();
        b0Var.f468954f = com.tencent.mm.R.drawable.d87;
        s15.h hVar = item.f284997e;
        b0Var.f468952d = hVar.getString(hVar.f303422d + 0);
        b0Var.f468953e = hVar.getString(hVar.f303422d + 1);
        b0Var.f468955g = new wu.a1(this, item);
        mvvmView.setViewModel(b0Var);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        s15.h hVar = item.f284997e;
        s15.i0 H = hVar.H();
        if (H == null || (str = H.toXml()) == null) {
            str = "";
        }
        hu.f fVar = new hu.f();
        hu.f fVar2 = this.f449610e;
        fVar.w(fVar2.n());
        fVar.y(fVar2.p());
        fVar.z(fVar2.q());
        fVar.x(fVar2.o());
        fVar.u(0);
        fVar.A(str);
        fVar.C(hVar.getString(hVar.f303422d + 0));
        fVar.B(false);
        fVar.t(fVar2.j() + 1);
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.tencent.mm.feature.appmsg.ui.RecordDetailUI.class);
        intent.putExtra("params", fVar.toJson().toString());
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailRecordItemConvert", "onClickFromRefer", "(Landroid/view/View;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailRecordItemConvert", "onClickFromRefer", "(Landroid/view/View;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingRecordMvvmView chattingRecordMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingRecordMvvmView(context, null, 0, 6, null);
        chattingRecordMvvmView.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(chattingRecordMvvmView, -2, -2);
    }
}
