package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class o3 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f185310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185312c;

    public o3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.util.Map map, nw4.y2 y2Var) {
        this.f185312c = c1Var;
        this.f185310a = map;
        this.f185311b = y2Var;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "float window permission granted");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        java.util.Map map = this.f185310a;
        map.put("ret", 0);
        this.f185312c.i5(this.f185311b, "requestOverlayPermission:ok", map);
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onResultCancel ok:%b", java.lang.Boolean.valueOf(((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        java.util.Map map = this.f185310a;
        map.put("ret", -1);
        this.f185312c.i5(this.f185311b, "requestOverlayPermission:ok", map);
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "float window permission refused");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        java.util.Map map = this.f185310a;
        map.put("ret", -1);
        this.f185312c.i5(this.f185311b, "requestOverlayPermission:ok", map);
    }
}
