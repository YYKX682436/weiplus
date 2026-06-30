package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.b f140241a;

    /* renamed from: b, reason: collision with root package name */
    public int f140242b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f140243c = 1;

    /* renamed from: d, reason: collision with root package name */
    public int f140244d = 0;

    public c0(com.tencent.mm.plugin.game.model.b bVar) {
        this.f140241a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r8 != 3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r8) {
        /*
            r7 = this;
            com.tencent.mm.plugin.game.model.b r0 = r7.f140241a
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.T
            java.lang.String r2 = r0.field_appId
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "MicroMsg.GameDownloadInfo"
            java.lang.String r4 = "AppId: %s, Initial downloadMode: %d"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            r2 = 2
            r4 = 3
            if (r1 != r2) goto L1d
            r1 = r4
        L1d:
            r5 = 1
            if (r1 != r4) goto L37
            java.lang.Class<lt.i0> r6 = lt.i0.class
            i95.m r6 = i95.n0.c(r6)
            lt.i0 r6 = (lt.i0) r6
            kt.c r6 = (kt.c) r6
            r6.getClass()
            java.lang.String r6 = "wx3909f6add1206543"
            boolean r8 = com.tencent.mm.pluginsdk.model.app.w.r(r8, r6)
            if (r8 != 0) goto L37
            r1 = r5
        L37:
            if (r1 == r5) goto L59
            java.lang.Class<vz.v1> r8 = vz.v1.class
            i95.m r8 = i95.n0.c(r8)
            vz.v1 r8 = (vz.v1) r8
            uz.v1 r8 = (uz.v1) r8
            r8.getClass()
            com.tencent.mm.plugin.downloader.model.r0 r8 = com.tencent.mm.plugin.downloader.model.r0.i()
            java.lang.String r6 = r0.field_appId
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r8 = r8.q(r6)
            int r8 = r8.f96963f
            if (r8 == r5) goto L5a
            if (r8 == r2) goto L5a
            if (r8 != r4) goto L59
            goto L5a
        L59:
            r5 = r1
        L5a:
            r7.f140243c = r5
            java.lang.String r8 = r0.field_appId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            java.lang.String r0 = "AppId: %s, Final downloadMode: %d"
            com.tencent.mars.xlog.Log.i(r3, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.c0.a(android.content.Context):void");
    }

    public void b() {
        com.tencent.mm.plugin.game.model.b bVar = this.f140241a;
        if (bVar == null) {
            return;
        }
        if (this.f140243c != 1) {
            this.f140242b = 0;
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(bVar.field_appId);
            long j17 = q17.f96968n;
            if (j17 != 0) {
                this.f140244d = (int) ((q17.f96967m / j17) * 100.0d);
            } else {
                this.f140244d = 0;
            }
            int i17 = this.f140244d;
            if (i17 == 0) {
                i17 = 1;
            }
            this.f140244d = i17;
            int i18 = q17.f96963f;
            if (i18 == 0) {
                this.f140242b = 0;
            } else if (i18 == 1) {
                this.f140242b = 1;
            } else if (i18 == 2) {
                this.f140242b = 2;
            } else if (i18 != 3) {
                if (i18 != 4) {
                    this.f140242b = 0;
                } else if (i17 == 0 || com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    this.f140242b = 0;
                } else {
                    this.f140242b = 2;
                }
            } else if (com.tencent.mm.vfs.w6.j(q17.f96964g)) {
                this.f140242b = 3;
            } else {
                this.f140242b = 0;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadInfo", "Updating Download Status, AppId: %s, downloadMode: %d, downloadStatus: %d", bVar.field_appId, java.lang.Integer.valueOf(this.f140243c), java.lang.Integer.valueOf(this.f140242b));
    }
}
