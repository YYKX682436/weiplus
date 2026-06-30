package zd2;

/* loaded from: classes5.dex */
public final class b implements yd2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zd2.b f471592a = new zd2.b();

    @Override // yd2.a
    public long a() {
        return 15000L;
    }

    @Override // yd2.a
    public void b(yd2.l lVar, yd2.b context, yz5.q completion) {
        com.tencent.mm.plugin.finder.live.aiassistant.tools.FlipCameraParams params = (com.tencent.mm.plugin.finder.live.aiassistant.tools.FlipCameraParams) lVar;
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(completion, "completion");
        in0.q e17 = dk2.ef.f233372a.e();
        if (e17 == null) {
            completion.invoke(java.lang.Boolean.FALSE, "{\"success\": false, \"error\": \"no anchor core\"}", 2002);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.Live.AiAssistant.ToolFlipCamera", "flipCamera: switching from backCamera=" + e17.W() + ", toolCallId=" + context.f461033e);
        hn0.h.h(e17, 0, null, 3, null);
        boolean W = e17.W() ^ true;
        com.tencent.mars.xlog.Log.i("Finder.Live.AiAssistant.ToolFlipCamera", "flipCamera: done, isFront=" + W);
        completion.invoke(java.lang.Boolean.TRUE, "{\"is_front\": " + W + '}', 0);
    }

    @Override // yd2.a
    public boolean c(yd2.b context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (dk2.ef.f233372a.e() != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("Finder.Live.AiAssistant.ToolFlipCamera", "flipCamera: no anchorCore");
        return false;
    }
}
