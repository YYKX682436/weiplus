package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f171630d;

    public yf(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f171630d = snsCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsAdAtFriendRedDot", 0) == 1) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.NEW_BANDAGE_SNS_AD_COMMENT_AT_RED_DOT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        }
        java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f171630d;
        android.widget.ImageView imageView = snsCommentFooter.f167096o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        imageView.setVisibility(8);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", 16391);
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("max_limit_num", 1);
        intent.putExtra("titile", com.tencent.mm.plugin.sns.ui.SnsCommentFooter.i(snsCommentFooter).getString(com.tencent.mm.R.string.j6l));
        j45.l.v(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.i(snsCommentFooter), ".ui.contact.SelectContactUI", intent, 2333);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$6");
    }
}
