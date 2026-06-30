package r45;

/* loaded from: classes15.dex */
public class un6 extends com.tencent.mm.protobuf.f {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387501d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387502e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387503f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387504g;

    /* renamed from: h, reason: collision with root package name */
    public long f387505h;

    /* renamed from: i, reason: collision with root package name */
    public int f387506i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387507m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387508n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xn6 f387509o;

    /* renamed from: p, reason: collision with root package name */
    public r45.x56 f387510p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f387512r;

    /* renamed from: s, reason: collision with root package name */
    public int f387513s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f387514t;

    /* renamed from: v, reason: collision with root package name */
    public int f387516v;

    /* renamed from: w, reason: collision with root package name */
    public int f387517w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f387518x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f387519y;

    /* renamed from: z, reason: collision with root package name */
    public int f387520z;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f387511q = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f387515u = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.un6)) {
            return false;
        }
        r45.un6 un6Var = (r45.un6) fVar;
        return n51.f.a(this.f387501d, un6Var.f387501d) && n51.f.a(this.f387502e, un6Var.f387502e) && n51.f.a(this.f387503f, un6Var.f387503f) && n51.f.a(this.f387504g, un6Var.f387504g) && n51.f.a(java.lang.Long.valueOf(this.f387505h), java.lang.Long.valueOf(un6Var.f387505h)) && n51.f.a(java.lang.Integer.valueOf(this.f387506i), java.lang.Integer.valueOf(un6Var.f387506i)) && n51.f.a(this.f387507m, un6Var.f387507m) && n51.f.a(this.f387508n, un6Var.f387508n) && n51.f.a(this.f387509o, un6Var.f387509o) && n51.f.a(this.f387510p, un6Var.f387510p) && n51.f.a(this.f387511q, un6Var.f387511q) && n51.f.a(this.f387512r, un6Var.f387512r) && n51.f.a(java.lang.Integer.valueOf(this.f387513s), java.lang.Integer.valueOf(un6Var.f387513s)) && n51.f.a(java.lang.Boolean.valueOf(this.f387514t), java.lang.Boolean.valueOf(un6Var.f387514t)) && n51.f.a(this.f387515u, un6Var.f387515u) && n51.f.a(java.lang.Integer.valueOf(this.f387516v), java.lang.Integer.valueOf(un6Var.f387516v)) && n51.f.a(java.lang.Integer.valueOf(this.f387517w), java.lang.Integer.valueOf(un6Var.f387517w)) && n51.f.a(java.lang.Boolean.valueOf(this.f387518x), java.lang.Boolean.valueOf(un6Var.f387518x)) && n51.f.a(this.f387519y, un6Var.f387519y) && n51.f.a(java.lang.Integer.valueOf(this.f387520z), java.lang.Integer.valueOf(un6Var.f387520z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(un6Var.A));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387515u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387501d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387502e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387503f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f387504g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(5, this.f387505h);
            fVar.e(6, this.f387506i);
            java.lang.String str5 = this.f387507m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f387508n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            r45.xn6 xn6Var = this.f387509o;
            if (xn6Var != null) {
                fVar.i(9, xn6Var.computeSize());
                this.f387509o.writeFields(fVar);
            }
            r45.x56 x56Var = this.f387510p;
            if (x56Var != null) {
                fVar.i(10, x56Var.computeSize());
                this.f387510p.writeFields(fVar);
            }
            fVar.g(11, 8, this.f387511q);
            java.lang.String str7 = this.f387512r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.e(13, this.f387513s);
            fVar.a(14, this.f387514t);
            fVar.g(15, 8, linkedList);
            fVar.e(16, this.f387516v);
            fVar.e(17, this.f387517w);
            fVar.a(18, this.f387518x);
            java.lang.String str8 = this.f387519y;
            if (str8 != null) {
                fVar.j(19, str8);
            }
            fVar.e(20, this.f387520z);
            fVar.a(21, this.A);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f387501d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f387502e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f387503f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f387504g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            int h17 = j17 + b36.f.h(5, this.f387505h) + b36.f.e(6, this.f387506i);
            java.lang.String str13 = this.f387507m;
            if (str13 != null) {
                h17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f387508n;
            if (str14 != null) {
                h17 += b36.f.j(8, str14);
            }
            r45.xn6 xn6Var2 = this.f387509o;
            if (xn6Var2 != null) {
                h17 += b36.f.i(9, xn6Var2.computeSize());
            }
            r45.x56 x56Var2 = this.f387510p;
            if (x56Var2 != null) {
                h17 += b36.f.i(10, x56Var2.computeSize());
            }
            int g17 = h17 + b36.f.g(11, 8, this.f387511q);
            java.lang.String str15 = this.f387512r;
            if (str15 != null) {
                g17 += b36.f.j(12, str15);
            }
            int e17 = g17 + b36.f.e(13, this.f387513s) + b36.f.a(14, this.f387514t) + b36.f.g(15, 8, linkedList) + b36.f.e(16, this.f387516v) + b36.f.e(17, this.f387517w) + b36.f.a(18, this.f387518x);
            java.lang.String str16 = this.f387519y;
            if (str16 != null) {
                e17 += b36.f.j(19, str16);
            }
            return e17 + b36.f.e(20, this.f387520z) + b36.f.a(21, this.A);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f387511q.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.un6 un6Var = (r45.un6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                un6Var.f387501d = aVar2.k(intValue);
                return 0;
            case 2:
                un6Var.f387502e = aVar2.k(intValue);
                return 0;
            case 3:
                un6Var.f387503f = aVar2.k(intValue);
                return 0;
            case 4:
                un6Var.f387504g = aVar2.k(intValue);
                return 0;
            case 5:
                un6Var.f387505h = aVar2.i(intValue);
                return 0;
            case 6:
                un6Var.f387506i = aVar2.g(intValue);
                return 0;
            case 7:
                un6Var.f387507m = aVar2.k(intValue);
                return 0;
            case 8:
                un6Var.f387508n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.xn6 xn6Var3 = new r45.xn6();
                    if (bArr2 != null && bArr2.length > 0) {
                        xn6Var3.parseFrom(bArr2);
                    }
                    un6Var.f387509o = xn6Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.x56 x56Var3 = new r45.x56();
                    if (bArr3 != null && bArr3.length > 0) {
                        x56Var3.parseFrom(bArr3);
                    }
                    un6Var.f387510p = x56Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr4 != null && bArr4.length > 0) {
                        x50Var.parseFrom(bArr4);
                    }
                    un6Var.f387511q.add(x50Var);
                }
                return 0;
            case 12:
                un6Var.f387512r = aVar2.k(intValue);
                return 0;
            case 13:
                un6Var.f387513s = aVar2.g(intValue);
                return 0;
            case 14:
                un6Var.f387514t = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.xn6 xn6Var4 = new r45.xn6();
                    if (bArr5 != null && bArr5.length > 0) {
                        xn6Var4.parseFrom(bArr5);
                    }
                    un6Var.f387515u.add(xn6Var4);
                }
                return 0;
            case 16:
                un6Var.f387516v = aVar2.g(intValue);
                return 0;
            case 17:
                un6Var.f387517w = aVar2.g(intValue);
                return 0;
            case 18:
                un6Var.f387518x = aVar2.c(intValue);
                return 0;
            case 19:
                un6Var.f387519y = aVar2.k(intValue);
                return 0;
            case 20:
                un6Var.f387520z = aVar2.g(intValue);
                return 0;
            case 21:
                un6Var.A = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f387501d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "relevantVid", str, false);
            eVar.d(jSONObject, "relevantExpand", this.f387502e, false);
            eVar.d(jSONObject, "relevantPreSearchId", this.f387503f, false);
            eVar.d(jSONObject, "relevantSharedOpenID", this.f387504g, false);
            eVar.d(jSONObject, "recCategory", java.lang.Long.valueOf(this.f387505h), false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f387506i), false);
            eVar.d(jSONObject, "searchId", this.f387507m, false);
            eVar.d(jSONObject, "keyword", this.f387508n, false);
            eVar.d(jSONObject, "firstVideoInfo", this.f387509o, false);
            eVar.d(jSONObject, "clickTag", this.f387510p, false);
            eVar.d(jSONObject, "extReqParams", this.f387511q, false);
            eVar.d(jSONObject, "contextId", this.f387512r, false);
            eVar.d(jSONObject, "offset", java.lang.Integer.valueOf(this.f387513s), false);
            eVar.d(jSONObject, "enbaleMobileNet", java.lang.Boolean.valueOf(this.f387514t), false);
            eVar.d(jSONObject, "videoList", this.f387515u, false);
            eVar.d(jSONObject, "currentPlayPosition", java.lang.Integer.valueOf(this.f387516v), false);
            eVar.d(jSONObject, "currentPlaySecond", java.lang.Integer.valueOf(this.f387517w), false);
            eVar.d(jSONObject, "isMute", java.lang.Boolean.valueOf(this.f387518x), false);
            eVar.d(jSONObject, "preNetType", this.f387519y, false);
            eVar.d(jSONObject, "hasCheckMobile", java.lang.Integer.valueOf(this.f387520z), false);
            eVar.d(jSONObject, "isSinglePage", java.lang.Boolean.valueOf(this.A), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
