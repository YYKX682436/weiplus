package qd2;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostAnnounceItemsView f361812d;

    public p0(com.tencent.mm.plugin.finder.view.FinderPostAnnounceItemsView finderPostAnnounceItemsView) {
        this.f361812d = finderPostAnnounceItemsView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$2$3$content0$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = this.f361812d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zy2.ta.f(e1Var, context, "wxalite65c6e1ccd7fa8ec919f16572a4b6181c", "pages/Apply", null, false, false, false, null, null, 504, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$2$3$content0$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
