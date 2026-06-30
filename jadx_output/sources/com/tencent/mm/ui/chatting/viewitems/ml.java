package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes2.dex */
public final class ml implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f204585d;

    public ml(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f204585d = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveSubscriptionNotifyTmpl$filling$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f204585d;
        if (info != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.g(info, "info");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(info);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveSubscriptionNotifyTmpl$filling$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
