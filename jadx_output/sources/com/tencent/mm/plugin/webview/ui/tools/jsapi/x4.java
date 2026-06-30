package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class x4 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f185526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185527i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185530o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185531p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f185532q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185533r;

    public x4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17) {
        this.f185533r = c1Var;
        this.f185522d = y2Var;
        this.f185523e = str;
        this.f185524f = str2;
        this.f185525g = str3;
        this.f185526h = j17;
        this.f185527i = str4;
        this.f185528m = str5;
        this.f185529n = str6;
        this.f185530o = str7;
        this.f185531p = str8;
        this.f185532q = i17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185533r;
        android.app.ProgressDialog progressDialog = c1Var.f184979h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f184979h.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doAddDownloadApp check result errType:%d errCode:%d msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        nw4.y2 y2Var = this.f185522d;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "addDownloadApp:fail_check fail", null);
            return 0;
        }
        r45.g30 g30Var = (r45.g30) oVar.f70711b.f70700a;
        if (g30Var == null || g30Var.f374851f != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(g30Var != null ? g30Var.f374851f : Integer.MAX_VALUE);
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "doAddDownloadApp %d", objArr);
            c1Var.i5(y2Var, "addDownloadApp:fail_check fail", null);
            return 0;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c1Var.f184975d, com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.class);
        intent.putExtra("task_name", this.f185523e);
        intent.putExtra("task_url", this.f185524f);
        intent.putExtra("alternative_url", this.f185525g);
        intent.putExtra("task_size", this.f185526h);
        intent.putExtra("file_md5", this.f185527i);
        intent.putExtra("extInfo", this.f185528m);
        intent.putExtra("appid", this.f185529n);
        intent.putExtra("package_name", this.f185530o);
        intent.putExtra("page_url", this.f185531p);
        intent.putExtra("page_scene", 0);
        intent.putExtra("thumb_url", g30Var.f374850e);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, g30Var.f374849d);
        intent.putExtra("task_download_type", this.f185532q);
        intent.putExtra("app_developer", (java.lang.String) y2Var.f340790a.get("developer"));
        intent.putExtra("app_desc", (java.lang.String) y2Var.f340790a.get("app_desc"));
        intent.putExtra("app_privacy_url", (java.lang.String) y2Var.f340790a.get("privacy_agreement_url"));
        intent.putExtra("app_permission_url", (java.lang.String) y2Var.f340790a.get("permission_url"));
        intent.putExtra("from_scene", 4);
        intent.addFlags(268435456);
        android.content.Context context = c1Var.f184975d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$42", "callback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/CommReqResp;Lcom/tencent/mm/modelbase/NetSceneBase;)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$42", "callback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/CommReqResp;Lcom/tencent/mm/modelbase/NetSceneBase;)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        c1Var.P = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AddDownloadTaskEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$42$1
            {
                this.__eventId = 1058823164;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AddDownloadTaskEvent addDownloadTaskEvent) {
                com.tencent.mm.autogen.events.AddDownloadTaskEvent addDownloadTaskEvent2 = addDownloadTaskEvent;
                if (!(addDownloadTaskEvent2 instanceof com.tencent.mm.autogen.events.AddDownloadTaskEvent)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "mismatched event");
                    return false;
                }
                am.j jVar = addDownloadTaskEvent2.f53970g;
                if (jVar.f6986a != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "not jsapi api callback");
                    return false;
                }
                boolean z17 = jVar.f6987b;
                java.util.HashMap hashMap = null;
                com.tencent.mm.plugin.webview.ui.tools.jsapi.x4 x4Var = com.tencent.mm.plugin.webview.ui.tools.jsapi.x4.this;
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "addDownloadApp callback, cancel");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar.f6989d)) {
                        hashMap = new java.util.HashMap();
                        hashMap.put("detail_err_msg", jVar.f6989d);
                    }
                    x4Var.f185533r.i5(x4Var.f185522d, "addDownloadApp:cancel", hashMap);
                    return false;
                }
                if (jVar.f6988c > 0) {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("download_id", java.lang.Long.valueOf(jVar.f6988c));
                    hashMap2.put("detail_err_msg", jVar.f6989d);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "addDownloadApp callback, ok");
                    x4Var.f185533r.i5(x4Var.f185522d, "addDownloadApp:ok", hashMap2);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "addDownloadApp callback, failed");
                    x4Var.f185533r.i5(x4Var.f185522d, "addDownloadApp:fail", null);
                }
                x4Var.f185533r.P.dead();
                return false;
            }
        };
        c1Var.P.alive();
        return 0;
    }
}
