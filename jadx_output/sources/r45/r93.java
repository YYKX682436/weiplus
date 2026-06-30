package r45;

/* loaded from: classes9.dex */
public class r93 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384654d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384655e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oy3 f384656f;

    /* renamed from: g, reason: collision with root package name */
    public r45.py3 f384657g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r93)) {
            return false;
        }
        r45.r93 r93Var = (r45.r93) fVar;
        return n51.f.a(this.BaseResponse, r93Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384654d), java.lang.Integer.valueOf(r93Var.f384654d)) && n51.f.a(this.f384655e, r93Var.f384655e) && n51.f.a(this.f384656f, r93Var.f384656f) && n51.f.a(this.f384657g, r93Var.f384657g);
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
            fVar.e(2, this.f384654d);
            java.lang.String str = this.f384655e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.oy3 oy3Var = this.f384656f;
            if (oy3Var != null) {
                fVar.i(4, oy3Var.computeSize());
                this.f384656f.writeFields(fVar);
            }
            r45.py3 py3Var = this.f384657g;
            if (py3Var != null) {
                fVar.i(5, py3Var.computeSize());
                this.f384657g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384654d);
            java.lang.String str2 = this.f384655e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.oy3 oy3Var2 = this.f384656f;
            if (oy3Var2 != null) {
                i18 += b36.f.i(4, oy3Var2.computeSize());
            }
            r45.py3 py3Var2 = this.f384657g;
            return py3Var2 != null ? i18 + b36.f.i(5, py3Var2.computeSize()) : i18;
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
        r45.r93 r93Var = (r45.r93) objArr[1];
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
                r93Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            r93Var.f384654d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            r93Var.f384655e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.oy3 oy3Var3 = new r45.oy3();
                if (bArr2 != null && bArr2.length > 0) {
                    oy3Var3.parseFrom(bArr2);
                }
                r93Var.f384656f = oy3Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.py3 py3Var3 = new r45.py3();
            if (bArr3 != null && bArr3.length > 0) {
                py3Var3.parseFrom(bArr3);
            }
            r93Var.f384657g = py3Var3;
        }
        return 0;
    }
}
