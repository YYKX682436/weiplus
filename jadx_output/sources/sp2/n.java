package sp2;

/* loaded from: classes2.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.p f411102d;

    public n(sp2.p pVar) {
        this.f411102d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveChatCreateAccountBottomSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        sp2.p pVar = this.f411102d;
        zy2.zb.qd(zbVar, 18, pVar.f411171c, pVar.f411170b, null, 8, null);
        pVar.f411172d.invoke();
        ((com.tencent.mm.plugin.finder.view.e3) ((jz5.n) pVar.f411174f).getValue()).h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveChatCreateAccountBottomSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
