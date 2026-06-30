package r45;

/* loaded from: classes12.dex */
public class ew4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373758d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c50 f373759e;

    /* renamed from: f, reason: collision with root package name */
    public int f373760f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f373761g;

    /* renamed from: h, reason: collision with root package name */
    public int f373762h;

    /* renamed from: i, reason: collision with root package name */
    public int f373763i;

    /* renamed from: m, reason: collision with root package name */
    public int f373764m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ew4)) {
            return false;
        }
        r45.ew4 ew4Var = (r45.ew4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373758d), java.lang.Integer.valueOf(ew4Var.f373758d)) && n51.f.a(this.f373759e, ew4Var.f373759e) && n51.f.a(java.lang.Integer.valueOf(this.f373760f), java.lang.Integer.valueOf(ew4Var.f373760f)) && n51.f.a(this.f373761g, ew4Var.f373761g) && n51.f.a(java.lang.Integer.valueOf(this.f373762h), java.lang.Integer.valueOf(ew4Var.f373762h)) && n51.f.a(java.lang.Integer.valueOf(this.f373763i), java.lang.Integer.valueOf(ew4Var.f373763i)) && n51.f.a(java.lang.Integer.valueOf(this.f373764m), java.lang.Integer.valueOf(ew4Var.f373764m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373758d);
            r45.c50 c50Var = this.f373759e;
            if (c50Var != null) {
                fVar.i(2, c50Var.computeSize());
                this.f373759e.writeFields(fVar);
            }
            fVar.e(3, this.f373760f);
            r45.cu5 cu5Var = this.f373761g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f373761g.writeFields(fVar);
            }
            fVar.e(5, this.f373762h);
            fVar.e(6, this.f373763i);
            fVar.e(7, this.f373764m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373758d) + 0;
            r45.c50 c50Var2 = this.f373759e;
            if (c50Var2 != null) {
                e17 += b36.f.i(2, c50Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(3, this.f373760f);
            r45.cu5 cu5Var2 = this.f373761g;
            if (cu5Var2 != null) {
                e18 += b36.f.i(4, cu5Var2.computeSize());
            }
            return e18 + b36.f.e(5, this.f373762h) + b36.f.e(6, this.f373763i) + b36.f.e(7, this.f373764m);
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
        r45.ew4 ew4Var = (r45.ew4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ew4Var.f373758d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.c50 c50Var3 = new r45.c50();
                    if (bArr != null && bArr.length > 0) {
                        c50Var3.parseFrom(bArr);
                    }
                    ew4Var.f373759e = c50Var3;
                }
                return 0;
            case 3:
                ew4Var.f373760f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    ew4Var.f373761g = cu5Var3;
                }
                return 0;
            case 5:
                ew4Var.f373762h = aVar2.g(intValue);
                return 0;
            case 6:
                ew4Var.f373763i = aVar2.g(intValue);
                return 0;
            case 7:
                ew4Var.f373764m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f373758d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Ret", valueOf, false);
            eVar.d(jSONObject, "CmdList", this.f373759e, false);
            eVar.d(jSONObject, "ContinueFlag", java.lang.Integer.valueOf(this.f373760f), false);
            eVar.d(jSONObject, "KeyBuf", this.f373761g, false);
            eVar.d(jSONObject, "Status", java.lang.Integer.valueOf(this.f373762h), false);
            eVar.d(jSONObject, "OnlineVersion", java.lang.Integer.valueOf(this.f373763i), false);
            eVar.d(jSONObject, "SvrTime", java.lang.Integer.valueOf(this.f373764m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
