package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf.f f186989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(sf.f fVar) {
        super(1);
        this.f186989d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCVoid result = (com.tencent.mm.ipcinvoker.type.IPCVoid) obj;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "enterFinderFullScreen callback");
        this.f186989d.g("ok");
        return jz5.f0.f302826a;
    }
}
