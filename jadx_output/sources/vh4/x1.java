package vh4;

/* loaded from: classes9.dex */
public class x1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f437172d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f437173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f437174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f437175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vh4.y1 f437176h;

    public x1(vh4.y1 y1Var, long j17, com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17) {
        this.f437176h = y1Var;
        this.f437173e = j17;
        this.f437174f = u3Var;
        this.f437175g = z17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.util.Map d17;
        int i17;
        vh4.y1 y1Var = this.f437176h;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(y1Var.f437191f.d1(), this.f437173e);
        if (Li.I0() <= 0 && (i17 = this.f437172d) < 10) {
            this.f437172d = i17 + 1;
            return true;
        }
        this.f437174f.dismiss();
        if (Li.I0() > 0) {
            y1Var.f437195j.rh(y1Var.f437193h, y1Var.f437191f.d1(), c01.z1.r(), Li.getCreateTime(), Li.I0(), Li.j(), Li.z0(), java.lang.Boolean.FALSE);
        }
        y1Var.f437195j.getClass();
        com.tencent.mm.ui.widget.dialog.k kVar = y1Var.f437194i;
        if (kVar != null) {
            kVar.a(this.f437175g);
        }
        int i18 = y1Var.f437188c;
        if (i18 != 3 || (d17 = com.tencent.mm.sdk.platformtools.aa.d(y1Var.f437190e, "content", null)) == null || d17.get(".content") == null) {
            return false;
        }
        ot0.q v17 = ot0.q.v((java.lang.String) d17.get(".content"));
        com.tencent.mm.autogen.mmdata.rpt.TeenModeAuthStruct teenModeAuthStruct = new com.tencent.mm.autogen.mmdata.rpt.TeenModeAuthStruct();
        teenModeAuthStruct.f61073d = 1L;
        teenModeAuthStruct.f61074e = 1L;
        teenModeAuthStruct.f61075f = i18;
        teenModeAuthStruct.f61076g = teenModeAuthStruct.b("requestID", Li.I0() + "", true);
        teenModeAuthStruct.f61077h = teenModeAuthStruct.b("requestResource", v17.f348674k, true);
        teenModeAuthStruct.k();
        return false;
    }
}
