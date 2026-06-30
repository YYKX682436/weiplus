package r45;

/* loaded from: classes2.dex */
public class n66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381103d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381104e;

    /* renamed from: f, reason: collision with root package name */
    public int f381105f;

    /* renamed from: g, reason: collision with root package name */
    public int f381106g;

    /* renamed from: h, reason: collision with root package name */
    public long f381107h;

    /* renamed from: i, reason: collision with root package name */
    public long f381108i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381109m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n66)) {
            return false;
        }
        r45.n66 n66Var = (r45.n66) fVar;
        return n51.f.a(this.f381103d, n66Var.f381103d) && n51.f.a(this.f381104e, n66Var.f381104e) && n51.f.a(java.lang.Integer.valueOf(this.f381105f), java.lang.Integer.valueOf(n66Var.f381105f)) && n51.f.a(java.lang.Integer.valueOf(this.f381106g), java.lang.Integer.valueOf(n66Var.f381106g)) && n51.f.a(java.lang.Long.valueOf(this.f381107h), java.lang.Long.valueOf(n66Var.f381107h)) && n51.f.a(java.lang.Long.valueOf(this.f381108i), java.lang.Long.valueOf(n66Var.f381108i)) && n51.f.a(this.f381109m, n66Var.f381109m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381103d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381104e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f381105f);
            fVar.e(4, this.f381106g);
            fVar.h(5, this.f381107h);
            fVar.h(6, this.f381108i);
            java.lang.String str3 = this.f381109m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f381103d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f381104e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f381105f) + b36.f.e(4, this.f381106g) + b36.f.h(5, this.f381107h) + b36.f.h(6, this.f381108i);
            java.lang.String str6 = this.f381109m;
            return str6 != null ? e17 + b36.f.j(7, str6) : e17;
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
        r45.n66 n66Var = (r45.n66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n66Var.f381103d = aVar2.k(intValue);
                return 0;
            case 2:
                n66Var.f381104e = aVar2.k(intValue);
                return 0;
            case 3:
                n66Var.f381105f = aVar2.g(intValue);
                return 0;
            case 4:
                n66Var.f381106g = aVar2.g(intValue);
                return 0;
            case 5:
                n66Var.f381107h = aVar2.i(intValue);
                return 0;
            case 6:
                n66Var.f381108i = aVar2.i(intValue);
                return 0;
            case 7:
                n66Var.f381109m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f381103d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "paramName", str, false);
            eVar.d(jSONObject, "paramValue", this.f381104e, false);
            eVar.d(jSONObject, "exptId", java.lang.Integer.valueOf(this.f381105f), false);
            eVar.d(jSONObject, "exptGroupId", java.lang.Integer.valueOf(this.f381106g), false);
            eVar.d(jSONObject, "key", java.lang.Long.valueOf(this.f381107h), false);
            eVar.d(jSONObject, "bucketSrc", java.lang.Long.valueOf(this.f381108i), false);
            eVar.d(jSONObject, "expInfo", this.f381109m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
