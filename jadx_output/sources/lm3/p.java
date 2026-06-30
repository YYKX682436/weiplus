package lm3;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.e f319498d;

    public p(lm3.e eVar) {
        this.f319498d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initLocalPostStats$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Long l17 = this.f319498d.f319482d.f264121a;
        if (l17 != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(l17.longValue());
            if (f17 != null) {
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                mv2.f0.f331561a.s(f17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initLocalPostStats$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
