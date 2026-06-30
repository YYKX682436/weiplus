package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.r f175069d;

    public q(com.tencent.mm.plugin.topstory.ui.home.r rVar) {
        this.f175069d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f175069d.f175075f.l();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
