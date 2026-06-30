package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class x3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f186651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186653f;

    public x3(int i17, nw4.k kVar, nw4.y2 y2Var) {
        this.f186651d = i17;
        this.f186652e = kVar;
        this.f186653f = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse checkCanCreatePhotoAccountResponse = (com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse) obj;
        nw4.k kVar = this.f186652e;
        int i17 = this.f186651d;
        nw4.y2 y2Var = this.f186653f;
        if (checkCanCreatePhotoAccountResponse == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "checkCanCreatePhotoAccount IPC resp null, scene=" + i17);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_desc", "ipc resp null");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", hashMap);
            return;
        }
        if (!checkCanCreatePhotoAccountResponse.f63611d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCanCreatePhotoAccount IPC fail, scene=");
            sb6.append(i17);
            sb6.append(", errorMsg=");
            java.lang.String str = checkCanCreatePhotoAccountResponse.f63617m;
            sb6.append(str);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("err_desc", str);
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", hashMap2);
            return;
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("can_create_photo_acct", java.lang.Integer.valueOf(checkCanCreatePhotoAccountResponse.f63612e ? 1 : 0));
        hashMap3.put("can_create_biz_acct", java.lang.Integer.valueOf(checkCanCreatePhotoAccountResponse.f63613f ? 1 : 0));
        if (i17 != 0) {
            hashMap3.put("sceneEnabled", java.lang.Integer.valueOf(checkCanCreatePhotoAccountResponse.f63614g ? 1 : 0));
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("register", checkCanCreatePhotoAccountResponse.f63615h);
            hashMap4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, checkCanCreatePhotoAccountResponse.f63616i);
            hashMap3.put("wording", hashMap4);
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap3);
    }
}
