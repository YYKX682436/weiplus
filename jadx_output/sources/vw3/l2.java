package vw3;

/* loaded from: classes.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI f441022d;

    public l2(com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI) {
        this.f441022d = repairerLoginAndRegUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI.g;
        android.content.Context context = this.f441022d;
        context.getClass();
        tm.a.b("<e><Content>Content</Content><Title>Title</Title><Url>https://weixin110.qq.com/security/readtemplate?t=test_jsAPI</Url><ShowType>4</ShowType><Action>1</Action></e>").c(context, null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
