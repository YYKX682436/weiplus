package r45;

/* loaded from: classes4.dex */
public class cb6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371428d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371429e;

    /* renamed from: f, reason: collision with root package name */
    public long f371430f;

    /* renamed from: g, reason: collision with root package name */
    public int f371431g;

    /* renamed from: h, reason: collision with root package name */
    public int f371432h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cb6)) {
            return false;
        }
        r45.cb6 cb6Var = (r45.cb6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371428d), java.lang.Integer.valueOf(cb6Var.f371428d)) && n51.f.a(this.f371429e, cb6Var.f371429e) && n51.f.a(java.lang.Long.valueOf(this.f371430f), java.lang.Long.valueOf(cb6Var.f371430f)) && n51.f.a(java.lang.Integer.valueOf(this.f371431g), java.lang.Integer.valueOf(cb6Var.f371431g)) && n51.f.a(java.lang.Integer.valueOf(this.f371432h), java.lang.Integer.valueOf(cb6Var.f371432h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371428d);
            java.lang.String str = this.f371429e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f371430f);
            fVar.e(4, this.f371431g);
            fVar.e(5, this.f371432h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371428d) + 0;
            java.lang.String str2 = this.f371429e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f371430f) + b36.f.e(4, this.f371431g) + b36.f.e(5, this.f371432h);
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
        r45.cb6 cb6Var = (r45.cb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cb6Var.f371428d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cb6Var.f371429e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            cb6Var.f371430f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            cb6Var.f371431g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        cb6Var.f371432h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f371428d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "SnsFlag", valueOf, false);
            eVar.d(jSONObject, "SnsBGImgID", this.f371429e, false);
            eVar.d(jSONObject, "SnsBGObjectID", java.lang.Long.valueOf(this.f371430f), false);
            eVar.d(jSONObject, "SnsFlagEx", java.lang.Integer.valueOf(this.f371431g), false);
            eVar.d(jSONObject, "SnsPrivacyRecent", java.lang.Integer.valueOf(this.f371432h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
