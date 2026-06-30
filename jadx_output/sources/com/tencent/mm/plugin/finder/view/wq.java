package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class wq implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f133308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f133309e;

    public wq(int i17, gk2.e eVar, dk2.zf zfVar) {
        this.f133308d = eVar;
        this.f133309e = zfVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            ((kotlinx.coroutines.flow.h3) ((mm2.j2) this.f133308d.a(mm2.j2.class)).f329165m).k(java.lang.Boolean.FALSE);
            dk2.zf msg = this.f133309e;
            kotlin.jvm.internal.o.g(msg, "msg");
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ij(9, mm2.j2.F.a(msg.p()));
        }
    }
}
