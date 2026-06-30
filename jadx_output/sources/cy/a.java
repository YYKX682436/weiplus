package cy;

/* loaded from: classes.dex */
public final class a {
    public final void a(java.lang.String code, java.lang.String message, yz5.l callback) {
        kotlin.jvm.internal.o.g(code, "code");
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.w("MicroMsg.ChatbotCardFlutterApiBridge", "drop onError code=" + code + " message=" + message);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }
}
