package ml2;

/* loaded from: classes3.dex */
public final class b implements ml2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml2.d f327209a;

    public b(ml2.d dVar) {
        this.f327209a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(ml2.f0 r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "liveFeed"
            kotlin.jvm.internal.o.g(r11, r0)
            so2.j5 r0 = r11.f327396a
            boolean r1 = r0 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            zl2.q4 r5 = zl2.q4.f473933a
            kotlin.jvm.internal.o.e(r0, r2)
            r6 = r0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r6
            boolean r5 = r5.C(r6)
            if (r5 == 0) goto L1f
            r5 = r3
            goto L20
        L1f:
            r5 = r4
        L20:
            boolean r6 = r0 instanceof so2.m1
            if (r6 == 0) goto L28
            ml2.x1 r6 = ml2.x1.f328213t
            r11.f327402g = r6
        L28:
            boolean r6 = r11.f327408m
            if (r6 != 0) goto L3b
            if (r5 != 0) goto L3b
            ml2.e0 r5 = ml2.e0.f327370e
            ml2.e0 r6 = r11.f327406k
            if (r6 == r5) goto L3b
            boolean r5 = r11.f327407l
            if (r5 == 0) goto L39
            goto L3b
        L39:
            r5 = r4
            goto L3c
        L3b:
            r5 = r3
        L3c:
            if (r5 != 0) goto L57
            if (r12 == 0) goto L57
            if (r1 == 0) goto L57
            kotlin.jvm.internal.o.e(r0, r2)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r0
            ya2.b2 r12 = r0.getContact()
            if (r12 == 0) goto L52
            int r12 = r12.field_liveStatus
            if (r12 != r3) goto L52
            r4 = r3
        L52:
            ml2.x1 r12 = ml2.x1.f328203g
            r11.f327402g = r12
            r5 = r4
        L57:
            if (r5 == 0) goto Lb9
            ml2.d r12 = r10.f327209a
            r12.getClass()
            ml2.x1 r0 = r11.f327402g
            long r0 = r0.f328220d
            ml2.x1 r2 = ml2.x1.f328201e
            r4 = 3
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Lb6
            ae2.in r0 = ae2.in.f3688a
            lb2.j r0 = r0.u()
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r3) goto Lb6
            so2.k2 r12 = so2.o2.f410517f
            so2.o2 r2 = r12.a()
            r3 = 1
            so2.o2 r12 = r12.a()
            r12.getClass()
            java.lang.String r12 = "commentScene"
            java.lang.String r0 = r11.f327403h
            kotlin.jvm.internal.o.g(r0, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            long r4 = r11.f327400e
            r12.append(r4)
            r4 = 35
            r12.append(r4)
            r12.append(r0)
            java.lang.String r4 = r12.toString()
            so2.m2 r5 = new so2.m2
            r5.<init>(r11, r1)
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            so2.o2.i(r2, r3, r4, r5, r6, r7, r8, r9)
            goto Lb9
        Lb6:
            r12.i(r11, r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.b.a(ml2.f0, boolean):void");
    }

    public void b(ml2.h0 feed, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(feed, "feed");
        if (feed.f327518f) {
            ml2.d dVar = this.f327209a;
            dVar.getClass();
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct();
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) feed.f327513a.getCustom(0);
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            j0Var.Vi(finderLiveEntranceLogStruct, str);
            java.lang.String str2 = feed.f327515c;
            finderLiveEntranceLogStruct.t(str2);
            finderLiveEntranceLogStruct.f57122e = 0L;
            finderLiveEntranceLogStruct.u("0");
            finderLiveEntranceLogStruct.f57126i = feed.f327516d.f328220d;
            java.lang.String str3 = feed.f327517e;
            finderLiveEntranceLogStruct.r(str3);
            finderLiveEntranceLogStruct.f57128k = feed.f327514b;
            finderLiveEntranceLogStruct.f57129l = 0L;
            finderLiveEntranceLogStruct.f57130m = 0L;
            finderLiveEntranceLogStruct.w("");
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            finderLiveEntranceLogStruct.s(b52.b.b());
            finderLiveEntranceLogStruct.f57133p = -1L;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            finderLiveEntranceLogStruct.q(b52.b.c());
            if (!r26.i0.A(str3, "temp_", false, 2, null)) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                if (b52.b.o(str2)) {
                    finderLiveEntranceLogStruct.v(ml2.d.d(dVar, com.tencent.mm.sdk.platformtools.t8.V(str2, -1L), com.tencent.mm.sdk.platformtools.b8.c(finderLiveEntranceLogStruct.f57127j), null, 4, null));
                } else {
                    finderLiveEntranceLogStruct.v(str3);
                }
            } else if (kotlin.jvm.internal.o.b(finderLiveEntranceLogStruct.f57127j, "temp_2")) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                finderLiveEntranceLogStruct.v(ml2.j0.f327583i.f328318z);
            } else {
                finderLiveEntranceLogStruct.v(str3);
            }
            finderLiveEntranceLogStruct.k();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.Audience21053Report", "report21053OnExposure, mixsearch, struct:\nnickName=" + feed.f327519g + "\nuserName=" + finderLiveEntranceLogStruct.f57121d + "\nfeedID=" + finderLiveEntranceLogStruct.f57123f + "\nliveIDStr=" + finderLiveEntranceLogStruct.f57137t + "\nactionTS=" + finderLiveEntranceLogStruct.f57125h + "\naction=" + finderLiveEntranceLogStruct.f57126i + "\ncommentScene=" + finderLiveEntranceLogStruct.f57127j + "\nindex=" + finderLiveEntranceLogStruct.f57128k + "\nenterStatus=" + finderLiveEntranceLogStruct.f57129l + "\nshareType=" + finderLiveEntranceLogStruct.f57130m + "\nshareUserName=" + finderLiveEntranceLogStruct.f57131n + "\ncontextId=" + finderLiveEntranceLogStruct.f57132o + "\nonlineNum=" + finderLiveEntranceLogStruct.f57133p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f57134q + "\nisPrivate=" + finderLiveEntranceLogStruct.f57135r + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f57136s + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f57138u + "\nsessionID=" + finderLiveEntranceLogStruct.f57124g);
        }
    }
}
