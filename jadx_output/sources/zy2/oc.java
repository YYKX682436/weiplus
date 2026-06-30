package zy2;

/* loaded from: classes10.dex */
public final class oc {

    /* renamed from: a, reason: collision with root package name */
    public static final zy2.oc f477525a = new zy2.oc();

    public static final void b(com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct struct) {
        kotlin.jvm.internal.o.g(struct, "struct");
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicActionReportLogic", "reportMvMusicCardAction, action:" + struct.f59456j + ", scene:" + struct.f59457k);
        b21.r j17 = kl3.t.g().j();
        if (j17 != null) {
            java.lang.String str = j17.f17348g;
            struct.f59451e = struct.b("SongName", str != null ? r26.i0.t(str, ",", " ", false) : null, true);
            java.lang.String str2 = j17.f17349h;
            struct.f59455i = struct.b("Singer", str2 != null ? r26.i0.t(str2, ",", " ", false) : null, true);
            struct.f59453g = struct.b("WebUrl", j17.f17354p, true);
            struct.f59454h = struct.b("DataUrl", j17.f17352n, true);
            struct.f59459m = struct.b("AppId", j17.f17358t, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicActionReportLogic", "song:" + struct.f59451e + ", singer:" + struct.f59455i + ", appId:" + struct.f59459m);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicActionReportLogic", "buildCommonReportStruct, musicWrapper must not be null");
        }
        struct.k();
        struct.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.storage.f9 r4, boolean r5, boolean r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r5 = "msg"
            kotlin.jvm.internal.o.g(r4, r5)
            java.lang.String r5 = "fromSourceId"
            kotlin.jvm.internal.o.g(r7, r5)
            com.tencent.mm.autogen.mmdata.rpt.MvShareReportStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.MvShareReportStruct
            r5.<init>()
            java.lang.String r4 = r4.U1()
            ot0.q r4 = ot0.q.v(r4)
            r0 = 1
            if (r4 == 0) goto L77
            java.lang.String r1 = r4.f348654f
            java.lang.String r2 = "SongName"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f59583e = r1
            java.lang.String r1 = r4.f348658g
            java.lang.String r2 = "Singer"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f59594p = r1
            java.lang.String r1 = r4.f348674k
            java.lang.String r2 = "WebUrl"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f59585g = r1
            java.lang.String r1 = r4.V
            java.lang.String r2 = "DataUrl"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f59586h = r1
            java.lang.String r1 = r4.f348646d
            java.lang.String r2 = "AppId"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f59591m = r1
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.i0> r1 = com.tencent.mm.pluginsdk.ui.tools.i0.class
            ot0.h r4 = r4.y(r1)
            com.tencent.mm.pluginsdk.ui.tools.i0 r4 = (com.tencent.mm.pluginsdk.ui.tools.i0) r4
            if (r4 == 0) goto L77
            java.lang.String r1 = r4.f191692d
            java.lang.String r2 = "MvObjectId"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f59588j = r1
            java.lang.String r1 = r4.f191693e
            java.lang.String r2 = "MvNonceId"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f59589k = r1
            java.lang.String r4 = r4.f191695g
            java.lang.String r1 = "MvUserId"
            java.lang.String r4 = r5.b(r1, r4, r0)
            r5.f59590l = r4
            jz5.f0 r4 = jz5.f0.f302826a
            goto L78
        L77:
            r4 = 0
        L78:
            if (r4 != 0) goto L7b
            return
        L7b:
            java.lang.String r4 = "FromSourceId"
            java.lang.String r4 = r5.b(r4, r7, r0)
            r5.f59593o = r4
            r0 = 3
            r5.f59587i = r0
            r0 = 2
            r5.f59592n = r0
            if (r6 == 0) goto L8e
            goto L90
        L8e:
            r0 = 1
        L90:
            r5.f59595q = r0
            r5.k()
            r5.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zy2.oc.a(com.tencent.mm.storage.f9, boolean, boolean, java.lang.String):void");
    }
}
