package com.tencent.mm.ui.chatting.component;

/* loaded from: classes7.dex */
public class q7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f199756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f199757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.n7 f199758f;

    public q7(com.tencent.mm.ui.chatting.component.n7 n7Var, boolean z17, android.content.Context context) {
        this.f199758f = n7Var;
        this.f199756d = z17;
        this.f199757e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f199756d;
        com.tencent.mm.ui.chatting.component.n7 n7Var = this.f199758f;
        if (z17) {
            android.content.Context context = this.f199757e;
            n7Var.getClass();
            com.tencent.mm.plugin.appbrand.service.k6 k6Var = (com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class);
            java.lang.String str = n7Var.f199549e;
            ((com.tencent.mm.plugin.appbrand.app.t2) k6Var).getClass();
            com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.V6(context, str, 5, null, true, null, null, null);
        } else {
            android.content.Context context2 = this.f199757e;
            n7Var.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context2, com.tencent.mm.plugin.profile.ui.ContactInfoUI.class);
            intent.putExtra("Contact_User", n7Var.f199549e);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent", "startContactUIActivity", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent", "startContactUIActivity", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21825, 6, n7Var.f199549e, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, null, 0, 0, 0, java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.qg.c(n7Var.f199549e)), te5.v1.f418758b);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
