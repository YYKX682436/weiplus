package vr3;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm f439653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr3.z f439654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f439656g;

    public x(r45.mm mmVar, vr3.z zVar, int i17, int i18) {
        this.f439653d = mmVar;
        this.f439654e = zVar;
        this.f439655f = i17;
        this.f439656g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.mm mmVar = this.f439653d;
        int i17 = mmVar.f380636e;
        int i18 = this.f439655f;
        vr3.z zVar = this.f439654e;
        if (i17 == 1) {
            com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = zVar.f439669o;
            if (m0Var != null) {
                m0Var.e(new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f439656g)));
            }
            tr3.d.b(zVar.f439663f, java.lang.String.valueOf(mmVar.f380635d), mmVar.f380638g, "menu_click", 0, 0, 126, mmVar.f380637f, tr3.d.a(i18, -1), "");
            return;
        }
        if (i17 == 2) {
            sr3.h.b(mmVar, zVar.f439661d, zVar.f439663f, 59);
            tr3.d.b(zVar.f439663f, java.lang.String.valueOf(mmVar.f380635d), mmVar.f380638g, "menu_click", 0, 0, 126, mmVar.f380637f, tr3.d.a(i18, -1), mmVar.f380642n);
            return;
        }
        if (i17 == 5) {
            sr3.h.c(mmVar, zVar.f439661d, zVar.f439663f);
            tr3.d.b(zVar.f439663f, java.lang.String.valueOf(mmVar.f380635d), mmVar.f380638g, "menu_click", 0, 0, 126, mmVar.f380637f, tr3.d.a(i18, -1), mmVar.f380639h);
            return;
        }
        if (i17 == 6) {
            sr3.h.a(mmVar, zVar.f439661d, zVar.f439663f);
            tr3.d.b(zVar.f439663f, java.lang.String.valueOf(mmVar.f380635d), mmVar.f380638g, "menu_click", 0, 0, 126, mmVar.f380637f, tr3.d.a(i18, -1), mmVar.f380639h);
            return;
        }
        int i19 = 0;
        if (i17 != 7) {
            if (i17 != 9) {
                return;
            }
            cs3.f fVar = zVar.f439668n;
            if (fVar != null) {
                com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer h17 = fVar.h();
                if (h17.q()) {
                    h17.n(true);
                }
            }
            com.tencent.mm.plugin.profile.ui.tab.m0 m0Var2 = zVar.f439669o;
            if (m0Var2 != null) {
                m0Var2.l(false);
            }
            tr3.d.b(zVar.f439663f, java.lang.String.valueOf(mmVar.f380635d), mmVar.f380638g, "menu_click", 0, 0, 126, mmVar.f380637f, tr3.d.a(i18, -1), mmVar.f380639h);
            return;
        }
        android.content.Context context = zVar.f439661d;
        java.lang.String str = zVar.f439663f;
        bw5.nf0 nf0Var = mmVar.f380644p;
        if (nf0Var == null || nf0Var.b() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewBizInfoUtil", "jumpToEcs param null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewBizInfoUtil", "jumpToEcs");
            bw5.x7 b17 = mmVar.f380644p.b();
            if (b17.f() != null) {
                if (b17.f().f33757g == 0) {
                    b17.f().g(1102);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17.f().c())) {
                    java.lang.String str2 = mmVar.f380638g;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        i19 = str2.length() - str2.replace("_", "").length();
                    }
                    b17.f().i(java.lang.String.format("%s:%s:%s:%s", str, java.lang.Integer.valueOf(i19), mmVar.f380637f, b17.f().getPath()));
                }
            }
            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(new pq.a(context), mmVar.f380644p.b(), null);
        }
        tr3.d.b(zVar.f439663f, java.lang.String.valueOf(mmVar.f380635d), mmVar.f380638g, "menu_click", 0, 0, 126, mmVar.f380637f, tr3.d.a(i18, -1), "");
    }
}
