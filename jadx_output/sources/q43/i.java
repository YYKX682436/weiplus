package q43;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final q43.i f360098a = new q43.i();

    public final void a(java.lang.String packageName) {
        q43.j Vi = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi();
        Vi.getClass();
        kotlin.jvm.internal.o.g(packageName, "packageName");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadStorage", "updateDownloadTaskFinishedTime, packageName:".concat(packageName));
        q43.a z07 = Vi.z0(packageName);
        if (z07 != null) {
            z07.field_finishDownloadTime = com.tencent.mm.sdk.platformtools.t8.i1();
            Vi.update(z07, new java.lang.String[0]);
        }
        q43.g.f360094a.f(packageName);
    }
}
