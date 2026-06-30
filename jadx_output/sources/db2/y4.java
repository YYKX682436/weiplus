package db2;

/* loaded from: classes8.dex */
public final class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f228244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.u f228245f;

    public y4(java.lang.String str, r45.qt2 qt2Var, yz5.u uVar) {
        this.f228243d = str;
        this.f228244e = qt2Var;
        this.f228245f = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verify ");
        java.lang.String str = this.f228243d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.FinderExtendReadingVerifier", sb6.toString());
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderExtendedReadingPrefix");
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                d17 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + ';';
            }
            kotlin.jvm.internal.o.d(d17);
            java.util.List e07 = r26.n0.e0(r26.n0.u0(d17).toString(), new char[]{';'}, false, 0, 6, null);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : e07) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(r26.n0.u0((java.lang.String) obj).toString())) {
                    arrayList.add(obj);
                }
            }
            boolean z17 = false;
            for (java.lang.String str2 : arrayList) {
                java.lang.String lowerCase = str.toLowerCase();
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                if (r26.i0.y(lowerCase, r26.n0.u0(str2).toString(), false)) {
                    z17 = true;
                }
            }
            if (z17) {
                new db2.c4(1, this.f228243d, 0, null, this.f228244e, null, null, false, com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX, null).l().K(new db2.x4(this.f228245f, str));
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderExtendReadingVerifier", "scheme or host not valid");
            yz5.u uVar = this.f228245f;
            java.util.Map map = db2.z4.f228259a;
            uVar.K(java.lang.Integer.valueOf(db2.z4.f228260b), "", this.f228243d, "", 0, 2, null);
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderExtendReadingVerifier", e17, "MalformedURLException", new java.lang.Object[0]);
            yz5.u uVar2 = this.f228245f;
            java.util.Map map2 = db2.z4.f228259a;
            uVar2.K(java.lang.Integer.valueOf(db2.z4.f228260b), "", this.f228243d, "", 0, 2, null);
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderExtendReadingVerifier", e18, "IOException", new java.lang.Object[0]);
            yz5.u uVar3 = this.f228245f;
            java.util.Map map3 = db2.z4.f228259a;
            uVar3.K(java.lang.Integer.valueOf(db2.z4.f228261c), "", this.f228243d, "", 0, 2, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderExtendReadingVerifier", th6, "Throwable", new java.lang.Object[0]);
            yz5.u uVar4 = this.f228245f;
            java.util.Map map4 = db2.z4.f228259a;
            uVar4.K(java.lang.Integer.valueOf(db2.z4.f228261c), "", this.f228243d, "", 0, 2, null);
        }
    }
}
