package gd2;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f270557d;

    public s(gd2.x xVar) {
        this.f270557d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gd2.x xVar = this.f270557d;
        ((gd2.j) xVar.f270567d).a();
        xVar.b();
        com.tencent.mm.autogen.events.CancelScanTranslationEvent cancelScanTranslationEvent = new com.tencent.mm.autogen.events.CancelScanTranslationEvent();
        int i17 = xVar.f270568e ? 6 : 5;
        am.r1 r1Var = cancelScanTranslationEvent.f54027g;
        r1Var.f7757a = i17;
        r1Var.f7758b = xVar.f270570g;
        cancelScanTranslationEvent.e();
        xVar.c();
        xVar.f270570g = 0;
        xVar.f270571h = null;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
