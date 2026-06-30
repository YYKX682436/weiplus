package r45;

/* loaded from: classes10.dex */
public class dx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372832e;

    /* renamed from: f, reason: collision with root package name */
    public int f372833f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372834g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g05 f372835h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372836i;

    /* renamed from: m, reason: collision with root package name */
    public int f372837m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372838n;

    /* renamed from: o, reason: collision with root package name */
    public r45.fw5 f372839o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dx5)) {
            return false;
        }
        r45.dx5 dx5Var = (r45.dx5) fVar;
        return n51.f.a(this.f372831d, dx5Var.f372831d) && n51.f.a(this.f372832e, dx5Var.f372832e) && n51.f.a(java.lang.Integer.valueOf(this.f372833f), java.lang.Integer.valueOf(dx5Var.f372833f)) && n51.f.a(this.f372834g, dx5Var.f372834g) && n51.f.a(this.f372835h, dx5Var.f372835h) && n51.f.a(this.f372836i, dx5Var.f372836i) && n51.f.a(java.lang.Integer.valueOf(this.f372837m), java.lang.Integer.valueOf(dx5Var.f372837m)) && n51.f.a(this.f372838n, dx5Var.f372838n) && n51.f.a(this.f372839o, dx5Var.f372839o);
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
                        case -1569063082:
                            if (next.equals("openim_finder_info")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1125980387:
                            if (next.equals("tp_type")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -1101837319:
                            if (next.equals("search_contact_context")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -1068855134:
                            if (next.equals("mobile")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 116079:
                            if (next.equals("url")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 109254796:
                            if (next.equals(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 171880113:
                            if (next.equals("tp_qrcode")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 253328057:
                            if (next.equals("spam_context")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 893190521:
                            if (next.equals("tp_multi_user_qrcode")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f372831d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f372832e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f372833f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f372834g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.g05 g05Var = new r45.g05();
                                g05Var.fromJson(((org.json.JSONObject) opt).toString());
                                this.f372835h = g05Var;
                                break;
                            }
                        case 5:
                            this.f372836i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f372837m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f372838n = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt2, 0));
                                break;
                            }
                        case '\b':
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.fw5 fw5Var = new r45.fw5();
                                fw5Var.fromJson(((org.json.JSONObject) opt3).toString());
                                this.f372839o = fw5Var;
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
            java.lang.String str = this.f372831d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372832e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f372833f);
            java.lang.String str3 = this.f372834g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.g05 g05Var = this.f372835h;
            if (g05Var != null) {
                fVar.i(5, g05Var.computeSize());
                this.f372835h.writeFields(fVar);
            }
            java.lang.String str4 = this.f372836i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f372837m);
            com.tencent.mm.protobuf.g gVar = this.f372838n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            r45.fw5 fw5Var = this.f372839o;
            if (fw5Var != null) {
                fVar.i(9, fw5Var.computeSize());
                this.f372839o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f372831d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f372832e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f372833f);
            java.lang.String str7 = this.f372834g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            r45.g05 g05Var2 = this.f372835h;
            if (g05Var2 != null) {
                e17 += b36.f.i(5, g05Var2.computeSize());
            }
            java.lang.String str8 = this.f372836i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int e18 = e17 + b36.f.e(7, this.f372837m);
            com.tencent.mm.protobuf.g gVar2 = this.f372838n;
            if (gVar2 != null) {
                e18 += b36.f.b(8, gVar2);
            }
            r45.fw5 fw5Var2 = this.f372839o;
            return fw5Var2 != null ? e18 + b36.f.i(9, fw5Var2.computeSize()) : e18;
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
        r45.dx5 dx5Var = (r45.dx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dx5Var.f372831d = aVar2.k(intValue);
                return 0;
            case 2:
                dx5Var.f372832e = aVar2.k(intValue);
                return 0;
            case 3:
                dx5Var.f372833f = aVar2.g(intValue);
                return 0;
            case 4:
                dx5Var.f372834g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.g05 g05Var3 = new r45.g05();
                    if (bArr != null && bArr.length > 0) {
                        g05Var3.parseFrom(bArr);
                    }
                    dx5Var.f372835h = g05Var3;
                }
                return 0;
            case 6:
                dx5Var.f372836i = aVar2.k(intValue);
                return 0;
            case 7:
                dx5Var.f372837m = aVar2.g(intValue);
                return 0;
            case 8:
                dx5Var.f372838n = aVar2.d(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.fw5 fw5Var3 = new r45.fw5();
                    if (bArr2 != null && bArr2.length > 0) {
                        fw5Var3.parseFrom(bArr2);
                    }
                    dx5Var.f372839o = fw5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
