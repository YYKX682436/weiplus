package com.tencent.mm.plugin.subapp.ui.gallery;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.gallery.c f172376d;

    public b(com.tencent.mm.plugin.subapp.ui.gallery.c cVar) {
        this.f172376d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) {
            return;
        }
        com.tencent.mm.plugin.subapp.ui.gallery.c cVar = this.f172376d;
        com.tencent.mm.plugin.subapp.ui.gallery.j jVar = cVar.f172377d;
        if (jVar.f172386d == 1) {
            com.tencent.mm.ui.MMActivity mMActivity = jVar.f172388f;
            db5.e1.s(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490500wu), "");
            cVar.f172377d.e();
        }
    }
}
