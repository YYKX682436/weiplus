package hh3;

/* loaded from: classes4.dex */
public class d extends ih3.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f281463e;

    /* renamed from: f, reason: collision with root package name */
    public fh3.a f281464f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f281465g;

    /* renamed from: h, reason: collision with root package name */
    public long f281466h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f281467i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f281468m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f281469n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f281470o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f281471p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f281472q;

    public d(ih3.m mVar) {
        super(mVar);
        this.f281463e = null;
        gm0.j1.d().a(3713, this);
    }

    @Override // ih3.n
    public java.lang.String a() {
        return "new_link_succeed_contact";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        java.lang.String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str3 = str2 == null ? "" : str2;
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        hh3.a aVar = new hh3.a(this, 1, null, bundle, map, str, weakReference, string, weakReference2);
        aVar.setTextBold(true);
        spannableString.setSpan(aVar, 0, str3.length(), 33);
        return spannableString;
    }

    @Override // ih3.n
    public void c() {
        super.c();
        gm0.j1.d().q(3713, this);
    }

    public final void e(android.content.Context context) {
        android.app.ProgressDialog progressDialog = this.f281463e;
        if (progressDialog == null) {
            this.f281463e = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.hfj), true, true, new hh3.b(this));
        } else {
            if (progressDialog.isShowing()) {
                return;
            }
            this.f281463e.show();
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        android.app.ProgressDialog progressDialog = this.f281463e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f281463e.dismiss();
        }
        if (m1Var instanceof fh3.a) {
            if (i18 == -3600) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hfe));
                u1Var.m(com.tencent.mm.R.string.l_e);
                u1Var.l(null);
                u1Var.q(false);
                jh3.n.i(this.f281466h, 7);
                return;
            }
            if (i17 == 0 && i18 == 0) {
                fh3.a aVar = (fh3.a) m1Var;
                r45.ow4 ow4Var = aVar.f262657f;
                r45.ow4 ow4Var2 = ow4Var != null ? ow4Var : null;
                if (ow4Var2 != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(ow4Var2.BaseResponse.f376959d);
                    int i19 = aVar.f262658g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "NetSceneOpenImNotAutoSucceed ret:%s action:%s", valueOf, java.lang.Integer.valueOf(i19));
                    if (i19 == 1) {
                        java.lang.ref.WeakReference weakReference = this.f281465g;
                        if (weakReference == null || weakReference.get() == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "NOT_AUTO_SUCCEED_ACTION_PREPARE context == null");
                            return;
                        }
                        com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1((android.content.Context) this.f281465g.get());
                        u1Var2.a(false);
                        u1Var2.g(this.f281467i);
                        u1Var2.j(this.f281468m);
                        u1Var2.n(this.f281469n);
                        u1Var2.b(new hh3.c(this));
                        u1Var2.q(false);
                        jh3.n.i(this.f281466h, 8);
                        return;
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "notAutoSucceedResp is null");
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490391to);
            }
            db5.t7.makeText(context, str, 0).show();
            jh3.n.i(this.f281466h, 6);
        }
    }
}
