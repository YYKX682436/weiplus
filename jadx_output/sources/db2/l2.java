package db2;

/* loaded from: classes2.dex */
public final class l2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f228053t;

    /* renamed from: u, reason: collision with root package name */
    public final long f228054u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f228055v;

    /* renamed from: w, reason: collision with root package name */
    public int f228056w;

    public /* synthetic */ l2(r45.f96 f96Var, zy2.o9 o9Var, com.tencent.mm.protobuf.g gVar, java.lang.Integer num, r45.qt2 qt2Var, int i17, int i18, long j17, java.lang.String str, int i19, kotlin.jvm.internal.i iVar) {
        this(f96Var, o9Var, gVar, (i19 & 8) != 0 ? null : num, (i19 & 16) != 0 ? null : qt2Var, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? 0 : i18, (i19 & 128) != 0 ? 0L : j17, (i19 & 256) != 0 ? "" : str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.zo2 resp = (r45.zo2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPoiStream", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("server increatment size:");
        sb6.append(resp.getList(1).size());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPoiStream", sb6.toString());
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.util.Objects.toString(resp.toJSON());
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
            java.util.LinkedList list = ((r45.zo2) fVar2).getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).cl((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), this.f16135n);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(r45.f96 location, zy2.o9 fromType, com.tencent.mm.protobuf.g gVar, java.lang.Integer num, r45.qt2 qt2Var, int i17, int i18, long j17, java.lang.String bypassBuffer) {
        super(qt2Var, null, 2, null);
        jz5.o oVar;
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(fromType, "fromType");
        kotlin.jvm.internal.o.g(bypassBuffer, "bypassBuffer");
        this.f228053t = i18;
        this.f228054u = j17;
        this.f228055v = bypassBuffer;
        r45.yo2 yo2Var = new r45.yo2();
        r45.zo2 zo2Var = new r45.zo2();
        yo2Var.set(1, db2.t4.f228171a.b(5225, qt2Var));
        yo2Var.set(6, location.getString(5));
        yo2Var.set(3, java.lang.Float.valueOf(location.getFloat(0)));
        yo2Var.set(4, java.lang.Float.valueOf(location.getFloat(1)));
        yo2Var.set(12, location.getString(4));
        java.lang.String string = location.getString(3);
        java.lang.String string2 = location.getString(15);
        java.lang.String string3 = location.getString(2);
        if (string == null || string.length() == 0) {
            oVar = new jz5.o(string == null ? "" : string, string2 == null ? "" : string2, string3 == null ? "" : string3);
        } else {
            kotlin.jvm.internal.o.d(string);
            java.lang.String t17 = !(string2 == null || string2.length() == 0) ? r26.i0.t(string, string2, "", false) : string;
            t17 = string3 == null || string3.length() == 0 ? t17 : r26.i0.t(t17, string3, "", false);
            while (r26.i0.y(t17, " · ", false)) {
                t17 = r26.n0.W(t17, " · ");
            }
            if (r26.n0.B(t17, " · ", false)) {
                oVar = new jz5.o(string, string2 == null ? "" : string2, string3 == null ? "" : string3);
            } else {
                oVar = new jz5.o(t17, string2 == null ? "" : string2, string3 == null ? "" : string3);
            }
        }
        java.lang.String str = (java.lang.String) oVar.f302841d;
        java.lang.String str2 = (java.lang.String) oVar.f302842e;
        java.lang.String str3 = (java.lang.String) oVar.f302843f;
        yo2Var.set(11, str);
        yo2Var.set(13, str3);
        yo2Var.set(14, str2);
        yo2Var.set(8, java.lang.Integer.valueOf(fromType.ordinal()));
        yo2Var.set(2, gVar);
        yo2Var.set(10, java.lang.Integer.valueOf(i17));
        yo2Var.set(5, db2.t4.f228171a.n());
        yo2Var.set(18, java.lang.Integer.valueOf(this.f228053t));
        yo2Var.set(7, java.lang.Long.valueOf(this.f228054u));
        yo2Var.set(19, this.f228055v);
        yo2Var.set(20, (r45.wo2) location.getCustom(21));
        if (num != null) {
            yo2Var.set(9, java.lang.Integer.valueOf(num.intValue()));
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = yo2Var;
        lVar.f70665b = zo2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpoistream";
        lVar.f70667d = 5225;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPoiStream", "poi_name=" + location.getString(3) + " poiAddress=" + location.getString(4) + " City=" + location.getString(2) + " country=" + location.getString(15) + "poiId=" + location.getString(5) + " fromScene=" + num + " fromType=" + fromType);
        if (com.tencent.mars.xlog.Log.isDebug()) {
            yo2Var.getInteger(18);
            java.util.Objects.toString(yo2Var.toJSON());
        }
    }
}
