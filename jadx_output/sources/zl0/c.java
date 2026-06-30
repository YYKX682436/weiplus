package zl0;

/* loaded from: classes13.dex */
public class c implements ol0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zl0.a f473560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473561b;

    public c(zl0.a aVar, java.lang.String str) {
        this.f473560a = aVar;
        this.f473561b = str;
    }

    @Override // ol0.b
    public void a() {
        em0.e.a(11L);
        com.tencent.mars.xlog.Log.e("Kara.ModelManager", "download file %s", this.f473560a.toString());
    }

    @Override // ol0.b
    public void b(java.lang.String str) {
        em0.e.a(10L);
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
        zl0.a aVar = this.f473560a;
        if (!aVar.f473557b.equals(p17)) {
            em0.e.a(13L);
            com.tencent.mars.xlog.Log.e("Kara.ModelManager", "md5 check fail %s %s", aVar.toString(), p17);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                m17.f213266a.d(m17.f213267b);
                return;
            }
            return;
        }
        em0.e.a(12L);
        com.tencent.mars.xlog.Log.i("Kara.ModelManager", "download succ %s", aVar.toString());
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str3 = a18.f213279f;
        if (str3 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m18.a() ? m18.f213266a.F(m18.f213267b) : false) {
            java.lang.String str4 = this.f473561b;
            if (ol0.d.a(str, str4)) {
                em0.e.a(14L);
                com.tencent.mars.xlog.Log.i("Kara.ModelManager", "decompress succ save: %s", str4);
            } else {
                em0.e.a(15L);
                com.tencent.mars.xlog.Log.e("Kara.ModelManager", "decompress fail %s", str4);
            }
        }
    }
}
