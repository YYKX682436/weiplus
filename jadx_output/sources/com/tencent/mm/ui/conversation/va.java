package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class va implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ServiceNotifyConversationUI f208202e;

    public va(com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI, java.lang.String str) {
        this.f208202e = serviceNotifyConversationUI;
        this.f208201d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Search_Scene", 2);
        u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
        androidx.appcompat.app.AppCompatActivity context = this.f208202e.getContext();
        ((s50.g0) vVar).getClass();
        o13.n.q(context, ".ui.FTSServiceNotifyUI", intent);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23903, 6, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, 0, this.f208201d);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
