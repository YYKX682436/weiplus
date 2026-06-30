package r45;

/* loaded from: classes2.dex */
public class f03 extends com.tencent.mm.protobuf.f {
    public int A;
    public r45.ya0 B;
    public java.lang.String C;
    public r45.hp2 E;
    public r45.uy3 F;
    public int G;
    public java.lang.String H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f373886J;

    /* renamed from: d, reason: collision with root package name */
    public int f373887d;

    /* renamed from: e, reason: collision with root package name */
    public int f373888e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373889f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373890g;

    /* renamed from: h, reason: collision with root package name */
    public int f373891h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373892i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373893m;

    /* renamed from: n, reason: collision with root package name */
    public int f373894n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373895o;

    /* renamed from: q, reason: collision with root package name */
    public r45.q40 f373897q;

    /* renamed from: r, reason: collision with root package name */
    public int f373898r;

    /* renamed from: s, reason: collision with root package name */
    public int f373899s;

    /* renamed from: t, reason: collision with root package name */
    public int f373900t;

    /* renamed from: u, reason: collision with root package name */
    public int f373901u;

    /* renamed from: v, reason: collision with root package name */
    public int f373902v;

    /* renamed from: w, reason: collision with root package name */
    public r45.ry3 f373903w;

    /* renamed from: x, reason: collision with root package name */
    public r45.lb f373904x;

