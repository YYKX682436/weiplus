package r45;

/* loaded from: classes2.dex */
public class f55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374023d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374024e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374025f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374026g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374027h;

    /* renamed from: i, reason: collision with root package name */
    public int f374028i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f55)) {
            return false;
        }
        r45.f55 f55Var = (r45.f55) fVar;
        return n51.f.a(this.f374023d, f55Var.f374023d) && n51.f.a(this.f374024e, f55Var.f374024e) && n51.f.a(this.f374025f, f55Var.f374025f) && n51.f.a(this.f374026g, f55Var.f374026g) && n51.f.a(this.f374027h, f55Var.f374027h) && n51.f.a(java.lang.Integer.valueOf(this.f374028i), java.lang.Integer.valueOf(f55Var.f374028i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374023d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374024e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374025f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f374026g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f374027h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f374028i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f374023d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f374024e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f374025f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f374026g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f374027h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f374028i);
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
        r45.f55 f55Var = (r45.f55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f55Var.f374023d = aVar2.k(intValue);
                return 0;
            case 2:
                f55Var.f374024e = aVar2.k(intValue);
                return 0;
            case 3:
                f55Var.f374025f = aVar2.k(intValue);
                return 0;
            case 4:
                f55Var.f374026g = aVar2.k(intValue);
                return 0;
            case 5:
                f55Var.f374027h = aVar2.k(intValue);
                return 0;
            case 6:
                f55Var.f374028i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f374023d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "DocId", str, false);
            eVar.d(jSONObject, "Title", this.f374024e, false);
            eVar.d(jSONObject, "Desc", this.f374025f, false);
            eVar.d(jSONObject, "IconUrl", this.f374026g, false);
            eVar.d(jSONObject, "Source", this.f374027h, false);
            eVar.d(jSONObject, "Duration", java.lang.Integer.valueOf(this.f374028i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
