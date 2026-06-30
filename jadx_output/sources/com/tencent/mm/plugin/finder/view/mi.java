package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class mi extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.si f132664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f132665e;

    public mi(com.tencent.mm.plugin.finder.view.si siVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f132664d = siVar;
        this.f132665e = finderJumpInfo;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$1$2$clickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = this.f132664d.f133040b;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f132665e;
        kotlin.jvm.internal.o.f(info, "$info");
        xc2.y2.i(y2Var, context, new xc2.p0(info), 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$1$2$clickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
