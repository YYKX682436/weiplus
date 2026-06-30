package ln4;

/* loaded from: classes4.dex */
public class e implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f319904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.p1 f319905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln4.f f319906f;

    public e(ln4.f fVar, int i17, pn4.p1 p1Var) {
        this.f319906f = fVar;
        this.f319904d = i17;
        this.f319905e = p1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        pn4.p1 p1Var = this.f319905e;
        java.lang.String str = p1Var.f357174d;
        if (this.f319904d != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreTranslate", "translate error");
            return true;
        }
        int i17 = p1Var.f357181k;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreTranslate", "translate ret not ok : %s", java.lang.Integer.valueOf(i17));
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(p1Var.f357173c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreTranslate", "translate return null");
            return true;
        }
        int i18 = p1Var.f357179i;
        if (i18 == 0 || i18 == 1) {
            this.f319906f.f319907a.getClass();
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(p1Var.f357175e, com.tencent.mm.sdk.platformtools.t8.E1(p1Var.f357174d));
            Li.D1(p1Var.f357173c);
            java.lang.String str2 = p1Var.f357176f;
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.sdk.platformtools.t8.n(str2);
            Li.C1(str2);
            Li.T = p1Var.f357177g;
            Li.f236178r = true;
            if (p1Var.f357178h == 1) {
                if (Li.i2()) {
                    Li.l1(Li.F | 1024);
                }
            } else if (Li.i2()) {
                Li.l1(Li.F & (-1025));
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
            gm.m mVar = new gm.m();
            mVar.y0(java.lang.Long.toString(Li.I0()));
            mVar.A0(Li.Q0());
            mVar.z0(Li.T0());
            mVar.D0(p1Var.f357172b);
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreTranslate", "Save code: " + mVar.w0() + ", receiver: " + mVar.u0() + ", srvId:" + Li.I0() + ", talker:" + Li.Q0());
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).getClass();
            ((pn4.l1) ((mn4.f) i95.n0.c(mn4.f.class))).getClass();
            java.lang.String t07 = mVar.t0();
            java.lang.String v07 = mVar.v0();
            boolean z17 = false;
            if (t07 == null || t07.trim().isEmpty() || v07 == null || v07.trim().isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TranslateService", "saveTranslateContext failed, params invalid, contentId: " + t07 + ", senderId: " + v07);
            } else {
                ((gm.b) ((gm.l) i95.n0.c(gm.l.class))).getClass();
                l75.k0 Q4 = gm.a.R6().Q4();
                if (Q4 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TranslateService", "saveTranslateContext failed, basisDB is null");
                } else {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("receiverId", mVar.u0());
                    contentValues.put("targetLangCode", mVar.w0());
                    p75.m c17 = dm.lb.f238329m.j(t07).c(dm.lb.f238330n.j(v07));
                    p75.h1 j17 = dm.lb.f238328i.j(contentValues);
                    j17.f352651c = c17;
                    int f17 = j17.a().f(Q4);
                    if (f17 < 0) {
                        long insertToDB = mVar.insertToDB(Q4, false);
                        if (insertToDB == -1) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TranslateService", "saveTranslateContext failed, basisDB error: " + insertToDB);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TranslateService", "saveTranslateContext successfully, translateContext: " + mVar + ", result: " + insertToDB);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateService", "saveTranslateContext successfully, translateContext: " + mVar + ", rowsAffected: " + f17);
                    }
                    z17 = true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreTranslate", "Save translateContext result: " + z17);
        }
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        pn4.p1 p1Var = this.f319905e;
        int i17 = this.f319904d;
        if (i17 == 0) {
            i17 = p1Var.f357181k;
        }
        com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent = new com.tencent.mm.autogen.events.TranslateMessageResultEvent();
        am.kz kzVar = translateMessageResultEvent.f54905g;
        kzVar.f7193a = i17;
        kzVar.f7194b = p1Var.f357171a;
        kzVar.f7196d = p1Var.f357174d;
        kzVar.f7195c = p1Var.f357173c;
        kzVar.f7197e = p1Var.f357179i;
        kzVar.f7198f = p1Var.f357175e;
        kzVar.f7199g = p1Var.f357176f;
        kzVar.f7200h = p1Var.f357177g;
        kzVar.f7201i = p1Var.f357178h;
        translateMessageResultEvent.e();
        return false;
    }
}
