package dk2;

/* loaded from: classes10.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f234154a;

    /* renamed from: b, reason: collision with root package name */
    public final long f234155b;

    /* renamed from: c, reason: collision with root package name */
    public int f234156c;

    /* renamed from: d, reason: collision with root package name */
    public int f234157d;

    /* renamed from: e, reason: collision with root package name */
    public int f234158e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f234159f;

    /* renamed from: g, reason: collision with root package name */
    public int f234160g;

    /* renamed from: h, reason: collision with root package name */
    public int f234161h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f234162i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f234163j;

    /* renamed from: k, reason: collision with root package name */
    public r45.gd2 f234164k;

    /* renamed from: l, reason: collision with root package name */
    public r45.hm1 f234165l;

    /* renamed from: m, reason: collision with root package name */
    public int f234166m;

    /* renamed from: n, reason: collision with root package name */
    public int f234167n;

    /* renamed from: o, reason: collision with root package name */
    public int f234168o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f234169p;

    public u4(java.lang.String str, long j17, int i17, int i18, int i19, java.util.List list, int i27, int i28, java.lang.String str2, java.util.List list2, r45.gd2 gd2Var, r45.hm1 hm1Var, int i29, int i37, int i38, int i39, kotlin.jvm.internal.i iVar) {
        java.util.List playerInfo;
        java.util.List battleTeams;
        java.lang.String str3 = (i39 & 1) != 0 ? null : str;
        long j18 = (i39 & 2) != 0 ? 0L : j17;
        int i47 = (i39 & 4) != 0 ? 0 : i17;
        int i48 = (i39 & 8) != 0 ? 0 : i18;
        int i49 = (i39 & 16) != 0 ? 0 : i19;
        if ((i39 & 32) != 0) {
            playerInfo = java.util.Collections.synchronizedList(new java.util.ArrayList());
            kotlin.jvm.internal.o.f(playerInfo, "synchronizedList(...)");
        } else {
            playerInfo = list;
        }
        int i57 = (i39 & 64) != 0 ? 1 : i27;
        int i58 = (i39 & 128) != 0 ? 0 : i28;
        java.lang.String str4 = (i39 & 256) != 0 ? null : str2;
        if ((i39 & 512) != 0) {
            battleTeams = java.util.Collections.synchronizedList(new java.util.ArrayList());
            kotlin.jvm.internal.o.f(battleTeams, "synchronizedList(...)");
        } else {
            battleTeams = list2;
        }
        r45.gd2 gd2Var2 = (i39 & 1024) != 0 ? null : gd2Var;
        r45.hm1 hm1Var2 = (i39 & 2048) != 0 ? null : hm1Var;
        int i59 = (i39 & 4096) != 0 ? 0 : i29;
        int i66 = (i39 & 8192) != 0 ? 0 : i37;
        int i67 = (i39 & 16384) != 0 ? 0 : i38;
        kotlin.jvm.internal.o.g(playerInfo, "playerInfo");
        kotlin.jvm.internal.o.g(battleTeams, "battleTeams");
        this.f234154a = str3;
        this.f234155b = j18;
        this.f234156c = i47;
        this.f234157d = i48;
        this.f234158e = i49;
        this.f234159f = playerInfo;
        this.f234160g = i57;
        this.f234161h = i58;
        this.f234162i = str4;
        this.f234163j = battleTeams;
        this.f234164k = gd2Var2;
        this.f234165l = hm1Var2;
        this.f234166m = i59;
        this.f234167n = i66;
        this.f234168o = i67;
        this.f234169p = "Finder.FinderLiveBattleData";
    }

    public final km2.k a() {
        java.util.List<km2.k> list = this.f234159f;
        synchronized (list) {
            for (km2.k kVar : list) {
                if (kVar.f309121h) {
                    return kVar;
                }
            }
            return null;
        }
    }

    public final java.lang.String b(int i17, com.tencent.mm.protobuf.g gVar) {
        if (i17 != 1) {
            return "";
        }
        r45.km1 km1Var = new r45.km1();
        if (gVar != null) {
            try {
                km1Var.parseFrom(gVar.f192156a);
            } catch (java.io.IOException unused) {
            }
        }
        java.lang.String string = km1Var.getString(0);
        return string == null ? "" : string;
    }

    public final km2.k c(java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i(this.f234169p, "getOtherBattleUser userName:" + str);
        java.util.List list = this.f234159f;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.k) obj).f309114a, str)) {
                    break;
                }
            }
        }
        return (km2.k) obj;
    }

    public final km2.k d(km2.q user) {
        kotlin.jvm.internal.o.g(user, "user");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.List<km2.k> list = this.f234159f;
        synchronized (list) {
            for (km2.k kVar : list) {
                java.lang.String str = kVar.f309114a;
                if (str == null) {
                    str = "";
                }
                hashMap.put(str, kVar);
                java.lang.String str2 = kVar.f309115b;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap2.put(str2, kVar);
            }
        }
        java.lang.String str3 = user.f309170a;
        if (str3 == null) {
            str3 = "";
        }
        if (hashMap2.get(str3) != null) {
            java.lang.String str4 = user.f309170a;
            if (str4 == null) {
                str4 = "";
            }
            return (km2.k) hashMap2.get(str4);
        }
        java.lang.String str5 = user.f309172c;
        if (str5 == null) {
            str5 = "";
        }
        if (hashMap.get(str5) != null) {
            java.lang.String str6 = user.f309172c;
            if (str6 == null) {
                str6 = "";
            }
            return (km2.k) hashMap.get(str6);
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.Iterator it = this.f234163j.iterator();
        while (it.hasNext()) {
            java.util.LinkedList<r45.wk6> list2 = ((r45.r22) it.next()).getList(0);
            kotlin.jvm.internal.o.f(list2, "getMembers(...)");
            for (r45.wk6 wk6Var : list2) {
                java.lang.String string = wk6Var.getString(1);
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = wk6Var.getString(0);
                if (string2 == null) {
                    string2 = "";
                }
                hashMap3.put(string, string2);
            }
        }
        java.lang.String str7 = (java.lang.String) hashMap3.get(user.f309170a);
        if (str7 == null) {
            str7 = "";
        }
        return (km2.k) hashMap.get(str7);
    }

    public final km2.k e(java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i(this.f234169p, "getSelfBattleUser anchorUsername:" + str);
        java.util.List list = this.f234159f;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.k) obj).f309114a, str)) {
                    break;
                }
            }
        }
        return (km2.k) obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.u4)) {
            return false;
        }
        dk2.u4 u4Var = (dk2.u4) obj;
        return kotlin.jvm.internal.o.b(this.f234154a, u4Var.f234154a) && this.f234155b == u4Var.f234155b && this.f234156c == u4Var.f234156c && this.f234157d == u4Var.f234157d && this.f234158e == u4Var.f234158e && kotlin.jvm.internal.o.b(this.f234159f, u4Var.f234159f) && this.f234160g == u4Var.f234160g && this.f234161h == u4Var.f234161h && kotlin.jvm.internal.o.b(this.f234162i, u4Var.f234162i) && kotlin.jvm.internal.o.b(this.f234163j, u4Var.f234163j) && kotlin.jvm.internal.o.b(this.f234164k, u4Var.f234164k) && kotlin.jvm.internal.o.b(this.f234165l, u4Var.f234165l) && this.f234166m == u4Var.f234166m && this.f234167n == u4Var.f234167n && this.f234168o == u4Var.f234168o;
    }

    public final boolean f() {
        return this.f234166m == 0;
    }

    public final boolean g() {
        return this.f234166m == 3;
    }

    public final boolean h() {
        return this.f234158e == 2;
    }

    public int hashCode() {
        java.lang.String str = this.f234154a;
        int hashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Long.hashCode(this.f234155b)) * 31) + java.lang.Integer.hashCode(this.f234156c)) * 31) + java.lang.Integer.hashCode(this.f234157d)) * 31) + java.lang.Integer.hashCode(this.f234158e)) * 31) + this.f234159f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f234160g)) * 31) + java.lang.Integer.hashCode(this.f234161h)) * 31;
        java.lang.String str2 = this.f234162i;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f234163j.hashCode()) * 31;
        r45.gd2 gd2Var = this.f234164k;
        int hashCode3 = (hashCode2 + (gd2Var == null ? 0 : gd2Var.hashCode())) * 31;
        r45.hm1 hm1Var = this.f234165l;
        return ((((((hashCode3 + (hm1Var != null ? hm1Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f234166m)) * 31) + java.lang.Integer.hashCode(this.f234167n)) * 31) + java.lang.Integer.hashCode(this.f234168o);
    }

    public final boolean i() {
        return this.f234158e == 3;
    }

    public final boolean j() {
        java.util.List list = this.f234159f;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((km2.k) it.next()).f309122i > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean k() {
        int i17 = this.f234166m;
        return i17 == 1 || i17 == 2;
    }

    public final void l(int i17) {
        this.f234158e = 3;
        this.f234157d = i17;
        com.tencent.mars.xlog.Log.i(this.f234169p, "transEnd endResult: " + i17);
    }

    public final void m(java.util.List remotePlayerInfo) {
        kotlin.jvm.internal.o.g(remotePlayerInfo, "remotePlayerInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = remotePlayerInfo.iterator();
        while (it.hasNext()) {
            r45.s85 s85Var = (r45.s85) it.next();
            com.tencent.mars.xlog.Log.i(this.f234169p, "updatePlayerInfo remotePlayerInfo:[" + s85Var.getString(0) + ", " + s85Var.getLong(1) + ", " + s85Var.getInteger(2) + ", count: " + s85Var.getLong(7) + " userId: " + s85Var.getString(10) + " username: " + s85Var.getString(0) + " boardKey: " + s85Var.getString(8) + "] boardType: " + s85Var.getInteger(9));
            arrayList.add(new km2.k(s85Var.getString(0), s85Var.getString(10), s85Var.getLong(1), s85Var.getInteger(2), s85Var.getBoolean(3), (r45.ja0) s85Var.getCustom(4), s85Var.getLong(5), s85Var.getBoolean(6), s85Var.getLong(7), s85Var.getString(8), s85Var.getInteger(9)));
        }
        java.util.List list = this.f234159f;
        list.clear();
        list.addAll(arrayList);
    }

    public java.lang.String toString() {
        return "FinderLiveBattleData(battleId=" + this.f234154a + ", battleSeq=" + this.f234155b + ", leftTime=" + this.f234156c + ", battleResult=" + this.f234157d + ", battleStatus=" + this.f234158e + ", playerInfo=" + this.f234159f + ", battleMode=" + this.f234160g + ", battleWinWay=" + this.f234161h + ", battleSelectGift=" + this.f234162i + ", battleTeams=" + this.f234163j + ", templateInfo=" + this.f234164k + ", extraInfo=" + this.f234165l + ", battleScope=" + this.f234166m + ", battleDuration=" + this.f234167n + ", battleLayout=" + this.f234168o + ')';
    }
}
