package za3;

/* loaded from: classes3.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.PoiHeaderView f470969d;

    public k(com.tencent.mm.plugin.location.ui.PoiHeaderView poiHeaderView) {
        this.f470969d = poiHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/PoiHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.location.ui.PoiHeaderView poiHeaderView = this.f470969d;
        intent.putExtra("rawUrl", com.tencent.mm.sdk.platformtools.t8.K0(poiHeaderView.f144627f) ? poiHeaderView.f144626e : poiHeaderView.f144627f);
        intent.putExtra("showShare", false);
        j45.l.u(poiHeaderView.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/PoiHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
