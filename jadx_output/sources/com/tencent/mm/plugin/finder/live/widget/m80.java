package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class m80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.l80 f119053d;

    public m80(com.tencent.mm.plugin.finder.live.widget.l80 l80Var) {
        this.f119053d = l80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAssistantMoreActionPanel$GridAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f119053d.f118920c.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAssistantMoreActionPanel$GridAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
