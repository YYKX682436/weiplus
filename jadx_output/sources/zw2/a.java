package zw2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.card.FinderProfileCardView f476871d;

    public a(com.tencent.mm.plugin.finder.view.card.FinderProfileCardView finderProfileCardView) {
        this.f476871d = finderProfileCardView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/card/FinderProfileCardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l onClick = this.f476871d.getOnClick();
        if (onClick != null) {
            kotlin.jvm.internal.o.d(view);
            onClick.invoke(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/card/FinderProfileCardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
