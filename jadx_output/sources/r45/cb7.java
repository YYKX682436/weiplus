package r45;

/* loaded from: classes2.dex */
public class cb7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371433d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371435f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371436g;

    /* renamed from: h, reason: collision with root package name */
    public int f371437h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371438i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371439m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cb7)) {
            return false;
        }
        r45.cb7 cb7Var = (r45.cb7) fVar;
        return n51.f.a(this.f371433d, cb7Var.f371433d) && n51.f.a(this.f371434e, cb7Var.f371434e) && n51.f.a(this.f371435f, cb7Var.f371435f) && n51.f.a(this.f371436g, cb7Var.f371436g) && n51.f.a(java.lang.Integer.valueOf(this.f371437h), java.lang.Integer.valueOf(cb7Var.f371437h)) && n51.f.a(this.f371438i, cb7Var.f371438i) && n51.f.a(this.f371439m, cb7Var.f371439m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371433d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371434e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f371435f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f371436g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f371437h);
            java.lang.String str5 = this.f371438i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f371439m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f371433d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f371434e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f371435f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f371436g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f371437h);
            java.lang.String str11 = this.f371438i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f371439m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        r45.cb7 cb7Var = (r45.cb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cb7Var.f371433d = aVar2.k(intValue);
                return 0;
            case 2:
                cb7Var.f371434e = aVar2.k(intValue);
                return 0;
            case 3:
                cb7Var.f371435f = aVar2.k(intValue);
                return 0;
            case 4:
                cb7Var.f371436g = aVar2.k(intValue);
                return 0;
            case 5:
                cb7Var.f371437h = aVar2.g(intValue);
                return 0;
            case 6:
                cb7Var.f371438i = aVar2.k(intValue);
                return 0;
            case 7:
                cb7Var.f371439m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f371433d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "DocId", str, false);
            eVar.d(jSONObject, "UserName", this.f371434e, false);
            eVar.d(jSONObject, "NickName", this.f371435f, false);
            eVar.d(jSONObject, "AppID", this.f371436g, false);
            eVar.d(jSONObject, "AppVersion", java.lang.Integer.valueOf(this.f371437h), false);
            eVar.d(jSONObject, "BoxInfo", this.f371438i, false);
            eVar.d(jSONObject, "IconUrl", this.f371439m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
