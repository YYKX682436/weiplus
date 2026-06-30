package te5;

/* loaded from: classes9.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final te5.t0 f418750d = new te5.t0();

    public t0() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View view = (android.view.View) obj;
        yb5.d chattingContext = (yb5.d) obj2;
        rd5.d msgData = (rd5.d) obj3;
        com.tencent.mm.ui.chatting.viewitems.g0 chattingHolder = (com.tencent.mm.ui.chatting.viewitems.g0) obj4;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(chattingHolder, "chattingHolder");
        if (!(msgData instanceof qd5.i)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            boolean z17 = false;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2", "invoke", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2", "invoke", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.mvvm.MvvmView mvvmView = view instanceof com.tencent.mm.mvvm.MvvmView ? (com.tencent.mm.mvvm.MvvmView) view : null;
            if (mvvmView != null) {
                z01.l lVar = (z01.l) mvvmView.getViewModel();
                if (lVar == null) {
                    lVar = new z01.l();
                }
                lVar.f469087d = false;
                lVar.f469092i = new te5.r0(chattingContext, msgData);
                com.tencent.mm.ui.chatting.manager.c cVar = chattingContext.f460708c;
                lVar.f469091h = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) cVar.a(sb5.e.class))).f200111m.f190869d;
                wg3.i iVar = (wg3.i) i95.n0.c(wg3.i.class);
                te5.s0 s0Var = new te5.s0(msgData, chattingContext);
                kc5.s sVar = (kc5.s) iVar;
                sVar.getClass();
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(mvvmView, "collection_album_msg_fold_btn");
                ((cy1.a) aVar.ik(mvvmView, 8, 37491)).Ai(mvvmView, new kc5.p(s0Var, sVar));
                mvvmView.setViewModel(lVar);
                sb5.a0 a0Var = (sb5.a0) cVar.a(sb5.a0.class);
                if (a0Var != null) {
                    ((com.tencent.mm.ui.chatting.component.o4) a0Var).q0(msgData.f394254d.f445300b, mvvmView);
                }
                java.lang.String b17 = ic5.f.f290437c.b(msgData.f394254d.f445300b);
                if (a0Var != null) {
                    if (r26.n0.N(b17) ? false : ((com.tencent.mm.ui.chatting.component.o4) a0Var).f199622g.contains(b17)) {
                        z17 = true;
                    }
                }
                mvvmView.setAlpha(z17 ? 0.0f : 1.0f);
            }
        }
        return jz5.f0.f302826a;
    }
}
