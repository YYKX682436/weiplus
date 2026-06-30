package r45;

/* loaded from: classes4.dex */
public class h40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f375816d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375817e;

    /* renamed from: f, reason: collision with root package name */
    public int f375818f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h40)) {
            return false;
        }
        r45.h40 h40Var = (r45.h40) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f375816d), java.lang.Boolean.valueOf(h40Var.f375816d)) && n51.f.a(this.f375817e, h40Var.f375817e) && n51.f.a(java.lang.Integer.valueOf(this.f375818f), java.lang.Integer.valueOf(h40Var.f375818f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f375816d);
            java.lang.String str = this.f375817e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f375818f);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f375816d) + 0;
            java.lang.String str2 = this.f375817e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            return a17 + b36.f.e(3, this.f375818f);
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
        r45.h40 h40Var = (r45.h40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h40Var.f375816d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            h40Var.f375817e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        h40Var.f375818f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f375816d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "SugStickBottom", valueOf, false);
            eVar.d(jSONObject, "SugBlockTitle", this.f375817e, false);
            eVar.d(jSONObject, "RecommendNum", java.lang.Integer.valueOf(this.f375818f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
