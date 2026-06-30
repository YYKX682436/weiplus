package e11;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: p, reason: collision with root package name */
    public static long f246392p;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f246399m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f246400n;

    /* renamed from: d, reason: collision with root package name */
    public int f246393d = 0;

    /* renamed from: e, reason: collision with root package name */
    public e11.f f246394e = null;

    /* renamed from: f, reason: collision with root package name */
    public e11.d f246395f = new e11.d();

    /* renamed from: g, reason: collision with root package name */
    public long f246396g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f246397h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f246398i = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f246401o = false;

    public g() {
        this.f246399m = null;
        this.f246400n = null;
        java.lang.String str = lp0.b.e() + "ProcessDetector";
        this.f246399m = str;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            this.f246400n = this.f246399m + "/mm";
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            this.f246400n = this.f246399m + "/push";
        }
    }

    public static long b() {
        if (f246392p == 0) {
            f246392p = com.tencent.mm.sdk.platformtools.t8.V(j62.e.g().a("clicfg_android_process_detect_time", "5", false, true), 5L) * 60 * 1000;
        }
        return f246392p;
    }

    public final void a(long j17, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            list.remove((java.lang.Object) null);
        }
    }

    public final boolean c(java.lang.StringBuilder sb6, java.util.List list, java.lang.String str) {
        int i17 = 0;
        if (list.size() <= 0) {
            return false;
        }
        sb6.append(str);
        sb6.append("[");
        sb6.append(list.size());
        sb6.append("]");
        sb6.append(":");
        sb6.append("\n");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            sb6.append("\t");
            sb6.append((java.lang.Object) null);
            sb6.append("\n");
            i17++;
            if (i17 > 1000) {
                break;
            }
        }
        return true;
    }

    public void d() {
        java.util.List list;
        java.lang.String str = this.f246400n;
        e11.d dVar = this.f246395f;
        if (dVar == null || (list = dVar.f246361d) == null || ((java.util.concurrent.CopyOnWriteArrayList) list).isEmpty()) {
            return;
        }
        try {
            e11.c.b(this.f246395f, com.tencent.mm.vfs.w6.K(str, false));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "%s,write exception:" + e17.getMessage(), str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:108|109|110|(1:112)|113|(4:118|119|128|124)|129|130|131|132|133|134|135|136|137|138|139|119|128|124|102) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0522, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.ActiveDetector.ProcessDetector", "process detector thread interrupt.thread id:%s", java.lang.Integer.valueOf(android.os.Process.myTid()));
        java.lang.Thread.currentThread().interrupt();
        r25.f246401o = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0502, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0511, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "exception,%s", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0504, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0507, code lost:
    
        r0 = e;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.g.run():void");
    }
}
