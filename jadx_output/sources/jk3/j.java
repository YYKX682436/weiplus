package jk3;

/* loaded from: classes8.dex */
public final class j implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f300090b;

    public j(jk3.v vVar, boolean z17) {
        this.f300089a = vVar;
        this.f300090b = z17;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation end ,way:" + i17);
        com.tencent.mm.sdk.platformtools.u3.i(new jk3.i(this.f300089a, this.f300090b, bitmap), 150L);
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        jk3.v vVar = this.f300089a;
        jk3.f fVar = vVar.f300125r;
        if (fVar != null) {
            kk3.c.h(fVar, vVar.f300077a, null, 2, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation start, isSwipeBack:" + z17 + ", way:" + i17);
        kk3.d dVar = vVar.f300117j;
        if (dVar != null) {
            kk3.d.c(dVar, bitmap, z17, 0, 4, null);
        }
        vVar.f300124q = vVar.f();
    }

    @Override // kk3.d
    public void e(int i17) {
        android.app.Activity activity;
        android.content.res.Resources resources;
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation cancel, way:" + i17);
        jk3.v vVar = this.f300089a;
        ak3.c cVar = vVar.f300111d;
        java.lang.String str = null;
        vVar.l(vVar.P(cVar != null ? cVar.getBitmap() : null, vVar.f()), true);
        jk3.f fVar = vVar.f300125r;
        if (fVar != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new pk3.j((pk3.l) fVar, false, false, null));
        }
        boolean z17 = this.f300090b;
        ak3.c cVar2 = vVar.f300111d;
        if (!z17 && vVar.f300128u) {
            if (cVar2 != null) {
                cVar2.j(true, vVar);
                return;
            }
            return;
        }
        if (vVar.f300128u || !vVar.T()) {
            return;
        }
        if ((cVar2 != null ? cVar2.getActivity() : null) != null) {
            android.app.Activity activity2 = cVar2 != null ? cVar2.getActivity() : null;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity2);
            if (cVar2 != null && (activity = cVar2.getActivity()) != null && (resources = activity.getResources()) != null) {
                str = resources.getString(com.tencent.mm.R.string.oa7);
            }
            e4Var.f211776c = str;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        }
    }
}
