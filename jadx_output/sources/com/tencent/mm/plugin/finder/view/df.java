package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class df implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMentionTitleView f131893d;

    public df(com.tencent.mm.plugin.finder.view.FinderMentionTitleView finderMentionTitleView) {
        this.f131893d = finderMentionTitleView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderMentionTitleView$updateData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.op opVar = this.f131893d.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (opVar != null) {
            kotlin.jvm.internal.o.d(view);
            com.tencent.mm.plugin.finder.convert.op opVar2 = (com.tencent.mm.plugin.finder.convert.op) opVar;
            com.tencent.mm.plugin.finder.convert.rp.p(opVar2.f104213a, view, opVar2.f104214b, opVar2.f104215c.f410411d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderMentionTitleView$updateData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
