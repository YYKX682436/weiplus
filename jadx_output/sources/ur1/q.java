package ur1;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f430368e;

    public q(java.lang.String str, yz5.l lVar) {
        this.f430367d = str;
        this.f430368e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f430367d;
        yz5.l lVar = this.f430368e;
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                lVar.invoke("");
                return;
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str + "/LocalDraft");
            if (!r6Var.m()) {
                lVar.invoke("");
                return;
            }
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            java.lang.String a18 = com.tencent.mm.vfs.s6.a(r6Var, forName);
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "readWebDraft from file contentLen: " + a18.length() + ", contentMd5: " + com.tencent.mm.sdk.platformtools.w2.b(a18.getBytes()) + ", contentPrefix: " + r26.p0.E0(a18, 200));
            lVar.invoke(a18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("BizPersonalDraftFeatureService", e17, "readWebDraft exception", new java.lang.Object[0]);
            lVar.invoke("");
        }
    }
}
