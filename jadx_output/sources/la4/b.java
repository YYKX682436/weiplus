package la4;

/* loaded from: classes4.dex */
public abstract class b extends la4.f {
    public static final java.util.HashSet M = new java.util.HashSet();
    public final java.lang.String A;
    public final com.tencent.mm.pointers.PString B;
    public int C;
    public long D;
    public long E;
    public long F;
    public int G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f317562J;
    public java.util.Map K;
    public int L;

    /* renamed from: l, reason: collision with root package name */
    public final la4.e f317563l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.memory.r f317564m;

    /* renamed from: n, reason: collision with root package name */
    public final la4.a f317565n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.jj4 f317566o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f317567p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f317568q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f317569r;

    /* renamed from: s, reason: collision with root package name */
    public int f317570s;

    /* renamed from: t, reason: collision with root package name */
    public int f317571t;

    /* renamed from: u, reason: collision with root package name */
    public long f317572u;

    /* renamed from: v, reason: collision with root package name */
    public long f317573v;

    /* renamed from: w, reason: collision with root package name */
    public int f317574w;

    /* renamed from: x, reason: collision with root package name */
    public long f317575x;

    /* renamed from: y, reason: collision with root package name */
    public long f317576y;

    /* renamed from: z, reason: collision with root package name */
    public long f317577z;

    public b(la4.e eVar, la4.a aVar) {
        super(eVar, aVar);
        this.f317564m = null;
        this.f317565n = null;
        this.f317566o = null;
        this.f317567p = "";
        this.f317568q = "";
        this.f317569r = "";
        this.f317570s = 0;
        this.f317571t = 0;
        this.f317572u = -1L;
        this.f317573v = -1L;
        this.f317574w = -1;
        this.f317575x = -1L;
        this.f317576y = -1L;
        this.f317577z = -1L;
        this.A = "";
        this.B = new com.tencent.mm.pointers.PString();
        this.G = -1;
        this.H = 0;
        this.I = "";
        this.f317562J = 0;
        this.L = 0;
        this.f317563l = eVar;
        this.f317565n = aVar;
        if (aVar == null) {
            return;
        }
        this.f317566o = aVar.f317542a;
        M.add(aVar.f());
        aVar.i();
    }

    public static long y(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return 0L;
        }
        try {
            java.lang.String[] split = str.split("\\.");
            long V = (com.tencent.mm.sdk.platformtools.t8.V(split[0], 0L) * 16777216) + (com.tencent.mm.sdk.platformtools.t8.V(split[1], 0L) * 65536) + (com.tencent.mm.sdk.platformtools.t8.V(split[2], 0L) * 256) + com.tencent.mm.sdk.platformtools.t8.V(split[3], 0L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return V;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return 0L;
        }
    }

    @Override // la4.f, com.tencent.mm.pluginsdk.model.j3
    public /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        java.lang.Integer k17 = k((java.lang.String[]) objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        return k17;
    }

