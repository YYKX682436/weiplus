package r45;

/* loaded from: classes4.dex */
public class d43 extends com.tencent.mm.protobuf.f {
    public r45.m3 A;
    public r45.zn B;
    public java.lang.String D;
    public java.lang.String E;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372073f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372074g;

    /* renamed from: h, reason: collision with root package name */
    public long f372075h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372076i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372077m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372078n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372079o;

    /* renamed from: p, reason: collision with root package name */
    public r45.x30 f372080p;

    /* renamed from: q, reason: collision with root package name */
    public int f372081q;

    /* renamed from: r, reason: collision with root package name */
    public r45.gr0 f372082r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f372083s;

    /* renamed from: t, reason: collision with root package name */
    public r45.wm4 f372084t;

    /* renamed from: u, reason: collision with root package name */
    public r45.c43 f372085u;

    /* renamed from: v, reason: collision with root package name */
    public r45.c43 f372086v;

    /* renamed from: w, reason: collision with root package name */
    public int f372087w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f372088x;

    /* renamed from: y, reason: collision with root package name */
    public r45.c43 f372089y;

    /* renamed from: z, reason: collision with root package name */
    public int f372090z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f372071d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372072e = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d43)) {
            return false;
        }
        r45.d43 d43Var = (r45.d43) fVar;
        return n51.f.a(this.f372071d, d43Var.f372071d) && n51.f.a(this.f372072e, d43Var.f372072e) && n51.f.a(this.f372073f, d43Var.f372073f) && n51.f.a(this.f372074g, d43Var.f372074g) && n51.f.a(java.lang.Long.valueOf(this.f372075h), java.lang.Long.valueOf(d43Var.f372075h)) && n51.f.a(this.f372076i, d43Var.f372076i) && n51.f.a(this.f372077m, d43Var.f372077m) && n51.f.a(this.f372078n, d43Var.f372078n) && n51.f.a(this.f372079o, d43Var.f372079o) && n51.f.a(this.f372080p, d43Var.f372080p) && n51.f.a(java.lang.Integer.valueOf(this.f372081q), java.lang.Integer.valueOf(d43Var.f372081q)) && n51.f.a(this.f372082r, d43Var.f372082r) && n51.f.a(this.f372083s, d43Var.f372083s) && n51.f.a(this.f372084t, d43Var.f372084t) && n51.f.a(this.f372085u, d43Var.f372085u) && n51.f.a(this.f372086v, d43Var.f372086v) && n51.f.a(java.lang.Integer.valueOf(this.f372087w), java.lang.Integer.valueOf(d43Var.f372087w)) && n51.f.a(this.f372088x, d43Var.f372088x) && n51.f.a(this.f372089y, d43Var.f372089y) && n51.f.a(java.lang.Integer.valueOf(this.f372090z), java.lang.Integer.valueOf(d43Var.f372090z)) && n51.f.a(this.A, d43Var.A) && n51.f.a(this.B, d43Var.B) && n51.f.a(this.C, d43Var.C) && n51.f.a(this.D, d43Var.D) && n51.f.a(this.E, d43Var.E);
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
                    int i17 = 0;
                    switch (next.hashCode()) {
                        case -2071290626:
                            if (next.equals("button_text_color")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case -1949983448:
                            if (next.equals("feedback_info")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case -1759740570:
                            if (next.equals("button_icon")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -1759410662:
                            if (next.equals("button_text")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1711558474:
                            if (next.equals("left_top_title")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case -1574700828:
                            if (next.equals("media_bg_color")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case -1467091664:
                            if (next.equals("sns_ad_id")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1406948299:
                            if (next.equals("ad_market_jump")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case -1359893700:
                            if (next.equals("ad_title")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1152726739:
                            if (next.equals("ad_desc")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -708209900:
                            if (next.equals("to_ad_market")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -506989974:
                            if (next.equals("auxiliary_desc")) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case -242372734:
                            if (next.equals("brand_badge_info")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case -218951286:
                            if (next.equals("head_name")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -66431586:
                            if (next.equals("multi_images_internal")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case 140120328:
                            if (next.equals("style_type")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 395166783:
                            if (next.equals("desc_text_color")) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case 1153405203:
                            if (next.equals("button_click_action_info")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 1188170350:
                            if (next.equals("store_icon_url_dark")) {
                                c17 = 24;
                                break;
                            }
                            break;
                        case 1688143068:
                            if (next.equals("minishop_data")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case 1749480007:
                            if (next.equals("store_icon_url")) {
                                c17 = 23;
                                break;
                            }
                            break;
                        case 1798173244:
                            if (next.equals("head_image")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1939536937:
                            if (next.equals("media_info")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 2031036640:
                            if (next.equals("click_action_info")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 2074188463:
                            if (next.equals("button_icon_dark")) {
                                c17 = 17;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                                while (i17 < jSONArray.length()) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.f372071d;
                                        r45.i96 i96Var = new r45.i96();
                                        i96Var.fromJson(((org.json.JSONObject) obj).toString());
                                        linkedList.add(i96Var);
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case 1:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt2;
                                while (i17 < jSONArray2.length()) {
                                    java.lang.Object obj2 = jSONArray2.get(i17);
                                    if (obj2 instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList2 = this.f372072e;
                                        r45.x30 x30Var = new r45.x30();
                                        x30Var.fromJson(((org.json.JSONObject) obj2).toString());
                                        linkedList2.add(x30Var);
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case 2:
                            this.f372073f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f372074g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f372075h = jSONObject.optLong(next);
                            break;
                        case 5:
                            this.f372076i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f372077m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f372078n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f372079o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.x30 x30Var2 = new r45.x30();
                                x30Var2.fromJson(((org.json.JSONObject) opt3).toString());
                                this.f372080p = x30Var2;
                                break;
                            }
                        case '\n':
                            this.f372081q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.gr0 gr0Var = new r45.gr0();
                                gr0Var.fromJson(((org.json.JSONObject) opt4).toString());
                                this.f372082r = gr0Var;
                                break;
                            }
                        case '\f':
                            this.f372083s = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\r':
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.wm4 wm4Var = new r45.wm4();
                                wm4Var.fromJson(((org.json.JSONObject) opt5).toString());
                                this.f372084t = wm4Var;
                                break;
                            }
                        case 14:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.c43 c43Var = new r45.c43();
                                c43Var.fromJson(((org.json.JSONObject) opt6).toString());
                                this.f372085u = c43Var;
                                break;
                            }
                        case 15:
                            java.lang.Object opt7 = jSONObject.opt(next);
                            if (!(opt7 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.c43 c43Var2 = new r45.c43();
                                c43Var2.fromJson(((org.json.JSONObject) opt7).toString());
                                this.f372086v = c43Var2;
                                break;
                            }
                        case 16:
                            this.f372087w = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 17:
                            this.f372088x = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 18:
                            java.lang.Object opt8 = jSONObject.opt(next);
                            if (!(opt8 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.c43 c43Var3 = new r45.c43();
                                c43Var3.fromJson(((org.json.JSONObject) opt8).toString());
                                this.f372089y = c43Var3;
                                break;
                            }
                        case 19:
                            this.f372090z = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 20:
                            java.lang.Object opt9 = jSONObject.opt(next);
                            if (!(opt9 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.m3 m3Var = new r45.m3();
                                m3Var.fromJson(((org.json.JSONObject) opt9).toString());
                                this.A = m3Var;
                                break;
                            }
                        case 21:
                            java.lang.Object opt10 = jSONObject.opt(next);
                            if (!(opt10 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.zn znVar = new r45.zn();
                                znVar.fromJson(((org.json.JSONObject) opt10).toString());
                                this.B = znVar;
                                break;
                            }
                        case 22:
                            java.lang.Object opt11 = jSONObject.opt(next);
                            if (!(opt11 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray3 = (org.json.JSONArray) opt11;
                                while (i17 < jSONArray3.length()) {
                                    this.C.add((java.lang.String) jSONArray3.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 23:
                            this.D = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 24:
                            this.E = (java.lang.String) jSONObject.opt(next);
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
        java.util.LinkedList linkedList = this.C;
        java.util.LinkedList linkedList2 = this.f372072e;
        java.util.LinkedList linkedList3 = this.f372071d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.g(2, 8, linkedList2);
            java.lang.String str = this.f372073f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f372074g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(6, this.f372075h);
            java.lang.String str3 = this.f372076i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f372077m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f372078n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f372079o;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            r45.x30 x30Var = this.f372080p;
            if (x30Var != null) {
                fVar.i(12, x30Var.computeSize());
                this.f372080p.writeFields(fVar);
            }
            fVar.e(13, this.f372081q);
            r45.gr0 gr0Var = this.f372082r;
            if (gr0Var != null) {
                fVar.i(14, gr0Var.computeSize());
                this.f372082r.writeFields(fVar);
            }
            java.lang.String str7 = this.f372083s;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            r45.wm4 wm4Var = this.f372084t;
            if (wm4Var != null) {
                fVar.i(16, wm4Var.computeSize());
                this.f372084t.writeFields(fVar);
            }
            r45.c43 c43Var = this.f372085u;
            if (c43Var != null) {
                fVar.i(17, c43Var.computeSize());
                this.f372085u.writeFields(fVar);
            }
            r45.c43 c43Var2 = this.f372086v;
            if (c43Var2 != null) {
                fVar.i(18, c43Var2.computeSize());
                this.f372086v.writeFields(fVar);
            }
            fVar.e(19, this.f372087w);
            java.lang.String str8 = this.f372088x;
            if (str8 != null) {
                fVar.j(20, str8);
            }
            r45.c43 c43Var3 = this.f372089y;
            if (c43Var3 != null) {
                fVar.i(21, c43Var3.computeSize());
                this.f372089y.writeFields(fVar);
            }
            fVar.e(22, this.f372090z);
            r45.m3 m3Var = this.A;
            if (m3Var != null) {
                fVar.i(23, m3Var.computeSize());
                this.A.writeFields(fVar);
            }
            r45.zn znVar = this.B;
            if (znVar != null) {
                fVar.i(24, znVar.computeSize());
                this.B.writeFields(fVar);
            }
            fVar.g(25, 1, linkedList);
            java.lang.String str9 = this.D;
            if (str9 != null) {
                fVar.j(26, str9);
            }
            java.lang.String str10 = this.E;
            if (str10 != null) {
                fVar.j(27, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList3) + 0 + b36.f.g(2, 8, linkedList2);
            java.lang.String str11 = this.f372073f;
            if (str11 != null) {
                g17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f372074g;
            if (str12 != null) {
                g17 += b36.f.j(4, str12);
            }
            int h17 = g17 + b36.f.h(6, this.f372075h);
            java.lang.String str13 = this.f372076i;
            if (str13 != null) {
                h17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f372077m;
            if (str14 != null) {
                h17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f372078n;
            if (str15 != null) {
                h17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f372079o;
            if (str16 != null) {
                h17 += b36.f.j(11, str16);
            }
            r45.x30 x30Var2 = this.f372080p;
            if (x30Var2 != null) {
                h17 += b36.f.i(12, x30Var2.computeSize());
            }
            int e17 = h17 + b36.f.e(13, this.f372081q);
            r45.gr0 gr0Var2 = this.f372082r;
            if (gr0Var2 != null) {
                e17 += b36.f.i(14, gr0Var2.computeSize());
            }
            java.lang.String str17 = this.f372083s;
            if (str17 != null) {
                e17 += b36.f.j(15, str17);
            }
            r45.wm4 wm4Var2 = this.f372084t;
            if (wm4Var2 != null) {
                e17 += b36.f.i(16, wm4Var2.computeSize());
            }
            r45.c43 c43Var4 = this.f372085u;
            if (c43Var4 != null) {
                e17 += b36.f.i(17, c43Var4.computeSize());
            }
            r45.c43 c43Var5 = this.f372086v;
            if (c43Var5 != null) {
                e17 += b36.f.i(18, c43Var5.computeSize());
            }
            int e18 = e17 + b36.f.e(19, this.f372087w);
            java.lang.String str18 = this.f372088x;
            if (str18 != null) {
                e18 += b36.f.j(20, str18);
            }
            r45.c43 c43Var6 = this.f372089y;
            if (c43Var6 != null) {
                e18 += b36.f.i(21, c43Var6.computeSize());
            }
            int e19 = e18 + b36.f.e(22, this.f372090z);
            r45.m3 m3Var2 = this.A;
            if (m3Var2 != null) {
                e19 += b36.f.i(23, m3Var2.computeSize());
            }
            r45.zn znVar2 = this.B;
            if (znVar2 != null) {
                e19 += b36.f.i(24, znVar2.computeSize());
            }
            int g18 = e19 + b36.f.g(25, 1, linkedList);
            java.lang.String str19 = this.D;
            if (str19 != null) {
                g18 += b36.f.j(26, str19);
            }
            java.lang.String str20 = this.E;
            return str20 != null ? g18 + b36.f.j(27, str20) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.d43 d43Var = (r45.d43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.i96 i96Var = new r45.i96();
                    if (bArr2 != null && bArr2.length > 0) {
                        i96Var.parseFrom(bArr2);
                    }
                    d43Var.f372071d.add(i96Var);
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.x30 x30Var3 = new r45.x30();
                    if (bArr3 != null && bArr3.length > 0) {
                        x30Var3.parseFrom(bArr3);
                    }
                    d43Var.f372072e.add(x30Var3);
                }
                return 0;
            case 3:
                d43Var.f372073f = aVar2.k(intValue);
                return 0;
            case 4:
                d43Var.f372074g = aVar2.k(intValue);
                return 0;
            case 5:
            case 10:
            default:
                return -1;
            case 6:
                d43Var.f372075h = aVar2.i(intValue);
                return 0;
            case 7:
                d43Var.f372076i = aVar2.k(intValue);
                return 0;
            case 8:
                d43Var.f372077m = aVar2.k(intValue);
                return 0;
            case 9:
                d43Var.f372078n = aVar2.k(intValue);
                return 0;
            case 11:
                d43Var.f372079o = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.x30 x30Var4 = new r45.x30();
                    if (bArr4 != null && bArr4.length > 0) {
                        x30Var4.parseFrom(bArr4);
                    }
                    d43Var.f372080p = x30Var4;
                }
                return 0;
            case 13:
                d43Var.f372081q = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.gr0 gr0Var3 = new r45.gr0();
                    if (bArr5 != null && bArr5.length > 0) {
                        gr0Var3.parseFrom(bArr5);
                    }
                    d43Var.f372082r = gr0Var3;
                }
                return 0;
            case 15:
                d43Var.f372083s = aVar2.k(intValue);
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.wm4 wm4Var3 = new r45.wm4();
                    if (bArr6 != null && bArr6.length > 0) {
                        wm4Var3.parseFrom(bArr6);
                    }
                    d43Var.f372084t = wm4Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.c43 c43Var7 = new r45.c43();
                    if (bArr7 != null && bArr7.length > 0) {
                        c43Var7.parseFrom(bArr7);
                    }
                    d43Var.f372085u = c43Var7;
                }
                return 0;
            case 18:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.c43 c43Var8 = new r45.c43();
                    if (bArr8 != null && bArr8.length > 0) {
                        c43Var8.parseFrom(bArr8);
                    }
                    d43Var.f372086v = c43Var8;
                }
                return 0;
            case 19:
                d43Var.f372087w = aVar2.g(intValue);
                return 0;
            case 20:
                d43Var.f372088x = aVar2.k(intValue);
                return 0;
            case 21:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j38.get(i39);
                    r45.c43 c43Var9 = new r45.c43();
                    if (bArr9 != null && bArr9.length > 0) {
                        c43Var9.parseFrom(bArr9);
                    }
                    d43Var.f372089y = c43Var9;
                }
                return 0;
            case 22:
                d43Var.f372090z = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j39.get(i47);
                    r45.m3 m3Var3 = new r45.m3();
                    if (bArr10 != null && bArr10.length > 0) {
                        m3Var3.parseFrom(bArr10);
                    }
                    d43Var.A = m3Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j47.get(i48);
                    r45.zn znVar3 = new r45.zn();
                    if (bArr11 != null && bArr11.length > 0) {
                        znVar3.parseFrom(bArr11);
                    }
                    d43Var.B = znVar3;
                }
                return 0;
            case 25:
                d43Var.C.add(aVar2.k(intValue));
                return 0;
            case 26:
                d43Var.D = aVar2.k(intValue);
                return 0;
            case 27:
                d43Var.E = aVar2.k(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f372071d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "media_info", linkedList, false);
            eVar.d(jSONObject, "click_action_info", this.f372072e, false);
            eVar.d(jSONObject, "head_name", this.f372073f, false);
            eVar.d(jSONObject, "head_image", this.f372074g, false);
            eVar.d(jSONObject, "sns_ad_id", java.lang.Long.valueOf(this.f372075h), false);
            eVar.d(jSONObject, "ad_title", this.f372076i, false);
            eVar.d(jSONObject, "ad_desc", this.f372077m, false);
            eVar.d(jSONObject, "button_text", this.f372078n, false);
            eVar.d(jSONObject, "button_icon", this.f372079o, false);
            eVar.d(jSONObject, "button_click_action_info", this.f372080p, false);
            eVar.d(jSONObject, "style_type", java.lang.Integer.valueOf(this.f372081q), false);
            eVar.d(jSONObject, "feedback_info", this.f372082r, false);
            eVar.d(jSONObject, "left_top_title", this.f372083s, false);
            eVar.d(jSONObject, "minishop_data", this.f372084t, false);
            eVar.d(jSONObject, "desc_text_color", this.f372085u, false);
            eVar.d(jSONObject, "media_bg_color", this.f372086v, false);
            eVar.d(jSONObject, "multi_images_internal", java.lang.Integer.valueOf(this.f372087w), false);
            eVar.d(jSONObject, "button_icon_dark", this.f372088x, false);
            eVar.d(jSONObject, "button_text_color", this.f372089y, false);
            eVar.d(jSONObject, "to_ad_market", java.lang.Integer.valueOf(this.f372090z), false);
            eVar.d(jSONObject, "ad_market_jump", this.A, false);
            eVar.d(jSONObject, "brand_badge_info", this.B, false);
            eVar.d(jSONObject, "auxiliary_desc", this.C, false);
            eVar.d(jSONObject, "store_icon_url", this.D, false);
            eVar.d(jSONObject, "store_icon_url_dark", this.E, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
