package r45;

/* loaded from: classes8.dex */
public class jh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377805d;

    /* renamed from: e, reason: collision with root package name */
    public int f377806e;

    /* renamed from: f, reason: collision with root package name */
    public int f377807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f377808g;

    /* renamed from: h, reason: collision with root package name */
    public int f377809h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jh0)) {
            return false;
        }
        r45.jh0 jh0Var = (r45.jh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377805d), java.lang.Integer.valueOf(jh0Var.f377805d)) && n51.f.a(java.lang.Integer.valueOf(this.f377806e), java.lang.Integer.valueOf(jh0Var.f377806e)) && n51.f.a(java.lang.Integer.valueOf(this.f377807f), java.lang.Integer.valueOf(jh0Var.f377807f)) && n51.f.a(java.lang.Boolean.valueOf(this.f377808g), java.lang.Boolean.valueOf(jh0Var.f377808g)) && n51.f.a(java.lang.Integer.valueOf(this.f377809h), java.lang.Integer.valueOf(jh0Var.f377809h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377805d);
            fVar.e(2, this.f377806e);
            fVar.e(3, this.f377807f);
            fVar.a(4, this.f377808g);
            fVar.e(5, this.f377809h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f377805d) + 0 + b36.f.e(2, this.f377806e) + b36.f.e(3, this.f377807f) + b36.f.a(4, this.f377808g) + b36.f.e(5, this.f377809h);
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
        r45.jh0 jh0Var = (r45.jh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jh0Var.f377805d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            jh0Var.f377806e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            jh0Var.f377807f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            jh0Var.f377808g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        jh0Var.f377809h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f377805d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "switch_option", valueOf, false);
            eVar.d(jSONObject, "refresh_freq", java.lang.Integer.valueOf(this.f377806e), false);
            eVar.d(jSONObject, "timing_of_preload", java.lang.Integer.valueOf(this.f377807f), false);
            eVar.d(jSONObject, "show_replace_button", java.lang.Boolean.valueOf(this.f377808g), false);
            eVar.d(jSONObject, "time_gap_of_loading_first", java.lang.Integer.valueOf(this.f377809h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
