package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public class g implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f183411a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f183413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.a f183414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.d f183415e;

    public g(com.tencent.mm.plugin.webview.permission.d dVar, java.lang.String str, int i17, com.tencent.mm.plugin.webview.permission.a aVar) {
        this.f183415e = dVar;
        this.f183412b = str;
        this.f183413c = i17;
        this.f183414d = aVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        if (this.f183411a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8Key", "ipcGetA8Key callbackCalled");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1653L, 13L, 1L, false);
            return;
        }
        this.f183411a = true;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.tencent.mm.plugin.webview.permission.d dVar = this.f183415e;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "ipcGetA8Key errType:%d, errCode:%d, errMsg:%s, destroyCalled:%b", valueOf, valueOf2, str, java.lang.Boolean.valueOf(dVar.f183396p));
        dVar.f183381a.remove(this.f183412b);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        if (!(fVar instanceof r45.s83)) {
            com.tencent.mm.plugin.webview.permission.d.a(this.f183415e, this.f183412b, this.f183413c, i17, i18, str, null, this.f183414d);
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8Key", "ipcGetA8Key call back resp is null");
        } else {
            com.tencent.mm.plugin.webview.permission.d.a(this.f183415e, this.f183412b, this.f183413c, i17, i18, str, (r45.s83) fVar, this.f183414d);
        }
    }
}
