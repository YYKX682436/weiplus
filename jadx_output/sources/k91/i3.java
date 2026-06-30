package k91;

/* loaded from: classes.dex */
public final class i3 {
    public i3(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        com.tencent.mars.xlog.Log.i("UDRBizWAGameIconInfoFeatureService", "unzipResource, resource info: %s", resource.toString());
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(resource.getPath());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String c17 = resource.c();
        if (c17 == null) {
            return;
        }
        int Q = com.tencent.mm.vfs.w6.Q(com.tencent.mm.vfs.w6.i(a17.toString(), false), c17);
        if (Q < 0) {
            com.tencent.mars.xlog.Log.e("UDRBizWAGameIconInfoFeatureService", "postProcess unzip resource failed, projectId: %s, resourcePath: %s, outputPath: %s", resource.d(), resource.getPath(), c17);
        } else {
            com.tencent.mars.xlog.Log.i("UDRBizWAGameIconInfoFeatureService", "unzip success, resource original path: %s, outputPath: %s", resource.getPath(), c17);
        }
        boolean z17 = Q >= 0;
        java.lang.String path = resource.getPath();
        if (path.length() == 0) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.M(path).putBoolean("ready", z17);
    }
}
