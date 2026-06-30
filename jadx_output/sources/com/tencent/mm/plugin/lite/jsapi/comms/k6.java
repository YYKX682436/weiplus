package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class k6 implements com.tencent.mm.plugin.lite.jsapi.comms.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.n6 f143637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143638b;

    public k6(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var, com.tencent.mm.plugin.lite.jsapi.comms.n6 n6Var, java.lang.String str) {
        this.f143637a = n6Var;
        this.f143638b = str;
    }

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.b
    public void a(java.lang.String str, int i17, int i18) {
        if (str != null && str.endsWith(".temp")) {
            java.lang.String replace = str.replace(".temp", "");
            com.tencent.mm.vfs.w6.w(str, replace);
            str = replace;
        }
        com.tencent.mm.plugin.lite.jsapi.comms.n6 n6Var = this.f143637a;
        if (i17 == 0 && !android.text.TextUtils.isEmpty(str) && com.tencent.mm.vfs.w6.j(str)) {
            n6Var.a(str);
        } else {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live video cdn download fail. url:%s errCode:%d", this.f143638b, java.lang.Integer.valueOf(i17));
            n6Var.a(null);
        }
    }
}
