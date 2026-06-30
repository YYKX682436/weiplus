package hk5;

/* loaded from: classes5.dex */
public final class j implements com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk5.k f282008a;

    public j(hk5.k kVar) {
        this.f282008a = kVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0
    public void a(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm result:" + result);
        ym5.a1.f(new hk5.i(this.f282008a, result));
    }
}
