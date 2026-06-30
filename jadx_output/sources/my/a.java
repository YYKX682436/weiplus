package my;

/* loaded from: classes.dex */
public final class a extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_51db20b7";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mars.xlog.Log.i("ChatBotWeAppLocalModelFeatureService", "resource info: " + resource.d() + ' ' + resource.getName());
        java.lang.String path = resource.getPath();
        java.lang.String c17 = resource.c();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c17);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mars.xlog.Log.i("ChatBotWeAppLocalModelFeatureService", "dir not exist, path: ".concat(c17));
        } else if (com.tencent.mm.vfs.w6.Q(path, c17) != 0) {
            com.tencent.mars.xlog.Log.i("ChatBotWeAppLocalModelFeatureService", "unpack resource error");
        }
    }
}
