package wc3;

/* loaded from: classes7.dex */
public final class e extends lc3.f0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f444511e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f444512f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String bizName, java.lang.String instanceName) {
        super(instanceName);
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f444511e = bizName;
        this.f444512f = "MagicCommonBizPkgManagement";
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return "";
    }

    @Override // jc3.x
    public com.tencent.mm.plugin.appbrand.appstorage.u1 b() {
        return new com.tencent.mm.plugin.appbrand.appstorage.y0();
    }

    @Override // jc3.x
    public java.lang.String d() {
        return this.f444511e;
    }

    @Override // jc3.x
    public void f(yz5.l cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.mars.xlog.Log.i(this.f444512f, "provide main scripts");
        cb6.invoke(kz5.b0.c(new lc3.j0("")));
    }

    @Override // jc3.x
    public java.lang.String g() {
        return this.f444511e;
    }
}
