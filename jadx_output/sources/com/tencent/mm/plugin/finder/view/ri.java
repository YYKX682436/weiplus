package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ri implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.si f132962d;

    public ri(com.tencent.mm.plugin.finder.view.si siVar) {
        this.f132962d = siVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.si siVar = this.f132962d;
        yz5.l lVar = siVar.f133045g;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(siVar.f133043e));
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(siVar.f133049k)) {
            android.content.Context context = siVar.f133040b;
            db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f491299cp1));
        } else {
            android.content.Context context2 = siVar.f133040b;
            db5.t7.h(context2, context2.getResources().getString(com.tencent.mm.R.string.f491301cp3));
        }
        siVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
