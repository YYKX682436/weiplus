package yd2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final yd2.m f461076a = new yd2.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f461077b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.Class paramsClass) {
        kotlin.jvm.internal.o.g(paramsClass, "paramsClass");
        com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolSchema toolSchema = (com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolSchema) paramsClass.getAnnotation(com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolSchema.class);
        if (toolSchema == null) {
            throw new java.lang.IllegalArgumentException(paramsClass.getSimpleName().concat(" must be annotated with @ToolSchema"));
        }
        java.lang.String name = toolSchema.name();
        java.lang.String version = toolSchema.version();
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(version, "version");
        java.lang.String str = name + '@' + version;
        if (((java.lang.Class) f461077b.putIfAbsent(str, paramsClass)) == null) {
            return;
        }
        throw new java.lang.IllegalStateException("Tool already registered: " + str);
    }
}
