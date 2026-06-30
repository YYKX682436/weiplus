package dm1;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f241637d;

    public h(dm1.m mVar) {
        this.f241637d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dm1.m window = this.f241637d;
        dm1.a aVar = window.f241657l;
        if (aVar != null) {
            kotlin.jvm.internal.o.g(window, "window");
            com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "click accept button");
            cm1.t tVar = cm1.t.f43316a;
            android.content.Context context = ((cm1.g) aVar).f43296a;
            kotlin.jvm.internal.o.f(context, "$context");
            tVar.c();
            tVar.b(context, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
