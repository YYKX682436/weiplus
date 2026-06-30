package r45;

/* loaded from: classes2.dex */
public class aw4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370295d;

    /* renamed from: e, reason: collision with root package name */
    public int f370296e;

    /* renamed from: f, reason: collision with root package name */
    public int f370297f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vs4 f370298g;

    /* renamed from: h, reason: collision with root package name */
    public r45.xt2 f370299h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aw4)) {
            return false;
        }
        r45.aw4 aw4Var = (r45.aw4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370295d), java.lang.Integer.valueOf(aw4Var.f370295d)) && n51.f.a(java.lang.Integer.valueOf(this.f370296e), java.lang.Integer.valueOf(aw4Var.f370296e)) && n51.f.a(java.lang.Integer.valueOf(this.f370297f), java.lang.Integer.valueOf(aw4Var.f370297f)) && n51.f.a(this.f370298g, aw4Var.f370298g) && n51.f.a(this.f370299h, aw4Var.f370299h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370295d);
            fVar.e(2, this.f370296e);
            fVar.e(3, this.f370297f);
            r45.vs4 vs4Var = this.f370298g;
            if (vs4Var != null) {
                fVar.i(4, vs4Var.computeSize());
                this.f370298g.writeFields(fVar);
            }
            r45.xt2 xt2Var = this.f370299h;
            if (xt2Var != null) {
                fVar.i(5, xt2Var.computeSize());
                this.f370299h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370295d) + 0 + b36.f.e(2, this.f370296e) + b36.f.e(3, this.f370297f);
            r45.vs4 vs4Var2 = this.f370298g;
            if (vs4Var2 != null) {
                e17 += b36.f.i(4, vs4Var2.computeSize());
            }
            r45.xt2 xt2Var2 = this.f370299h;
            return xt2Var2 != null ? e17 + b36.f.i(5, xt2Var2.computeSize()) : e17;
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
        r45.aw4 aw4Var = (r45.aw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aw4Var.f370295d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            aw4Var.f370296e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            aw4Var.f370297f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.vs4 vs4Var3 = new r45.vs4();
                if (bArr != null && bArr.length > 0) {
                    vs4Var3.parseFrom(bArr);
                }
                aw4Var.f370298g = vs4Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.xt2 xt2Var3 = new r45.xt2();
            if (bArr2 != null && bArr2.length > 0) {
                xt2Var3.parseFrom(bArr2);
            }
            aw4Var.f370299h = xt2Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f370295d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Type", valueOf, false);
            eVar.d(jSONObject, "StartTime", java.lang.Integer.valueOf(this.f370296e), false);
            eVar.d(jSONObject, "EndTime", java.lang.Integer.valueOf(this.f370297f), false);
            eVar.d(jSONObject, "Music", this.f370298g, false);
            eVar.d(jSONObject, "Finder", this.f370299h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
