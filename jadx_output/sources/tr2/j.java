package tr2;

/* loaded from: classes2.dex */
public final class j implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f421385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr2.l f421386b;

    public j(com.tencent.mm.api.IEmojiInfo iEmojiInfo, tr2.l lVar) {
        this.f421385a = iEmojiInfo;
        this.f421386b = lVar;
    }

    @Override // sr.b
    public void a(int i17) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f421385a;
        if (iEmojiInfo.E0() || i17 == 1) {
            tr2.l lVar = this.f421386b;
            android.content.res.Resources resources = lVar.f421390b.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479664c2);
            hc2.f1.z(lVar.f421399k, iEmojiInfo, new tr2.h(dimensionPixelSize), new tr2.i(dimensionPixelSize2));
            com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = lVar.f421399k;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderEmojiView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(finderEmojiView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$onPreviewEmojiChanged$1", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderEmojiView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(finderEmojiView, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$onPreviewEmojiChanged$1", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(finderEmojiView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
