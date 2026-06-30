package r45;

/* loaded from: classes8.dex */
public class qx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384338d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384339e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384340f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384341g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384342h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384343i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384344m;

    /* renamed from: n, reason: collision with root package name */
    public int f384345n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qx5)) {
            return false;
        }
        r45.qx5 qx5Var = (r45.qx5) fVar;
        return n51.f.a(this.f384338d, qx5Var.f384338d) && n51.f.a(this.f384339e, qx5Var.f384339e) && n51.f.a(this.f384340f, qx5Var.f384340f) && n51.f.a(this.f384341g, qx5Var.f384341g) && n51.f.a(this.f384342h, qx5Var.f384342h) && n51.f.a(this.f384343i, qx5Var.f384343i) && n51.f.a(this.f384344m, qx5Var.f384344m) && n51.f.a(java.lang.Integer.valueOf(this.f384345n), java.lang.Integer.valueOf(qx5Var.f384345n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384338d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384339e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f384340f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f384341g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f384342h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f384343i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f384344m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f384345n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f384338d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f384339e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f384340f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f384341g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f384342h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f384343i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f384344m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.e(8, this.f384345n);
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
        r45.qx5 qx5Var = (r45.qx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qx5Var.f384338d = aVar2.k(intValue);
                return 0;
            case 2:
                qx5Var.f384339e = aVar2.k(intValue);
                return 0;
            case 3:
                qx5Var.f384340f = aVar2.k(intValue);
                return 0;
            case 4:
                qx5Var.f384341g = aVar2.k(intValue);
                return 0;
            case 5:
                qx5Var.f384342h = aVar2.k(intValue);
                return 0;
            case 6:
                qx5Var.f384343i = aVar2.k(intValue);
                return 0;
            case 7:
                qx5Var.f384344m = aVar2.k(intValue);
                return 0;
            case 8:
                qx5Var.f384345n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f384338d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Desc", this.f384339e, false);
            eVar.d(jSONObject, "ThumbUrl", this.f384340f, false);
            eVar.d(jSONObject, "AppID", this.f384341g, false);
            eVar.d(jSONObject, "UserName", this.f384342h, false);
            eVar.d(jSONObject, "Path", this.f384343i, false);
            eVar.d(jSONObject, "WeappIconUrl", this.f384344m, false);
            eVar.d(jSONObject, "Version", java.lang.Integer.valueOf(this.f384345n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
