package com.tencent.mm.plugin.readerapp.ui;

@gm0.a2
@ul5.d(0)
/* loaded from: classes9.dex */
public class ReaderAppUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: u, reason: collision with root package name */
    public static float f155055u;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.v3 f155056d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMPullDownView f155057e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f155058f;

    /* renamed from: g, reason: collision with root package name */
    public ts3.a f155059g;

    /* renamed from: q, reason: collision with root package name */
    public rl5.r f155066q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f155067r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f155068s;

    /* renamed from: h, reason: collision with root package name */
    public int f155060h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f155061i = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f155062m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f155063n = "";

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.i0 f155064o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f155065p = 0;

    /* renamed from: t, reason: collision with root package name */
    public final db5.t4 f155069t = new ts3.r(this);

    public android.view.View.OnClickListener T6(c01.ta taVar, int i17, int i18, int i19, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (taVar != null) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.y9.a(taVar.h());
            java.lang.String a18 = com.tencent.mm.sdk.platformtools.y9.a(str);
            java.lang.String a19 = com.tencent.mm.sdk.platformtools.y9.a(str2);
            taVar.i();
            if (taVar.f37489v == 5) {
                xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
                taVar.i();
                ((wj.j0) iVar).mj(taVar.f37493z, wj.w0.f446541d, null);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    xj.i iVar2 = (xj.i) i95.n0.c(xj.i.class);
                    taVar.i();
                    int i27 = 1;
                    if (!(((wj.j0) iVar2).Ai(taVar.f37493z) == wj.n.f446450g)) {
                        i27 = 0;
                    }
                    jSONObject.put("yuanbao_app_status", i27);
                    str3 = jSONObject.toString();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReaderAppUI", "gen featureValue error " + e17);
                }
                java.lang.String str4 = str3;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                taVar.i();
                java.lang.String str5 = taVar.f37490w;
                java.lang.String g17 = taVar.g();
                taVar.i();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(taVar.f37489v);
                taVar.i();
                g0Var.d(15413, 9, a18, a19, str5, g17, a17, valueOf, java.lang.Integer.valueOf(taVar.f37488u), this.f155062m, str4);
            }
            str3 = "";
            java.lang.String str42 = str3;
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            taVar.i();
            java.lang.String str52 = taVar.f37490w;
            java.lang.String g172 = taVar.g();
            taVar.i();
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(taVar.f37489v);
            taVar.i();
            g0Var2.d(15413, 9, a18, a19, str52, g172, a17, valueOf2, java.lang.Integer.valueOf(taVar.f37488u), this.f155062m, str42);
        }
        return new ts3.o(this, i17, taVar, str, str2, i19);
    }

    public void U6() {
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.dfo);
        if (this.f155059g.getCount() == 0) {
            this.f155057e.setVisibility(8);
            scrollView.setVisibility(0);
        } else {
            scrollView.setVisibility(8);
            this.f155057e.setVisibility(0);
        }
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = this.f155056d;
        if (v3Var == null || !(this.f155059g instanceof ts3.d0)) {
            return;
        }
        v3Var.post(new ts3.q(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbz;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.initView():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ts3.a aVar = this.f155059g;
        if (aVar != null) {
            aVar.c();
            this.f155059g.f212611h = null;
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f63516b = "";
        ss3.d0.Di().remove(this.f155059g);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(this.f155063n);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f155060h == 20) {
            setMMTitle(com.tencent.mm.R.string.fvh);
        } else {
            setMMTitle(com.tencent.mm.R.string.fvk);
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f63516b = this.f155063n;
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).h(this.f155063n);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(this.f155063n);
        ss3.d0.Di().add(this.f155059g);
        this.f155059g.f();
        U6();
    }
}
