package gc0;

/* loaded from: classes5.dex */
public final class g3 extends ea5.l {
    public final java.lang.String b(java.lang.String postPath, java.lang.String name) {
        kotlin.jvm.internal.o.g(postPath, "postPath");
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(postPath, name);
        if (r6Var.m()) {
            return r6Var.o();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkUdrConfig", name + " does not exist at " + r6Var.o());
        return null;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList getParameter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
        vVar.d("RecommendRemarkEnable");
        vVar.c(1);
        vVar.e(1);
        arrayList.add(vVar);
        com.tencent.wechat.aff.udr.v vVar2 = new com.tencent.wechat.aff.udr.v();
        vVar2.d("sdkversion");
        vVar2.c(2);
        vVar2.e(1);
        arrayList.add(vVar2);
        return arrayList;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_0f34f0cc";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        java.lang.String c17 = resource.c();
        if (c17 != null) {
            java.lang.String path = resource.getPath();
            kotlin.jvm.internal.o.f(path, "getPath(...)");
            if (!(path.length() == 0)) {
                if (!(c17.length() == 0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemarkUdrConfig", "checkAndUnzip zipFilePath:" + path + " unzipFolder: " + c17);
                    if ((path.length() == 0) || !com.tencent.mm.vfs.w6.j(path)) {
                        return;
                    }
                    java.lang.String concat = c17.concat("_temp");
                    com.tencent.mm.vfs.w6.f(concat);
                    com.tencent.mm.vfs.w6.f(c17);
                    com.tencent.mm.vfs.w6.u(concat);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemarkUdrConfig", "unZip result unzipStatus: " + com.tencent.mm.vfs.w6.Q(path, concat) + " moveDirStatus: " + com.tencent.mm.vfs.w6.v(concat, c17));
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.RemarkUdrConfig", "unZip fail path empty, zipFilePath: " + path + " unzipFolder: " + c17);
        }
    }
}
