package r45;

/* loaded from: classes8.dex */
public class r97 extends com.tencent.mm.protobuf.f {
    public int A;
    public boolean B;
    public int C;
    public int D;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public int f384663d;

    /* renamed from: e, reason: collision with root package name */
    public int f384664e;

    /* renamed from: f, reason: collision with root package name */
    public int f384665f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384666g;

    /* renamed from: h, reason: collision with root package name */
    public r45.e64 f384667h;

    /* renamed from: i, reason: collision with root package name */
    public int f384668i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384669m;

    /* renamed from: n, reason: collision with root package name */
    public int f384670n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f384673q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384674r;

    /* renamed from: s, reason: collision with root package name */
    public int f384675s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f384676t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f384677u;

    /* renamed from: w, reason: collision with root package name */
    public int f384679w;

    /* renamed from: x, reason: collision with root package name */
    public int f384680x;

    /* renamed from: y, reason: collision with root package name */
    public int f384681y;

    /* renamed from: z, reason: collision with root package name */
    public r45.o33 f384682z;

    /* renamed from: o, reason: collision with root package name */
    public int f384671o = 2;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f384672p = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f384678v = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r97)) {
            return false;
        }
        r45.r97 r97Var = (r45.r97) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384663d), java.lang.Integer.valueOf(r97Var.f384663d)) && n51.f.a(java.lang.Integer.valueOf(this.f384664e), java.lang.Integer.valueOf(r97Var.f384664e)) && n51.f.a(java.lang.Integer.valueOf(this.f384665f), java.lang.Integer.valueOf(r97Var.f384665f)) && n51.f.a(this.f384666g, r97Var.f384666g) && n51.f.a(this.f384667h, r97Var.f384667h) && n51.f.a(java.lang.Integer.valueOf(this.f384668i), java.lang.Integer.valueOf(r97Var.f384668i)) && n51.f.a(this.f384669m, r97Var.f384669m) && n51.f.a(java.lang.Integer.valueOf(this.f384670n), java.lang.Integer.valueOf(r97Var.f384670n)) && n51.f.a(java.lang.Integer.valueOf(this.f384671o), java.lang.Integer.valueOf(r97Var.f384671o)) && n51.f.a(this.f384672p, r97Var.f384672p) && n51.f.a(this.f384673q, r97Var.f384673q) && n51.f.a(this.f384674r, r97Var.f384674r) && n51.f.a(java.lang.Integer.valueOf(this.f384675s), java.lang.Integer.valueOf(r97Var.f384675s)) && n51.f.a(this.f384676t, r97Var.f384676t) && n51.f.a(this.f384677u, r97Var.f384677u) && n51.f.a(this.f384678v, r97Var.f384678v) && n51.f.a(java.lang.Integer.valueOf(this.f384679w), java.lang.Integer.valueOf(r97Var.f384679w)) && n51.f.a(java.lang.Integer.valueOf(this.f384680x), java.lang.Integer.valueOf(r97Var.f384680x)) && n51.f.a(java.lang.Integer.valueOf(this.f384681y), java.lang.Integer.valueOf(r97Var.f384681y)) && n51.f.a(this.f384682z, r97Var.f384682z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(r97Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(r97Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(r97Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(r97Var.D)) && n51.f.a(this.E, r97Var.E);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384672p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384663d);
            fVar.e(2, this.f384664e);
            fVar.e(3, this.f384665f);
            java.lang.String str = this.f384666g;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.e64 e64Var = this.f384667h;
            if (e64Var != null) {
                fVar.i(5, e64Var.computeSize());
                this.f384667h.writeFields(fVar);
            }
            fVar.e(6, this.f384668i);
            java.lang.String str2 = this.f384669m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f384670n);
            fVar.e(9, this.f384671o);
            fVar.g(10, 8, linkedList);
            java.lang.String str3 = this.f384673q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f384674r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f384675s);
            java.lang.String str5 = this.f384676t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f384677u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            fVar.g(16, 1, this.f384678v);
            fVar.e(17, this.f384679w);
            fVar.e(18, this.f384680x);
            fVar.e(19, this.f384681y);
            r45.o33 o33Var = this.f384682z;
            if (o33Var != null) {
                fVar.i(20, o33Var.computeSize());
                this.f384682z.writeFields(fVar);
            }
            fVar.e(21, this.A);
            fVar.a(22, this.B);
            fVar.e(23, this.C);
            fVar.e(24, this.D);
            java.lang.String str7 = this.E;
            if (str7 != null) {
                fVar.j(25, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384663d) + 0 + b36.f.e(2, this.f384664e) + b36.f.e(3, this.f384665f);
            java.lang.String str8 = this.f384666g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            r45.e64 e64Var2 = this.f384667h;
            if (e64Var2 != null) {
                e17 += b36.f.i(5, e64Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f384668i);
            java.lang.String str9 = this.f384669m;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            int e19 = e18 + b36.f.e(8, this.f384670n) + b36.f.e(9, this.f384671o) + b36.f.g(10, 8, linkedList);
            java.lang.String str10 = this.f384673q;
            if (str10 != null) {
                e19 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f384674r;
            if (str11 != null) {
                e19 += b36.f.j(12, str11);
            }
            int e27 = e19 + b36.f.e(13, this.f384675s);
            java.lang.String str12 = this.f384676t;
            if (str12 != null) {
                e27 += b36.f.j(14, str12);
            }
            java.lang.String str13 = this.f384677u;
            if (str13 != null) {
                e27 += b36.f.j(15, str13);
            }
            int g17 = e27 + b36.f.g(16, 1, this.f384678v) + b36.f.e(17, this.f384679w) + b36.f.e(18, this.f384680x) + b36.f.e(19, this.f384681y);
            r45.o33 o33Var2 = this.f384682z;
            if (o33Var2 != null) {
                g17 += b36.f.i(20, o33Var2.computeSize());
            }
            int e28 = g17 + b36.f.e(21, this.A) + b36.f.a(22, this.B) + b36.f.e(23, this.C) + b36.f.e(24, this.D);
            java.lang.String str14 = this.E;
            return str14 != null ? e28 + b36.f.j(25, str14) : e28;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f384678v.clear();
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
        r45.r97 r97Var = (r45.r97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r97Var.f384663d = aVar2.g(intValue);
                return 0;
            case 2:
                r97Var.f384664e = aVar2.g(intValue);
                return 0;
            case 3:
                r97Var.f384665f = aVar2.g(intValue);
                return 0;
            case 4:
                r97Var.f384666g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.parseFrom(bArr2);
                    }
                    r97Var.f384667h = e64Var3;
                }
                return 0;
            case 6:
                r97Var.f384668i = aVar2.g(intValue);
                return 0;
            case 7:
                r97Var.f384669m = aVar2.k(intValue);
                return 0;
            case 8:
                r97Var.f384670n = aVar2.g(intValue);
                return 0;
            case 9:
                r97Var.f384671o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr3 != null && bArr3.length > 0) {
                        x50Var.parseFrom(bArr3);
                    }
                    r97Var.f384672p.add(x50Var);
                }
                return 0;
            case 11:
                r97Var.f384673q = aVar2.k(intValue);
                return 0;
            case 12:
                r97Var.f384674r = aVar2.k(intValue);
                return 0;
            case 13:
                r97Var.f384675s = aVar2.g(intValue);
                return 0;
            case 14:
                r97Var.f384676t = aVar2.k(intValue);
                return 0;
            case 15:
                r97Var.f384677u = aVar2.k(intValue);
                return 0;
            case 16:
                r97Var.f384678v.add(aVar2.k(intValue));
                return 0;
            case 17:
                r97Var.f384679w = aVar2.g(intValue);
                return 0;
            case 18:
                r97Var.f384680x = aVar2.g(intValue);
                return 0;
            case 19:
                r97Var.f384681y = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.o33 o33Var3 = new r45.o33();
                    if (bArr4 != null && bArr4.length > 0) {
                        o33Var3.parseFrom(bArr4);
                    }
                    r97Var.f384682z = o33Var3;
                }
                return 0;
            case 21:
                r97Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                r97Var.B = aVar2.c(intValue);
                return 0;
            case 23:
                r97Var.C = aVar2.g(intValue);
                return 0;
            case 24:
                r97Var.D = aVar2.g(intValue);
                return 0;
            case 25:
                r97Var.E = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f384663d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Offset", valueOf, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f384664e), false);
            eVar.d(jSONObject, "IsHomePage", java.lang.Integer.valueOf(this.f384665f), false);
            eVar.d(jSONObject, "Keyword", this.f384666g, false);
            eVar.d(jSONObject, "Location", this.f384667h, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f384668i), false);
            eVar.d(jSONObject, "SearchID", this.f384669m, false);
            eVar.d(jSONObject, "SceneActionType", java.lang.Integer.valueOf(this.f384670n), false);
            eVar.d(jSONObject, "DisplayPattern", java.lang.Integer.valueOf(this.f384671o), false);
            eVar.d(jSONObject, "ExtReqParams", this.f384672p, false);
            eVar.d(jSONObject, "SessionID", this.f384673q, false);
            eVar.d(jSONObject, "Source", this.f384674r, false);
            eVar.d(jSONObject, "ChannelId", java.lang.Integer.valueOf(this.f384675s), false);
            eVar.d(jSONObject, "NavigationId", this.f384676t, false);
            eVar.d(jSONObject, "RedPointMsgId", this.f384677u, false);
            eVar.d(jSONObject, "CheckDocidList", this.f384678v, false);
            eVar.d(jSONObject, "Pos", java.lang.Integer.valueOf(this.f384679w), false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f384680x), false);
            eVar.d(jSONObject, "FromPreTabChannelId", java.lang.Integer.valueOf(this.f384681y), false);
            eVar.d(jSONObject, "FloatingWindow", this.f384682z, false);
            eVar.d(jSONObject, "Count", java.lang.Integer.valueOf(this.A), false);
            eVar.d(jSONObject, "IsFromClient", java.lang.Boolean.valueOf(this.B), false);
            eVar.d(jSONObject, "CareMode", java.lang.Integer.valueOf(this.C), false);
            eVar.d(jSONObject, "YoungMode", java.lang.Integer.valueOf(this.D), false);
            eVar.d(jSONObject, "AdIdInfo", this.E, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
