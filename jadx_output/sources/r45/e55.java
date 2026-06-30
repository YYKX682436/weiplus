package r45;

/* loaded from: classes2.dex */
public class e55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373027f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373028g;

    /* renamed from: h, reason: collision with root package name */
    public int f373029h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373030i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373031m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373032n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373033o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f373034p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e55)) {
            return false;
        }
        r45.e55 e55Var = (r45.e55) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373025d), java.lang.Integer.valueOf(e55Var.f373025d)) && n51.f.a(this.f373026e, e55Var.f373026e) && n51.f.a(this.f373027f, e55Var.f373027f) && n51.f.a(this.f373028g, e55Var.f373028g) && n51.f.a(java.lang.Integer.valueOf(this.f373029h), java.lang.Integer.valueOf(e55Var.f373029h)) && n51.f.a(this.f373030i, e55Var.f373030i) && n51.f.a(this.f373031m, e55Var.f373031m) && n51.f.a(this.f373032n, e55Var.f373032n) && n51.f.a(this.f373033o, e55Var.f373033o) && n51.f.a(this.f373034p, e55Var.f373034p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373025d);
            java.lang.String str = this.f373026e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373027f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f373028g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f373029h);
            java.lang.String str4 = this.f373030i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f373031m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f373032n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f373033o;
            if (str7 != null) {
                fVar.j(100, str7);
            }
            java.lang.String str8 = this.f373034p;
            if (str8 != null) {
                fVar.j(101, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373025d) + 0;
            java.lang.String str9 = this.f373026e;
            if (str9 != null) {
                e17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f373027f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f373028g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            int e18 = e17 + b36.f.e(5, this.f373029h);
            java.lang.String str12 = this.f373030i;
            if (str12 != null) {
                e18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f373031m;
            if (str13 != null) {
                e18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f373032n;
            if (str14 != null) {
                e18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f373033o;
            if (str15 != null) {
                e18 += b36.f.j(100, str15);
            }
            java.lang.String str16 = this.f373034p;
            return str16 != null ? e18 + b36.f.j(101, str16) : e18;
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
        r45.e55 e55Var = (r45.e55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            e55Var.f373033o = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 101) {
            e55Var.f373034p = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                e55Var.f373025d = aVar2.g(intValue);
                return 0;
            case 2:
                e55Var.f373026e = aVar2.k(intValue);
                return 0;
            case 3:
                e55Var.f373027f = aVar2.k(intValue);
                return 0;
            case 4:
                e55Var.f373028g = aVar2.k(intValue);
                return 0;
            case 5:
                e55Var.f373029h = aVar2.g(intValue);
                return 0;
            case 6:
                e55Var.f373030i = aVar2.k(intValue);
                return 0;
            case 7:
                e55Var.f373031m = aVar2.k(intValue);
                return 0;
            case 8:
                e55Var.f373032n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f373025d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ActionType", valueOf, false);
            eVar.d(jSONObject, "JumpUrl", this.f373026e, false);
            eVar.d(jSONObject, "UserName", this.f373027f, false);
            eVar.d(jSONObject, "WeappPath", this.f373028g, false);
            eVar.d(jSONObject, "WeappVersion", java.lang.Integer.valueOf(this.f373029h), false);
            eVar.d(jSONObject, "SceneNote", this.f373030i, false);
            eVar.d(jSONObject, "CtrlInfo", this.f373031m, false);
            eVar.d(jSONObject, "MusicObjectXmlDesc", this.f373032n, false);
            eVar.d(jSONObject, "query", this.f373033o, false);
            eVar.d(jSONObject, "extParamStr", this.f373034p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
