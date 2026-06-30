package i31;

/* loaded from: classes9.dex */
public final class i extends i31.a {

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f288109c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData f288110d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f288111e;

    /* renamed from: b, reason: collision with root package name */
    public final int f288108b = 1;

    /* renamed from: f, reason: collision with root package name */
    public final j31.a f288112f = new j31.a();

    @Override // i31.c
    public void a(java.lang.String bizUsername, i31.b l17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(l17, "l");
        android.app.Activity activity = this.f288109c;
        if (activity == null) {
            kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            throw null;
        }
        com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = (com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData) activity.getIntent().getParcelableExtra("key_biz_data");
        this.f288110d = subscribeMsgSettingData;
        if (subscribeMsgSettingData != null) {
            ((m31.j) l17).a(subscribeMsgSettingData);
            h(this.f288110d, bizUsername);
            i(0);
        } else {
            o31.k kVar = new o31.k(bizUsername, new i31.h(this, l17, bizUsername));
            f31.f fVar = new f31.f(bizUsername, 3);
            fVar.f259277f = kVar;
            fVar.a(f31.b.f259269a);
        }
    }

    @Override // i31.c
    public void b(boolean z17) {
        this.f288111e = true;
        com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = this.f288110d;
        if (subscribeMsgSettingData != null) {
            subscribeMsgSettingData.f71835e = z17;
        }
        j31.a aVar = this.f288112f;
        aVar.f297357d = z17;
        aVar.getClass();
        aVar.f297360g = "";
        aVar.getClass();
        aVar.f297361h = "";
        aVar.f297359f = 0;
        i(1);
    }

    @Override // i31.c
    public m31.f c(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        return new m31.g0(activity, new i31.f(this, activity));
    }

    @Override // i31.a
    public void d(android.app.Activity activity) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288109c = activity;
        android.content.Intent intent = activity.getIntent();
        if (intent == null || (str = intent.getStringExtra("service_notify_session_id")) == null) {
            str = "";
        }
        java.lang.String str2 = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        j31.a aVar = this.f288112f;
        aVar.getClass();
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        aVar.f297358e = str2;
        if (android.text.TextUtils.isEmpty(str)) {
            str = aVar.f297358e;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar.f297356c = str;
        android.content.Intent intent2 = activity.getIntent();
        aVar.f297354a = intent2 != null ? intent2.getIntExtra("key_enter_scene", 0) : 0;
    }

    @Override // i31.a
    public void g(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!this.f288111e || this.f288110d == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_biz_data", this.f288110d);
        activity.setResult(-1, intent);
    }

    public final void h(com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData, java.lang.String str) {
        java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> list;
        if (subscribeMsgSettingData == null) {
            return;
        }
        j31.a aVar = this.f288112f;
        aVar.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar.f297355b = str;
        aVar.f297357d = subscribeMsgSettingData.f71835e;
        com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData2 = this.f288110d;
        if (subscribeMsgSettingData2 == null || (list = subscribeMsgSettingData2.f71836f) == null) {
            return;
        }
        if (list.isEmpty()) {
            aVar.getClass();
            aVar.f297362i = "[]";
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("templateTitle", subscribeMsgTmpItem.f71802e);
            jSONObject.put("status", subscribeMsgTmpItem.f71807m);
            jSONObject.put("templateID", subscribeMsgTmpItem.f71803f);
            jSONObject.put("msgType", subscribeMsgTmpItem.f71820z);
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        try {
            java.lang.String b17 = fp.s0.b(jSONArray2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            kotlin.jvm.internal.o.f(b17, "encode(...)");
            jSONArray2 = b17;
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaSubscribeMsgSettingPagePresenter", e17.toString());
        }
        aVar.getClass();
        aVar.f297362i = jSONArray2;
    }

    public final void i(int i17) {
        j31.e eVar = j31.e.f297392a;
        j31.a reportInfo = this.f288112f;
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = reportInfo.f297355b;
        objArr[1] = reportInfo.f297356c;
        objArr[2] = java.lang.Integer.valueOf(reportInfo.f297354a);
        objArr[3] = reportInfo.f297358e;
        objArr[4] = java.lang.Integer.valueOf(reportInfo.f297359f);
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = java.lang.Integer.valueOf(reportInfo.f297357d ? 1 : 0);
        objArr[7] = reportInfo.f297360g;
        objArr[8] = reportInfo.f297361h;
        objArr[9] = i17 > 0 ? "[]" : reportInfo.f297362i;
        fVar.d(35855, objArr);
    }
}
