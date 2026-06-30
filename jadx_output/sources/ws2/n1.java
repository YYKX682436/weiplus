package ws2;

/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ws2.n1 f449105a = new ws2.n1();

    public final mn2.g4 a(java.lang.String replayUrl, java.lang.String str) {
        kotlin.jvm.internal.o.g(replayUrl, "replayUrl");
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        mb4Var.set(0, replayUrl);
        if (str == null || str.length() == 0) {
            str = kk.k.e(mb4Var.getString(0));
        }
        mb4Var.set(9, str);
        return new mn2.g4(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128357g, "xV0", 0, 0, null, false, null, 248, null);
    }

    public final java.lang.String b(int i17) {
        no0.l lVar = no0.m.f338730a;
        return i17 >= 3600 ? no0.l.a(lVar, i17, ":", true, false, false, 24, null) : no0.l.a(lVar, i17, ":", false, false, false, 24, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if ((r1 == null || r1.length() == 0) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(km2.m r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "liveData"
            kotlin.jvm.internal.o.g(r13, r0)
            bu2.j r0 = bu2.j.f24534a
            com.tencent.mm.live.api.LiveConfig r1 = r13.f309129d
            long r1 = r1.f68549s
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.h(r1)
            r1 = 0
            if (r0 == 0) goto L17
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFinderObject()
            goto L18
        L17:
            r0 = r1
        L18:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "#replay_data#finderObject from cache:"
            r2.<init>(r3)
            cm2.a r3 = cm2.a.f43328a
            r10 = -1
            java.lang.String r4 = r3.x(r0, r10)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "recoverFromLiveConfig"
            com.tencent.mars.xlog.Log.i(r11, r2)
            if (r0 == 0) goto L52
            r45.nw1 r5 = r0.getLiveInfo()
            if (r5 == 0) goto L44
            java.lang.String r6 = "recoverFromLiveConfig"
            r7 = 0
            r8 = 2
            r9 = 0
            r4 = r3
            java.lang.String r1 = cm2.a.i(r4, r5, r6, r7, r8, r9)
        L44:
            if (r1 == 0) goto L4f
            int r1 = r1.length()
            if (r1 != 0) goto L4d
            goto L4f
        L4d:
            r1 = 0
            goto L50
        L4f:
            r1 = 1
        L50:
            if (r1 == 0) goto L6d
        L52:
            km2.l r0 = km2.m.f309128u
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.b(r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "#replay_data#finderObject from static data:"
            r1.<init>(r2)
            java.lang.String r2 = r3.x(r0, r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r11, r1)
        L6d:
            r3.v(r13, r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.n1.c(km2.m, int):void");
    }

    public final java.lang.String d(r45.j72 j72Var, r45.gv cdnInfo) {
        java.lang.String e17;
        kotlin.jvm.internal.o.g(cdnInfo, "cdnInfo");
        if (j72Var == null || j72Var.getLong(3) == 0) {
            e17 = kk.k.e(cdnInfo.f375537e);
        } else {
            e17 = pm0.v.u(j72Var.getLong(3)) + '_' + cdnInfo.f375542m + '_' + cdnInfo.f375539g;
        }
        return "finder_live_" + e17;
    }
}
