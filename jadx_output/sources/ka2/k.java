package ka2;

/* loaded from: classes8.dex */
public final class k implements in5.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306036d;

    public k(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        this.f306036d = finderPoiNormalLbsListUI;
    }

    @Override // in5.z
    public boolean f(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var, android.view.MotionEvent event) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 == 0) {
            return false;
        }
        int action = event.getAction();
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306036d;
        if (action == 0) {
            view.setBackgroundColor(finderPoiNormalLbsListUI.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_5));
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        view.setBackgroundColor(finderPoiNormalLbsListUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478494f));
        return false;
    }
}
