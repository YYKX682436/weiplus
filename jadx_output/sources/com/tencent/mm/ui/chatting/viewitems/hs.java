package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes16.dex */
public final class hs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.gs f204144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204146g;

    public hs(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.gs gsVar, java.lang.String str, java.lang.String str2) {
        this.f204143d = f9Var;
        this.f204144e = gsVar;
        this.f204145f = str;
        this.f204146g = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemEcsKfProductCard$filling$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("whole card click, msgSvrId=");
        com.tencent.mm.storage.f9 msg = this.f204143d;
        sb6.append(msg.I0());
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemEcsKfProductCard", sb6.toString());
        com.tencent.mm.ui.chatting.viewitems.ms msVar = this.f204144e.I0;
        if (msVar != null) {
            java.lang.String base64Str = this.f204145f;
            kotlin.jvm.internal.o.g(base64Str, "base64Str");
            kotlin.jvm.internal.o.g(msg, "msg");
            java.lang.String talker = this.f204146g;
            kotlin.jvm.internal.o.g(talker, "talker");
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", msg, "ecs_kf_card_template_body");
            msVar.b(base64Str, talker);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemEcsKfProductCard$filling$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
