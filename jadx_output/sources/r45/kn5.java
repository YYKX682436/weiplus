package r45;

/* loaded from: classes14.dex */
public class kn5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378856d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378857e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378858f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378859g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378860h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378861i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kn5)) {
            return false;
        }
        r45.kn5 kn5Var = (r45.kn5) fVar;
        return n51.f.a(this.f378856d, kn5Var.f378856d) && n51.f.a(this.f378857e, kn5Var.f378857e) && n51.f.a(this.f378858f, kn5Var.f378858f) && n51.f.a(this.f378859g, kn5Var.f378859g) && n51.f.a(this.f378860h, kn5Var.f378860h) && n51.f.a(this.f378861i, kn5Var.f378861i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378856d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378857e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378858f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f378859g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f378860h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f378861i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f378856d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f378857e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f378858f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f378859g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f378860h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f378861i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.kn5 kn5Var = (r45.kn5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kn5Var.f378856d = aVar2.k(intValue);
                return 0;
            case 2:
                kn5Var.f378857e = aVar2.k(intValue);
                return 0;
            case 3:
                kn5Var.f378858f = aVar2.k(intValue);
                return 0;
            case 4:
                kn5Var.f378859g = aVar2.k(intValue);
                return 0;
            case 5:
                kn5Var.f378860h = aVar2.k(intValue);
                return 0;
            case 6:
                kn5Var.f378861i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f378856d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "NickName", str, false);
            eVar.d(jSONObject, "PwdHash", this.f378857e, false);
            eVar.d(jSONObject, "HeadImgMd5", this.f378858f, false);
            eVar.d(jSONObject, "PhoneNumber", this.f378859g, false);
            eVar.d(jSONObject, "TimeZone", this.f378860h, false);
            eVar.d(jSONObject, "TimeZoneName", this.f378861i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
