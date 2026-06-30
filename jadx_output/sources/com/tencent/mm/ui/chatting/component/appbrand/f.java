package com.tencent.mm.ui.chatting.component.appbrand;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.ui.chatting.component.appbrand.h {

    /* renamed from: e, reason: collision with root package name */
    public int f198670e;

    /* renamed from: f, reason: collision with root package name */
    public int f198671f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaExposedParams f198672g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f198673h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f198674i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f198675m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f198676n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f198677o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f198678p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f198679q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f198680r = new com.tencent.mm.ui.chatting.component.appbrand.AppBrandServiceComponent$1(this, com.tencent.mm.app.a0.f53288d);

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f198681s = "";

    /* renamed from: t, reason: collision with root package name */
    public ab5.z f198682t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f198683u;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        if (r7.f198677o.equals(r7.f198681s) != false) goto L16;
     */
    @Override // sb5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C() {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.AppBrandServiceComponent"
            java.lang.String r1 = "updateStaticTitle()"
            com.tencent.mars.xlog.Log.i(r0, r1)
            yb5.d r0 = r7.f198685d
            java.lang.String r0 = r0.x()
            java.lang.String r0 = ab5.c0.b(r0)
            java.lang.String r0 = ab5.c0.c(r0)
            r7.f198681s = r0
            java.lang.String r0 = r7.f198676n
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L2a
            yb5.d r0 = r7.f198685d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f460717l
            java.lang.String r1 = r7.f198676n
            r0.setMMTitle(r1)
            goto L35
        L2a:
            yb5.d r0 = r7.f198685d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r0.f460717l
            java.lang.String r0 = r0.w()
            r1.setMMTitle(r0)
        L35:
            java.lang.String r0 = r7.f198677o
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r1 = 0
            if (r0 != 0) goto L52
            yb5.d r0 = r7.f198685d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f460717l
            java.lang.String r2 = r7.f198677o
            r0.setMMSubTitle(r2)
            java.lang.String r0 = r7.f198677o
            java.lang.String r2 = r7.f198681s
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L89
        L52:
            java.lang.String r0 = r7.f198681s
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r2 = 2131755912(0x7f100388, float:1.9142717E38)
            if (r0 == 0) goto L66
            yb5.d r0 = r7.f198685d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f460717l
            r0.setMMSubTitle(r2)
        L64:
            r0 = r1
            goto L8a
        L66:
            yb5.d r0 = r7.f198685d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f460717l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r2 = r4.getString(r2)
            r3.append(r2)
            java.lang.String r2 = "-"
            r3.append(r2)
            java.lang.String r2 = r7.f198681s
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.setMMSubTitle(r2)
        L89:
            r0 = 1
        L8a:
            com.tencent.mm.ui.chatting.component.appbrand.e r2 = new com.tencent.mm.ui.chatting.component.appbrand.e
            r3 = 0
            r2.<init>(r7, r3)
            com.tencent.mm.sdk.platformtools.u3.h(r2)
            yb5.d r2 = r7.f198685d
            com.tencent.mm.ui.chatting.manager.c r2 = r2.f460708c
            java.lang.Class<sb5.z0> r3 = sb5.z0.class
            yn.e r2 = r2.a(r3)
            sb5.z0 r2 = (sb5.z0) r2
            com.tencent.mm.ui.chatting.component.appbrand.b r4 = new com.tencent.mm.ui.chatting.component.appbrand.b
            r4.<init>(r7)
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r6 = 2131755903(0x7f10037f, float:1.9142698E38)
            java.lang.String r5 = r5.getString(r6)
            com.tencent.mm.ui.chatting.component.pe r2 = (com.tencent.mm.ui.chatting.component.pe) r2
            r2.C0(r0, r4, r5)
            boolean r0 = r7.f198679q
            if (r0 == 0) goto Lc6
            yb5.d r0 = r7.f198685d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f460708c
            yn.e r0 = r0.a(r3)
            sb5.z0 r0 = (sb5.z0) r0
            com.tencent.mm.ui.chatting.component.pe r0 = (com.tencent.mm.ui.chatting.component.pe) r0
            r0.H0(r1)
            goto Ld7
        Lc6:
            yb5.d r0 = r7.f198685d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f460708c
            yn.e r0 = r0.a(r3)
            sb5.z0 r0 = (sb5.z0) r0
            r1 = 8
            com.tencent.mm.ui.chatting.component.pe r0 = (com.tencent.mm.ui.chatting.component.pe) r0
            r0.H0(r1)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.appbrand.f.C():void");
    }

    @Override // sb5.a
    public java.lang.String F() {
        return this.f198678p;
    }

    @Override // com.tencent.mm.ui.chatting.component.appbrand.h, yn.l
    public void a() {
        this.f198670e = this.f198685d.f460717l.getIntExtra("app_brand_chatting_from_scene", 1);
        this.f198671f = this.f198685d.f460717l.getIntExtra("app_brand_chatting_from_scene_new", 3);
        this.f198672g = (com.tencent.mm.plugin.appbrand.config.WxaExposedParams) this.f198685d.f460717l.getParcelableExtra("app_brand_chatting_expose_params");
        java.lang.String stringExtra = this.f198685d.f460717l.getStringExtra("key_scene_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f198673h = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceComponent", "onChattingInit() fromScene:%d newScene:%d wxaExposedParams:%s mSceneId:%s", java.lang.Integer.valueOf(this.f198670e), java.lang.Integer.valueOf(this.f198671f), this.f198672g, this.f198673h);
        java.lang.String stringExtra2 = this.f198685d.f460717l.getStringExtra("keyPrivateAppId");
        this.f198674i = stringExtra2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            this.f198675m = this.f198685d.f460717l.getStringExtra("keyPrivateUserName");
            this.f198676n = this.f198685d.f460717l.getStringExtra("keyPrivateTitle");
            this.f198677o = this.f198685d.f460717l.getStringExtra("keyPrivateSubTitle");
            java.lang.String stringExtra3 = this.f198685d.f460717l.getStringExtra("keyPrivateHeadImage");
            this.f198678p = stringExtra3;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceComponent", "onChattingInit customized appId:%s, username:%s, title:%s, subtitle:%s, headImage:%s", this.f198674i, this.f198675m, this.f198676n, this.f198677o, stringExtra3);
        }
        this.f198682t = new ab5.z(this.f198685d.g());
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(this.f198685d.x());
        this.f198679q = Bi != null && (Bi.field_appOpt & 2) > 0;
        java.lang.String x17 = this.f198685d.x();
        java.lang.String b17 = b();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2912;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/getkefusessioninfo";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        r45.kh3 kh3Var = new r45.kh3();
        java.lang.String b18 = ab5.c0.b(x17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b18)) {
            kh3Var.f378696d = b17;
            kh3Var.f378697e = "";
        } else {
            kh3Var.f378696d = ab5.c0.a(b18);
            kh3Var.f378697e = b17;
        }
        lVar.f70664a = kh3Var;
        lVar.f70665b = new r45.lh3();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new ab5.b0(), false);
    }

    public java.lang.String b() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f198674i)) {
            this.f198683u = this.f198674i;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f198683u)) {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(this.f198685d.x());
            this.f198683u = Bi == null ? null : Bi.field_appId;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f198683u)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceComponent", "error, appId is null");
        }
        return this.f198683u;
    }

    @Override // sb5.a
    public void v() {
        this.f198685d.f460717l.addIconOptionMenu(0, com.tencent.mm.R.string.f490208nz, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.ui.chatting.component.appbrand.d(this));
    }

    @Override // com.tencent.mm.ui.chatting.component.appbrand.h, yn.l
    public void x() {
        this.f198680r.alive();
    }

    @Override // com.tencent.mm.ui.chatting.component.appbrand.h, yn.l
    public void y() {
        this.f198680r.dead();
    }
}
