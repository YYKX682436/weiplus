package vr1;

/* loaded from: classes3.dex */
public final class h0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI f439569d;

    public h0(com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI) {
        this.f439569d = bizPCRecentReadUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI = this.f439569d;
            com.tencent.mars.xlog.Log.i(bizPCRecentReadUI.f94063d, "click close make sure");
            androidx.appcompat.app.AppCompatActivity context = bizPCRecentReadUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(vr1.o.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            vr1.o oVar = (vr1.o) a17;
            androidx.appcompat.app.AppCompatActivity context2 = bizPCRecentReadUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(context2).a(vr1.b0.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            bizPCRecentReadUI.T6(oVar.f439583e.f456194e, true, new vr1.g0(oVar));
        }
    }
}
