package r45;

/* loaded from: classes4.dex */
public class bz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371182d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fv f371183e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fv f371184f;

    /* renamed from: g, reason: collision with root package name */
    public int f371185g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz6)) {
            return false;
        }
        r45.bz6 bz6Var = (r45.bz6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371182d), java.lang.Integer.valueOf(bz6Var.f371182d)) && n51.f.a(this.f371183e, bz6Var.f371183e) && n51.f.a(this.f371184f, bz6Var.f371184f) && n51.f.a(java.lang.Integer.valueOf(this.f371185g), java.lang.Integer.valueOf(bz6Var.f371185g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371182d);
            r45.fv fvVar = this.f371183e;
            if (fvVar != null) {
                fVar.i(4, fvVar.computeSize());
                this.f371183e.writeFields(fVar);
            }
            r45.fv fvVar2 = this.f371184f;
            if (fvVar2 != null) {
                fVar.i(5, fvVar2.computeSize());
                this.f371184f.writeFields(fVar);
            }
            fVar.e(6, this.f371185g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371182d) + 0;
            r45.fv fvVar3 = this.f371183e;
            if (fvVar3 != null) {
                e17 += b36.f.i(4, fvVar3.computeSize());
            }
            r45.fv fvVar4 = this.f371184f;
            if (fvVar4 != null) {
                e17 += b36.f.i(5, fvVar4.computeSize());
            }
            return e17 + b36.f.e(6, this.f371185g);
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
        r45.bz6 bz6Var = (r45.bz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bz6Var.f371182d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.fv fvVar5 = new r45.fv();
                if (bArr != null && bArr.length > 0) {
                    fvVar5.parseFrom(bArr);
                }
                bz6Var.f371183e = fvVar5;
            }
            return 0;
        }
        if (intValue != 5) {
            if (intValue != 6) {
                return -1;
            }
            bz6Var.f371185g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.fv fvVar6 = new r45.fv();
            if (bArr2 != null && bArr2.length > 0) {
                fvVar6.parseFrom(bArr2);
            }
            bz6Var.f371184f = fvVar6;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f371182d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "CdnScene", valueOf, false);
            eVar.d(jSONObject, "CtnInfo", this.f371183e, false);
            eVar.d(jSONObject, "MpInfo", this.f371184f, false);
            eVar.d(jSONObject, "CdnSourceType", java.lang.Integer.valueOf(this.f371185g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
