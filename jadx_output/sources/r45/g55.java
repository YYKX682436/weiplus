package r45;

/* loaded from: classes12.dex */
public class g55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374889d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e64 f374890e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374891f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374892g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374893h;

    /* renamed from: i, reason: collision with root package name */
    public int f374894i;

    /* renamed from: m, reason: collision with root package name */
    public int f374895m;

    /* renamed from: n, reason: collision with root package name */
    public int f374896n;

    /* renamed from: o, reason: collision with root package name */
    public int f374897o;

    /* renamed from: p, reason: collision with root package name */
    public int f374898p;

    /* renamed from: q, reason: collision with root package name */
    public r45.j30 f374899q;

    /* renamed from: r, reason: collision with root package name */
    public int f374900r;

    /* renamed from: s, reason: collision with root package name */
    public int f374901s;

    /* renamed from: t, reason: collision with root package name */
    public r45.b40 f374902t;

    /* renamed from: w, reason: collision with root package name */
    public r45.cw5 f374905w;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f374903u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f374904v = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f374906x = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g55)) {
            return false;
        }
        r45.g55 g55Var = (r45.g55) fVar;
        return n51.f.a(this.f374889d, g55Var.f374889d) && n51.f.a(this.f374890e, g55Var.f374890e) && n51.f.a(this.f374891f, g55Var.f374891f) && n51.f.a(this.f374892g, g55Var.f374892g) && n51.f.a(this.f374893h, g55Var.f374893h) && n51.f.a(java.lang.Integer.valueOf(this.f374894i), java.lang.Integer.valueOf(g55Var.f374894i)) && n51.f.a(java.lang.Integer.valueOf(this.f374895m), java.lang.Integer.valueOf(g55Var.f374895m)) && n51.f.a(java.lang.Integer.valueOf(this.f374896n), java.lang.Integer.valueOf(g55Var.f374896n)) && n51.f.a(java.lang.Integer.valueOf(this.f374897o), java.lang.Integer.valueOf(g55Var.f374897o)) && n51.f.a(java.lang.Integer.valueOf(this.f374898p), java.lang.Integer.valueOf(g55Var.f374898p)) && n51.f.a(this.f374899q, g55Var.f374899q) && n51.f.a(java.lang.Integer.valueOf(this.f374900r), java.lang.Integer.valueOf(g55Var.f374900r)) && n51.f.a(java.lang.Integer.valueOf(this.f374901s), java.lang.Integer.valueOf(g55Var.f374901s)) && n51.f.a(this.f374902t, g55Var.f374902t) && n51.f.a(this.f374903u, g55Var.f374903u) && n51.f.a(this.f374904v, g55Var.f374904v) && n51.f.a(this.f374905w, g55Var.f374905w) && n51.f.a(this.f374906x, g55Var.f374906x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374903u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374889d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.e64 e64Var = this.f374890e;
            if (e64Var != null) {
                fVar.i(2, e64Var.computeSize());
                this.f374890e.writeFields(fVar);
            }
            java.lang.String str2 = this.f374891f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374892g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f374893h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f374894i);
            fVar.e(7, this.f374895m);
            fVar.e(8, this.f374896n);
            fVar.e(9, this.f374897o);
            fVar.e(10, this.f374898p);
            r45.j30 j30Var = this.f374899q;
            if (j30Var != null) {
                fVar.i(11, j30Var.computeSize());
                this.f374899q.writeFields(fVar);
            }
            fVar.e(12, this.f374900r);
            fVar.e(13, this.f374901s);
            r45.b40 b40Var = this.f374902t;
            if (b40Var != null) {
                fVar.i(14, b40Var.computeSize());
                this.f374902t.writeFields(fVar);
            }
            fVar.g(15, 8, linkedList);
            fVar.g(16, 8, this.f374904v);
            r45.cw5 cw5Var = this.f374905w;
            if (cw5Var != null) {
                fVar.i(17, cw5Var.computeSize());
                this.f374905w.writeFields(fVar);
            }
            fVar.g(18, 8, this.f374906x);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f374889d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            r45.e64 e64Var2 = this.f374890e;
            if (e64Var2 != null) {
                j17 += b36.f.i(2, e64Var2.computeSize());
            }
            java.lang.String str6 = this.f374891f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f374892g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f374893h;
            if (str8 != null) {
                j17 += b36.f.j(5, str8);
            }
            int e17 = j17 + b36.f.e(6, this.f374894i) + b36.f.e(7, this.f374895m) + b36.f.e(8, this.f374896n) + b36.f.e(9, this.f374897o) + b36.f.e(10, this.f374898p);
            r45.j30 j30Var2 = this.f374899q;
            if (j30Var2 != null) {
                e17 += b36.f.i(11, j30Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(12, this.f374900r) + b36.f.e(13, this.f374901s);
            r45.b40 b40Var2 = this.f374902t;
            if (b40Var2 != null) {
                e18 += b36.f.i(14, b40Var2.computeSize());
            }
            int g17 = e18 + b36.f.g(15, 8, linkedList) + b36.f.g(16, 8, this.f374904v);
            r45.cw5 cw5Var2 = this.f374905w;
            if (cw5Var2 != null) {
                g17 += b36.f.i(17, cw5Var2.computeSize());
            }
            return g17 + b36.f.g(18, 8, this.f374906x);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f374904v.clear();
            this.f374906x.clear();
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
        r45.g55 g55Var = (r45.g55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g55Var.f374889d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.parseFrom(bArr2);
                    }
                    g55Var.f374890e = e64Var3;
                }
                return 0;
            case 3:
                g55Var.f374891f = aVar2.k(intValue);
                return 0;
            case 4:
                g55Var.f374892g = aVar2.k(intValue);
                return 0;
            case 5:
                g55Var.f374893h = aVar2.k(intValue);
                return 0;
            case 6:
                g55Var.f374894i = aVar2.g(intValue);
                return 0;
            case 7:
                g55Var.f374895m = aVar2.g(intValue);
                return 0;
            case 8:
                g55Var.f374896n = aVar2.g(intValue);
                return 0;
            case 9:
                g55Var.f374897o = aVar2.g(intValue);
                return 0;
            case 10:
                g55Var.f374898p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr3 != null && bArr3.length > 0) {
                        j30Var3.parseFrom(bArr3);
                    }
                    g55Var.f374899q = j30Var3;
                }
                return 0;
            case 12:
                g55Var.f374900r = aVar2.g(intValue);
                return 0;
            case 13:
                g55Var.f374901s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.b40 b40Var3 = new r45.b40();
                    if (bArr4 != null && bArr4.length > 0) {
                        b40Var3.parseFrom(bArr4);
                    }
                    g55Var.f374902t = b40Var3;
                }
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr5 != null && bArr5.length > 0) {
                        x50Var.parseFrom(bArr5);
                    }
                    g55Var.f374903u.add(x50Var);
                }
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    r45.cw5 cw5Var3 = new r45.cw5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cw5Var3.parseFrom(bArr6);
                    }
                    g55Var.f374904v.add(cw5Var3);
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j37.get(i37);
                    r45.cw5 cw5Var4 = new r45.cw5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cw5Var4.parseFrom(bArr7);
                    }
                    g55Var.f374905w = cw5Var4;
                }
                return 0;
            case 18:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j38.get(i38);
                    r45.ei6 ei6Var = new r45.ei6();
                    if (bArr8 != null && bArr8.length > 0) {
                        ei6Var.parseFrom(bArr8);
                    }
                    g55Var.f374906x.add(ei6Var);
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f374889d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Query", str, false);
            eVar.d(jSONObject, "Location", this.f374890e, false);
            eVar.d(jSONObject, "SessionId", this.f374891f, false);
            eVar.d(jSONObject, "RequestId", this.f374892g, false);
            eVar.d(jSONObject, "Source", this.f374893h, false);
            eVar.d(jSONObject, "PardusSwitch", java.lang.Integer.valueOf(this.f374894i), false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f374895m), false);
            eVar.d(jSONObject, "DarkMode", java.lang.Integer.valueOf(this.f374896n), false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f374897o), false);
            eVar.d(jSONObject, "BusinessType", java.lang.Integer.valueOf(this.f374898p), false);
            eVar.d(jSONObject, "ChildMode", this.f374899q, false);
            eVar.d(jSONObject, "WebSearchH5Version", java.lang.Integer.valueOf(this.f374900r), false);
            eVar.d(jSONObject, "ActionType", java.lang.Integer.valueOf(this.f374901s), false);
            eVar.d(jSONObject, "ClickContext", this.f374902t, false);
            eVar.d(jSONObject, "ExtReqParams", this.f374903u, false);
            eVar.d(jSONObject, "SearchClickHistory", this.f374904v, false);
            eVar.d(jSONObject, "PrefixLocalClickInfo", this.f374905w, false);
            eVar.d(jSONObject, "SugPrefixSequence", this.f374906x, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
