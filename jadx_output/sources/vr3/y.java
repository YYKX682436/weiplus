package vr3;

/* loaded from: classes10.dex */
public final class y implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f439657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr3.z f439658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cs3.f f439659f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439660g;

    public y(androidx.recyclerview.widget.RecyclerView recyclerView, vr3.z zVar, cs3.f fVar, yz5.l lVar) {
        this.f439657d = recyclerView;
        this.f439658e = zVar;
        this.f439659f = fVar;
        this.f439660g = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f439657d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int a17 = this.f439658e.a(this.f439659f);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "content measure callback, height: " + a17);
        this.f439660g.invoke(java.lang.Integer.valueOf(a17));
    }
}
