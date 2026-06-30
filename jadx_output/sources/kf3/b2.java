package kf3;

/* loaded from: classes8.dex */
public class b2 implements com.tencent.mm.pluginsdk.ui.chat.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307322a;

    public b2(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI) {
        this.f307322a = massSendMsgUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void C() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void a() {
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
        j45.l.j(this.f307322a, "subapp", ".ui.openapi.AddAppUI", new android.content.Intent(), null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void b() {
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.f492481gt2), 0).show();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void c(int i17) {
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enable_send_as_file", false);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.c(massSendMsgUI, 1, 1, 3, 3, false, intent);
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(lp0.b.m());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        boolean F = !m17.a() ? false : m17.f213266a.F(m17.f213267b);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI2 = this.f307322a;
        if (!F) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (!(m18.a() ? m18.f213266a.r(m18.f213267b) : false)) {
                dp.a.makeText(massSendMsgUI2, massSendMsgUI2.getString(com.tencent.mm.R.string.b69), 1).show();
                return;
            }
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = massSendMsgUI2.getContext();
        ((sb0.f) jVar).getClass();
        boolean a18 = j35.u.a(context, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), massSendMsgUI2.getContext());
        if (a18) {
            int i18 = com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.f148539v;
            massSendMsgUI2.d7();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void d() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void e() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void f(com.tencent.mm.pluginsdk.model.app.m mVar) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void g() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void h(int i17, long j17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void i() {
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.f492481gt2), 0).show();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void j() {
        qk.z zVar = new qk.z();
        zVar.f364155a = 13;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(this.f307322a, zVar);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void k(int i17) {
        int i18 = com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.f148539v;
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        massSendMsgUI.getClass();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(massSendMsgUI, "android.permission.CAMERA", 18, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), massSendMsgUI);
        if (a17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 1);
            com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(1, i17);
            java.lang.String str = massSendMsgUI.f148541e;
            kk.l lVar = t21.w2.f415056c;
            java.lang.String a18 = t21.c3.a(str);
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, a18, true);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a18, true);
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightParams.f148819f;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g(rj6, tj6, videoTransPara, videoTransPara.f71195h * 1000, 1);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_c2c_ignore_remux_without_edit, false)) {
                g17.f155669d = 2;
            }
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true);
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.Map map = uICustomParam.f64779h;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            g17.f155677o = uICustomParam;
            if (fj6) {
                ut3.m.f431182a.d(massSendMsgUI, 9, com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1, g17, 0);
            } else {
                com.tencent.mm.pluginsdk.ui.tools.l7.k(massSendMsgUI, 8, new android.content.Intent(), 1, massSendMsgUI.f148541e, 0, "");
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void l(int i17, int i18) {
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.gta), 0).show();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void m() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void n() {
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.f492481gt2), 0).show();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void o() {
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.f492481gt2), 0).show();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void p() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void q() {
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.gtg), 0).show();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void r() {
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.gtb), 0).show();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void s() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void t() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void u(int i17, int i18) {
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307322a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.gti), 0).show();
    }
}
