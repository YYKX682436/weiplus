package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f189693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.model.v f189694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189695f;

    public p(com.tencent.mm.pluginsdk.res.downloader.model.s sVar, java.util.List list, com.tencent.mm.pluginsdk.res.downloader.model.v vVar, java.lang.String str) {
        this.f189693d = list;
        this.f189694e = vVar;
        this.f189695f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r18 = this;
            r0 = r18
            java.util.List r1 = r0.f189693d
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r1.next()
            com.tencent.mm.pluginsdk.res.downloader.model.h r2 = (com.tencent.mm.pluginsdk.res.downloader.model.h) r2
            r2.getClass()
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r2 = "CheckResUpdate"
            com.tencent.mm.pluginsdk.res.downloader.model.v r3 = r0.f189694e
            java.lang.String r4 = r3.f189728f
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L8
            java.lang.String r2 = r0.f189695f
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            java.lang.String r5 = "MicroMsg.ResDownloader.CheckResUpdateHelper"
            java.lang.String r6 = "networkEventListener.onFailed: %s"
            com.tencent.mars.xlog.Log.i(r5, r6, r4)
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.a(r2)
            com.tencent.mm.pluginsdk.res.downloader.model.l0 r4 = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a
            com.tencent.mm.pluginsdk.res.downloader.model.n0 r2 = r4.e(r2)
            if (r2 != 0) goto L3f
            goto L8
        L3f:
            r4 = 0
            if (r3 == 0) goto L5f
            java.lang.Exception r3 = r3.f189730h
            if (r3 == 0) goto L5f
            boolean r5 = r3 instanceof n35.a
            if (r5 == 0) goto L52
            long r5 = r2.field_reportId
            r7 = 7
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(r5, r7)
            goto L5d
        L52:
            boolean r3 = r3 instanceof n35.c
            if (r3 == 0) goto L5f
            long r5 = r2.field_reportId
            r7 = 16
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(r5, r7)
        L5d:
            r3 = r4
            goto L60
        L5f:
            r3 = 1
        L60:
            if (r3 == 0) goto L69
            long r5 = r2.field_reportId
            r7 = 11
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(r5, r7)
        L69:
            long r5 = r2.field_reportId
            r7 = 44
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(r5, r7)
            int r9 = r2.field_resType
            int r10 = r2.field_subType
            java.lang.String r11 = r2.field_url
            java.lang.String r3 = r2.field_fileVersion
            int r12 = com.tencent.mm.sdk.platformtools.t8.P(r3, r4)
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0 r13 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0.FAIL
            r14 = 0
            java.lang.String r3 = "NewXml"
            java.lang.String r5 = r2.field_groupId2
            boolean r15 = r3.equalsIgnoreCase(r5)
            r16 = 0
            java.lang.String r3 = r2.field_sampleId
            r17 = r3
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.c(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            int r3 = r2.field_resType
            int r5 = r2.field_subType
            java.lang.String r6 = r2.field_fileVersion
            int r4 = com.tencent.mm.sdk.platformtools.t8.P(r6, r4)
            long r6 = r2.field_reportId
            int r2 = (int) r6
            r6 = 78
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.e(r3, r5, r4, r2, r6)
            goto L8
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.model.p.run():void");
    }
}
