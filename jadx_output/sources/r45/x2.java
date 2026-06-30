package r45;

/* loaded from: classes4.dex */
public class x2 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public long B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;

    /* renamed from: d, reason: collision with root package name */
    public int f389670d;

    /* renamed from: e, reason: collision with root package name */
    public int f389671e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389672f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389673g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389674h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389675i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389676m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389677n;

    /* renamed from: o, reason: collision with root package name */
    public int f389678o;

    /* renamed from: p, reason: collision with root package name */
    public int f389679p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389680q;

    /* renamed from: r, reason: collision with root package name */
    public long f389681r;

    /* renamed from: s, reason: collision with root package name */
    public int f389682s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f389683t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f389684u;

    /* renamed from: v, reason: collision with root package name */
    public int f389685v;

    /* renamed from: w, reason: collision with root package name */
    public int f389686w;

    /* renamed from: x, reason: collision with root package name */
    public int f389687x;

    /* renamed from: y, reason: collision with root package name */
    public int f389688y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f389689z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x2)) {
            return false;
        }
        r45.x2 x2Var = (r45.x2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389670d), java.lang.Integer.valueOf(x2Var.f389670d)) && n51.f.a(java.lang.Integer.valueOf(this.f389671e), java.lang.Integer.valueOf(x2Var.f389671e)) && n51.f.a(this.f389672f, x2Var.f389672f) && n51.f.a(this.f389673g, x2Var.f389673g) && n51.f.a(this.f389674h, x2Var.f389674h) && n51.f.a(this.f389675i, x2Var.f389675i) && n51.f.a(this.f389676m, x2Var.f389676m) && n51.f.a(this.f389677n, x2Var.f389677n) && n51.f.a(java.lang.Integer.valueOf(this.f389678o), java.lang.Integer.valueOf(x2Var.f389678o)) && n51.f.a(java.lang.Integer.valueOf(this.f389679p), java.lang.Integer.valueOf(x2Var.f389679p)) && n51.f.a(this.f389680q, x2Var.f389680q) && n51.f.a(java.lang.Long.valueOf(this.f389681r), java.lang.Long.valueOf(x2Var.f389681r)) && n51.f.a(java.lang.Integer.valueOf(this.f389682s), java.lang.Integer.valueOf(x2Var.f389682s)) && n51.f.a(this.f389683t, x2Var.f389683t) && n51.f.a(this.f389684u, x2Var.f389684u) && n51.f.a(java.lang.Integer.valueOf(this.f389685v), java.lang.Integer.valueOf(x2Var.f389685v)) && n51.f.a(java.lang.Integer.valueOf(this.f389686w), java.lang.Integer.valueOf(x2Var.f389686w)) && n51.f.a(java.lang.Integer.valueOf(this.f389687x), java.lang.Integer.valueOf(x2Var.f389687x)) && n51.f.a(java.lang.Integer.valueOf(this.f389688y), java.lang.Integer.valueOf(x2Var.f389688y)) && n51.f.a(this.f389689z, x2Var.f389689z) && n51.f.a(this.A, x2Var.A) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(x2Var.B)) && n51.f.a(this.C, x2Var.C) && n51.f.a(this.D, x2Var.D) && n51.f.a(this.E, x2Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(x2Var.F));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -2094810920:
                            if (next.equals("outer_duration")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case -1964727523:
                            if (next.equals("click_pos")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -1938110428:
                            if (next.equals("ipv4_md5")) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case -1936263386:
                            if (next.equals("ipv6_md5")) {
                                c17 = 23;
                                break;
                            }
                            break;
                        case -1904089573:
                            if (next.equals("client_ip")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1788292820:
                            if (next.equals("video_total_time")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case -1506231196:
                            if (next.equals("client_version")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1291903789:
                            if (next.equals("play_total_time")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -982470938:
                            if (next.equals("pos_id")) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case -934828512:
                            if (next.equals("reffer")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -814188436:
                            if (next.equals("play_sequence")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -353328790:
                            if (next.equals("report_ts")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case -246795227:
                            if (next.equals("report_link")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -246541467:
                            if (next.equals("report_type")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -174007845:
                            if (next.equals("client_ipv6")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case -97276114:
                            if (next.equals("biz_uin")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 96572:
                            if (next.equals("aid")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 433444722:
                            if (next.equals("exposure_type")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case 550295380:
                            if (next.equals("exposure_scene")) {
                                c17 = 25;
                                break;
                            }
                            break;
                        case 782144144:
                            if (next.equals("devicetype")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1234998884:
                            if (next.equals("report_extra_data")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case 1270300245:
                            if (next.equals("trace_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1660143334:
                            if (next.equals("advert_group_id")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1688668397:
                            if (next.equals("minishop_uuid")) {
                                c17 = 24;
                                break;
                            }
                            break;
                        case 1911031876:
                            if (next.equals("play_count")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case 1917799825:
                            if (next.equals("user_agent")) {
                                c17 = 5;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f389670d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f389671e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f389672f = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt, 0));
                                break;
                            }
                        case 3:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f389673g = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt2, 0));
                                break;
                            }
                        case 4:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f389674h = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt3, 0));
                                break;
                            }
                        case 5:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f389675i = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt4, 0));
                                break;
                            }
                        case 6:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f389676m = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt5, 0));
                                break;
                            }
                        case 7:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f389677n = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt6, 0));
                                break;
                            }
                        case '\b':
                            this.f389678o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f389679p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            java.lang.Object opt7 = jSONObject.opt(next);
                            if (!(opt7 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f389680q = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt7, 0));
                                break;
                            }
                        case 11:
                            this.f389681r = jSONObject.optLong(next);
                            break;
                        case '\f':
                            this.f389682s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\r':
                            this.f389683t = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 14:
                            this.f389684u = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 15:
                            this.f389685v = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            this.f389686w = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 17:
                            this.f389687x = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 18:
                            this.f389688y = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f389689z = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 20:
                            this.A = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 21:
                            this.B = jSONObject.optLong(next);
                            break;
                        case 22:
                            this.C = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 23:
                            this.D = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 24:
                            this.E = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 25:
                            this.F = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389670d);
            fVar.e(2, this.f389671e);
            com.tencent.mm.protobuf.g gVar = this.f389672f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f389673g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f389674h;
            if (gVar3 != null) {
                fVar.b(6, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f389675i;
            if (gVar4 != null) {
                fVar.b(11, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f389676m;
            if (gVar5 != null) {
                fVar.b(12, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f389677n;
            if (gVar6 != null) {
                fVar.b(13, gVar6);
            }
            fVar.e(16, this.f389678o);
            fVar.e(19, this.f389679p);
            com.tencent.mm.protobuf.g gVar7 = this.f389680q;
            if (gVar7 != null) {
                fVar.b(20, gVar7);
            }
            fVar.h(27, this.f389681r);
            fVar.e(40, this.f389682s);
            java.lang.String str = this.f389683t;
            if (str != null) {
                fVar.j(45, str);
            }
            java.lang.String str2 = this.f389684u;
            if (str2 != null) {
                fVar.j(56, str2);
            }
            fVar.e(63, this.f389685v);
            fVar.e(64, this.f389686w);
            fVar.e(65, this.f389687x);
            fVar.e(66, this.f389688y);
            java.lang.String str3 = this.f389689z;
            if (str3 != null) {
                fVar.j(67, str3);
            }
            java.lang.String str4 = this.A;
            if (str4 != null) {
                fVar.j(68, str4);
            }
            fVar.h(71, this.B);
            java.lang.String str5 = this.C;
            if (str5 != null) {
                fVar.j(75, str5);
            }
            java.lang.String str6 = this.D;
            if (str6 != null) {
                fVar.j(76, str6);
            }
            java.lang.String str7 = this.E;
            if (str7 != null) {
                fVar.j(92, str7);
            }
            fVar.e(103, this.F);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389670d) + 0 + b36.f.e(2, this.f389671e);
            com.tencent.mm.protobuf.g gVar8 = this.f389672f;
            if (gVar8 != null) {
                e17 += b36.f.b(4, gVar8);
            }
            com.tencent.mm.protobuf.g gVar9 = this.f389673g;
            if (gVar9 != null) {
                e17 += b36.f.b(5, gVar9);
            }
            com.tencent.mm.protobuf.g gVar10 = this.f389674h;
            if (gVar10 != null) {
                e17 += b36.f.b(6, gVar10);
            }
            com.tencent.mm.protobuf.g gVar11 = this.f389675i;
            if (gVar11 != null) {
                e17 += b36.f.b(11, gVar11);
            }
            com.tencent.mm.protobuf.g gVar12 = this.f389676m;
            if (gVar12 != null) {
                e17 += b36.f.b(12, gVar12);
            }
            com.tencent.mm.protobuf.g gVar13 = this.f389677n;
            if (gVar13 != null) {
                e17 += b36.f.b(13, gVar13);
            }
            int e18 = e17 + b36.f.e(16, this.f389678o) + b36.f.e(19, this.f389679p);
            com.tencent.mm.protobuf.g gVar14 = this.f389680q;
            if (gVar14 != null) {
                e18 += b36.f.b(20, gVar14);
            }
            int h17 = e18 + b36.f.h(27, this.f389681r) + b36.f.e(40, this.f389682s);
            java.lang.String str8 = this.f389683t;
            if (str8 != null) {
                h17 += b36.f.j(45, str8);
            }
            java.lang.String str9 = this.f389684u;
            if (str9 != null) {
                h17 += b36.f.j(56, str9);
            }
            int e19 = h17 + b36.f.e(63, this.f389685v) + b36.f.e(64, this.f389686w) + b36.f.e(65, this.f389687x) + b36.f.e(66, this.f389688y);
            java.lang.String str10 = this.f389689z;
            if (str10 != null) {
                e19 += b36.f.j(67, str10);
            }
            java.lang.String str11 = this.A;
            if (str11 != null) {
                e19 += b36.f.j(68, str11);
            }
            int h18 = e19 + b36.f.h(71, this.B);
            java.lang.String str12 = this.C;
            if (str12 != null) {
                h18 += b36.f.j(75, str12);
            }
            java.lang.String str13 = this.D;
            if (str13 != null) {
                h18 += b36.f.j(76, str13);
            }
            java.lang.String str14 = this.E;
            if (str14 != null) {
                h18 += b36.f.j(92, str14);
            }
            return h18 + b36.f.e(103, this.F);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.x2 x2Var = (r45.x2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x2Var.f389670d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            x2Var.f389671e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            x2Var.f389672f = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 5) {
            x2Var.f389673g = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 6) {
            x2Var.f389674h = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 16) {
            x2Var.f389678o = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 27) {
            x2Var.f389681r = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 40) {
            x2Var.f389682s = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 45) {
            x2Var.f389683t = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 56) {
            x2Var.f389684u = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 71) {
            x2Var.B = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 92) {
            x2Var.E = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 103) {
            x2Var.F = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 19) {
            x2Var.f389679p = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 20) {
            x2Var.f389680q = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 75) {
            x2Var.C = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 76) {
            x2Var.D = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 11:
                x2Var.f389675i = aVar2.d(intValue);
                return 0;
            case 12:
                x2Var.f389676m = aVar2.d(intValue);
                return 0;
            case 13:
                x2Var.f389677n = aVar2.d(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 63:
                        x2Var.f389685v = aVar2.g(intValue);
                        return 0;
                    case 64:
                        x2Var.f389686w = aVar2.g(intValue);
                        return 0;
                    case 65:
                        x2Var.f389687x = aVar2.g(intValue);
                        return 0;
                    case 66:
                        x2Var.f389688y = aVar2.g(intValue);
                        return 0;
                    case 67:
                        x2Var.f389689z = aVar2.k(intValue);
                        return 0;
                    case 68:
                        x2Var.A = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f389670d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "report_type", valueOf, false);
            eVar.d(jSONObject, "biz_uin", java.lang.Integer.valueOf(this.f389671e), false);
            eVar.d(jSONObject, "advert_group_id", this.f389672f, false);
            eVar.d(jSONObject, "trace_id", this.f389673g, false);
            eVar.d(jSONObject, "report_link", this.f389674h, false);
            eVar.d(jSONObject, "user_agent", this.f389675i, false);
            eVar.d(jSONObject, "client_ip", this.f389676m, false);
            eVar.d(jSONObject, "reffer", this.f389677n, false);
            eVar.d(jSONObject, "click_pos", java.lang.Integer.valueOf(this.f389678o), false);
            eVar.d(jSONObject, "client_version", java.lang.Integer.valueOf(this.f389679p), false);
            eVar.d(jSONObject, "devicetype", this.f389680q, false);
            eVar.d(jSONObject, "aid", java.lang.Long.valueOf(this.f389681r), false);
            eVar.d(jSONObject, "exposure_type", java.lang.Integer.valueOf(this.f389682s), false);
            eVar.d(jSONObject, "client_ipv6", this.f389683t, false);
            eVar.d(jSONObject, "pos_id", this.f389684u, false);
            eVar.d(jSONObject, "outer_duration", java.lang.Integer.valueOf(this.f389685v), false);
            eVar.d(jSONObject, "play_count", java.lang.Integer.valueOf(this.f389686w), false);
            eVar.d(jSONObject, "play_total_time", java.lang.Integer.valueOf(this.f389687x), false);
            eVar.d(jSONObject, "video_total_time", java.lang.Integer.valueOf(this.f389688y), false);
            eVar.d(jSONObject, "play_sequence", this.f389689z, false);
            eVar.d(jSONObject, "report_extra_data", this.A, false);
            eVar.d(jSONObject, "report_ts", java.lang.Long.valueOf(this.B), false);
            eVar.d(jSONObject, "ipv4_md5", this.C, false);
            eVar.d(jSONObject, "ipv6_md5", this.D, false);
            eVar.d(jSONObject, "minishop_uuid", this.E, false);
            eVar.d(jSONObject, "exposure_scene", java.lang.Integer.valueOf(this.F), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
