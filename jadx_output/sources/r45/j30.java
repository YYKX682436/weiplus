package r45;

/* loaded from: classes8.dex */
public class j30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377529d;

    /* renamed from: e, reason: collision with root package name */
    public int f377530e;

    /* renamed from: f, reason: collision with root package name */
    public int f377531f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f377532g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j30)) {
            return false;
        }
        r45.j30 j30Var = (r45.j30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377529d), java.lang.Integer.valueOf(j30Var.f377529d)) && n51.f.a(java.lang.Integer.valueOf(this.f377530e), java.lang.Integer.valueOf(j30Var.f377530e)) && n51.f.a(java.lang.Integer.valueOf(this.f377531f), java.lang.Integer.valueOf(j30Var.f377531f)) && n51.f.a(java.lang.Boolean.valueOf(this.f377532g), java.lang.Boolean.valueOf(j30Var.f377532g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377529d);
            fVar.e(2, this.f377530e);
            fVar.e(3, this.f377531f);
            fVar.a(4, this.f377532g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f377529d) + 0 + b36.f.e(2, this.f377530e) + b36.f.e(3, this.f377531f) + b36.f.a(4, this.f377532g);
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
        r45.j30 j30Var = (r45.j30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j30Var.f377529d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            j30Var.f377530e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            j30Var.f377531f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        j30Var.f377532g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f377529d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BizSwitch", valueOf, false);
            eVar.d(jSONObject, "WeappSwitch", java.lang.Integer.valueOf(this.f377530e), false);
            eVar.d(jSONObject, "FinderSwitch", java.lang.Integer.valueOf(this.f377531f), false);
            eVar.d(jSONObject, "ChildModeSwitch", java.lang.Boolean.valueOf(this.f377532g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