    @Override // la4.f, com.tencent.mm.pluginsdk.model.j3
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        java.util.concurrent.ExecutorService ij6 = com.tencent.mm.plugin.sns.model.l4.ij();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        return ij6;
    }

    @Override // la4.f, com.tencent.mm.pluginsdk.model.j3
    public /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        p((java.lang.Integer) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public void e(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        java.lang.Integer[] numArr = (java.lang.Integer[]) objArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (numArr == null || numArr.length == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "responeTotalLen:%d, downloadlen:%d ", java.lang.Integer.valueOf(this.f317562J), numArr[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:5|(1:7)|8|(1:10)(41:200|(1:202)(2:203|(1:205)(2:206|(1:208)(2:209|(1:211)(2:212|(1:214)(2:215|(1:217)(2:218|(1:220)))))))|12|(1:14)|15|(1:17)(1:199)|(1:19)(1:198)|20|(1:22)|23|24|25|(1:27)(1:196)|28|29|30|31|32|33|34|(1:36)|37|(1:41)|42|(1:46)|47|(1:51)|52|(1:56)|57|58|(2:161|(2:163|164)(12:165|(1:169)|170|171|74|75|(1:77)(1:147)|78|(10:80|81|82|83|84|85|87|88|(2:90|91)(5:94|95|96|97|(2:99|100)(5:102|(1:104)(1:109)|105|106|107))|92)|146|106|107))(6:62|(2:64|(1:(1:152))(1:67))(2:153|(1:(1:160))(1:156))|68|(1:70)|71|72)|73|74|75|(0)(0)|78|(0)|146|106|107)|11|12|(0)|15|(0)(0)|(0)(0)|20|(0)|23|24|25|(0)(0)|28|29|30|31|32|33|34|(0)|37|(2:39|41)|42|(2:44|46)|47|(2:49|51)|52|(2:54|56)|57|58|(1:60)|161|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0424, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0426, code lost:
    
        r43.G = 1;
        z(false);
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0432, code lost:
    
        if (r12.f317546e != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0434, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22, 77, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0451, code lost:
    
        if (r12.f317545d != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0453, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150, 14, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0460, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! socket timeout mediaId : " + r13 + " " + r12.f317544c + " msg:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x047d, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("connect", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0442, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22, 55, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03eb, code lost:
    
        z(false);
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03f4, code lost:
    
        if (r12.f317545d != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03f6, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150, 14, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0403, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! mediaId : " + r13 + " " + r12.f317544c + " msg:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0420, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("connect", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0484, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0489, code lost:
    
        r3 = 0;
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", r0, "connect fail : " + r0.getMessage(), new java.lang.Object[0]);
        r43.G = 2;
        z(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("connect", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0486, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0487, code lost:
    
        r23 = "doInBackground";
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x019b, code lost:
    
        r3 = "-";
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036b A[Catch: Exception -> 0x0484, TRY_LEAVE, TryCatch #13 {Exception -> 0x0484, blocks: (B:34:0x0202, B:36:0x021e, B:37:0x022b, B:39:0x0247, B:41:0x024d, B:42:0x0256, B:44:0x0262, B:46:0x0268, B:47:0x0271, B:49:0x027d, B:51:0x0283, B:52:0x0290, B:54:0x029c, B:56:0x02a2, B:161:0x035e, B:163:0x036b, B:165:0x0392, B:167:0x03a7, B:169:0x03ad, B:170:0x03ba, B:185:0x03eb, B:187:0x03f6, B:188:0x0403, B:174:0x0426, B:176:0x0434, B:177:0x044f, B:179:0x0453, B:180:0x0460, B:182:0x0442, B:58:0x02af, B:62:0x02c7, B:64:0x02d6, B:67:0x02dc, B:68:0x0325, B:70:0x0329, B:71:0x0336, B:152:0x02f0, B:153:0x02fe, B:156:0x0304, B:160:0x0318), top: B:33:0x0202, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0392 A[Catch: Exception -> 0x0484, TRY_ENTER, TryCatch #13 {Exception -> 0x0484, blocks: (B:34:0x0202, B:36:0x021e, B:37:0x022b, B:39:0x0247, B:41:0x024d, B:42:0x0256, B:44:0x0262, B:46:0x0268, B:47:0x0271, B:49:0x027d, B:51:0x0283, B:52:0x0290, B:54:0x029c, B:56:0x02a2, B:161:0x035e, B:163:0x036b, B:165:0x0392, B:167:0x03a7, B:169:0x03ad, B:170:0x03ba, B:185:0x03eb, B:187:0x03f6, B:188:0x0403, B:174:0x0426, B:176:0x0434, B:177:0x044f, B:179:0x0453, B:180:0x0460, B:182:0x0442, B:58:0x02af, B:62:0x02c7, B:64:0x02d6, B:67:0x02dc, B:68:0x0325, B:70:0x0329, B:71:0x0336, B:152:0x02f0, B:153:0x02fe, B:156:0x0304, B:160:0x0318), top: B:33:0x0202, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0198 A[Catch: Exception -> 0x019b, TRY_LEAVE, TryCatch #9 {Exception -> 0x019b, blocks: (B:25:0x0185, B:27:0x018d, B:196:0x0198), top: B:24:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018d A[Catch: Exception -> 0x019b, TryCatch #9 {Exception -> 0x019b, blocks: (B:25:0x0185, B:27:0x018d, B:196:0x0198), top: B:24:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021e A[Catch: Exception -> 0x0484, TryCatch #13 {Exception -> 0x0484, blocks: (B:34:0x0202, B:36:0x021e, B:37:0x022b, B:39:0x0247, B:41:0x024d, B:42:0x0256, B:44:0x0262, B:46:0x0268, B:47:0x0271, B:49:0x027d, B:51:0x0283, B:52:0x0290, B:54:0x029c, B:56:0x02a2, B:161:0x035e, B:163:0x036b, B:165:0x0392, B:167:0x03a7, B:169:0x03ad, B:170:0x03ba, B:185:0x03eb, B:187:0x03f6, B:188:0x0403, B:174:0x0426, B:176:0x0434, B:177:0x044f, B:179:0x0453, B:180:0x0460, B:182:0x0442, B:58:0x02af, B:62:0x02c7, B:64:0x02d6, B:67:0x02dc, B:68:0x0325, B:70:0x0329, B:71:0x0336, B:152:0x02f0, B:153:0x02fe, B:156:0x0304, B:160:0x0318), top: B:33:0x0202, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04e4  */
    @Override // la4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer k(java.lang.String... r44) {
        /*
            Method dump skipped, instructions count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la4.b.k(java.lang.String[]):java.lang.Integer");
    }

    @Override // la4.f
    public boolean n(com.tencent.mm.storage.s7 s7Var, java.lang.String str, long j17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        }
        try {
            java.net.URL url = new java.net.URL(str);
            if (s7Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return false;
            }
            if (str2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return false;
            }
            if (str2.indexOf(url.getHost()) == -1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return false;
            }
            int i17 = s7Var.f195313b;
            if (i17 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return false;
            }
            if (com.tencent.mm.sdk.platformtools.t8.H1(i17) > j17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", e17.getMessage());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        }
    }

    @Override // la4.f
    public abstract boolean o();

    @Override // la4.f
    public void p(java.lang.Integer num) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        super.p(num);
        la4.a aVar = this.f317565n;
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return;
        }
        java.lang.String str = aVar.f317544c;
        java.lang.String str2 = aVar.f317543b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.H);
        java.util.HashSet hashSet = M;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d", num, str, str2, valueOf, java.lang.Integer.valueOf(hashSet.size()));
        hashSet.remove(aVar.f());
        if (aVar.f317545d && num.intValue() != 2) {
            com.tencent.mm.plugin.sns.model.n7.b(aVar.f317543b, aVar.f317555n);
            s();
        } else if (!aVar.f317545d && aVar.f317547f == 4) {
            com.tencent.mm.plugin.sns.model.l4.hj().K(aVar.f317543b, aVar.d() + ca4.z0.R(this.f317566o));
        }
        ((com.tencent.mm.plugin.sns.model.m0) this.f317563l).u(num.intValue(), this.f317566o, aVar.e(), aVar.f317545d, aVar.f(), this.H, -1, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    @Override // la4.f
    public void s() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return;
        }
        java.lang.System.currentTimeMillis();
        la4.a aVar = this.f317565n;
        int a17 = aVar.f317549h.a();
        java.lang.String str2 = aVar.f317543b;
        r45.jj4 jj4Var = this.f317566o;
        if (a17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur thumb");
            java.lang.String U = ca4.z0.U(jj4Var);
            java.lang.String M2 = ca4.z0.M(jj4Var);
            this.f317564m = ha4.a.b(aVar.d() + U, aVar.d() + M2);
            com.tencent.mm.plugin.sns.model.l4.hj().J(str2, this.f317564m, aVar.f317549h.a());
        } else if (aVar.f317549h.a() == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur grid");
            java.lang.String U2 = ca4.z0.U(jj4Var);
            java.lang.String L = ca4.z0.L(jj4Var);
            this.f317564m = ha4.a.b(aVar.d() + U2, aVar.d() + L);
            com.tencent.mm.plugin.sns.model.l4.hj().J(str2, this.f317564m, aVar.f317549h.a());
        } else if (aVar.f317549h.b().size() <= 1) {
            com.tencent.mm.plugin.sns.model.l4.hj().J(str2, this.f317564m, aVar.f317549h.a());
        } else {
            com.tencent.mm.plugin.sns.model.l4.hj().J(str2, this.f317564m, 0);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < aVar.f317549h.b().size() && i17 < 4; i17++) {
                r45.jj4 jj4Var2 = (r45.jj4) aVar.f317549h.b().get(i17);
                com.tencent.mm.memory.r j17 = com.tencent.mm.plugin.sns.model.l4.hj().j(0, jj4Var2.f377855d);
                if (!ca4.z0.g(j17)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                    return;
                }
                linkedList.add(j17);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap from " + j17 + " " + jj4Var2.f377855d);
            }
            this.f317564m = com.tencent.mm.memory.r.c(ca4.z0.u0(linkedList, com.tencent.mm.plugin.sns.model.l4.nj()));
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap " + aVar.f317549h.c() + " " + this.f317564m);
            com.tencent.mm.plugin.sns.model.l4.hj().J(aVar.f317549h.c(), this.f317564m, aVar.f317549h.a());
        }
        if (aVar.f317549h.a() == 0) {
            str = "0-" + aVar.f317549h.c();
        } else if (aVar.f317549h.a() == 1) {
            str = "1-" + aVar.f317549h.c();
        } else if (aVar.f317549h.a() == 4) {
            str = "4-" + aVar.f317549h.c();
        } else if (aVar.f317549h.a() == 5) {
            str = "5-" + aVar.f317549h.c();
        } else {
            str = null;
        }
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        hj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.coverview.m0.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        hj6.r0("", str, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.coverview.m0.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    public abstract com.tencent.mm.network.h2 t(com.tencent.mm.network.h2 h2Var);

    public final boolean u(com.tencent.mm.network.h2 h2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        try {
            java.util.List list = (java.util.List) h2Var.b().get("cache-control");
            if (list != null && list.size() != 0) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(list.toString()) && list.toString().contains("no-cache")) {
                    if (list.toString().contains("no-cache")) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                        return false;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                    return false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        }
    }

    public boolean v(int i17, long j17, com.tencent.mm.pointers.PString pString) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStatistic", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - j17 < 1000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStatistic", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        }
        pString.value += java.lang.String.format("ts=%d&size=%d|", java.lang.Long.valueOf(currentTimeMillis / 1000), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStatistic", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        return true;
    }

    public final void w(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return;
        }
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (java.lang.String str : map.keySet()) {
                java.util.List list = (java.util.List) map.get(str);
                if (list != null) {
                    stringBuffer.append(str + ":");
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(((java.lang.String) it.next()) + "|");
                    }
                    stringBuffer.append(";");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "header respone %s", stringBuffer.toString());
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    public abstract boolean x(java.io.InputStream inputStream, java.util.Map map);

    public final void z(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportResult", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        la4.a aVar = this.f317565n;
        if (aVar == null || !aVar.f317546e) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 53L, this.f317572u, true);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 52L, 1L, true);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 51L, 1L, true);
        } else {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 75L, this.f317572u, true);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 74L, 1L, true);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 73L, 1L, true);
        }
        if (aVar != null && aVar.f317545d && !z17 && !ca4.z0.g(this.f317564m)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(150L, 66L, 1L, true);
        }
        this.H = this.L;
        boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
        int c17 = i0Var.c();
        if (aVar != null) {
            java.lang.String str = aVar.f317544c;
        }
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = (aVar == null || aVar.f317547f != 4) ? 0 : 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "retCode :%d totalSize: %d net: %d downloadType %d xErrorNo %d", java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(netType), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f317570s));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[19];
        objArr[0] = aVar == null ? "" : aVar.f317544c;
        objArr[1] = java.lang.Long.valueOf(y(this.f317569r));
        int i18 = i17;
        objArr[2] = java.lang.Long.valueOf(z17 ? this.f317572u : 0L);
        objArr[3] = "";
        objArr[4] = java.lang.Integer.valueOf(isWifi ? 1 : 0);
        objArr[5] = java.lang.Long.valueOf(this.f317573v);
        objArr[6] = java.lang.Long.valueOf(this.f317575x);
        objArr[7] = 0;
        objArr[8] = 0;
        objArr[9] = java.lang.Long.valueOf(this.f317576y);
        objArr[10] = java.lang.Long.valueOf(y(this.f317568q));
        objArr[11] = java.lang.Long.valueOf(y(this.f317567p));
        objArr[12] = java.lang.Integer.valueOf(this.f317574w);
        objArr[13] = java.lang.Integer.valueOf(c17);
        objArr[14] = java.lang.Integer.valueOf(this.G);
        objArr[15] = java.lang.Integer.valueOf(this.H);
        objArr[16] = java.lang.Integer.valueOf(netType);
        objArr[17] = java.lang.Integer.valueOf(i18);
        objArr[18] = java.lang.Integer.valueOf(this.f317570s);
        g0Var.d(10736, objArr);
        boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (!z17) {
            java.lang.String str2 = this.A;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && isConnected) {
                com.tencent.mm.network.n.g(str2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDownloadRecord", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        com.tencent.mm.pointers.PString pString = this.B;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "ready to report logbuffer(13346) packageRecordList:%s", pString.value);
        int l17 = l();
        m21.x xVar = new m21.x();
        xVar.a("20ImgSize", this.L + ",");
        xVar.a("21NetType", (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 0) + ",");
        xVar.a("22DelayTime", (this.f317572u - this.f317575x) + ",");
        xVar.a("23RetCode", this.G + ",");
        xVar.a("24DnsCostTime", this.f317573v + ",");
        xVar.a("25ConnectCostTime", this.f317575x + ",");
        xVar.a("26SendCostTime", ",");
        xVar.a("27WaitResponseCostTime", this.E + ",");
        xVar.a("28ReceiveCostTime", this.f317576y + ",");
        xVar.a("29ClientAddrIP", this.f317568q + ",");
        xVar.a("30ServerAddrIP", this.f317569r + ",");
        xVar.a("31dnstype", this.f317574w + ",");
        xVar.a("32signal", i0Var.c() + ",");
        xVar.a("33host", this.I + ",");
        xVar.a("34MediaType", l17 + ",");
        xVar.a("35X_Errno", this.f317570s + ",");
        xVar.a("36MaxPackageSize", this.C + ",");
        xVar.a("37MaxPackageTimeStamp", this.D + ",");
        xVar.a("38PackageRecordList", pString.value + ",");
        xVar.a("39ExpLayerId", "0,");
        xVar.a("40ExpId", "0,");
        xVar.a("41FeedId", ",");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "report logbuffer(13480 TLMediaFielDownloadRecord): " + xVar.c());
        g0Var.d(13480, xVar);
        if (this.G != 200) {
            g0Var.d(14071, xVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadRecord", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportResult", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }
}
