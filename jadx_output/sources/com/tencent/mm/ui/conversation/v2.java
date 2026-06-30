package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class v2 implements com.tencent.mm.ui.conversation.p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.w2 f208181a;

    public v2(com.tencent.mm.ui.conversation.w2 w2Var) {
        this.f208181a = w2Var;
    }

    @Override // com.tencent.mm.ui.conversation.p2
    public void a(int i17) {
        ((yf5.w0) this.f208181a.f208211d).f461988t.b(i17);
    }

    @Override // com.tencent.mm.ui.conversation.p2
    public void b(android.view.View view, int i17, java.lang.String str) {
        yf5.w0 w0Var = (yf5.w0) this.f208181a.f208211d;
        if (view == null) {
            w0Var.getClass();
            return;
        }
        com.tencent.mm.ui.conversation.b3 b3Var = w0Var.f461988t;
        boolean z17 = b3Var.f207460b != null;
        java.lang.String str2 = w0Var.f461978g;
        if (z17 && !com.tencent.mm.ui.bk.y()) {
            com.tencent.mars.xlog.Log.w(str2, "[onClickItem] has click! position:%s username:%s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, "[onClickItem] position:%s username:%s", java.lang.Integer.valueOf(i17), str);
        boolean X3 = com.tencent.mm.storage.z3.X3(str);
        com.tencent.mm.ui.conversation.o5 o5Var = w0Var.f461976e;
        if (X3) {
            o5Var.v();
            return;
        }
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
        yf5.n nVar = (yf5.n) tag;
        kotlin.jvm.internal.o.d(str);
        b3Var.a(str, view, nVar);
        if (com.tencent.mm.ui.bk.y()) {
            w0Var.notifyDataSetChanged();
        }
        java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.cip);
        kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.storage.Conversation");
        com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) tag2;
        if (com.tencent.mm.storage.z3.B3(str)) {
            com.tencent.mm.plugin.appbrand.service.i5 i5Var = (com.tencent.mm.plugin.appbrand.service.i5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i5.class);
            java.lang.String valueOf = java.lang.String.valueOf(gm0.j1.b().h());
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (valueOf == null) {
                valueOf = "";
            }
            com.tencent.mm.plugin.appbrand.app.d0 d0Var = (com.tencent.mm.plugin.appbrand.app.d0) i5Var;
            d0Var.wi(valueOf);
            d0Var.f75048e = new com.tencent.mm.plugin.appbrand.service.h5(l4Var.d1(), i17 + 1);
        }
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().H(l4Var)) {
            o5Var.d(l4Var);
        }
        bg5.k.f20757a.a(str, o5Var.n(), o5Var.f207940w, i17, 0, 0L);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = nVar.f461924k;
        if (weImageView != null && weImageView.getVisibility() == 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = nVar.f461924k;
            weImageView2.setIconColor(i65.a.d(weImageView2.getContext(), com.tencent.mm.R.color.FG_2));
        }
        android.widget.TextView textView = nVar.f461920g;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.View view2 = nVar.f461925l;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter", "hideRedDotTemporary", "(Lcom/tencent/mm/ui/conversation/adapter/ConvViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter", "hideRedDotTemporary", "(Lcom/tencent/mm/ui/conversation/adapter/ConvViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.conversation.p2
    public void c(java.lang.String str, android.os.Bundle bundle) {
        android.app.Activity activity = this.f208181a.f208213f;
        if (activity instanceof com.tencent.mm.ui.LauncherUI) {
            ((com.tencent.mm.ui.LauncherUI) activity).startChatting(str, bundle, true);
        }
    }
}
