package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class we extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f205927b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f205928c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f205929d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f205930e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f205931f;

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view) {
        super.create(view);
        this.f205927b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bkm);
        this.f205928c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bko);
        this.clickArea = view.findViewById(com.tencent.mm.R.id.bkg);
        this.f205929d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqy);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f205930e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bjp);
        this.f205931f = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.br_);
        this.stateIV = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqx);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }

    public void b(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, com.tencent.mm.ui.chatting.viewitems.we weVar, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar, rd5.d dVar2, boolean z17, com.tencent.mm.ui.chatting.viewitems.ve veVar, com.tencent.mm.ui.chatting.viewitems.q0 q0Var) {
        java.lang.String str;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        if (v17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, content is null");
            return;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = v17.f348646d;
        int i17 = v17.G;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m i18 = com.tencent.mm.pluginsdk.model.app.w.i(str2, i17);
        java.lang.String str3 = (i18 == null || (str = i18.field_appName) == null || str.trim().length() <= 0) ? v17.H : i18.field_appName;
        java.lang.String str4 = v17.f348646d;
        if (str4 == null || str4.length() <= 0 || !com.tencent.mm.ui.chatting.w5.y(str3)) {
            weVar.f205930e.setVisibility(8);
        } else {
            weVar.f205930e.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), i18, str3));
            weVar.f205930e.setVisibility(0);
            com.tencent.mm.ui.chatting.w5.w(dVar, weVar.f205930e, v17.f348646d);
        }
        weVar.f205929d.setImageDrawable(i65.a.i(dVar.g(), com.tencent.mm.R.raw.shortvideo_play_btn));
        android.widget.ProgressBar progressBar = weVar.f205931f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, msgImgPath:%s, thumbFullPath:%s", f9Var.z0(), D2);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap b37 = m11.b1.Di().b3(D2, i65.a.g(dVar.g()), dVar.g(), com.tencent.mm.R.drawable.bzt);
        if (b37 == null || b37.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, has no video thumb");
            weVar.f205928c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(0, 0));
            int b17 = i65.a.b(dVar.g(), 85);
            int h17 = i65.a.h(dVar.g(), com.tencent.mm.R.dimen.f479593a3);
            weVar.f205927b.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s(com.tencent.mm.sdk.platformtools.x.q(dVar.g().getResources().getColor(com.tencent.mm.R.color.f479219t7), b17, h17), com.tencent.mm.R.drawable.bzt, b17, h17));
            weVar.f205927b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b17, h17));
            weVar.f205928c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b17, h17));
        } else {
            weVar.f205927b.setImageBitmap(b37);
            weVar.f205927b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b37.getWidth(), b37.getHeight()));
            weVar.f205928c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b37.getWidth(), b37.getHeight()));
        }
        if (z17) {
            if (f9Var.P0() == 5 || f9Var.P0() == 2) {
                android.widget.ProgressBar progressBar2 = weVar.f205931f;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
            } else {
                android.widget.ProgressBar progressBar3 = weVar.f205931f;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(0);
                }
            }
        }
        weVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), weVar, f9Var.Q0()));
        weVar.clickArea.setOnClickListener(veVar);
        weVar.clickArea.setOnLongClickListener(q0Var);
        weVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16979, v17.f348677k2, v17.f348669i2, 0, 0);
        l01.b bVar = l01.d0.f314761a;
        bVar.k("file://" + D2);
        ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
        if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.C)) {
            bVar.k(aVar.C);
        }
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class) != null) {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.B);
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) || aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.B)) {
            return;
        }
        java.lang.String str5 = aVar.B;
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.service.x5.class) != null) {
            ((com.tencent.mm.plugin.appbrand.service.x5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.x5.class)).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WeishiVideoItemViewHolder", "[weishi] parseMsgInfo, invoke video cache task");
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_weishi_video_preload_size, -1);
            if (Ni != -1) {
                Ni = Ni * 1024 * 1024;
            }
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.ipcinvoker.wx_extension.service.Appbrand0IPCService.f68449e, new com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation(str5, 0L, Ni), com.tencent.mm.ui.chatting.viewitems.ue.class, null);
        }
    }
}
