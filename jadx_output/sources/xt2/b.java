package xt2;

/* loaded from: classes3.dex */
public final class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f456625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.d f456626e;

    public b(com.tencent.mm.plugin.finder.live.plugin.l lVar, xt2.d dVar) {
        this.f456625d = lVar;
        this.f456626e = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean a17 = this.f456625d.a1();
        xt2.d dVar = this.f456626e;
        if (a17) {
            dVar.f456666o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            com.tencent.mars.xlog.Log.i(dVar.f456667p, "watchShoppingEntrancePosition removeOnGlobalLayoutListener:" + this);
            return;
        }
        int i17 = dVar.f456668q;
        dVar.f456668q = i17 + 1;
        if (i17 >= Integer.MAX_VALUE) {
            dVar.f456668q = 0;
        }
    }
}
