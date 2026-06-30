package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class h2 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f168475g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f168476h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f168477i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f168478j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f168479k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f168480l;

    /* renamed from: m, reason: collision with root package name */
    public int f168481m;

    /* renamed from: n, reason: collision with root package name */
    public int f168482n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f168483o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f168484p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f168485q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f168486r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f168481m = 1;
        this.f168485q = new java.util.HashMap();
    }

    public static final /* synthetic */ java.lang.String o(com.tencent.mm.plugin.sns.ui.h2 h2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        java.lang.String str = h2Var.f168475g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return str;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        android.view.View inflate = android.view.LayoutInflater.from(this.f169957c).inflate(com.tencent.mm.R.layout.ct_, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hjz);
        imageView.setBackground(null);
        imageView.setPadding(0, 0, 0, 0);
        java.lang.String str = this.f168475g;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        imageView.setTag(str);
        java.util.HashMap hashMap = this.f168485q;
        java.lang.String str2 = this.f168475g;
        if (str2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hashMap.get(str2);
        if (ca4.z0.f(bitmap)) {
            imageView.setImageBitmap(bitmap);
        } else {
            kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            this.f168486r = kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.sns.ui.f2(this, imageView, null), 2, null);
        }
        inflate.setOnClickListener(new com.tencent.mm.plugin.sns.ui.g2(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return inflate;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(1, mMActivity);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.lang.String str3 = this.f168475g;
        if (str3 == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        ca4.w0 w0Var = new ca4.w0(str3, 2);
        w0Var.f40037e = 2;
        w0Var.f40036d = i17;
        w0Var.f40035c = i18;
        if (iVar != null) {
            w0Var.f40042j = iVar.f316692d;
            w0Var.f40043k = iVar.f316693e;
        }
        w0Var.f40044l = str;
        w0Var.f40047o = false;
        linkedList2.add(w0Var);
        if (iVar != null) {
            y7Var.U(iVar.f316692d, iVar.f316693e);
        }
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 3);
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (list != null) {
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str4)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f377690d = str4;
                    linkedList3.add(jb6Var);
                }
            }
        }
        y7Var.t(str);
        y7Var.x(linkedList);
        y7Var.A(ed4Var);
        y7Var.W(linkedList3);
        y7Var.G(i17);
        y7Var.S(i18);
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        m(y7Var);
        java.lang.String str5 = this.f168477i;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("appId");
            throw null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            java.lang.String str6 = this.f168477i;
            if (str6 == null) {
                kotlin.jvm.internal.o.o("appId");
                throw null;
            }
            y7Var.J(str6);
        }
        java.lang.String str7 = this.f168478j;
        if (str7 == null) {
            kotlin.jvm.internal.o.o("appName");
            throw null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            java.lang.String str8 = this.f168478j;
            if (str8 == null) {
                kotlin.jvm.internal.o.o("appName");
                throw null;
            }
            y7Var.I(str8);
        }
        y7Var.N(this.f168482n);
        if (this.f168483o && (wXMediaMessage = this.f168484p) != null) {
            y7Var.R(wXMediaMessage != null ? wXMediaMessage.mediaTagName : null);
        }
        y7Var.O(null, null, null, i27, i28);
        int i29 = this.f168481m;
        java.lang.String str9 = this.f168480l;
        if (str9 == null) {
            kotlin.jvm.internal.o.o("sdkPackageName");
            throw null;
        }
        y7Var.E(i29, str9);
        y7Var.y(list2);
        java.lang.String str10 = this.f168479k;
        if (str10 == null) {
            kotlin.jvm.internal.o.o(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            throw null;
        }
        y7Var.K(str10);
        java.lang.String str11 = this.f168476h;
        if (str11 == null) {
            kotlin.jvm.internal.o.o("excerptUrl");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPicExcerptUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "[addPicExcerptUrl] url = " + str11);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str11)) {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = y7Var.f164781f;
            timeLineObject.snsExcerptUrl = str11;
            timeLineObject.isExcerpt = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPicExcerptUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        y7Var.V(linkedList2);
        int i37 = y7Var.i();
        android.content.Intent intent = new android.content.Intent();
        ta4.v.f416846a.f416847a = i37;
        intent.putExtra("sns_local_id", i37);
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        super.e();
        kotlinx.coroutines.r2 r2Var = this.f168486r;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        java.util.HashMap hashMap = this.f168485q;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hashMap.get((java.lang.String) it.next());
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        hashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        java.lang.String str = this.f168475g;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMediaFile", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaFile", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        if (!z17) {
            db5.e1.i(this.f169957c, com.tencent.mm.R.string.f493258jh0, com.tencent.mm.R.string.f490573yv);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f168475g = java.lang.String.valueOf(mMActivity.getIntent().getStringExtra("sns_kemdia_path"));
        this.f168476h = java.lang.String.valueOf(mMActivity.getIntent().getStringExtra("sns_exceprt_url"));
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f168477i = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f168478j = stringExtra2;
        this.f168483o = mMActivity.getIntent().getBooleanExtra("KSnsAction", false);
        this.f168482n = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("reportSessionId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f168479k = stringExtra3;
        android.os.Bundle bundleExtra = mMActivity.getIntent().getBundleExtra("Ksnsupload_timeline");
        if (bundleExtra != null) {
            this.f168484p = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req(bundleExtra).message;
        }
        this.f168481m = mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true) ? 1 : 0;
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f168480l = stringExtra4 != null ? stringExtra4 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }
}
