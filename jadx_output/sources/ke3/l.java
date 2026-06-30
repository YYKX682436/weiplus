package ke3;

/* loaded from: classes7.dex */
public final class l implements gq0.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI f307024d;

    public l(com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI) {
        this.f307024d = magicSclCommonStarterDemoUI;
    }

    @Override // gq0.v
    public void S3(java.lang.String frameSetId) {
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
    }

    @Override // qp0.c
    public void ca(java.lang.String event, java.util.HashMap hashMap, yz5.q callback) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // gq0.v
    public void og(org.json.JSONObject data, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        ym5.a1.f(new ke3.k(this.f307024d, data, this, callback));
    }

    @Override // gq0.v
    public jc3.m xc(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return null;
    }
}
