package db2;

/* loaded from: classes3.dex */
public final class e5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f227956g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f227957h;

    /* renamed from: i, reason: collision with root package name */
    public final int f227958i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f227959m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f227960n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, java.lang.String str, java.lang.Integer num, java.lang.Long l17, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, com.tencent.mm.protobuf.g gVar, java.util.LinkedList linkedList, java.lang.String str4, java.lang.String str5, int i18, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        java.lang.String str6;
        java.lang.String str7;
        com.tencent.mm.protobuf.g gVar2;
        java.util.LinkedList linkedList2;
        long j17;
        com.tencent.mm.modelbase.l lVar;
        int i19;
        java.lang.String str8 = (i18 & 16) != 0 ? "" : str;
        java.lang.Integer num3 = (i18 & 32) != 0 ? -1 : num;
        java.lang.Long l18 = (i18 & 64) != 0 ? -1L : l17;
        java.lang.Integer num4 = (i18 & 128) != 0 ? 0 : num2;
        java.lang.String str9 = (i18 & 256) != 0 ? "" : str2;
        java.lang.String fromQrcode = (i18 & 512) != 0 ? "" : str3;
        com.tencent.mm.protobuf.g gVar3 = (i18 & 1024) != 0 ? null : gVar;
        java.util.LinkedList noticeTypeList = (i18 & 2048) != 0 ? new java.util.LinkedList() : linkedList;
        java.lang.String gmsgId = (i18 & 4096) != 0 ? "" : str4;
        if ((i18 & 8192) != 0) {
            str7 = "";
            str6 = null;
        } else {
            str6 = str5;
            str7 = "";
        }
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        kotlin.jvm.internal.o.g(fromQrcode, "fromQrcode");
        kotlin.jvm.internal.o.g(noticeTypeList, "noticeTypeList");
        kotlin.jvm.internal.o.g(gmsgId, "gmsgId");
        this.f227956g = userName;
        this.f227957h = noticeId;
        this.f227958i = i17;
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        java.lang.String str10 = fromQrcode;
        lVar2.f70666c = "/cgi-bin/micromsg-bin/finderaudiencereservelive";
        lVar2.f70667d = 6276;
        r45.ru0 ru0Var = new r45.ru0();
        int intValue = num3 != null ? num3.intValue() : -1;
        int intValue2 = num4 != null ? num4.intValue() : 0;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        if (l18 != null) {
            gVar2 = gVar3;
            linkedList2 = noticeTypeList;
            j17 = l18.longValue();
        } else {
            gVar2 = gVar3;
            linkedList2 = noticeTypeList;
            j17 = -1;
        }
        if (qt2Var != null) {
            lVar = lVar2;
            i19 = qt2Var.getInteger(5);
        } else {
            lVar = lVar2;
            i19 = 0;
        }
        java.lang.String Zi = ((c61.p2) ybVar).Zi(j17, i19, str6);
        int integer = qt2Var != null ? qt2Var.getInteger(8) : 0;
        java.lang.String str11 = str9 == null ? str7 : str9;
        com.tencent.mm.modelbase.l lVar3 = lVar;
        db2.r4.a(ru0Var, userName, noticeId, i17, l18 != null ? l18.longValue() : 0L, null, str8, intValue, integer, Zi, str11, intValue2, str10, linkedList2, gmsgId, 16, null);
        ru0Var.set(14, gVar2);
        r45.su0 su0Var = new r45.su0();
        lVar3.f70664a = ru0Var;
        lVar3.f70665b = su0Var;
        this.f227959m = lVar3.a();
        com.tencent.mars.xlog.Log.i("Finder.com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive", "com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive init userName:" + userName + ", noticeId:" + noticeId + " ,optype:" + i17 + " ,promoToken:" + str8 + ",scene:" + num3 + ", fromQrcode = " + str10 + ", live_cookies:" + ru0Var.getByteString(14));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.com.tencent.mm.plugin.finder.cgi.NetSceneAudienceReserveLive", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f227960n;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        if (i18 == 0 && i19 == 0) {
            java.lang.String username = this.f227956g;
            int i27 = this.f227958i;
            if (i27 == 3 || i27 == 4) {
                zy2.x7 x7Var = (zy2.x7) i95.n0.c(zy2.x7.class);
                int i28 = i27 == 3 ? 1 : 0;
                vd2.j1 j1Var = (vd2.j1) x7Var;
                j1Var.getClass();
                kotlin.jvm.internal.o.g(username, "username");
                for (java.util.Map.Entry entry : j1Var.f435771e.entrySet()) {
                    if (kotlin.jvm.internal.o.b(((vd2.h1) entry.getKey()).f435744a, username)) {
                        ((vd2.i1) entry.getValue()).f435761a.set(1, java.lang.Integer.valueOf(i28 ^ 1));
                    }
                }
            } else {
                ((vd2.j1) ((zy2.x7) i95.n0.c(zy2.x7.class))).wi(username, this.f227957h, i27 == 1);
            }
            com.tencent.mm.autogen.events.FinderLiveNoticeStateEvent finderLiveNoticeStateEvent = new com.tencent.mm.autogen.events.FinderLiveNoticeStateEvent();
            am.rb rbVar = finderLiveNoticeStateEvent.f54287g;
            rbVar.getClass();
            rbVar.getClass();
            finderLiveNoticeStateEvent.e();
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f227960n = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f227959m;
        if (oVar != null) {
            return dispatch(sVar, oVar, this);
        }
        kotlin.jvm.internal.o.o("rr");
        throw null;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6276;
    }
}
