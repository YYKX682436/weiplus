package oe1;

/* loaded from: classes11.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f344728d;

    public o(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView) {
        this.f344728d = appBrandVideoView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f344728d.x();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
