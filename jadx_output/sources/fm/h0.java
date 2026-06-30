package fm;

/* loaded from: classes7.dex */
public final class h0 extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_9f0a6b36";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        java.lang.String path = resource.getPath();
        if (path == null) {
            path = "";
        }
        java.lang.String c17 = resource.c();
        if (c17 == null) {
            c17 = "";
        }
        j65.b.h(path, c17, "");
        k65.l lVar = k65.l.f304617a;
        java.lang.String name = resource.getName();
        java.lang.String str = (java.lang.String) kz5.n0.i0(r26.n0.f0(name == null ? "" : name, new java.lang.String[]{"_"}, false, 0, 6, null));
        if (str.length() > 0) {
            java.lang.String c18 = resource.c();
            kotlin.jvm.internal.o.f(c18, "getPostPath(...)");
            if (c18.length() > 0) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(j65.b.f297918g, str);
                android.util.Pair c19 = j65.b.c(resource.c(), r6Var.o());
                java.lang.String o17 = r6Var.o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                k65.l.f(o17, false);
                com.tencent.mars.xlog.Log.i("UDRBaseStringResPreloadService", "postProcess: moveRes: " + c19 + " downloadResourceVersion: " + str);
            }
        }
        com.tencent.mars.xlog.Log.i("UDRBaseStringResPreloadService", "postProcess: " + resource.c() + " path: " + resource.getPath() + " resourceName: " + resource.getName() + " currentVersion: 96b2c56e4056b923191227d71602c0ce");
    }
}
