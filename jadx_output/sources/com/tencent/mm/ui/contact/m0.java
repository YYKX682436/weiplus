package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.CategoryTipView f207021d;

    public m0(com.tencent.mm.ui.contact.CategoryTipView categoryTipView) {
        this.f207021d = categoryTipView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.CategoryTipView categoryTipView = this.f207021d;
        long j17 = categoryTipView.f206336f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 1000) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        categoryTipView.f206336f = android.os.SystemClock.elapsedRealtime();
        if (categoryTipView.c()) {
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct = mf4.d.f326163d;
            storyPreviewReportStruct.f60934t = storyPreviewReportStruct.b("SessionId", categoryTipView.f206337g, true);
            mf4.d.f326163d.f60919e = 6L;
            android.content.Context context = categoryTipView.getContext();
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(new java.util.ArrayList());
                int i17 = com.tencent.mm.plugin.story.ui.StoryBrowseUI.f171862h;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.story.ui.StoryBrowseUI.class);
                intent.putExtra("user_list", arrayList2);
                intent.putExtra("delete_when_first_empty", false);
                intent.putExtra("gallery_session_id", (java.lang.String) null);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/story/api/LaunchStory", "startStoryBrowse", "(Landroid/content/Context;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/story/api/LaunchStory", "startStoryBrowse", "(Landroid/content/Context;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.ClassNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LaunchStory", e17, "startStoryBrowse failed", new java.lang.Object[0]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
