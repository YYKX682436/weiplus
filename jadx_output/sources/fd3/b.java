package fd3;

/* loaded from: classes.dex */
public final class b extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f261281f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261282g;

    public b(java.lang.Class taskClass) {
        kotlin.jvm.internal.o.g(taskClass, "taskClass");
        this.f261281f = taskClass;
    }

    @Override // lc3.c0
    public java.lang.String f() {
        if (this.f261282g == null) {
            fd3.a aVar = (fd3.a) this.f261281f.getAnnotation(fd3.a.class);
            java.lang.String name = aVar != null ? aVar.name() : null;
            this.f261282g = name;
            boolean z17 = false;
            if (name != null) {
                kotlin.jvm.internal.o.d(name);
                if (name.length() > 0) {
                    z17 = true;
                }
            }
            iz5.a.g(null, z17);
        }
        java.lang.String str = this.f261282g;
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    @Override // lc3.b0
    public lc3.b0 r() {
        java.lang.Object newInstance = fd3.b.class.getConstructor(java.lang.Class.class).newInstance(this.f261281f);
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        return (lc3.b0) newInstance;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.magicbrush.jsapi.base.d dVar = (com.tencent.mm.plugin.magicbrush.jsapi.base.d) this.f261281f.newInstance();
        com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType requestType = new com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType(new com.tencent.mm.ipcinvoker.type.IPCString(f()), new com.tencent.mm.ipcinvoker.type.IPCString(data.toString()));
        kotlin.jvm.internal.o.d(dVar);
        uk0.a.b(requestType, dVar, new com.tencent.mm.plugin.magicbrush.jsapi.base.c(this));
    }
}
