package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class y6 implements com.tencent.mm.plugin.lite.jsapi.comms.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.c7 f143838c;

    public y6(com.tencent.mm.plugin.lite.jsapi.comms.c7 c7Var, java.lang.String str, java.lang.String str2) {
        this.f143838c = c7Var;
        this.f143836a = str;
        this.f143837b = str2;
    }

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.b
    public void a(java.lang.String str, int i17, int i18) {
        if (str != null && str.endsWith(".temp")) {
            java.lang.String replace = str.replace(".temp", "");
            com.tencent.mm.vfs.w6.w(str, replace);
            com.tencent.mars.xlog.Log.i("LiteAppJsApiSendFileMessage", "download videoPath:%s", replace);
            str = replace;
        }
        com.tencent.mm.plugin.lite.jsapi.comms.c7 c7Var = this.f143838c;
        if (i17 == 0) {
            c7Var.C(str, c7Var.A(str), this.f143836a, this.f143837b);
        } else {
            if (i17 != 2) {
                return;
            }
            c7Var.f143443f.a("sendFileMessage fail, download video failed");
        }
    }
}
