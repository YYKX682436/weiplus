package vc2;

/* loaded from: classes15.dex */
public class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f435235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager f435236e;

    public b(com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager flowLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f435236e = flowLayoutManager;
        this.f435235d = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f435235d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager flowLayoutManager = this.f435236e;
        flowLayoutManager.f106764q = null;
        wc2.a aVar = flowLayoutManager.f106760m;
        aVar.f444498b = flowLayoutManager.f106759i.c();
        aVar.f444500d.clear();
        aVar.e();
    }
}
