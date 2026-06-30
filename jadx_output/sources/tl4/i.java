package tl4;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl4.l f420313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.tp0 f420315f;

    public i(tl4.l lVar, java.lang.String str, bw5.tp0 tp0Var) {
        this.f420313d = lVar;
        this.f420314e = str;
        this.f420315f = tp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qk.b9 b9Var = (qk.b9) i95.n0.c(qk.b9.class);
        com.tencent.unit_rc.WeakPtr weakPtr = this.f420313d.f420321e;
        ef0.q3 q3Var = (ef0.q3) b9Var;
        q3Var.getClass();
        java.lang.String listenId = this.f420314e;
        kotlin.jvm.internal.o.g(listenId, "listenId");
        java.util.Iterator it = q3Var.f252307e.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService = (com.tencent.mm.plugin.ting.media.TingMediaBrowserService) ((rl4.a) it.next());
            tingMediaBrowserService.getClass();
            if (kotlin.jvm.internal.o.b(tingMediaBrowserService.f174700w, weakPtr)) {
                tingMediaBrowserService.B = listenId;
                bw5.tp0 tp0Var = this.f420315f;
                tingMediaBrowserService.C = tp0Var;
                java.lang.String str = tingMediaBrowserService.D;
                java.lang.String str2 = tingMediaBrowserService.E;
                if (tp0Var != null) {
                    str = tingMediaBrowserService.D + " - " + tingMediaBrowserService.E;
                    bw5.tp0 tp0Var2 = tingMediaBrowserService.C;
                    kotlin.jvm.internal.o.d(tp0Var2);
                    str2 = tp0Var2.f33574h[3] ? tp0Var2.f33572f : "";
                    kotlin.jvm.internal.o.f(str2, "getText(...)");
                }
                android.support.v4.media.r rVar = tingMediaBrowserService.F;
                rVar.e("android.media.metadata.DISPLAY_TITLE", str);
                rVar.d("android.media.metadata.TITLE", str);
                rVar.d("android.media.metadata.ARTIST", str2);
                rVar.e("android.media.metadata.DISPLAY_SUBTITLE", str2);
                android.support.v4.media.session.f0 f0Var = tingMediaBrowserService.f174692o;
                if (f0Var == null) {
                    kotlin.jvm.internal.o.o("mSession");
                    throw null;
                }
                f0Var.g(tingMediaBrowserService.F.a());
                tingMediaBrowserService.k(tingMediaBrowserService.f174702y, tingMediaBrowserService.f174701x);
            }
        }
    }
}
