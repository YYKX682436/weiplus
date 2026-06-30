package zx5;

/* loaded from: classes13.dex */
public class u extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public zx5.b f477272f = null;

    /* renamed from: g, reason: collision with root package name */
    public zx5.r f477273g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f477274h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Timer f477275i = null;

    /* renamed from: j, reason: collision with root package name */
    public long f477276j = 0;

    public static void k(zx5.r rVar, zx5.b bVar) {
        zx5.u uVar = new zx5.u();
        uVar.f477272f = bVar;
        uVar.f477273g = rVar;
        uVar.f477274h = 0;
        uVar.f477276j = java.lang.System.currentTimeMillis();
        uVar.e(uVar.f477273g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fb, code lost:
    
        if (r12 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00c3, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c6, code lost:
    
        r15.close();
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00cc, code lost:
    
        r12.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d3, code lost:
    
        by5.c4.c(r10, "task close failed, error:" + r0);
        r6.f477261c = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0101, code lost:
    
        r5 = r10;
        by5.c4.f(r5, "response headers:\n" + m(r12.getHeaderFields()));
        r6.f477267i = r12.getHeaderField("X-NWS-LOG-UUID");
        r6.f477268j = r12.getHeaderField("X-COS-META-MD5");
        r6.f477269k = r12.getHeaderField("server_ip");
        r6.f477270l = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date());
        by5.c4.f(r5, "response, uuid:" + r6.f477267i + ", md5:" + r6.f477268j + ", serverip:" + r6.f477269k + ", downloadTime:" + r6.f477270l);
        r6.f477265g = r7;
        r6.f477264f = java.lang.System.currentTimeMillis() - r17.f477276j;
        r6.f477271m = java.net.InetAddress.getByName(r11.getHost()).getHostAddress();
        r0 = new java.lang.StringBuilder();
        r0.append("response, DNSServerIP:");
        r0.append(r6.f477269k);
        by5.c4.f(r5, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ab, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f1 A[Catch: IOException -> 0x01ed, TRY_LEAVE, TryCatch #9 {IOException -> 0x01ed, blocks: (B:66:0x01e9, B:54:0x01f1), top: B:65:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // by5.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zx5.u.d(java.lang.Object[]):java.lang.Object");
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        int i17;
        zx5.t tVar = (zx5.t) obj;
        if (tVar == null) {
            tVar = new zx5.t();
            tVar.f477261c = -10004;
            by5.c4.a("XWebHttpTask", "invalid params para onPostExecute");
        }
        if (tVar.f477261c == 0) {
            by5.c4.a("XWebHttpTask", "task succeed!");
            this.f477272f.d(tVar);
            return;
        }
        by5.c4.a("XWebHttpTask", "task failed! mRetCode = " + tVar.f477261c + " mRetrytimes = " + this.f477274h);
        int i18 = this.f477274h;
        if (!((i18 >= 2 || (i17 = tVar.f477261c) == -10001 || i17 == -10004) ? false : true)) {
            this.f477272f.a(tVar);
            return;
        }
        this.f477274h = i18 + 1;
        by5.c4.a("XWebHttpTask", "task retry! mRetrytimes = " + this.f477274h);
        java.util.Timer timer = new java.util.Timer();
        this.f477275i = timer;
        timer.schedule(new zx5.q(this), this.f477274h * 3000);
    }

    @Override // by5.u0
    public void h() {
    }

    @Override // by5.u0
    public void i(java.lang.Object[] objArr) {
        zx5.s[] sVarArr = (zx5.s[]) objArr;
        if (sVarArr.length != 1) {
            return;
        }
        this.f477272f.b(sVarArr[0]);
    }

    public final java.lang.String l() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("XWebSdk/20260502 ");
        sb6.append("XWebApk/" + org.xwalk.core.XWalkEnvironment.h() + " ");
        sb6.append("XWebGrayValue/" + by5.a4.b() + " ");
        sb6.append("XWebTodayGrayValue/" + by5.a4.c() + " ");
        sb6.append("XWebGrayValue2/" + by5.d4.a("XWEB_USER_INFO", false).getInt("USER_ID", 0) + " ");
        sb6.append("ABI/" + by5.a.b() + " ");
        sb6.append("APPINFO/dump (" + org.xwalk.core.XWalkEnvironment.dumpAppInfo() + ") ");
        sb6.append("ProcessName/" + org.xwalk.core.XWalkEnvironment.getProcessName() + " ");
        return sb6.toString();
    }

    public java.lang.String m(java.util.Map map) {
        if (map == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            sb6.append(entry.getKey() == null ? "null" : (java.lang.String) entry.getKey());
            sb6.append(" : ");
            java.util.List<java.lang.String> list = (java.util.List) entry.getValue();
            if (list != null && list.size() > 0) {
                for (java.lang.String str : list) {
                    if (str == null) {
                        str = "null";
                    }
                    sb6.append(str);
                }
            }
            sb6.append("\n");
        }
        return sb6.toString();
    }
}
