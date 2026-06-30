package la4;

/* loaded from: classes4.dex */
public abstract class f extends com.tencent.mm.pluginsdk.model.j3 {

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.HashSet f317585k = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final la4.e f317586c;

    /* renamed from: f, reason: collision with root package name */
    public final la4.a f317589f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.jj4 f317590g;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.memory.r f317587d = null;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f317588e = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public int f317591h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f317592i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f317593j = "";

    public f(la4.e eVar, la4.a aVar) {
        this.f317589f = null;
        this.f317590g = null;
        this.f317586c = eVar;
        this.f317589f = aVar;
        if (aVar == null) {
            return;
        }
        this.f317590g = aVar.f317542a;
        f317585k.add(aVar.f());
        aVar.i();
    }

    public static /* synthetic */ java.util.HashSet g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        java.util.HashSet hashSet = f317585k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return hashSet;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        java.lang.Integer k17 = k((java.lang.String[]) objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return k17;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        java.util.concurrent.ExecutorService ij6 = com.tencent.mm.plugin.sns.model.l4.ij();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return ij6;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        p((java.lang.Integer) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
    }

    public abstract java.lang.String h(java.lang.String str);

    public java.lang.String i(java.lang.String str, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return str;
    }

    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCdnPath", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        la4.a aVar = this.f317589f;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "checkCdnPath: %s", java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.u(aVar.d())));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCdnPath", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:5|(2:7|(3:9|(2:12|10)|13)(1:14))|15|(4:16|17|(1:19)(1:243)|(2:21|(1:23)))|(1:26)(1:242)|27|(31:29|(1:31)(2:223|(1:225)(2:226|(1:228)(2:229|(1:231)(2:232|(1:234)(2:235|(1:237)(2:238|(1:240)))))))|32|(1:34)|35|(1:37)(1:222)|38|(1:40)(1:221)|(1:42)(1:220)|43|(1:45)|46|(4:48|(2:51|49)|52|53)(1:219)|54|55|56|57|58|59|60|61|(3:188|189|(4:191|(6:194|(3:196|197|(3:199|200|201))(1:204)|202|203|201|192)|205|206)(1:208))(2:63|(13:171|172|(2:174|(1:176)(2:177|(13:179|180|181|182|183|66|(1:68)(3:134|(2:139|(1:141)(6:142|(1:169)(2:150|(2:152|(1:154)))|155|(1:163)|164|(1:168)))|170)|69|70|(4:72|(5:74|(2:76|(1:125)(9:80|81|82|83|84|85|(3:87|(1:89)(6:105|106|107|108|109|110)|90)(1:117)|91|92))(1:127)|126|91|92)(1:128)|93|(5:95|(1:97)(1:102)|98|99|100)(1:103))(1:129)|104|99|100)))|185|183|66|(0)(0)|69|70|(0)(0)|104|99|100))|65|66|(0)(0)|69|70|(0)(0)|104|99|100)|241|32|(0)|35|(0)(0)|38|(0)(0)|(0)(0)|43|(0)|46|(0)(0)|54|55|56|57|58|59|60|61|(0)(0)|65|66|(0)(0)|69|70|(0)(0)|104|99|100) */
    /* JADX WARN: Can't wrap try/catch for region: R(40:5|(2:7|(3:9|(2:12|10)|13)(1:14))|15|16|17|(1:19)(1:243)|(2:21|(1:23))|(1:26)(1:242)|27|(31:29|(1:31)(2:223|(1:225)(2:226|(1:228)(2:229|(1:231)(2:232|(1:234)(2:235|(1:237)(2:238|(1:240)))))))|32|(1:34)|35|(1:37)(1:222)|38|(1:40)(1:221)|(1:42)(1:220)|43|(1:45)|46|(4:48|(2:51|49)|52|53)(1:219)|54|55|56|57|58|59|60|61|(3:188|189|(4:191|(6:194|(3:196|197|(3:199|200|201))(1:204)|202|203|201|192)|205|206)(1:208))(2:63|(13:171|172|(2:174|(1:176)(2:177|(13:179|180|181|182|183|66|(1:68)(3:134|(2:139|(1:141)(6:142|(1:169)(2:150|(2:152|(1:154)))|155|(1:163)|164|(1:168)))|170)|69|70|(4:72|(5:74|(2:76|(1:125)(9:80|81|82|83|84|85|(3:87|(1:89)(6:105|106|107|108|109|110)|90)(1:117)|91|92))(1:127)|126|91|92)(1:128)|93|(5:95|(1:97)(1:102)|98|99|100)(1:103))(1:129)|104|99|100)))|185|183|66|(0)(0)|69|70|(0)(0)|104|99|100))|65|66|(0)(0)|69|70|(0)(0)|104|99|100)|241|32|(0)|35|(0)(0)|38|(0)(0)|(0)(0)|43|(0)|46|(0)(0)|54|55|56|57|58|59|60|61|(0)(0)|65|66|(0)(0)|69|70|(0)(0)|104|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x045d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x05a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x05a5, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x05a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x05a8, code lost:
    
        r1 = "attachSnsImgTaskInfo";
        r3 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ce A[Catch: MalformedURLException -> 0x045d, TRY_LEAVE, TryCatch #9 {MalformedURLException -> 0x045d, blocks: (B:199:0x034d, B:201:0x0356, B:63:0x03ce, B:176:0x0456), top: B:61:0x02e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04d4 A[Catch: MalformedURLException -> 0x05a0, TryCatch #6 {MalformedURLException -> 0x05a0, blocks: (B:66:0x0489, B:68:0x04d4, B:69:0x057d, B:141:0x04ee, B:155:0x0510, B:157:0x051d, B:159:0x0528, B:161:0x0533, B:163:0x0546, B:164:0x054d, B:166:0x0552, B:168:0x055d, B:170:0x0572, B:182:0x047a, B:183:0x0481), top: B:181:0x047a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06cb  */
    /* JADX WARN: Type inference failed for: r17v2, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer k(java.lang.String... r37) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la4.f.k(java.lang.String[]):java.lang.Integer");
    }

    public abstract int l();

    public final java.lang.String[] m(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStringArray", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        if (list == null) {
            java.lang.String[] strArr = new java.lang.String[0];
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringArray", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return strArr;
        }
        int size = list.size();
        java.lang.String[] strArr2 = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr2[i17] = (java.lang.String) list.get(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringArray", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return strArr2;
    }

    public boolean n(com.tencent.mm.storage.s7 s7Var, java.lang.String str, long j17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return false;
        }
        try {
            java.net.URL url = new java.net.URL(str);
            if (s7Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                return false;
            }
            if (str2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                return false;
            }
            if (str2.indexOf(url.getHost()) == -1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                return false;
            }
            int i17 = s7Var.f195313b;
            if (i17 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                return false;
            }
            if (com.tencent.mm.sdk.platformtools.t8.H1(i17) > j17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                return true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", e17.getMessage());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return false;
        }
    }

    public boolean o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return true;
    }

    public void p(java.lang.Integer num) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
    }

    public abstract boolean q(dn.h hVar, int i17);

    public boolean r(dn.h hVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processGroupDownloadSuccessData", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        return false;
    }

    public void s() {
        java.lang.String x17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            return;
        }
        java.lang.System.currentTimeMillis();
        la4.a aVar = this.f317589f;
        int a17 = aVar.f317549h.a();
        java.lang.String str = aVar.f317543b;
        int i17 = 9;
        r45.jj4 jj4Var = this.f317590g;
        if (a17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur thumb");
            java.lang.String U = ca4.z0.U(jj4Var);
            java.lang.String M = ca4.z0.M(jj4Var);
            this.f317587d = ha4.a.b(aVar.d() + U, aVar.d() + M);
            com.tencent.mm.plugin.sns.model.l4.hj().J(str, this.f317587d, aVar.f317549h.a());
        } else if (aVar.f317549h.a() == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur grid");
            java.lang.String U2 = ca4.z0.U(jj4Var);
            java.lang.String L = ca4.z0.L(jj4Var);
            this.f317587d = ha4.a.b(aVar.d() + U2, aVar.d() + L);
            com.tencent.mm.plugin.sns.model.l4.hj().J(str, this.f317587d, aVar.f317549h.a());
        } else if (aVar.f317549h.b().size() <= 1) {
            com.tencent.mm.plugin.sns.model.l4.hj().J(str, this.f317587d, aVar.f317549h.a());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "merge decodeInfo size %d", java.lang.Integer.valueOf(aVar.f317549h.b().size()));
            int i18 = 0;
            com.tencent.mm.plugin.sns.model.l4.hj().J(str, this.f317587d, 0);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i19 = 0;
            while (i19 < aVar.f317549h.b().size() && i19 < i17) {
                r45.jj4 jj4Var2 = (r45.jj4) aVar.f317549h.b().get(i19);
                com.tencent.mm.memory.r j17 = com.tencent.mm.plugin.sns.model.l4.hj().j(i18, jj4Var2.f377855d);
                if (!ca4.z0.g(j17)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
                    return;
                }
                linkedList.add(j17);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap from " + j17 + " " + jj4Var2.f377855d);
                i19++;
                i17 = 9;
                i18 = 0;
            }
            this.f317587d = com.tencent.mm.memory.r.c(ca4.z0.u0(linkedList, com.tencent.mm.plugin.sns.model.l4.mj()));
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap " + aVar.f317549h.c() + " " + this.f317587d);
            com.tencent.mm.plugin.sns.model.l4.hj().J(aVar.f317549h.c(), this.f317587d, aVar.f317549h.a());
        }
        if (aVar.f317549h.a() == 0) {
            x17 = "0-" + aVar.f317549h.c();
        } else if (aVar.f317549h.a() == 1) {
            x17 = "1-" + aVar.f317549h.c();
        } else if (aVar.f317549h.a() == 4) {
            x17 = "4-" + aVar.f317549h.c();
        } else if (aVar.f317549h.a() == 5) {
            x17 = "5-" + aVar.f317549h.c();
        } else {
            x17 = aVar.f317549h.a() == 3 ? ca4.z0.x(3, aVar.f317549h.c()) : aVar.f317549h.a() == 8 ? ca4.z0.x(8, aVar.f317549h.c()) : aVar.f317549h.a() == 9 ? ca4.z0.x(9, aVar.f317549h.c()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]thumbAddDecode cacheName1: %s.", "[image-flow]", str, x17);
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        hj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        hj6.r0(str, x17, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
    }
}
