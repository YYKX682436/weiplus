package jj1;

/* loaded from: classes15.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage f299964d;

    public a(com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage wxaShareMessagePage) {
        this.f299964d = wxaShareMessagePage;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/share/widget/WxaShareMessagePage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k01.t0 t0Var = this.f299964d.f88861q;
        if (t0Var != null) {
            t0Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/share/widget/WxaShareMessagePage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
