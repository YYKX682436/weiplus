package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.l f207525d;

    public k(com.tencent.mm.ui.conversation.banner.l lVar) {
        this.f207525d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.banner.l lVar = this.f207525d;
        android.content.Intent intent = new android.content.Intent((android.content.Context) lVar.f402842g.get(), (java.lang.Class<?>) com.tencent.mm.ui.contact.SelectContactUI.class);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206780a & (-257));
        intent.putExtra("list_type", 10);
        intent.putExtra("received_card_name", lVar.f207540m);
        intent.putExtra("recommend_friends", true);
        intent.putExtra("titile", ((android.content.Context) lVar.f402842g.get()).getString(com.tencent.mm.R.string.f489934fx));
        android.content.Context context = (android.content.Context) lVar.f402842g.get();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c01.d9.b().n().b(lVar.f207540m);
        c01.d9.b().n().b(lVar.f207541n);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11003, lVar.f207540m, 2, 0);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
