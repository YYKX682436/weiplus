package pj4;

/* loaded from: classes9.dex */
public class x1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355332f;

    /* renamed from: g, reason: collision with root package name */
    public int f355333g;

    /* renamed from: h, reason: collision with root package name */
    public int f355334h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355335i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f355336m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.x1)) {
            return false;
        }
        pj4.x1 x1Var = (pj4.x1) fVar;
        return n51.f.a(this.f355330d, x1Var.f355330d) && n51.f.a(this.f355331e, x1Var.f355331e) && n51.f.a(this.f355332f, x1Var.f355332f) && n51.f.a(java.lang.Integer.valueOf(this.f355333g), java.lang.Integer.valueOf(x1Var.f355333g)) && n51.f.a(java.lang.Integer.valueOf(this.f355334h), java.lang.Integer.valueOf(x1Var.f355334h)) && n51.f.a(this.f355335i, x1Var.f355335i) && n51.f.a(this.f355336m, x1Var.f355336m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355330d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f355331e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f355332f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f355333g);
            fVar.e(5, this.f355334h);
            java.lang.String str4 = this.f355335i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f355336m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f355330d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f355331e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f355332f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f355333g) + b36.f.e(5, this.f355334h);
            java.lang.String str9 = this.f355335i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f355336m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        pj4.x1 x1Var = (pj4.x1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x1Var.f355330d = aVar2.k(intValue);
                return 0;
            case 2:
                x1Var.f355331e = aVar2.k(intValue);
                return 0;
            case 3:
                x1Var.f355332f = aVar2.k(intValue);
                return 0;
            case 4:
                x1Var.f355333g = aVar2.g(intValue);
                return 0;
            case 5:
                x1Var.f355334h = aVar2.g(intValue);
                return 0;
            case 6:
                x1Var.f355335i = aVar2.k(intValue);
                return 0;
            case 7:
                x1Var.f355336m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355330d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, str, false);
            eVar.d(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f355331e, false);
            eVar.d(jSONObject, dm.i4.COL_USERNAME, this.f355332f, false);
            eVar.d(jSONObject, "version_type", java.lang.Integer.valueOf(this.f355333g), false);
            eVar.d(jSONObject, "version_num", java.lang.Integer.valueOf(this.f355334h), false);
            eVar.d(jSONObject, "icon_url", this.f355335i, false);
            eVar.d(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA, this.f355336m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
