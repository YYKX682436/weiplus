package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class sf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.dg f170456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f170457e;

    public sf(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter, com.tencent.mm.plugin.sns.ui.dg dgVar) {
        this.f170457e = snsCommentFooter;
        this.f170456d = dgVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m17 = ip.c.m();
        fl5.j g17 = fl5.j.g(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(this.f170457e));
        g17.f42561f = 0;
        g17.f42560e = m17;
        g17.f42556a = true;
        g17.d(new com.tencent.mm.plugin.sns.ui.rf(this, m17));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14");
    }
}
