package com.tencent.mm.plugin.fts;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.fts.j f137759d;

    public m(com.tencent.mm.plugin.fts.n nVar, com.tencent.mm.plugin.fts.j jVar) {
        this.f137759d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.fts.j jVar = this.f137759d;
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(jVar.f137420a);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if ((!m17.a() ? false : m17.f213266a.F(m17.f213267b)) || (bitmap = jVar.f137421b) == null || bitmap.isRecycled()) {
                return;
            }
            java.lang.System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.x.D0(jVar.f137421b, 100, android.graphics.Bitmap.CompressFormat.PNG, jVar.f137420a, false);
            java.lang.System.currentTimeMillis();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSImageLoader", e17, "", new java.lang.Object[0]);
        }
    }
}
