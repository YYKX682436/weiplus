package ou4;

/* loaded from: classes8.dex */
public abstract class n implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f348995d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f348996e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f348997f;

    public final void a(java.lang.String eventName, java.util.Map map) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        ou4.l lVar = new ou4.l(this, eventName, map);
        if (this.f348997f) {
            lVar.run();
        } else {
            com.tencent.mars.xlog.Log.i(((com.tencent.mm.plugin.websearch.m2) this).f181569g, "callFlutter: not ready, queuing eventName=".concat(eventName));
            ((java.util.ArrayList) this.f348996e).add(lVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mm.plugin.websearch.m2 m2Var = (com.tencent.mm.plugin.websearch.m2) this;
        com.tencent.mars.xlog.Log.i(m2Var.f181569g, "onAttachedToEngine");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        com.tencent.pigeon.websearch.WebSearchHostApi.Companion.setUp$default(com.tencent.pigeon.websearch.WebSearchHostApi.INSTANCE, binaryMessenger, this instanceof com.tencent.pigeon.websearch.WebSearchHostApi ? (com.tencent.pigeon.websearch.WebSearchHostApi) this : null, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        m2Var.f181570h = new com.tencent.pigeon.websearch.WebSearchFlutterApi(binaryMessenger2, str, 2, objArr == true ? 1 : 0);
        this.f348997f = true;
        java.util.Iterator it = ((java.util.ArrayList) this.f348996e).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        ((java.util.ArrayList) this.f348996e).clear();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mm.plugin.websearch.m2 m2Var = (com.tencent.mm.plugin.websearch.m2) this;
        com.tencent.mars.xlog.Log.i(m2Var.f181569g, "onDetachedFromEngine");
        this.f348997f = false;
        m2Var.f181570h = null;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.websearch.WebSearchHostApi.Companion.setUp$default(com.tencent.pigeon.websearch.WebSearchHostApi.INSTANCE, binaryMessenger, null, null, 4, null);
        java.util.Collection values = this.f348995d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((ou4.c0) it.next()).getClass();
        }
        this.f348995d.clear();
    }
}
