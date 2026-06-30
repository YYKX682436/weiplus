package r45;

/* loaded from: classes8.dex */
public class cc5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371472d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qb7 f371473e;

    /* renamed from: f, reason: collision with root package name */
    public r45.f04 f371474f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cc5)) {
            return false;
        }
        r45.cc5 cc5Var = (r45.cc5) fVar;
        return n51.f.a(this.BaseResponse, cc5Var.BaseResponse) && n51.f.a(this.f371472d, cc5Var.f371472d) && n51.f.a(this.f371473e, cc5Var.f371473e) && n51.f.a(this.f371474f, cc5Var.f371474f);
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
            com.tencent.mm.protobuf.g gVar = this.f371472d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            r45.qb7 qb7Var = this.f371473e;
            if (qb7Var != null) {
                fVar.i(3, qb7Var.computeSize());
                this.f371473e.writeFields(fVar);
            }
            r45.f04 f04Var = this.f371474f;
            if (f04Var != null) {
                fVar.i(100, f04Var.computeSize());
                this.f371474f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f371472d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            r45.qb7 qb7Var2 = this.f371473e;
            if (qb7Var2 != null) {
                i18 += b36.f.i(3, qb7Var2.computeSize());
            }
            r45.f04 f04Var2 = this.f371474f;
            return f04Var2 != null ? i18 + b36.f.i(100, f04Var2.computeSize()) : i18;
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
        r45.cc5 cc5Var = (r45.cc5) objArr[1];
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
                cc5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            cc5Var.f371472d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.qb7 qb7Var3 = new r45.qb7();
                if (bArr2 != null && bArr2.length > 0) {
                    qb7Var3.parseFrom(bArr2);
                }
                cc5Var.f371473e = qb7Var3;
            }
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.f04 f04Var3 = new r45.f04();
            if (bArr3 != null && bArr3.length > 0) {
                f04Var3.parseFrom(bArr3);
            }
            cc5Var.f371474f = f04Var3;
        }
        return 0;
    }
}
