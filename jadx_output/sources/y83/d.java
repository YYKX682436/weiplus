package y83;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent f459982d;

    public d(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent) {
        this.f459982d = kidsWatchHeadComponent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent$prepareViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("KidsWatchHeadComponent", "click help icon");
        a93.a aVar = a93.a.f2429a;
        android.content.Context context = this.f459982d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.b(context, "wxaaff6b96fc2cd3c6", "pages/help/help.html", bb1.d.CTRL_INDEX, "1");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent$prepareViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
