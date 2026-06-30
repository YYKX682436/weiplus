package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderJumpAnchorView f124041d;

    public o3(com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView) {
        this.f124041d = finderJumpAnchorView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$justWatchedLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView = this.f124041d;
        java.lang.Object tag = finderJumpAnchorView.getTag(com.tencent.mm.R.id.rld);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        if (intValue == 10) {
            java.lang.Object tag2 = finderJumpAnchorView.getTag(com.tencent.mm.R.id.rlb);
            aVar = kotlin.jvm.internal.m0.f(tag2, 0) ? (yz5.a) tag2 : null;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (intValue == 11) {
            java.lang.Object tag3 = finderJumpAnchorView.getTag(com.tencent.mm.R.id.rlc);
            aVar = kotlin.jvm.internal.m0.f(tag3, 0) ? (yz5.a) tag3 : null;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$justWatchedLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
