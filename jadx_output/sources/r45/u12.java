package r45;

/* loaded from: classes4.dex */
public class u12 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386927d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386928e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386929f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386930g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386931h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386932i;

    /* renamed from: m, reason: collision with root package name */
    public int f386933m;

    /* renamed from: n, reason: collision with root package name */
    public int f386934n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f386935o;

    /* renamed from: p, reason: collision with root package name */
    public r45.v12 f386936p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f386937q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f386938r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f386939s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public r45.w12 f386940t;

    /* renamed from: u, reason: collision with root package name */
    public r45.x12 f386941u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u12)) {
            return false;
        }
        r45.u12 u12Var = (r45.u12) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386927d), java.lang.Integer.valueOf(u12Var.f386927d)) && n51.f.a(this.f386928e, u12Var.f386928e) && n51.f.a(this.f386929f, u12Var.f386929f) && n51.f.a(this.f386930g, u12Var.f386930g) && n51.f.a(this.f386931h, u12Var.f386931h) && n51.f.a(this.f386932i, u12Var.f386932i) && n51.f.a(java.lang.Integer.valueOf(this.f386933m), java.lang.Integer.valueOf(u12Var.f386933m)) && n51.f.a(java.lang.Integer.valueOf(this.f386934n), java.lang.Integer.valueOf(u12Var.f386934n)) && n51.f.a(this.f386935o, u12Var.f386935o) && n51.f.a(this.f386936p, u12Var.f386936p) && n51.f.a(this.f386937q, u12Var.f386937q) && n51.f.a(this.f386938r, u12Var.f386938r) && n51.f.a(this.f386939s, u12Var.f386939s) && n51.f.a(this.f386940t, u12Var.f386940t) && n51.f.a(this.f386941u, u12Var.f386941u);
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
                        case -1859247178:
                            if (next.equals("short_content")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -1826570228:
                            if (next.equals("ext_info")) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case -1390617967:
                            if (next.equals("icon_name")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -737588055:
                            if (next.equals("icon_url")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -721465274:
                            if (next.equals("ui_style")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -309891265:
                            if (next.equals("appeal_page")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case -246880039:
                            if (next.equals("report_info")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case -95350749:
                            if (next.equals("show_placement")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 3575610:
                            if (next.equals("type")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 89413836:
                            if (next.equals("bottompopup_info")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 831592612:
                            if (next.equals("content_list")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case 951530617:
                            if (next.equals("content")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1292959499:
                            if (next.equals("button_title")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1919815089:
                            if (next.equals("alert_info")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f386927d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f386928e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f386929f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f386930g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f386931h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f386932i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f386933m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f386934n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f386935o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONObject) {
                                r45.v12 v12Var = new r45.v12();
                                v12Var.fromJson(((org.json.JSONObject) opt).toString());
                                this.f386936p = v12Var;
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof org.json.JSONObject) {
                                this.f386937q = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) new com.tencent.mm.protocal.protobuf.FinderJumpInfo().fromJson(((org.json.JSONObject) opt2).toString());
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            this.f386938r = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\f':
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (opt3 instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt3;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    this.f386939s.add((java.lang.String) jSONArray.get(i17));
                                }
                                break;
                            } else {
                                break;
                            }
                        case '\r':
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (opt4 instanceof org.json.JSONObject) {
                                r45.w12 w12Var = new r45.w12();
                                w12Var.fromJson(((org.json.JSONObject) opt4).toString());
                                this.f386940t = w12Var;
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (opt5 instanceof org.json.JSONObject) {
                                r45.x12 x12Var = new r45.x12();
                                x12Var.fromJson(((org.json.JSONObject) opt5).toString());
                                this.f386941u = x12Var;
                                break;
                            } else {
                                break;
                            }
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
            fVar.e(1, this.f386927d);
            java.lang.String str = this.f386928e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386929f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386930g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386931h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f386932i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f386933m);
            fVar.e(8, this.f386934n);
            java.lang.String str6 = this.f386935o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            r45.v12 v12Var = this.f386936p;
            if (v12Var != null) {
                fVar.i(10, v12Var.computeSize());
                this.f386936p.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f386937q;
            if (finderJumpInfo != null) {
                fVar.i(11, finderJumpInfo.computeSize());
                this.f386937q.writeFields(fVar);
            }
            java.lang.String str7 = this.f386938r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.g(13, 1, this.f386939s);
            r45.w12 w12Var = this.f386940t;
            if (w12Var != null) {
                fVar.i(14, w12Var.computeSize());
                this.f386940t.writeFields(fVar);
            }
            r45.x12 x12Var = this.f386941u;
            if (x12Var != null) {
                fVar.i(15, x12Var.computeSize());
                this.f386941u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386927d) + 0;
            java.lang.String str8 = this.f386928e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f386929f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f386930g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f386931h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f386932i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            int e18 = e17 + b36.f.e(7, this.f386933m) + b36.f.e(8, this.f386934n);
            java.lang.String str13 = this.f386935o;
            if (str13 != null) {
                e18 += b36.f.j(9, str13);
            }
            r45.v12 v12Var2 = this.f386936p;
            if (v12Var2 != null) {
                e18 += b36.f.i(10, v12Var2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.f386937q;
            if (finderJumpInfo2 != null) {
                e18 += b36.f.i(11, finderJumpInfo2.computeSize());
            }
            java.lang.String str14 = this.f386938r;
            if (str14 != null) {
                e18 += b36.f.j(12, str14);
            }
            int g17 = e18 + b36.f.g(13, 1, this.f386939s);
            r45.w12 w12Var2 = this.f386940t;
            if (w12Var2 != null) {
                g17 += b36.f.i(14, w12Var2.computeSize());
            }
            r45.x12 x12Var2 = this.f386941u;
            return x12Var2 != null ? g17 + b36.f.i(15, x12Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386939s.clear();
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
        r45.u12 u12Var = (r45.u12) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                u12Var.f386927d = aVar2.g(intValue);
                return 0;
            case 2:
                u12Var.f386928e = aVar2.k(intValue);
                return 0;
            case 3:
                u12Var.f386929f = aVar2.k(intValue);
                return 0;
            case 4:
                u12Var.f386930g = aVar2.k(intValue);
                return 0;
            case 5:
                u12Var.f386931h = aVar2.k(intValue);
                return 0;
            case 6:
                u12Var.f386932i = aVar2.k(intValue);
                return 0;
            case 7:
                u12Var.f386933m = aVar2.g(intValue);
                return 0;
            case 8:
                u12Var.f386934n = aVar2.g(intValue);
                return 0;
            case 9:
                u12Var.f386935o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.v12 v12Var3 = new r45.v12();
                    if (bArr2 != null && bArr2.length > 0) {
                        v12Var3.parseFrom(bArr2);
                    }
                    u12Var.f386936p = v12Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderJumpInfo3.parseFrom(bArr3);
                    }
                    u12Var.f386937q = finderJumpInfo3;
                }
                return 0;
            case 12:
                u12Var.f386938r = aVar2.k(intValue);
                return 0;
            case 13:
                u12Var.f386939s.add(aVar2.k(intValue));
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.w12 w12Var3 = new r45.w12();
                    if (bArr4 != null && bArr4.length > 0) {
                        w12Var3.parseFrom(bArr4);
                    }
                    u12Var.f386940t = w12Var3;
                }
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.x12 x12Var3 = new r45.x12();
                    if (bArr5 != null && bArr5.length > 0) {
                        x12Var3.parseFrom(bArr5);
                    }
                    u12Var.f386941u = x12Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f386927d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "type", valueOf, true);
            eVar.d(jSONObject, "icon_name", this.f386928e, true);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f386929f, true);
            eVar.d(jSONObject, "content", this.f386930g, true);
            eVar.d(jSONObject, "button_title", this.f386931h, true);
            eVar.d(jSONObject, "icon_url", this.f386932i, true);
            eVar.d(jSONObject, "show_placement", java.lang.Integer.valueOf(this.f386933m), true);
            eVar.d(jSONObject, "ui_style", java.lang.Integer.valueOf(this.f386934n), true);
            eVar.d(jSONObject, "short_content", this.f386935o, true);
            eVar.d(jSONObject, "alert_info", this.f386936p, true);
            eVar.d(jSONObject, "appeal_page", this.f386937q, true);
            eVar.d(jSONObject, "report_info", this.f386938r, true);
            eVar.d(jSONObject, "content_list", this.f386939s, true);
            eVar.d(jSONObject, "bottompopup_info", this.f386940t, true);
            eVar.d(jSONObject, "ext_info", this.f386941u, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
