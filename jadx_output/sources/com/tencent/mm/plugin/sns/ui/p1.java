package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class p1 extends com.tencent.mm.plugin.sns.ui.b5 {
    public final com.tencent.mm.ui.MMActivity J0;
    public final int K0;
    public final r45.hh4 L0;
    public final r45.jj4 M0;
    public final android.view.View N0;
    public java.lang.String O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.J0 = context;
        this.K0 = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH;
        this.L0 = new r45.hh4();
        this.M0 = new r45.jj4();
        this.N0 = md4.e.f325877a.b(context);
        this.O0 = "";
    }

    @Override // com.tencent.mm.plugin.sns.ui.b5, com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        new com.tencent.mm.pluginsdk.ui.applet.CdnImageView(this.J0, null).setUrl(this.f167849i);
        com.tencent.mm.plugin.sns.ui.o1 o1Var = new com.tencent.mm.plugin.sns.ui.o1(this);
        android.view.View view = this.N0;
        view.setOnClickListener(o1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.b5, com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        if (((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(this.f167849i) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LinkWidget", "block for non thumb bitmap");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
            return false;
        }
        n11.a b17 = n11.a.b();
        md4.e eVar = md4.e.f325877a;
        java.lang.String Url = this.M0.f377858g;
        kotlin.jvm.internal.o.f(Url, "Url");
        android.graphics.Bitmap e17 = b17.e(eVar.c(Url));
        if (e17 == null || e17.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LinkWidget", "block for non cover bitmap");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
            return false;
        }
        super.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.b5, com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        super.i(bundle);
        android.content.Intent intent = this.J0.getIntent();
        java.lang.String stringExtra = intent.getStringExtra("ksnsupload_bizstyle_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.O0 = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("ksnsupload_bizstyle_cover_url");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        r45.jj4 jj4Var = this.M0;
        jj4Var.f377858g = str;
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f379520d = intent.getIntExtra("ksnsupload_bizstyle_cover_width", 0);
        lj4Var.f379521e = intent.getIntExtra("ksnsupload_bizstyle_cover_height", 0);
        jj4Var.f377865p = lj4Var;
        int intExtra = intent.getIntExtra("ksnsupload_bizstyle_pic_count", 0);
        r45.hh4 hh4Var = this.L0;
        hh4Var.f376149d = 8;
        hh4Var.f376160r = intExtra;
        java.lang.String stringExtra3 = intent.getStringExtra("Ksnsupload_title");
        md4.e eVar = md4.e.f325877a;
        android.view.View view = this.N0;
        java.lang.String Url = jj4Var.f377858g;
        kotlin.jvm.internal.o.f(Url, "Url");
        eVar.e(view, Url, lj4Var.f379520d, lj4Var.f379521e, this.O0, stringExtra3, intExtra);
        c01.l2 c17 = c01.n2.d().c(this.N, true);
        if (((java.util.concurrent.ConcurrentHashMap) c17.f37305a).isEmpty()) {
            c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", 8);
            c17.i("_DATA_CENTER_BIZ_PIC_COUNT", java.lang.Integer.valueOf(intExtra));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.b5
    public void o(com.tencent.mm.plugin.sns.model.y7 y7Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("subCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        super.o(y7Var, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.sns.model.l4.Ni());
        r45.jj4 jj4Var = this.M0;
        java.lang.String Url = jj4Var.f377858g;
        kotlin.jvm.internal.o.f(Url, "Url");
        byte[] bytes = Url.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        n11.a b17 = n11.a.b();
        md4.e eVar = md4.e.f325877a;
        java.lang.String Url2 = jj4Var.f377858g;
        kotlin.jvm.internal.o.f(Url2, "Url");
        android.graphics.Bitmap e17 = b17.e(eVar.c(Url2));
        float width = e17.getWidth();
        int i17 = this.K0;
        float min = java.lang.Math.min(width / i17, e17.getHeight() / i17);
        if (min > 1.01d) {
            android.graphics.Bitmap F0 = com.tencent.mm.sdk.platformtools.x.F0(e17, e17.getWidth() / min, e17.getHeight() / min, false);
            com.tencent.mm.sdk.platformtools.x.D0(F0, 70, android.graphics.Bitmap.CompressFormat.JPEG, sb7, !kotlin.jvm.internal.o.b(F0, e17));
            com.tencent.mars.xlog.Log.i("MicroMsg.LinkWidget", "save bitmap1 width:" + F0.getWidth() + " height:" + F0.getHeight());
        } else {
            com.tencent.mm.sdk.platformtools.x.D0(e17, 70, android.graphics.Bitmap.CompressFormat.JPEG, sb7, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.LinkWidget", "save bitmap2 width:" + e17.getWidth() + " height:" + e17.getHeight());
        }
        if (y7Var != null) {
            y7Var.a(sb7, "");
        }
        if (!z17 && y7Var != null) {
            java.lang.String str = this.O0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPublishUserName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            y7Var.f164781f.publicUserName = str != null ? str : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPublishUserName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        if (y7Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReaderShare", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            y7Var.f164781f.ContentObj.f369843n = this.L0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReaderShare", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
    }
}
