package com.tencent.xweb;

/* loaded from: classes13.dex */
public class e2 extends by5.u0 implements rx5.b {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.xweb.b2 f220260f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.xweb.c2 f220261g;

    /* renamed from: h, reason: collision with root package name */
    public final rx5.c f220262h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f220263i = new java.lang.Object();

    /* renamed from: j, reason: collision with root package name */
    public boolean f220264j = false;

    public e2(boolean z17, com.tencent.xweb.b2 b2Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f220260f = b2Var;
        com.tencent.xweb.c2 c2Var = new com.tencent.xweb.c2();
        this.f220261g = c2Var;
        c2Var.f220223a = 0;
        c2Var.f220224b = 0;
        c2Var.f220225c = 2;
        c2Var.f220226d = str;
        c2Var.f220227e = str2;
        c2Var.f220232j = z17;
        c2Var.f220233k = i17;
        rx5.c cVar = new rx5.c();
        this.f220262h = cVar;
        cVar.f401351a = this;
    }

    @Override // rx5.b
    public void a(java.lang.String str, java.lang.String str2, boolean z17) {
        synchronized (this.f220263i) {
            this.f220261g.f220230h = z17;
            this.f220264j = false;
            this.f220263i.notify();
        }
    }

    @Override // rx5.b
    public void b(java.lang.String str, int i17, boolean z17) {
        synchronized (this.f220263i) {
            com.tencent.xweb.c2 c2Var = this.f220261g;
            c2Var.f220223a = 1;
            c2Var.f220224b = i17;
            c2Var.f220230h = z17;
            this.f220264j = false;
            this.f220263i.notify();
        }
    }

    @Override // rx5.b
    public void c(java.lang.String str, long j17, long j18) {
        com.tencent.xweb.c2 c2Var = this.f220261g;
        if (c2Var.f220231i != j18) {
            c2Var.f220231i = j18;
        }
        j(java.lang.Integer.valueOf((int) j17), java.lang.Integer.valueOf((int) j18));
    }

    @Override // by5.u0
    public java.lang.Object d(java.lang.Object[] objArr) {
        int i17;
        com.tencent.xweb.b2 b2Var = this.f220260f;
        if (b2Var != null) {
            b2Var.a(this.f220261g.f220225c);
        }
        this.f220261g.f220228f = java.lang.System.currentTimeMillis();
        this.f220261g.f220229g = by5.y.a(org.xwalk.core.XWalkEnvironment.f347970c);
        rx5.c cVar = this.f220262h;
        if (cVar != null) {
            if (rx5.c.f401350b != null) {
                com.tencent.xweb.c2 c2Var = this.f220261g;
                java.lang.String str = c2Var.f220226d;
                java.lang.String str2 = c2Var.f220227e;
                int i18 = c2Var.f220233k;
                cVar.getClass();
                rx5.a aVar = rx5.c.f401350b;
                if (aVar != null) {
                    pv1.c cVar2 = (pv1.c) aVar;
                    com.tencent.mars.xlog.Log.i("XWeb.MM.FileDownloaderXWEBProxy", "addDownloadTask, url:%s, filepath:%s, bizType:%s", str, str2, java.lang.Integer.valueOf(i18));
                    dn.m mVar = new dn.m();
                    mVar.f241785d = "task_FileDownloaderXWEBProxy";
                    mVar.field_mediaId = str;
                    mVar.field_fullpath = str2;
                    mVar.f241811z = str;
                    mVar.field_fileType = 30004;
                    mVar.f241787f = cVar2.f358571b;
                    mVar.A = 60;
                    mVar.B = 600;
                    mVar.C = false;
                    pv1.b bVar = new pv1.b(cVar2, null);
                    bVar.f358567a = cVar;
                    bVar.f358568b = str2;
                    ((java.util.concurrent.ConcurrentHashMap) cVar2.f358570a).put(str, bVar);
                    i17 = hv1.d.f().b(mVar);
                    com.tencent.mars.xlog.Log.i("XWeb.MM.FileDownloaderXWEBProxy", "addDownloadTask, result:" + i17);
                } else {
                    i17 = -1;
                }
                if (i17 != 0) {
                    com.tencent.xweb.c2 c2Var2 = this.f220261g;
                    c2Var2.f220223a = 1;
                    c2Var2.f220224b = -1;
                    return -1;
                }
                synchronized (this.f220263i) {
                    try {
                        this.f220264j = true;
                        this.f220263i.wait(600000L);
                    } catch (java.lang.InterruptedException e17) {
                        by5.c4.d("WXFileDownloaderTask", "download error", e17);
                        this.f220264j = false;
                        com.tencent.xweb.c2 c2Var3 = this.f220261g;
                        c2Var3.f220223a = 2;
                        c2Var3.f220224b = -101;
                    }
                    if (this.f220264j) {
                        com.tencent.xweb.c2 c2Var4 = this.f220261g;
                        c2Var4.f220223a = 1;
                        c2Var4.f220224b = -100;
                    }
                    com.tencent.xweb.c2 c2Var5 = this.f220261g;
                    if (c2Var5.f220223a == 0 && c2Var5.f220224b == 0) {
                        return 0;
                    }
                    by5.c4.c("WXFileDownloaderTask", "download errorType:" + this.f220261g.f220223a + ", errorcode:" + this.f220261g.f220224b + ", waitTimeout:" + this.f220264j);
                    return -1;
                }
            }
        }
        com.tencent.xweb.c2 c2Var6 = this.f220261g;
        c2Var6.f220223a = 2;
        c2Var6.f220224b = -1;
        return -1;
    }

    @Override // by5.u0
    public void f(java.lang.Object obj) {
        if (this.f220261g.f220232j) {
            com.tencent.xweb.f2.f220281a = null;
            by5.c4.f("WXFileDownloaderTask", "runtime onCancelled");
        } else {
            by5.c4.f("WXFileDownloaderTask", "plugin onCancelled");
        }
        com.tencent.xweb.b2 b2Var = this.f220260f;
        if (b2Var != null) {
            b2Var.e();
        }
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        com.tencent.xweb.f2.c(this.f220261g, this.f220260f, "WXFileDownloaderTask", (java.lang.Integer) obj);
    }

    @Override // by5.u0
    public void h() {
        com.tencent.xweb.f2.a("WXFileDownloaderTask", this.f220261g, this);
    }

    @Override // by5.u0
    public void i(java.lang.Object[] objArr) {
        com.tencent.xweb.f2.b(this.f220260f, (java.lang.Integer[]) objArr);
    }
}