    /* renamed from: y, reason: collision with root package name */
    public int f373905y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f373906z;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f373896p = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f03)) {
            return false;
        }
        r45.f03 f03Var = (r45.f03) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373887d), java.lang.Integer.valueOf(f03Var.f373887d)) && n51.f.a(java.lang.Integer.valueOf(this.f373888e), java.lang.Integer.valueOf(f03Var.f373888e)) && n51.f.a(this.f373889f, f03Var.f373889f) && n51.f.a(this.f373890g, f03Var.f373890g) && n51.f.a(java.lang.Integer.valueOf(this.f373891h), java.lang.Integer.valueOf(f03Var.f373891h)) && n51.f.a(this.f373892i, f03Var.f373892i) && n51.f.a(this.f373893m, f03Var.f373893m) && n51.f.a(java.lang.Integer.valueOf(this.f373894n), java.lang.Integer.valueOf(f03Var.f373894n)) && n51.f.a(this.f373895o, f03Var.f373895o) && n51.f.a(this.f373896p, f03Var.f373896p) && n51.f.a(this.f373897q, f03Var.f373897q) && n51.f.a(java.lang.Integer.valueOf(this.f373898r), java.lang.Integer.valueOf(f03Var.f373898r)) && n51.f.a(java.lang.Integer.valueOf(this.f373899s), java.lang.Integer.valueOf(f03Var.f373899s)) && n51.f.a(java.lang.Integer.valueOf(this.f373900t), java.lang.Integer.valueOf(f03Var.f373900t)) && n51.f.a(java.lang.Integer.valueOf(this.f373901u), java.lang.Integer.valueOf(f03Var.f373901u)) && n51.f.a(java.lang.Integer.valueOf(this.f373902v), java.lang.Integer.valueOf(f03Var.f373902v)) && n51.f.a(this.f373903w, f03Var.f373903w) && n51.f.a(this.f373904x, f03Var.f373904x) && n51.f.a(java.lang.Integer.valueOf(this.f373905y), java.lang.Integer.valueOf(f03Var.f373905y)) && n51.f.a(this.f373906z, f03Var.f373906z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(f03Var.A)) && n51.f.a(this.B, f03Var.B) && n51.f.a(this.C, f03Var.C) && n51.f.a(this.D, f03Var.D) && n51.f.a(this.E, f03Var.E) && n51.f.a(this.F, f03Var.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(f03Var.G)) && n51.f.a(this.H, f03Var.H) && n51.f.a(java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(f03Var.I)) && n51.f.a(java.lang.Integer.valueOf(this.f373886J), java.lang.Integer.valueOf(f03Var.f373886J));
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
                        case -1971861220:
                            if (next.equals("attributeTitle")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -1903312068:
                            if (next.equals("show_type")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1806115381:
                            if (next.equals("show_ext_info_type")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1766717118:
                            if (next.equals("client_stats_info")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case -1613589672:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case -995424086:
                            if (next.equals("parent")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -959795941:
                            if (next.equals("iconConfig")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -737588055:
                            if (next.equals("icon_url")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -732792340:
                            if (next.equals("clear_type")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -331061934:
                            if (next.equals("expose_limit_strategy")) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case -265713450:
                            if (next.equals(dm.i4.COL_USERNAME)) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -179985264:
                            if (next.equals("expose_count_limit")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case -86367474:
                            if (next.equals("show_ext_info")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -66538571:
                            if (next.equals("big_card_image_size")) {
                                c17 = 25;
                                break;
                            }
                            break;
                        case -42298471:
                            if (next.equals("sub_title")) {
                                c17 = 27;
                                break;
                            }
                            break;
                        case -21125788:
                            if (next.equals("multi_icon_urls")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 3433509:
                            if (next.equals(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 94851343:
                            if (next.equals("count")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 685162667:
                            if (next.equals("jump_type")) {
                                c17 = 29;
                                break;
                            }
                            break;
                        case 863214435:
                            if (next.equals("swipe_down_revoke_config")) {
                                c17 = 23;
                                break;
                            }
                            break;
                        case 1015999425:
                            if (next.equals("ignore_freq_limit")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case 1099718262:
                            if (next.equals("show_live_tab_id")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 1190518468:
                            if (next.equals("finder_popup_show_info")) {
                                c17 = 24;
                                break;
                            }
                            break;
                        case 1215103539:
                            if (next.equals("coldTimeLevel")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case 1454732984:
                            if (next.equals("cacheChangeTabOption")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case 1649412936:
                            if (next.equals("cold_time")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case 1755731442:
                            if (next.equals("expose_expire_time")) {
                                c17 = 26;
                                break;
                            }
                            break;
                        case 2008265139:
                            if (next.equals("dslRender")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case 2048598888:
                            if (next.equals("is_exempt_nm_control")) {
                                c17 = 28;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f373887d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f373888e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f373889f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f373890g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f373891h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f373892i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f373893m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f373894n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f373895o = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt, 0));
                                break;
                            }
                        case '\t':
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt2;
                                while (i17 < jSONArray.length()) {
                                    this.f373896p.add((java.lang.String) jSONArray.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case '\n':
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.q40 q40Var = new r45.q40();
                                q40Var.fromJson(((org.json.JSONObject) opt3).toString());
                                this.f373897q = q40Var;
                                break;
                            }
                        case 11:
                            this.f373898r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f373899s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\r':
                            this.f373900t = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 14:
                            this.f373901u = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 15:
                            this.f373902v = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.ry3 ry3Var = new r45.ry3();
                                ry3Var.fromJson(((org.json.JSONObject) opt4).toString());
                                this.f373903w = ry3Var;
                                break;
                            }
                        case 17:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.lb lbVar = new r45.lb();
                                lbVar.fromJson(((org.json.JSONObject) opt5).toString());
                                this.f373904x = lbVar;
                                break;
                            }
                        case 18:
                            this.f373905y = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f373906z = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 20:
                            this.A = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 21:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.ya0 ya0Var = new r45.ya0();
                                ya0Var.fromJson(((org.json.JSONObject) opt6).toString());
                                this.B = ya0Var;
                                break;
                            }
                        case 22:
                            this.C = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 23:
                            java.lang.Object opt7 = jSONObject.opt(next);
                            if (!(opt7 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt7;
                                while (i17 < jSONArray2.length()) {
                                    java.lang.Object obj = jSONArray2.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.D;
                                        r45.ii6 ii6Var = new r45.ii6();
                                        ii6Var.fromJson(((org.json.JSONObject) obj).toString());
                                        linkedList.add(ii6Var);
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case 24:
                            java.lang.Object opt8 = jSONObject.opt(next);
                            if (!(opt8 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.hp2 hp2Var = new r45.hp2();
                                hp2Var.fromJson(((org.json.JSONObject) opt8).toString());
                                this.E = hp2Var;
                                break;
                            }
                        case 25:
                            java.lang.Object opt9 = jSONObject.opt(next);
                            if (!(opt9 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.uy3 uy3Var = new r45.uy3();
                                uy3Var.fromJson(((org.json.JSONObject) opt9).toString());
                                this.F = uy3Var;
                                break;
                            }
                        case 26:
                            this.G = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 27:
                            this.H = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 28:
                            this.I = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case 29:
                            this.f373886J = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
        java.util.LinkedList linkedList = this.D;
        java.util.LinkedList linkedList2 = this.f373896p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373887d);
            fVar.e(2, this.f373888e);
            java.lang.String str = this.f373889f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f373890g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f373891h);
            java.lang.String str3 = this.f373892i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f373893m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f373894n);
            com.tencent.mm.protobuf.g gVar = this.f373895o;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            fVar.g(10, 1, linkedList2);
            r45.q40 q40Var = this.f373897q;
            if (q40Var != null) {
                fVar.i(11, q40Var.computeSize());
                this.f373897q.writeFields(fVar);
            }
            fVar.e(12, this.f373898r);
            fVar.e(13, this.f373899s);
            fVar.e(14, this.f373900t);
            fVar.e(15, this.f373901u);
            fVar.e(16, this.f373902v);
            r45.ry3 ry3Var = this.f373903w;
            if (ry3Var != null) {
                fVar.i(17, ry3Var.computeSize());
                this.f373903w.writeFields(fVar);
            }
            r45.lb lbVar = this.f373904x;
            if (lbVar != null) {
                fVar.i(18, lbVar.computeSize());
                this.f373904x.writeFields(fVar);
            }
            fVar.e(19, this.f373905y);
            java.lang.String str5 = this.f373906z;
            if (str5 != null) {
                fVar.j(20, str5);
            }
            fVar.e(21, this.A);
            r45.ya0 ya0Var = this.B;
            if (ya0Var != null) {
                fVar.i(22, ya0Var.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str6 = this.C;
            if (str6 != null) {
                fVar.j(23, str6);
            }
            fVar.g(24, 8, linkedList);
            r45.hp2 hp2Var = this.E;
            if (hp2Var != null) {
                fVar.i(25, hp2Var.computeSize());
                this.E.writeFields(fVar);
            }
            r45.uy3 uy3Var = this.F;
            if (uy3Var != null) {
                fVar.i(26, uy3Var.computeSize());
                this.F.writeFields(fVar);
            }
            fVar.e(27, this.G);
            java.lang.String str7 = this.H;
            if (str7 != null) {
                fVar.j(28, str7);
            }
            fVar.a(29, this.I);
            fVar.e(30, this.f373886J);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373887d) + 0 + b36.f.e(2, this.f373888e);
            java.lang.String str8 = this.f373889f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f373890g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            int e18 = e17 + b36.f.e(5, this.f373891h);
            java.lang.String str10 = this.f373892i;
            if (str10 != null) {
                e18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f373893m;
            if (str11 != null) {
                e18 += b36.f.j(7, str11);
            }
            int e19 = e18 + b36.f.e(8, this.f373894n);
            com.tencent.mm.protobuf.g gVar2 = this.f373895o;
            if (gVar2 != null) {
                e19 += b36.f.b(9, gVar2);
            }
            int g17 = e19 + b36.f.g(10, 1, linkedList2);
            r45.q40 q40Var2 = this.f373897q;
            if (q40Var2 != null) {
                g17 += b36.f.i(11, q40Var2.computeSize());
            }
            int e27 = g17 + b36.f.e(12, this.f373898r) + b36.f.e(13, this.f373899s) + b36.f.e(14, this.f373900t) + b36.f.e(15, this.f373901u) + b36.f.e(16, this.f373902v);
            r45.ry3 ry3Var2 = this.f373903w;
            if (ry3Var2 != null) {
                e27 += b36.f.i(17, ry3Var2.computeSize());
            }
            r45.lb lbVar2 = this.f373904x;
            if (lbVar2 != null) {
                e27 += b36.f.i(18, lbVar2.computeSize());
            }
            int e28 = e27 + b36.f.e(19, this.f373905y);
            java.lang.String str12 = this.f373906z;
            if (str12 != null) {
                e28 += b36.f.j(20, str12);
            }
            int e29 = e28 + b36.f.e(21, this.A);
            r45.ya0 ya0Var2 = this.B;
            if (ya0Var2 != null) {
                e29 += b36.f.i(22, ya0Var2.computeSize());
            }
            java.lang.String str13 = this.C;
            if (str13 != null) {
                e29 += b36.f.j(23, str13);
            }
            int g18 = e29 + b36.f.g(24, 8, linkedList);
            r45.hp2 hp2Var2 = this.E;
            if (hp2Var2 != null) {
                g18 += b36.f.i(25, hp2Var2.computeSize());
            }
            r45.uy3 uy3Var2 = this.F;
            if (uy3Var2 != null) {
                g18 += b36.f.i(26, uy3Var2.computeSize());
            }
            int e37 = g18 + b36.f.e(27, this.G);
            java.lang.String str14 = this.H;
            if (str14 != null) {
                e37 += b36.f.j(28, str14);
            }
            return e37 + b36.f.a(29, this.I) + b36.f.e(30, this.f373886J);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.f03 f03Var = (r45.f03) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f03Var.f373887d = aVar2.g(intValue);
                return 0;
            case 2:
                f03Var.f373888e = aVar2.g(intValue);
                return 0;
            case 3:
                f03Var.f373889f = aVar2.k(intValue);
                return 0;
            case 4:
                f03Var.f373890g = aVar2.k(intValue);
                return 0;
            case 5:
                f03Var.f373891h = aVar2.g(intValue);
                return 0;
            case 6:
                f03Var.f373892i = aVar2.k(intValue);
                return 0;
            case 7:
                f03Var.f373893m = aVar2.k(intValue);
                return 0;
            case 8:
                f03Var.f373894n = aVar2.g(intValue);
                return 0;
            case 9:
                f03Var.f373895o = aVar2.d(intValue);
                return 0;
            case 10:
                f03Var.f373896p.add(aVar2.k(intValue));
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.q40 q40Var3 = new r45.q40();
                    if (bArr2 != null && bArr2.length > 0) {
                        q40Var3.parseFrom(bArr2);
                    }
                    f03Var.f373897q = q40Var3;
                }
                return 0;
            case 12:
                f03Var.f373898r = aVar2.g(intValue);
                return 0;
            case 13:
                f03Var.f373899s = aVar2.g(intValue);
                return 0;
            case 14:
                f03Var.f373900t = aVar2.g(intValue);
                return 0;
            case 15:
                f03Var.f373901u = aVar2.g(intValue);
                return 0;
            case 16:
                f03Var.f373902v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ry3 ry3Var3 = new r45.ry3();
                    if (bArr3 != null && bArr3.length > 0) {
                        ry3Var3.parseFrom(bArr3);
                    }
                    f03Var.f373903w = ry3Var3;
                }
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.lb lbVar3 = new r45.lb();
                    if (bArr4 != null && bArr4.length > 0) {
                        lbVar3.parseFrom(bArr4);
                    }
                    f03Var.f373904x = lbVar3;
                }
                return 0;
            case 19:
                f03Var.f373905y = aVar2.g(intValue);
                return 0;
            case 20:
                f03Var.f373906z = aVar2.k(intValue);
                return 0;
            case 21:
                f03Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ya0 ya0Var3 = new r45.ya0();
                    if (bArr5 != null && bArr5.length > 0) {
                        ya0Var3.parseFrom(bArr5);
                    }
                    f03Var.B = ya0Var3;
                }
                return 0;
            case 23:
                f03Var.C = aVar2.k(intValue);
                return 0;
            case 24:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.ii6 ii6Var = new r45.ii6();
                    if (bArr6 != null && bArr6.length > 0) {
                        ii6Var.parseFrom(bArr6);
                    }
                    f03Var.D.add(ii6Var);
                }
                return 0;
            case 25:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.hp2 hp2Var3 = new r45.hp2();
                    if (bArr7 != null && bArr7.length > 0) {
                        hp2Var3.parseFrom(bArr7);
                    }
                    f03Var.E = hp2Var3;
                }
                return 0;
            case 26:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.uy3 uy3Var3 = new r45.uy3();
                    if (bArr8 != null && bArr8.length > 0) {
                        uy3Var3.parseFrom(bArr8);
                    }
                    f03Var.F = uy3Var3;
                }
                return 0;
            case 27:
                f03Var.G = aVar2.g(intValue);
                return 0;
            case 28:
                f03Var.H = aVar2.k(intValue);
                return 0;
            case 29:
                f03Var.I = aVar2.c(intValue);
                return 0;
            case 30:
                f03Var.f373886J = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f373887d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "show_type", valueOf, true);
            eVar.d(jSONObject, "count", java.lang.Integer.valueOf(this.f373888e), true);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f373889f, true);
            eVar.d(jSONObject, "icon_url", this.f373890g, true);
            eVar.d(jSONObject, "clear_type", java.lang.Integer.valueOf(this.f373891h), true);
            eVar.d(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f373892i, true);
            eVar.d(jSONObject, "parent", this.f373893m, true);
            eVar.d(jSONObject, "show_ext_info_type", java.lang.Integer.valueOf(this.f373894n), true);
            eVar.d(jSONObject, "show_ext_info", this.f373895o, true);
            eVar.d(jSONObject, "multi_icon_urls", this.f373896p, true);
            eVar.d(jSONObject, "client_stats_info", this.f373897q, true);
            eVar.d(jSONObject, "show_live_tab_id", java.lang.Integer.valueOf(this.f373898r), true);
            eVar.d(jSONObject, "ignore_freq_limit", java.lang.Integer.valueOf(this.f373899s), true);
            eVar.d(jSONObject, "expose_count_limit", java.lang.Integer.valueOf(this.f373900t), true);
            eVar.d(jSONObject, "expose_limit_strategy", java.lang.Integer.valueOf(this.f373901u), true);
            eVar.d(jSONObject, "cold_time", java.lang.Integer.valueOf(this.f373902v), true);
            eVar.d(jSONObject, "iconConfig", this.f373903w, true);
            eVar.d(jSONObject, "attributeTitle", this.f373904x, true);
            eVar.d(jSONObject, "cacheChangeTabOption", java.lang.Integer.valueOf(this.f373905y), true);
            eVar.d(jSONObject, dm.i4.COL_USERNAME, this.f373906z, true);
            eVar.d(jSONObject, "coldTimeLevel", java.lang.Integer.valueOf(this.A), true);
            eVar.d(jSONObject, "dslRender", this.B, true);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.C, true);
            eVar.d(jSONObject, "swipe_down_revoke_config", this.D, true);
            eVar.d(jSONObject, "finder_popup_show_info", this.E, true);
            eVar.d(jSONObject, "big_card_image_size", this.F, true);
            eVar.d(jSONObject, "expose_expire_time", java.lang.Integer.valueOf(this.G), true);
            eVar.d(jSONObject, "sub_title", this.H, true);
            eVar.d(jSONObject, "is_exempt_nm_control", java.lang.Boolean.valueOf(this.I), true);
            eVar.d(jSONObject, "jump_type", java.lang.Integer.valueOf(this.f373886J), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
