package or1;

/* loaded from: classes5.dex */
public class i2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI f347507d;

    public i2(com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI) {
        this.f347507d = searchOrRecommendBizUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/SearchOrRecommendBizUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI = this.f347507d;
        searchOrRecommendBizUI.f94045f.clearFocus();
        searchOrRecommendBizUI.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/brandservice/ui/SearchOrRecommendBizUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
