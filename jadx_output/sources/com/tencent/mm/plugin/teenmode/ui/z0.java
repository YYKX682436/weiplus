package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class z0 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianUI f173200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f173202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f173203d;

    public z0(com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI, java.lang.String str, int i17, com.tencent.mm.modelbase.f fVar) {
        this.f173200a = bindGuardianUI;
        this.f173201b = str;
        this.f173202c = i17;
        this.f173203d = fVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            ot0.q qVar = new ot0.q();
            com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI = this.f173200a;
            qVar.f348654f = bindGuardianUI.getString(com.tencent.mm.R.string.jra);
            qVar.f348658g = bindGuardianUI.getString(com.tencent.mm.R.string.jr6);
            java.lang.String str2 = this.f173201b;
            qVar.f348683m0 = str2;
            qVar.f348666i = this.f173202c == 101 ? 83 : 102;
            qVar.f348674k = "https://support.weixin.qq.com/update/";
            qVar.f348734z = "http://wxapp.tc.qq.com/251/20304/stodownload?m=adb36df21d075a4c2148a2c0fc361304&filekey=30450201010420301e020200fb0402535a0410adb36df21d075a4c2148a2c0fc3613040202188a041e000000046274667300000001310000000861707073746f72650000000131&hy=SZ&storeid=32303231303932383030353631353030303362636238303062633631346565633763333930613030303030306662&dotrans=0&sourceflag=1&bizid=1023&adaptivelytrans=0";
            rt0.e eVar = new rt0.e();
            com.tencent.mm.modelbase.f fVar = this.f173203d;
            eVar.f399377b = ((r45.ap3) fVar.f70618d).f370174d;
            qVar.f(eVar);
            ot0.k1 a17 = ot0.j1.a();
            java.lang.String str3 = this.f173201b;
            ((ez.w0) a17).getClass();
            com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", str3, "", null);
            ((uh4.c0) i95.n0.c(uh4.c0.class)).q8(bindGuardianUI.getContext(), this.f173201b, c01.z1.r(), ((r45.ap3) fVar.f70618d).f370174d, c01.id.a(), qVar.f348666i, false);
            if (!(str == null || r26.n0.N(str))) {
                ((dk5.s5) tg3.t1.a()).fj(str2, str, c01.e2.C(str2), 0);
            }
            com.tencent.mm.autogen.mmdata.rpt.TeenModeBindStruct teenModeBindStruct = new com.tencent.mm.autogen.mmdata.rpt.TeenModeBindStruct();
            teenModeBindStruct.f61079d = 1L;
            teenModeBindStruct.f61080e = 1L;
            teenModeBindStruct.f61081f = 1L;
            teenModeBindStruct.f61082g = teenModeBindStruct.b("targetUsername", str2, true);
            teenModeBindStruct.k();
            pm0.v.V(200L, new com.tencent.mm.plugin.teenmode.ui.y0(bindGuardianUI));
        }
    }
}
