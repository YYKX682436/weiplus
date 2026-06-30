package zd2;

/* loaded from: classes5.dex */
public final class a implements yd2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zd2.a f471591a = new zd2.a();

    @Override // yd2.a
    public void b(yd2.l lVar, yd2.b context, yz5.q completion) {
        com.tencent.mm.plugin.finder.live.aiassistant.tools.EchoParams params = (com.tencent.mm.plugin.finder.live.aiassistant.tools.EchoParams) lVar;
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(completion, "completion");
        com.tencent.mars.xlog.Log.i("Finder.Live.AiAssistant.ToolEcho", "echo: message=" + params.message + ", toolCallId=" + context.f461033e);
        java.lang.String jSONObject = new org.json.JSONObject().put("echo_message", params.message).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        completion.invoke(java.lang.Boolean.TRUE, jSONObject, 0);
    }

    @Override // yd2.a
    public boolean c(yd2.b context) {
        kotlin.jvm.internal.o.g(context, "context");
        return true;
    }
}
