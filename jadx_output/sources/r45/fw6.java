package r45;

/* loaded from: classes2.dex */
public class fw6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374659d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374660e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374661f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374662g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374663h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374664i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fw6)) {
            return false;
        }
        r45.fw6 fw6Var = (r45.fw6) fVar;
        return n51.f.a(this.f374659d, fw6Var.f374659d) && n51.f.a(this.f374660e, fw6Var.f374660e) && n51.f.a(this.f374661f, fw6Var.f374661f) && n51.f.a(this.f374662g, fw6Var.f374662g) && n51.f.a(this.f374663h, fw6Var.f374663h) && n51.f.a(this.f374664i, fw6Var.f374664i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374659d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374660e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374661f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f374662g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f374663h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f374664i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f374659d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f374660e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f374661f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f374662g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f374663h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f374664i;
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
        r45.fw6 fw6Var = (r45.fw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fw6Var.f374659d = aVar2.k(intValue);
                return 0;
            case 2:
                fw6Var.f374660e = aVar2.k(intValue);
                return 0;
            case 3:
                fw6Var.f374661f = aVar2.k(intValue);
                return 0;
            case 4:
                fw6Var.f374662g = aVar2.k(intValue);
                return 0;
            case 5:
                fw6Var.f374663h = aVar2.k(intValue);
                return 0;
            case 6:
                fw6Var.f374664i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f374659d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "UserName", str, false);
            eVar.d(jSONObject, "MatchWord", this.f374660e, false);
            eVar.d(jSONObject, "NickName", this.f374661f, false);
            eVar.d(jSONObject, "Remark", this.f374662g, false);
            eVar.d(jSONObject, "Alias", this.f374663h, false);
            eVar.d(jSONObject, "Description", this.f374664i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
