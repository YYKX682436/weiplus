package pk2;

/* loaded from: classes3.dex */
public final class qa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f356201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356202e;

    public qa(com.tencent.mm.plugin.finder.view.e3 e3Var, pk2.o9 o9Var) {
        this.f356201d = e3Var;
        this.f356202e = o9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/VisitorMoreSettingOption$showMoreSettingPanel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f356201d.h();
        pk2.d9 d9Var = this.f356202e.f356082f;
        if (d9Var != null) {
            d9Var.f355663f = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/VisitorMoreSettingOption$showMoreSettingPanel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
