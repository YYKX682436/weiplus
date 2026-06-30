package cy5;

/* loaded from: classes13.dex */
public class j implements com.tencent.xweb.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final cy5.t f224881a;

    /* renamed from: b, reason: collision with root package name */
    public final cy5.h f224882b;

    /* renamed from: c, reason: collision with root package name */
    public final by5.n0 f224883c;

    /* renamed from: d, reason: collision with root package name */
    public final xx5.n f224884d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f224885e;

    public j(cy5.t tVar, cy5.h hVar, by5.n0 n0Var, xx5.m mVar) {
        xx5.n nVar = new xx5.n();
        this.f224884d = nVar;
        this.f224881a = tVar;
        this.f224882b = hVar;
        this.f224883c = n0Var;
        nVar.f458065g = mVar;
        if (hVar != null) {
            nVar.f458060b = hVar.m();
            nVar.f458061c = hVar.f224879a;
        }
        if (n0Var == null) {
            this.f224885e = false;
            return;
        }
        nVar.f458062d = n0Var.f36574m.f36537e;
        boolean z17 = n0Var.f36571j;
        nVar.f458063e = z17 ? 2 : 1;
        nVar.f458064f = n0Var.f36568g;
        this.f224885e = z17;
    }

    @Override // com.tencent.xweb.b2
    public void a(int i17) {
        java.lang.String m17 = this.f224882b.m();
        if (by5.s0.f36595c == null) {
            return;
        }
        int i18 = this.f224885e ? 51 : 60;
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(m17)) {
            by5.s0.f36595c.b(577L, 185L, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT.equals(m17)) {
            by5.s0.f36595c.b(1068L, i18, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF.equals(m17)) {
            by5.s0.f36595c.b(1071L, i18, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD.equals(m17)) {
            by5.s0.f36595c.b(1069L, i18, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL.equals(m17)) {
            by5.s0.f36595c.b(1070L, i18, 1L);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE.equals(m17)) {
            by5.s0.f36595c.b(1544L, i18, 1L);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT.equals(m17)) {
            by5.s0.f36595c.b(1889L, i18, 1L);
        }
    }

    @Override // com.tencent.xweb.b2
    public void b(int i17) {
        java.lang.String m17 = this.f224882b.m();
        cy5.t tVar = this.f224881a;
        if (tVar.f224903g.f224897a == 3 && tVar.k() && tVar.f224911o.equals(m17)) {
            tVar.f224912p.b(i17);
        }
    }

    @Override // com.tencent.xweb.b2
    public void c(com.tencent.xweb.c2 c2Var) {
        cy5.h hVar = this.f224882b;
        this.f224881a.l(hVar.m(), -1);
        xx5.n nVar = this.f224884d;
        nVar.f458066h = c2Var;
        if (c2Var != null && c2Var.f220228f > 0) {
            nVar.f458067i = java.lang.System.currentTimeMillis() - c2Var.f220228f;
        }
        nVar.f458059a = -2;
        xx5.o.b(nVar);
        by5.s0.h(hVar.m(), this.f224885e);
        cy5.b.a(hVar.m()).V(null);
    }

    @Override // com.tencent.xweb.b2
    public void d(com.tencent.xweb.c2 c2Var) {
        xx5.n nVar = this.f224884d;
        nVar.f458066h = c2Var;
        if (c2Var != null && c2Var.f220228f > 0) {
            nVar.f458067i = java.lang.System.currentTimeMillis() - c2Var.f220228f;
        }
        cy5.h hVar = this.f224882b;
        java.lang.String m17 = hVar.m();
        if (by5.s0.f36595c != null) {
            int i17 = this.f224885e ? 52 : 61;
            if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(m17)) {
                by5.s0.f36595c.b(577L, 186L, 1L);
            } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT.equals(m17)) {
                by5.s0.f36595c.b(1068L, i17, 1L);
            } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF.equals(m17)) {
                by5.s0.f36595c.b(1071L, i17, 1L);
            } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD.equals(m17)) {
                by5.s0.f36595c.b(1069L, i17, 1L);
            } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL.equals(m17)) {
                by5.s0.f36595c.b(1070L, i17, 1L);
            } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE.equals(m17)) {
                by5.s0.f36595c.b(1544L, i17, 1L);
            } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT.equals(m17)) {
                by5.s0.f36595c.b(1889L, i17, 1L);
            }
        }
        cy5.b.a(hVar.m()).V(null);
        new cy5.i(this).e(new java.lang.Void[0]);
    }

    @Override // com.tencent.xweb.b2
    public void e() {
        cy5.h hVar = this.f224882b;
        this.f224881a.l(hVar.m(), -3);
        by5.s0.h(hVar.m(), this.f224885e);
        cy5.b.a(hVar.m()).V(null);
    }
}
