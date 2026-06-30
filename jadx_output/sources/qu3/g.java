package qu3;

/* loaded from: classes.dex */
public final class g extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public boolean addToPeriod() {
        return true;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_806b4baf";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        java.lang.String c17;
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mars.xlog.Log.i("UDRSecondCutPromotionItems", "resource info: %s", resource.toString());
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(resource.getPath());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        if (((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class)) == null || (c17 = resource.c()) == null) {
            return;
        }
        if (com.tencent.mm.vfs.w6.Q(com.tencent.mm.vfs.w6.i(a17.toString(), false), c17) < 0) {
            com.tencent.mars.xlog.Log.e("UDRSecondCutPromotionItems", "postProcess unzip resource failed, projectId: %s, resourcePath: %s, outputPath: %s", resource.d(), resource.getPath(), c17);
        } else {
            com.tencent.mars.xlog.Log.i("UDRSecondCutPromotionItems", "unzip success, resource original path: %s, outputPath: %s", resource.getPath(), c17);
        }
    }
}
