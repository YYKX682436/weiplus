package z25;

/* loaded from: classes12.dex */
public class a extends z25.b implements z25.l {

    /* renamed from: q, reason: collision with root package name */
    public final int f469748q;

    /* renamed from: r, reason: collision with root package name */
    public final int f469749r;

    /* renamed from: s, reason: collision with root package name */
    public final z25.k f469750s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f469751t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f469752u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f469753v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f469754w;

    /* renamed from: x, reason: collision with root package name */
    public int f469755x;

    /* renamed from: y, reason: collision with root package name */
    public int f469756y;

    /* renamed from: z, reason: collision with root package name */
    public int f469757z = 0;

    public a(z25.k kVar) {
        this.f469750s = kVar;
        int i17 = 32768;
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ParallelUploadPartSize");
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CGIFileUploader", "getFileSizeLimit nullOrNil");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CGIFileUploader", "getFileSizeLimit " + d17);
            }
            i17 = com.tencent.mm.sdk.platformtools.t8.P(d17, 32768);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CGIFileUploader", th6, "getFileSizeLimit", new java.lang.Object[0]);
        }
        this.f469749r = i17;
        this.f469748q = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_cgi_upload_concurrent_max_android, 10);
        this.f469753v = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f469754w = java.util.Collections.synchronizedList(new java.util.ArrayList());
    }

    public void a(z25.i iVar, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.CGIFileUploader", "upload section failure, index = %s, canRetry:%s, retCode:%s", java.lang.Integer.valueOf(iVar.f469818e.f469808b), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        this.f469753v.remove(iVar);
        if (!z17) {
            c();
            z25.k kVar = this.f469750s;
            if (kVar != null) {
                ((z25.d) kVar).c(this, this.f469752u, i17);
                return;
            }
            return;
        }
        iVar.f469815b++;
        int i18 = iVar.f469818e.f469808b;
        java.util.List list = this.f469754w;
        if (i18 == 0) {
            list.add(0, iVar);
            e();
        } else if (i18 == this.f469755x - 1) {
            list.add(iVar);
            e();
        } else {
            list.add(0, iVar);
            d(this.f469756y);
        }
    }

    public void b() {
        if (this.f469751t) {
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(this.f469758a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CGIFileUploader", "file %s not exist", this.f469758a);
            z25.k kVar = this.f469750s;
            if (kVar != null) {
                ((z25.d) kVar).c(this, this.f469752u, -30001);
                return;
            }
            return;
        }
        long j17 = this.f469759b;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            z25.g gVar = new z25.g();
            gVar.f469807a = this.f469758a;
            gVar.f469808b = i17;
            gVar.f469809c = i18;
            gVar.f469811e = this.f469773p;
            int i19 = this.f469749r;
            int i27 = i18 + i19;
            long j18 = i27;
            if (j18 > j17) {
                gVar.f469810d = (int) (j17 - i18);
            } else {
                gVar.f469810d = i19;
            }
            z25.i iVar = new z25.i();
            iVar.f469822i = this;
            iVar.f469818e = gVar;
            iVar.f469814a = i17;
            iVar.f469815b = 0;
            iVar.f469820g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_parallel_cgi_upload_retry_max_android, 3);
            if (i17 == 0) {
                this.f469769l = com.tencent.mm.vfs.w6.p(this.f469758a);
                r45.z45 z45Var = new r45.z45();
                z45Var.f391698d = this.f469760c;
                z45Var.f391699e = this.f469761d;
                z45Var.f391700f = (int) this.f469759b;
                z45Var.f391701g = this.f469769l;
                z45Var.f391702h = i19;
                z45Var.f391703i = this.f469762e;
                z45Var.f391704m = this.f469763f;
                z45Var.f391706o = this.f469764g;
                z45Var.f391707p = this.f469765h;
                z45Var.f391708q = this.f469766i;
                z45Var.f391705n = null;
                z45Var.f391709r = this.f469767j;
                z45Var.f391710s = this.f469768k;
                z45Var.f391713v = this.f469772o;
                z45Var.f391712u = this.f469771n;
                if (this.f469770m) {
                    z45Var.f391711t = "HDVideo:1";
                }
                iVar.f469817d = z45Var;
            }
            java.util.List list = this.f469754w;
            list.add(iVar);
            i17++;
            if (j18 >= j17) {
                this.f469755x = list.size();
                com.tencent.mars.xlog.Log.i("MicroMsg.CGIFileUploader", "will start upload, file = %s, scene = %s, fileType = %s, sectionLen = %s, sectionCount = %s", this.f469758a, java.lang.Integer.valueOf(this.f469760c), java.lang.Integer.valueOf(this.f469761d), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(list.size()));
                this.f469751t = true;
                e();
                return;
            }
            i18 = i27;
        }
    }

    public void c() {
        this.f469751t = false;
        for (z25.i iVar : this.f469753v) {
            iVar.f469819f = false;
            iVar.f469821h = null;
        }
    }

    public final boolean d(int i17) {
        if (!this.f469751t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CGIFileUploader", "it means error has occurred, return.");
            return false;
        }
        while (true) {
            java.util.List list = this.f469753v;
            if (list.size() >= this.f469748q) {
                break;
            }
            java.util.List list2 = this.f469754w;
            if (list2.size() <= 1) {
                break;
            }
            if (i17 - 1 == this.f469757z) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CGIFileUploader", "The whole piece is uploaded, but the limit value is not updated [%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f469757z + 1));
                c();
                z25.k kVar = this.f469750s;
                if (kVar != null) {
                    ((z25.d) kVar).c(this, this.f469752u, -30004);
                }
                return false;
            }
            z25.i iVar = (z25.i) list2.get(0);
            if (iVar.f469814a > this.f469757z) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CGIFileUploader", "upload too fast, need to wait for the previous task to complete first");
                return true;
            }
            list2.remove(0);
            list.add(iVar);
            iVar.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.CGIFileUploader", "start section idx = %s", java.lang.Integer.valueOf(iVar.f469818e.f469808b));
        }
        return true;
    }

    public final void e() {
        java.util.List list = this.f469754w;
        if (list.size() >= 1) {
            z25.i iVar = (z25.i) list.get(0);
            list.remove(0);
            this.f469753v.add(iVar);
            iVar.a();
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CGIFileUploader", "no section to upload, file:%s", this.f469758a);
        z25.k kVar = this.f469750s;
        if (kVar != null) {
            ((z25.d) kVar).c(this, this.f469752u, -30003);
        }
    }
}
