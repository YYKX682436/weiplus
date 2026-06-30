package v01;

/* loaded from: classes7.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.ui.BizProfileCardFragment f432197d;

    public b(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment) {
        this.f432197d = bizProfileCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initBanBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment = this.f432197d;
        android.content.Context context = bizProfileCardFragment.getContext();
        com.tencent.wechat.mm.biz.b bVar = bizProfileCardFragment.f70866n;
        if (context != null && bVar != null) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            java.lang.String str = bVar.f217896o;
            kotlin.jvm.internal.o.f(str, "getBanUrl(...)");
            ((ox.g) oVar).tj(context, str);
        }
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initBanBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
