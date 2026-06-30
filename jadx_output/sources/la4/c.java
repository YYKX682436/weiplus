package la4;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f317579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f317580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ la4.d f317581g;

    public c(la4.d dVar, java.lang.String str, int i17, dn.h hVar) {
        this.f317581g = dVar;
        this.f317578d = str;
        this.f317579e = i17;
        this.f317580f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1$1");
        la4.d dVar = this.f317581g;
        if (9 == dVar.f317584f.f317589f.f317547f) {
            dn.i iVar = (dn.i) dVar.f317582d;
            if (iVar.T1 == iVar.V1) {
                la4.f.g().remove(this.f317581g.f317584f.f317589f.f());
            }
        } else {
            la4.f.g().remove(this.f317581g.f317584f.f317589f.f());
        }
        ca4.s0 s0Var = this.f317581g.f317584f.f317589f.f317549h;
        int a17 = s0Var == null ? -1 : s0Var.a();
        java.lang.String str = this.f317578d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f317579e);
        la4.a aVar = this.f317581g.f317584f.f317589f;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d decodetype:%d", "[image-flow]", str, valueOf, aVar.f317544c, aVar.f317543b, java.lang.Long.valueOf(this.f317580f.field_fileLength), java.lang.Integer.valueOf(la4.f.g().size()), java.lang.Integer.valueOf(a17));
        la4.a aVar2 = this.f317581g.f317584f.f317589f;
        boolean z17 = aVar2.f317545d;
        if (!z17 || this.f317579e == 2) {
            if (!z17 && ((i17 = aVar2.f317547f) == 4 || i17 == 6)) {
                com.tencent.mm.plugin.sns.model.l4.hj().K(this.f317581g.f317584f.f317589f.f317543b, this.f317581g.f317584f.f317589f.d() + ca4.z0.R(this.f317581g.f317584f.f317590g));
            }
        } else if (9 == aVar2.f317547f) {
            com.tencent.mm.plugin.sns.model.n7.b(((r45.jj4) aVar2.f317557p.get(this.f317580f.f241773h)).f377855d, this.f317581g.f317584f.f317589f.f317555n);
            la4.f fVar = this.f317581g.f317584f;
            int i18 = this.f317580f.f241773h;
            fVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            } else {
                la4.a aVar3 = fVar.f317589f;
                ca4.s0 s0Var2 = (ca4.s0) aVar3.f317558q.get(i18);
                r45.jj4 jj4Var = (r45.jj4) aVar3.f317557p.get(i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "thumbAddDecode index: %d decodeType: %d.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(s0Var2.a()));
                com.tencent.mm.plugin.sns.model.l4.hj().J(jj4Var.f377855d, (com.tencent.mm.memory.r) fVar.f317588e.get(i18), s0Var2.a());
                java.lang.String x17 = s0Var2.a() == 0 ? ca4.z0.x(0, s0Var2.c()) : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]thumbAddDecode cacheName2: %s.", "[image-flow]", jj4Var.f377855d, x17);
                com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                java.lang.String str2 = jj4Var.f377855d;
                hj6.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                hj6.r0(str2, x17, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            }
        } else {
            com.tencent.mm.plugin.sns.model.n7.b(aVar2.f317543b, aVar2.f317555n);
            this.f317581g.f317584f.s();
        }
        la4.a aVar4 = this.f317581g.f317584f.f317589f;
        int i19 = aVar4.f317547f;
        if (9 == i19) {
            r45.jj4 jj4Var2 = (r45.jj4) aVar4.f317557p.get(this.f317580f.f241773h);
            dn.i iVar2 = (dn.i) this.f317581g.f317582d;
            if ((iVar2.T1 == iVar2.V1) && !iVar2.W1) {
                iVar2.W1 = true;
                long j17 = this.f317581g.f317583e;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]group download, feed cost: %d.", "[image-flow]", this.f317578d, java.lang.Long.valueOf(currentTimeMillis));
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.C(1040L, 3L, currentTimeMillis);
                g0Var.A(1040, 4);
                g0Var.C(1040L, 9L, currentTimeMillis);
                g0Var.C(1040L, 10L, iVar2.T1);
            }
            la4.f fVar2 = this.f317581g.f317584f;
            la4.e eVar = fVar2.f317586c;
            int i27 = this.f317579e;
            int e17 = fVar2.f317589f.e();
            la4.a aVar5 = this.f317581g.f317584f.f317589f;
            boolean z19 = aVar5.f317545d;
            java.lang.String f17 = aVar5.f();
            dn.h hVar = this.f317580f;
            ((com.tencent.mm.plugin.sns.model.m0) eVar).u(i27, jj4Var2, e17, z19, f17, (int) hVar.field_fileLength, hVar.f241773h, iVar2.T1 == iVar2.V1);
        } else {
            if (1 == i19) {
                com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
                java.lang.String str3 = this.f317581g.f317584f.f317589f.f317543b;
                Cj.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
                boolean remove = Cj.f164456s.remove(str3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
                if (remove) {
                    long j18 = this.f317581g.f317583e;
                    boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]single download cost: %d.", "[image-flow]", this.f317578d, java.lang.Long.valueOf(currentTimeMillis2));
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var2.C(1040L, 6L, currentTimeMillis2);
                    g0Var2.A(1040, 7);
                }
            }
            if (this.f317581g.f317584f.f317589f.f317547f == 4) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[%s][media:%s]sight download cost=");
                long j19 = this.f317581g.f317583e;
                boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(java.lang.System.currentTimeMillis() - j19);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnDownloadBase", sb6.toString(), "[image-flow]", this.f317581g.f317584f.f317589f.f317543b);
            }
            la4.f fVar3 = this.f317581g.f317584f;
            la4.e eVar2 = fVar3.f317586c;
            int i28 = this.f317579e;
            r45.jj4 jj4Var3 = fVar3.f317590g;
            int e18 = fVar3.f317589f.e();
            la4.a aVar6 = this.f317581g.f317584f.f317589f;
            ((com.tencent.mm.plugin.sns.model.m0) eVar2).u(i28, jj4Var3, e18, aVar6.f317545d, aVar6.f(), (int) this.f317580f.field_fileLength, -1, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1$1");
    }
}
