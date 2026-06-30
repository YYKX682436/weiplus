package r45;

/* loaded from: classes8.dex */
public class ow5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382581d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382582e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382583f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382584g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382585h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382586i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ow5)) {
            return false;
        }
        r45.ow5 ow5Var = (r45.ow5) fVar;
        return n51.f.a(this.f382581d, ow5Var.f382581d) && n51.f.a(this.f382582e, ow5Var.f382582e) && n51.f.a(this.f382583f, ow5Var.f382583f) && n51.f.a(this.f382584g, ow5Var.f382584g) && n51.f.a(this.f382585h, ow5Var.f382585h) && n51.f.a(this.f382586i, ow5Var.f382586i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382581d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382582e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382583f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f382584g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f382585h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f382586i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f382581d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f382582e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f382583f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f382584g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f382585h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f382586i;
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
        r45.ow5 ow5Var = (r45.ow5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ow5Var.f382581d = aVar2.k(intValue);
                return 0;
            case 2:
                ow5Var.f382582e = aVar2.k(intValue);
                return 0;
            case 3:
                ow5Var.f382583f = aVar2.k(intValue);
                return 0;
            case 4:
                ow5Var.f382584g = aVar2.k(intValue);
                return 0;
            case 5:
                ow5Var.f382585h = aVar2.k(intValue);
                return 0;
            case 6:
                ow5Var.f382586i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f382581d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "UserName", this.f382582e, false);
            eVar.d(jSONObject, "HeadUrl", this.f382583f, false);
            eVar.d(jSONObject, "NickName", this.f382584g, false);
            eVar.d(jSONObject, "AuthJob", this.f382585h, false);
            eVar.d(jSONObject, "AuthIcon", this.f382586i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
