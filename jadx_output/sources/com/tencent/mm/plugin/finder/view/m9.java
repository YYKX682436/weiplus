package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendReadingView f132634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132635e;

    public m9(com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView, java.lang.String str) {
        this.f132634d = finderExtendReadingView;
        this.f132635e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setVerifyingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f132634d.f131047e;
        if (lVar != null) {
            lVar.invoke(this.f132635e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setVerifyingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
