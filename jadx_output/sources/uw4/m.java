package uw4;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.plugin.webview.luggage.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.o0 f431743b = new com.tencent.mm.plugin.webview.modeltools.o0();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uw4.n f431744c;

    public m(uw4.n nVar) {
        this.f431744c = nVar;
    }

    @Override // com.tencent.xweb.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        com.tencent.mars.xlog.Log.i("LuggageMMWebChromeClientProxy", "onPermissionRequest");
        uw4.n nVar = this.f431744c;
        android.app.Activity a17 = q75.a.a(nVar.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageMMWebViewCoreImpl", "onPermissionRequest NULL activity");
        } else {
            this.f431743b.h(permissionRequest, a17, nVar.getUrl());
        }
    }
}
