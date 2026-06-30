package ul2;

/* loaded from: classes5.dex */
public final class e extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList getParameter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
        vVar.d("InnerVersion");
        vVar.c(3);
        vVar.e(1);
        arrayList.add(vVar);
        com.tencent.wechat.aff.udr.v vVar2 = new com.tencent.wechat.aff.udr.v();
        vVar2.d("InnerVersion_Karaoke");
        vVar2.c(5);
        vVar2.e(1);
        arrayList.add(vVar2);
        return arrayList;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_68d95938";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mars.xlog.Log.i("URDLiveKTVSoFeatureServ", "project rsp: " + resource.getPath() + " postPath: " + resource.c());
        java.lang.String o17 = new com.tencent.mm.vfs.r6(resource.c(), "lib_ktv_so").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.String path = resource.getPath();
        kotlin.jvm.internal.o.f(path, "getPath(...)");
        wl2.e.a(path, o17);
    }
}
