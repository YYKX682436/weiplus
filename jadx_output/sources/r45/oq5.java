package r45;

/* loaded from: classes4.dex */
public class oq5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382450d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382451e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382452f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f382453g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f382454h;

    /* renamed from: i, reason: collision with root package name */
    public int f382455i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oq5)) {
            return false;
        }
        r45.oq5 oq5Var = (r45.oq5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382450d), java.lang.Integer.valueOf(oq5Var.f382450d)) && n51.f.a(this.f382451e, oq5Var.f382451e) && n51.f.a(this.f382452f, oq5Var.f382452f) && n51.f.a(java.lang.Boolean.valueOf(this.f382453g), java.lang.Boolean.valueOf(oq5Var.f382453g)) && n51.f.a(java.lang.Integer.valueOf(this.f382454h), java.lang.Integer.valueOf(oq5Var.f382454h)) && n51.f.a(java.lang.Integer.valueOf(this.f382455i), java.lang.Integer.valueOf(oq5Var.f382455i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382450d);
            java.lang.String str = this.f382451e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382452f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f382453g);
            fVar.e(5, this.f382454h);
            fVar.e(6, this.f382455i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382450d) + 0;
            java.lang.String str3 = this.f382451e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f382452f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.a(4, this.f382453g) + b36.f.e(5, this.f382454h) + b36.f.e(6, this.f382455i);
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
        r45.oq5 oq5Var = (r45.oq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oq5Var.f382450d = aVar2.g(intValue);
                return 0;
            case 2:
                oq5Var.f382451e = aVar2.k(intValue);
                return 0;
            case 3:
                oq5Var.f382452f = aVar2.k(intValue);
                return 0;
            case 4:
                oq5Var.f382453g = aVar2.c(intValue);
                return 0;
            case 5:
                oq5Var.f382454h = aVar2.g(intValue);
                return 0;
            case 6:
                oq5Var.f382455i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f382450d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "item_type", valueOf, false);
            eVar.d(jSONObject, ya.b.ITEM_ID, this.f382451e, false);
            eVar.d(jSONObject, "event_id", this.f382452f, false);
            eVar.d(jSONObject, "need_report", java.lang.Boolean.valueOf(this.f382453g), false);
            eVar.d(jSONObject, "interval_ms", java.lang.Integer.valueOf(this.f382454h), false);
            eVar.d(jSONObject, "middle_action_type", java.lang.Integer.valueOf(this.f382455i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
