package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class g2 extends com.tencent.mm.plugin.sns.model.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f164200c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.memory.r f164201d = null;

    /* renamed from: e, reason: collision with root package name */
    public final int f164202e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f164203f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f164204g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f164205h;

    public g2(java.lang.String str, java.lang.String str2, java.util.List list) {
        this.f164200c = "";
        ((java.util.HashSet) com.tencent.mm.plugin.sns.model.l4.hj().f164274w).add(str);
        this.f164204g = str2;
        this.f164203f = com.tencent.mm.plugin.sns.model.l4.Di();
        this.f164202e = com.tencent.mm.plugin.sns.model.l4.nj();
        this.f164205h = list;
        this.f164200c = str;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.lang.Object a(java.lang.Object[] objArr) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = "doInBackground";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        java.lang.String str4 = this.f164204g;
        java.lang.String V = ca4.z0.V(str4);
        java.lang.String str5 = this.f164203f;
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(str5, str4);
        if (com.tencent.mm.vfs.w6.j(d17 + V)) {
            str = "doInBackground";
            str2 = d17;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("makeMutilMedia ");
            sb6.append(str4);
            sb6.append(" ");
            sb6.append(V);
            sb6.append(" ");
            java.util.List list = this.f164205h;
            sb6.append(list.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.MutiImageLoader", sb6.toString());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            try {
                while (it.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it.next();
                    java.lang.String e07 = ca4.z0.e0(jj4Var);
                    java.lang.String U = ca4.z0.U(jj4Var);
                    java.util.Iterator it6 = it;
                    java.lang.String d18 = com.tencent.mm.plugin.sns.model.f6.d(str5, jj4Var.f377855d);
                    str = str3;
                    if (com.tencent.mm.vfs.w6.j(d18 + e07)) {
                        str2 = d17;
                    } else {
                        if (com.tencent.mm.vfs.w6.j(d18 + U)) {
                            str2 = d17;
                        } else {
                            java.lang.String J2 = ca4.z0.J(jj4Var);
                            str2 = d17;
                            if (!com.tencent.mm.vfs.w6.j(d18 + J2)) {
                                J2 = ca4.z0.W(jj4Var);
                            }
                            com.tencent.mm.plugin.sns.storage.m2.W0(d18, J2, U, com.tencent.mm.plugin.sns.model.l4.tj());
                        }
                        com.tencent.mm.plugin.sns.storage.m2.i1(d18, U, e07, com.tencent.mm.plugin.sns.model.l4.mj());
                    }
                    com.tencent.mm.memory.r n17 = ca4.z0.n(d18 + e07);
                    if (n17 != null) {
                        linkedList.add(n17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MutiImageLoader", "getbitmap from bm " + n17 + " " + d18 + e07);
                        i17++;
                        if (i17 < 9) {
                            it = it6;
                            str3 = str;
                            d17 = str2;
                        }
                        break;
                    }
                    com.tencent.mm.vfs.w6.h(d18 + e07);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("userThumb decode fail !! ");
                    sb7.append(e07);
                    com.tencent.mars.xlog.Log.e("MicroMsg.MutiImageLoader", sb7.toString());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
                    break;
                }
                break;
                java.lang.String d19 = com.tencent.mm.plugin.sns.model.f6.d(str5, str4);
                com.tencent.mm.vfs.w6.u(d19);
                com.tencent.mm.sdk.platformtools.x.D0(ca4.z0.u0(linkedList, this.f164202e), 100, android.graphics.Bitmap.CompressFormat.JPEG, d19 + V, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MutiImageLoader", e17, "makeMutilMedia failed: " + V, new java.lang.Object[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
            }
            str = str3;
            str2 = d17;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.String str6 = str2;
        sb8.append(str6);
        sb8.append(V);
        this.f164201d = ca4.z0.n(sb8.toString());
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        com.tencent.mm.memory.r rVar = this.f164201d;
        hj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.model.k1(hj6, 0, str4, rVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mars.xlog.Log.i("MicroMsg.MutiImageLoader", "deocde done bm " + this.f164201d + " requestid " + str4 + " " + str6 + V);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str7 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        return bool;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        java.util.concurrent.ExecutorService bj6 = com.tencent.mm.plugin.sns.model.l4.bj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        return bj6;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        super.c((java.lang.Boolean) obj);
        java.util.HashSet hashSet = (java.util.HashSet) com.tencent.mm.plugin.sns.model.l4.hj().f164274w;
        java.lang.String str = this.f164200c;
        hashSet.remove(str);
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        com.tencent.mm.memory.r rVar = this.f164201d;
        hj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.coverview.m0.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        hj6.r0("", str, rVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.coverview.m0.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
    }
}
