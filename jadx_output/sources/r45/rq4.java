package r45;

/* loaded from: classes4.dex */
public class rq4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385118d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385119e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385120f;

    /* renamed from: g, reason: collision with root package name */
    public int f385121g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385122h;

    /* renamed from: i, reason: collision with root package name */
    public int f385123i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rq4)) {
            return false;
        }
        r45.rq4 rq4Var = (r45.rq4) fVar;
        return n51.f.a(this.f385118d, rq4Var.f385118d) && n51.f.a(this.f385119e, rq4Var.f385119e) && n51.f.a(this.f385120f, rq4Var.f385120f) && n51.f.a(java.lang.Integer.valueOf(this.f385121g), java.lang.Integer.valueOf(rq4Var.f385121g)) && n51.f.a(this.f385122h, rq4Var.f385122h) && n51.f.a(java.lang.Integer.valueOf(this.f385123i), java.lang.Integer.valueOf(rq4Var.f385123i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385118d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385119e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385120f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f385121g);
            java.lang.String str4 = this.f385122h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f385123i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f385118d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f385119e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f385120f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f385121g);
            java.lang.String str8 = this.f385122h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f385123i);
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
        r45.rq4 rq4Var = (r45.rq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rq4Var.f385118d = aVar2.k(intValue);
                return 0;
            case 2:
                rq4Var.f385119e = aVar2.k(intValue);
                return 0;
            case 3:
                rq4Var.f385120f = aVar2.k(intValue);
                return 0;
            case 4:
                rq4Var.f385121g = aVar2.g(intValue);
                return 0;
            case 5:
                rq4Var.f385122h = aVar2.k(intValue);
                return 0;
            case 6:
                rq4Var.f385123i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f385118d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "nickname", str, false);
            eVar.d(jSONObject, "avatar", this.f385119e, false);
            eVar.d(jSONObject, dm.i4.COL_USERNAME, this.f385120f, false);
            eVar.d(jSONObject, "avatar_style", java.lang.Integer.valueOf(this.f385121g), false);
            eVar.d(jSONObject, "user_jump_info_str", this.f385122h, false);
            eVar.d(jSONObject, "err_code", java.lang.Integer.valueOf(this.f385123i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
