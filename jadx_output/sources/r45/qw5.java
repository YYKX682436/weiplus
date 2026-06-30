package r45;

/* loaded from: classes8.dex */
public class qw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384317d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384318e;

    /* renamed from: f, reason: collision with root package name */
    public int f384319f;

    /* renamed from: g, reason: collision with root package name */
    public int f384320g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384321h;

    /* renamed from: i, reason: collision with root package name */
    public int f384322i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qw5)) {
            return false;
        }
        r45.qw5 qw5Var = (r45.qw5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384317d), java.lang.Integer.valueOf(qw5Var.f384317d)) && n51.f.a(this.f384318e, qw5Var.f384318e) && n51.f.a(java.lang.Integer.valueOf(this.f384319f), java.lang.Integer.valueOf(qw5Var.f384319f)) && n51.f.a(java.lang.Integer.valueOf(this.f384320g), java.lang.Integer.valueOf(qw5Var.f384320g)) && n51.f.a(this.f384321h, qw5Var.f384321h) && n51.f.a(java.lang.Integer.valueOf(this.f384322i), java.lang.Integer.valueOf(qw5Var.f384322i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384317d);
            java.lang.String str = this.f384318e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f384319f);
            fVar.e(4, this.f384320g);
            java.lang.String str2 = this.f384321h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f384322i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384317d) + 0;
            java.lang.String str3 = this.f384318e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f384319f) + b36.f.e(4, this.f384320g);
            java.lang.String str4 = this.f384321h;
            if (str4 != null) {
                e18 += b36.f.j(5, str4);
            }
            return e18 + b36.f.e(6, this.f384322i);
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
        r45.qw5 qw5Var = (r45.qw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qw5Var.f384317d = aVar2.g(intValue);
                return 0;
            case 2:
                qw5Var.f384318e = aVar2.k(intValue);
                return 0;
            case 3:
                qw5Var.f384319f = aVar2.g(intValue);
                return 0;
            case 4:
                qw5Var.f384320g = aVar2.g(intValue);
                return 0;
            case 5:
                qw5Var.f384321h = aVar2.k(intValue);
                return 0;
            case 6:
                qw5Var.f384322i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f384317d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "MediaType", valueOf, false);
            eVar.d(jSONObject, "Url", this.f384318e, false);
            eVar.d(jSONObject, "Width", java.lang.Integer.valueOf(this.f384319f), false);
            eVar.d(jSONObject, "Height", java.lang.Integer.valueOf(this.f384320g), false);
            eVar.d(jSONObject, "ThumbUrl", this.f384321h, false);
            eVar.d(jSONObject, "VideoPlayDuration", java.lang.Integer.valueOf(this.f384322i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
