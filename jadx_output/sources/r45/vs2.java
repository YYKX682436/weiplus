package r45;

/* loaded from: classes8.dex */
public class vs2 extends com.tencent.mm.protobuf.f {
    public r45.s30 A;
    public com.tencent.mm.protobuf.g B;
    public long C;

    /* renamed from: d, reason: collision with root package name */
    public int f388486d;

    /* renamed from: e, reason: collision with root package name */
    public int f388487e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388488f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f388489g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388490h;

    /* renamed from: i, reason: collision with root package name */
    public int f388491i;

    /* renamed from: m, reason: collision with root package name */
    public int f388492m;

    /* renamed from: n, reason: collision with root package name */
    public int f388493n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f388494o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f388495p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388496q;

    /* renamed from: r, reason: collision with root package name */
    public int f388497r;

    /* renamed from: s, reason: collision with root package name */
    public int f388498s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f388499t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f388500u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388501v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388502w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f388503x;

    /* renamed from: y, reason: collision with root package name */
    public int f388504y;

    /* renamed from: z, reason: collision with root package name */
    public int f388505z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vs2)) {
            return false;
        }
        r45.vs2 vs2Var = (r45.vs2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388486d), java.lang.Integer.valueOf(vs2Var.f388486d)) && n51.f.a(java.lang.Integer.valueOf(this.f388487e), java.lang.Integer.valueOf(vs2Var.f388487e)) && n51.f.a(this.f388488f, vs2Var.f388488f) && n51.f.a(this.f388489g, vs2Var.f388489g) && n51.f.a(this.f388490h, vs2Var.f388490h) && n51.f.a(java.lang.Integer.valueOf(this.f388491i), java.lang.Integer.valueOf(vs2Var.f388491i)) && n51.f.a(java.lang.Integer.valueOf(this.f388492m), java.lang.Integer.valueOf(vs2Var.f388492m)) && n51.f.a(java.lang.Integer.valueOf(this.f388493n), java.lang.Integer.valueOf(vs2Var.f388493n)) && n51.f.a(java.lang.Boolean.valueOf(this.f388494o), java.lang.Boolean.valueOf(vs2Var.f388494o)) && n51.f.a(this.f388495p, vs2Var.f388495p) && n51.f.a(this.f388496q, vs2Var.f388496q) && n51.f.a(java.lang.Integer.valueOf(this.f388497r), java.lang.Integer.valueOf(vs2Var.f388497r)) && n51.f.a(java.lang.Integer.valueOf(this.f388498s), java.lang.Integer.valueOf(vs2Var.f388498s)) && n51.f.a(this.f388499t, vs2Var.f388499t) && n51.f.a(this.f388500u, vs2Var.f388500u) && n51.f.a(this.f388501v, vs2Var.f388501v) && n51.f.a(this.f388502w, vs2Var.f388502w) && n51.f.a(this.f388503x, vs2Var.f388503x) && n51.f.a(java.lang.Integer.valueOf(this.f388504y), java.lang.Integer.valueOf(vs2Var.f388504y)) && n51.f.a(java.lang.Integer.valueOf(this.f388505z), java.lang.Integer.valueOf(vs2Var.f388505z)) && n51.f.a(this.A, vs2Var.A) && n51.f.a(this.B, vs2Var.B) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(vs2Var.C));
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
                        case -2057382891:
                            if (next.equals("save_Strategy")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case -1573145462:
                            if (next.equals("start_time")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1310739582:
                            if (next.equals("tips_id")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1306498449:
                            if (next.equals("extInfo")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -1278410919:
                            if (next.equals("feedId")) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case -1194943390:
                            if (next.equals("tips_uuid")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -1165461084:
                            if (next.equals(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY)) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1160326153:
                            if (next.equals("internal_feedback_url")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1159291097:
                            if (next.equals("clear_prev_reddot_feed_strategy")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case -521457284:
                            if (next.equals("session_bypass_info")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -96179731:
                            if (next.equals("expire_time")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 3575610:
                            if (next.equals("type")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 32264720:
                            if (next.equals("finder_sub_recall_type")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 243982663:
                            if (next.equals("reddot_expose_buff")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case 452971343:
                            if (next.equals("ignore_valid")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 506361563:
                            if (next.equals(ya.b.GROUP_ID)) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case 630087769:
                            if (next.equals("business_type")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case 823546702:
                            if (next.equals("ignore_display_tab_type")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 1116372419:
                            if (next.equals("show_infos")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1662551223:
                            if (next.equals("report_ctrl_info")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case 1675237852:
                            if (next.equals("self_finder_username")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1731475127:
                            if (next.equals("report_ext_info")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case 1745305302:
                            if (next.equals("live_sub_recall_type")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f388486d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f388487e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof java.lang.String) {
                                this.f388488f = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt, 0));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt2;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.f388489g;
                                        r45.f03 f03Var = new r45.f03();
                                        f03Var.fromJson(((org.json.JSONObject) obj).toString());
                                        linkedList.add(f03Var);
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            this.f388490h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f388491i = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            this.f388492m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f388493n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f388494o = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case '\t':
                            this.f388495p = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\n':
                            this.f388496q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f388497r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f388498s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\r':
                            this.f388499t = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 14:
                            this.f388500u = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 15:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (opt3 instanceof java.lang.String) {
                                this.f388501v = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt3, 0));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (opt4 instanceof java.lang.String) {
                                this.f388502w = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt4, 0));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            this.f388503x = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 18:
                            this.f388504y = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f388505z = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 20:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (opt5 instanceof org.json.JSONObject) {
                                r45.s30 s30Var = new r45.s30();
                                s30Var.fromJson(((org.json.JSONObject) opt5).toString());
                                this.A = s30Var;
                                break;
                            } else {
                                break;
                            }
                        case 21:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (opt6 instanceof java.lang.String) {
                                this.B = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt6, 0));
                                break;
                            } else {
                                break;
                            }
                        case 22:
                            this.C = jSONObject.optLong(next);
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
            fVar.e(1, this.f388486d);
            fVar.e(2, this.f388487e);
            com.tencent.mm.protobuf.g gVar = this.f388488f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, this.f388489g);
            java.lang.String str = this.f388490h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f388491i);
            fVar.e(7, this.f388492m);
            fVar.e(8, this.f388493n);
            fVar.a(9, this.f388494o);
            java.lang.String str2 = this.f388495p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f388496q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            fVar.e(12, this.f388497r);
            fVar.e(13, this.f388498s);
            java.lang.String str4 = this.f388499t;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f388500u;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388501v;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f388502w;
            if (gVar3 != null) {
                fVar.b(18, gVar3);
            }
            java.lang.String str6 = this.f388503x;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            fVar.e(20, this.f388504y);
            fVar.e(21, this.f388505z);
            r45.s30 s30Var = this.A;
            if (s30Var != null) {
                fVar.i(22, s30Var.computeSize());
                this.A.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar4 = this.B;
            if (gVar4 != null) {
                fVar.b(23, gVar4);
            }
            fVar.h(100, this.C);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388486d) + 0 + b36.f.e(2, this.f388487e);
            com.tencent.mm.protobuf.g gVar5 = this.f388488f;
            if (gVar5 != null) {
                e17 += b36.f.b(3, gVar5);
            }
            int g17 = e17 + b36.f.g(4, 8, this.f388489g);
            java.lang.String str7 = this.f388490h;
            if (str7 != null) {
                g17 += b36.f.j(5, str7);
            }
            int e18 = g17 + b36.f.e(6, this.f388491i) + b36.f.e(7, this.f388492m) + b36.f.e(8, this.f388493n) + b36.f.a(9, this.f388494o);
            java.lang.String str8 = this.f388495p;
            if (str8 != null) {
                e18 += b36.f.j(10, str8);
            }
            java.lang.String str9 = this.f388496q;
            if (str9 != null) {
                e18 += b36.f.j(11, str9);
            }
            int e19 = e18 + b36.f.e(12, this.f388497r) + b36.f.e(13, this.f388498s);
            java.lang.String str10 = this.f388499t;
            if (str10 != null) {
                e19 += b36.f.j(14, str10);
            }
            java.lang.String str11 = this.f388500u;
            if (str11 != null) {
                e19 += b36.f.j(15, str11);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f388501v;
            if (gVar6 != null) {
                e19 += b36.f.b(16, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f388502w;
            if (gVar7 != null) {
                e19 += b36.f.b(18, gVar7);
            }
            java.lang.String str12 = this.f388503x;
            if (str12 != null) {
                e19 += b36.f.j(19, str12);
            }
            int e27 = e19 + b36.f.e(20, this.f388504y) + b36.f.e(21, this.f388505z);
            r45.s30 s30Var2 = this.A;
            if (s30Var2 != null) {
                e27 += b36.f.i(22, s30Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar8 = this.B;
            if (gVar8 != null) {
                e27 += b36.f.b(23, gVar8);
            }
            return e27 + b36.f.h(100, this.C);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388489g.clear();
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
        r45.vs2 vs2Var = (r45.vs2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            vs2Var.C = aVar2.i(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                vs2Var.f388486d = aVar2.g(intValue);
                return 0;
            case 2:
                vs2Var.f388487e = aVar2.g(intValue);
                return 0;
            case 3:
                vs2Var.f388488f = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.f03 f03Var = new r45.f03();
                    if (bArr2 != null && bArr2.length > 0) {
                        f03Var.parseFrom(bArr2);
                    }
                    vs2Var.f388489g.add(f03Var);
                }
                return 0;
            case 5:
                vs2Var.f388490h = aVar2.k(intValue);
                return 0;
            case 6:
                vs2Var.f388491i = aVar2.g(intValue);
                return 0;
            case 7:
                vs2Var.f388492m = aVar2.g(intValue);
                return 0;
            case 8:
                vs2Var.f388493n = aVar2.g(intValue);
                return 0;
            case 9:
                vs2Var.f388494o = aVar2.c(intValue);
                return 0;
            case 10:
                vs2Var.f388495p = aVar2.k(intValue);
                return 0;
            case 11:
                vs2Var.f388496q = aVar2.k(intValue);
                return 0;
            case 12:
                vs2Var.f388497r = aVar2.g(intValue);
                return 0;
            case 13:
                vs2Var.f388498s = aVar2.g(intValue);
                return 0;
            case 14:
                vs2Var.f388499t = aVar2.k(intValue);
                return 0;
            case 15:
                vs2Var.f388500u = aVar2.k(intValue);
                return 0;
            case 16:
                vs2Var.f388501v = aVar2.d(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 18:
                        vs2Var.f388502w = aVar2.d(intValue);
                        return 0;
                    case 19:
                        vs2Var.f388503x = aVar2.k(intValue);
                        return 0;
                    case 20:
                        vs2Var.f388504y = aVar2.g(intValue);
                        return 0;
                    case 21:
                        vs2Var.f388505z = aVar2.g(intValue);
                        return 0;
                    case 22:
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size2 = j18.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr3 = (byte[]) j18.get(i19);
                            r45.s30 s30Var3 = new r45.s30();
                            if (bArr3 != null && bArr3.length > 0) {
                                s30Var3.parseFrom(bArr3);
                            }
                            vs2Var.A = s30Var3;
                        }
                        return 0;
                    case 23:
                        vs2Var.B = aVar2.d(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f388486d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, valueOf, true);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f388487e), true);
            eVar.d(jSONObject, "extInfo", this.f388488f, true);
            eVar.d(jSONObject, "show_infos", this.f388489g, true);
            eVar.d(jSONObject, "tips_id", this.f388490h, true);
            eVar.d(jSONObject, "expire_time", java.lang.Integer.valueOf(this.f388491i), true);
            eVar.d(jSONObject, "start_time", java.lang.Integer.valueOf(this.f388492m), true);
            eVar.d(jSONObject, "ignore_display_tab_type", java.lang.Integer.valueOf(this.f388493n), true);
            eVar.d(jSONObject, "ignore_valid", java.lang.Boolean.valueOf(this.f388494o), true);
            eVar.d(jSONObject, "internal_feedback_url", this.f388495p, true);
            eVar.d(jSONObject, "self_finder_username", this.f388496q, true);
            eVar.d(jSONObject, "finder_sub_recall_type", java.lang.Integer.valueOf(this.f388497r), true);
            eVar.d(jSONObject, "live_sub_recall_type", java.lang.Integer.valueOf(this.f388498s), true);
            eVar.d(jSONObject, "report_ext_info", this.f388499t, true);
            eVar.d(jSONObject, ya.b.GROUP_ID, this.f388500u, true);
            eVar.d(jSONObject, "report_ctrl_info", this.f388501v, true);
            eVar.d(jSONObject, "session_bypass_info", this.f388502w, true);
            eVar.d(jSONObject, "tips_uuid", this.f388503x, true);
            eVar.d(jSONObject, "save_Strategy", java.lang.Integer.valueOf(this.f388504y), true);
            eVar.d(jSONObject, "business_type", java.lang.Integer.valueOf(this.f388505z), true);
            eVar.d(jSONObject, "clear_prev_reddot_feed_strategy", this.A, true);
            eVar.d(jSONObject, "reddot_expose_buff", this.B, true);
            eVar.d(jSONObject, "feedId", java.lang.Long.valueOf(this.C), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
