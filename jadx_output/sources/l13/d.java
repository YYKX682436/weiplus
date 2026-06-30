package l13;

/* loaded from: classes15.dex */
public final class d extends androidx.recyclerview.widget.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager f314990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f314991b;

    public d(com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager stackLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f314990a = stackLayoutManager;
        this.f314991b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.u2
    public boolean a(int i17, int i18) {
        l13.b bVar = i18 < 0 ? l13.b.f314987e : l13.b.f314986d;
        com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager stackLayoutManager = this.f314990a;
        int height = stackLayoutManager.getHeight() * (stackLayoutManager.getItemCount() - 1);
        int i19 = stackLayoutManager.f137360m;
        boolean z17 = false;
        if (1 <= i19 && i19 < height) {
            z17 = true;
        }
        if (z17) {
            stackLayoutManager.f137361n = true;
        }
        com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager.m(stackLayoutManager, this.f314991b, bVar);
        return true;
    }
}
