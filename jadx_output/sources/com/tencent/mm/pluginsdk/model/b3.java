package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public class b3 implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f189224d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f189225e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f189226f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f189227g;

    /* renamed from: h, reason: collision with root package name */
    public int f189228h;

    /* renamed from: i, reason: collision with root package name */
    public int f189229i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f189230m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f189231n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.ABAPrams f189232o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f189233p;

    /* renamed from: r, reason: collision with root package name */
    public int f189235r;

    /* renamed from: s, reason: collision with root package name */
    public int f189236s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f189237t;

    /* renamed from: x, reason: collision with root package name */
    public d11.n f189241x;

    /* renamed from: q, reason: collision with root package name */
    public boolean f189234q = false;

    /* renamed from: u, reason: collision with root package name */
    public int f189238u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f189239v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f189240w = false;

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        boolean z17;
        this.f189240w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_fail_send_when_remuxing_fail, 1) == 1;
        synchronized (com.tencent.mm.pluginsdk.model.c3.f189250w) {
            z17 = !com.tencent.mm.pluginsdk.model.c3.f189249v.containsKey(this.f189224d);
        }
        if (!z17) {
            z17 = t21.d3.h(this.f189224d) == null;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImportMultiVideo", "remuxing job has been removed, filename %s", this.f189224d);
            return true;
        }
        c();
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "onPostExecute");
        synchronized (com.tencent.mm.pluginsdk.model.c3.f189250w) {
            com.tencent.mm.pluginsdk.model.c3.f189249v.remove(this.f189224d);
        }
        if (this.f189237t) {
            java.lang.String str = this.f189226f;
            if (this.f189229i == 2) {
                int k17 = (int) (com.tencent.mm.vfs.w6.k(str) / 1024);
                int[] iArr = {512, 1024, 2048, 5120, 8192, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 15360, 20480};
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y(k17, iArr, 247, 255));
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.idkeyStat(106L, q17, 1L, false);
                g0Var2.idkeyStat(106L, 246L, 1L, false);
            }
        } else {
            com.tencent.mm.pluginsdk.model.c3.j(this.f189226f, this.f189229i);
        }
        com.tencent.mm.pluginsdk.model.c3.h(this.f189237t, this.f189225e, this.f189226f);
        int i17 = this.f189238u;
        java.lang.String str2 = this.f189225e;
        java.lang.String str3 = this.f189226f;
        int i18 = this.f189228h;
        long k18 = com.tencent.mm.vfs.w6.k(str2);
        if (k18 > 0) {
            long k19 = com.tencent.mm.vfs.w6.k(str3);
            int i19 = (int) ((100 * k19) / k18);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "kv report video compression isNew[%d], oriSize[%d], remuxingSize[%d], compressionRatio[%d], bitrate[%d], preset[%d], retDuration[%d]", 1, java.lang.Long.valueOf(k18), java.lang.Long.valueOf(k19), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13432, 1, java.lang.Long.valueOf(k18), java.lang.Long.valueOf(k19), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImportMultiVideo", "file canot be empty");
        }
        t21.i2.wi().Di(this.f189225e, this.f189226f, new wf0.l1(this.f189224d, bm5.f0.f22571s), this.f189230m, "", "", this.f189229i == 1 ? 8 : 1, this.f189237t ? 1 : 3);
        f65.y0.f260019a.k(this.f189230m, this.f189224d, this.f189228h * 1000, com.tencent.mm.vfs.w6.k(this.f189225e), com.tencent.mm.vfs.w6.k(this.f189226f), com.tencent.mm.pluginsdk.model.c3.e(this.f189229i), this.f189233p, false);
        if (!this.f189240w) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "updateVideo");
            t21.d3.P(this.f189224d, this.f189228h);
            t21.d3.M(this.f189224d);
        } else if (this.f189237t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "updateVideo");
            t21.d3.P(this.f189224d, this.f189228h);
            t21.d3.M(this.f189224d);
        } else {
            t21.d3.G(this.f189224d);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x067d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.b3.c():boolean");
    }
}
