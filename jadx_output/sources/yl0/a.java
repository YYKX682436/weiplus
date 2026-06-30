package yl0;

/* loaded from: classes13.dex */
public class a implements ol0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f462955a;

    public a(java.lang.String str) {
        this.f462955a = str;
    }

    @Override // ol0.b
    public void a() {
        com.tencent.mars.xlog.Log.e("Kara.XgboostEnv", "download fail");
    }

    @Override // ol0.b
    public void b(java.lang.String str) {
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
        java.lang.String str2 = this.f462955a;
        if (!str2.equals(p17)) {
            em0.e.a(13L);
            com.tencent.mars.xlog.Log.e("Kara.XgboostEnv", "md5 check fail %s %s", str2, p17);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
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
        com.tencent.mars.xlog.Log.i("Kara.XgboostEnv", "download succ");
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str4 = a18.f213279f;
        if (str4 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m18.a() ? m18.f213266a.F(m18.f213267b) : false) {
            java.lang.String str5 = yl0.b.f462957b;
            if (ol0.d.a(str, str5)) {
                em0.e.a(14L);
                com.tencent.mars.xlog.Log.i("Kara.XgboostEnv", "decompress succ save: %s", str5);
            } else {
                em0.e.a(15L);
                com.tencent.mars.xlog.Log.e("Kara.XgboostEnv", "decompress fail %s", str5);
            }
        }
    }
}
