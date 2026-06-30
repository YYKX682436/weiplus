package e10;

/* loaded from: classes7.dex */
public final class r extends ie3.j {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_b516b52d";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void haveSpecifiedResourceAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        super.haveSpecifiedResourceAsync(j17, projectId, name, i17, i18, i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRMagicEcsPublicServiceFeatureService", "haveSpecifiedResourceAsync projectId " + projectId + ", name " + name + ", version " + i17 + " errNo " + i18 + " errCode " + i19);
    }

    @Override // ie3.j, ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRMagicEcsPublicServiceFeatureService", "postProcessAsync, resource name:" + resource.getName() + ", path:" + resource.getPath() + ", postPath:" + resource.c());
        super.postProcessAsync(j17, resource);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(resource.c());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UDRMagicEcsPublicServiceFeatureService", "postPath not exist");
            com.tencent.mm.vfs.w6.u(resource.c());
        }
        if (kotlin.jvm.internal.o.b(resource.getName(), "EcsGiftOpenAnimation")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UDRMagicEcsPublicServiceFeatureService", "unzipStatus: " + com.tencent.mm.vfs.w6.Q(resource.getPath(), resource.c()));
        }
    }
}
