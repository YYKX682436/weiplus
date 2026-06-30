package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f204071d;

    public h1(com.tencent.mm.ui.chatting.viewitems.i1 i1Var, com.tencent.mm.ui.chatting.viewitems.v0 v0Var) {
        this.f204071d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) view.getTag();
        int adapterPosition = ((com.tencent.mm.ui.chatting.adapter.q) view.getTag(com.tencent.mm.R.id.bhl)).getAdapterPosition();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "AppBrandNotityMsgMoreViewClickListener onclick");
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppBrandNotifyMsg", "AppBrandNotityMsgMoreViewClickListener, on more view click, but msg is null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        tt0.a a17 = tt0.a.a(f9Var.j());
        java.lang.String str = a17.f421779e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = a17.f421783i;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = a17.f421776b;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = a17.f421777c;
        java.lang.String str8 = str7 == null ? "" : str7;
        android.content.Context context = view.getContext();
        com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f204071d;
        ab5.i iVar = new ab5.i(context, i1Var.A ? 1 : 0, a17.f421778d);
        iVar.f2949u = new com.tencent.mm.ui.chatting.viewitems.g1(this, iVar, str6, str2, str8, str4, adapterPosition, view, f9Var);
        iVar.e(view);
        this.f204071d.e0(7, str2, str8, str4, null, com.tencent.mm.ui.chatting.viewitems.i1.d0(i1Var, adapterPosition));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
