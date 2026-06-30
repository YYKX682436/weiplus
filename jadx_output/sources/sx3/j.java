package sx3;

/* loaded from: classes10.dex */
public final class j implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx3.m f413560d;

    public j(sx3.m mVar) {
        this.f413560d = mVar;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.util.List data;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            sx3.m mVar = this.f413560d;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = mVar.f413568g;
            if (a07 < ((wxRecyclerAdapter2 == null || (data = wxRecyclerAdapter2.getData()) == null) ? 0 : data.size())) {
                java.util.List data2 = wxRecyclerAdapter.getData();
                android.app.Activity context = mVar.getContext();
                sx3.i iVar = new sx3.i(mVar, i17);
                kotlin.jvm.internal.o.g(context, "context");
                rl5.r rVar = new rl5.r(context, view);
                rVar.f397351u = new by3.b(context);
                rVar.f397354x = new by3.c(iVar);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int width = iArr[0] + (view.getWidth() / 2);
                int i18 = iArr[1];
                int height = view.getHeight() + i18;
                int i19 = i18 >= 0 ? i18 : 0;
                if (height > com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels) {
                    height = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels;
                }
                android.graphics.Point point = new android.graphics.Point(width, (i19 + height) / 2);
                rVar.n(point.x, point.y);
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onLongClick " + a07 + " id:" + ((ox3.g) data2.get(a07)).f349749d.toJSON());
            }
        }
        return true;
    }
}
