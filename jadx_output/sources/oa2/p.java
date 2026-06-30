package oa2;

/* loaded from: classes.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa2.w f343830e;

    public p(java.lang.String str, oa2.w wVar) {
        this.f343829d = str;
        this.f343830e = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$initDesigner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", this.f343829d);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(this.f343830e.getContext(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$initDesigner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
