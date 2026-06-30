package r45;

/* loaded from: classes2.dex */
public class uh5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387385d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387386e;

    /* renamed from: f, reason: collision with root package name */
    public int f387387f;

    /* renamed from: g, reason: collision with root package name */
    public r45.m67 f387388g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uh5)) {
            return false;
        }
        r45.uh5 uh5Var = (r45.uh5) fVar;
        return n51.f.a(this.BaseResponse, uh5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387385d), java.lang.Integer.valueOf(uh5Var.f387385d)) && n51.f.a(this.f387386e, uh5Var.f387386e) && n51.f.a(java.lang.Integer.valueOf(this.f387387f), java.lang.Integer.valueOf(uh5Var.f387387f)) && n51.f.a(this.f387388g, uh5Var.f387388g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f387385d);
            java.lang.String str = this.f387386e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f387387f);
            r45.m67 m67Var = this.f387388g;
            if (m67Var != null) {
                fVar.i(5, m67Var.computeSize());
                this.f387388g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387385d);
            java.lang.String str2 = this.f387386e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f387387f);
            r45.m67 m67Var2 = this.f387388g;
            return m67Var2 != null ? e17 + b36.f.i(5, m67Var2.computeSize()) : e17;
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
        r45.uh5 uh5Var = (r45.uh5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                uh5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            uh5Var.f387385d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            uh5Var.f387386e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            uh5Var.f387387f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.m67 m67Var3 = new r45.m67();
            if (bArr2 != null && bArr2.length > 0) {
                m67Var3.parseFrom(bArr2);
            }
            uh5Var.f387388g = m67Var3;
        }
        return 0;
    }
}
