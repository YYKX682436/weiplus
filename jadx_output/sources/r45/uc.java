package r45;

/* loaded from: classes4.dex */
public class uc extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f387205d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f387206e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jx3 f387207f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f387208g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uc)) {
            return false;
        }
        r45.uc ucVar = (r45.uc) fVar;
        return n51.f.a(this.BaseResponse, ucVar.BaseResponse) && n51.f.a(this.f387205d, ucVar.f387205d) && n51.f.a(this.f387206e, ucVar.f387206e) && n51.f.a(this.f387207f, ucVar.f387207f) && n51.f.a(this.f387208g, ucVar.f387208g);
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
            r45.cu5 cu5Var = this.f387205d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f387205d.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f387206e;
            if (cu5Var2 != null) {
                fVar.i(3, cu5Var2.computeSize());
                this.f387206e.writeFields(fVar);
            }
            r45.jx3 jx3Var = this.f387207f;
            if (jx3Var != null) {
                fVar.i(4, jx3Var.computeSize());
                this.f387207f.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f387208g;
            if (cu5Var3 != null) {
                fVar.i(5, cu5Var3.computeSize());
                this.f387208g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var4 = this.f387205d;
            if (cu5Var4 != null) {
                i18 += b36.f.i(2, cu5Var4.computeSize());
            }
            r45.cu5 cu5Var5 = this.f387206e;
            if (cu5Var5 != null) {
                i18 += b36.f.i(3, cu5Var5.computeSize());
            }
            r45.jx3 jx3Var2 = this.f387207f;
            if (jx3Var2 != null) {
                i18 += b36.f.i(4, jx3Var2.computeSize());
            }
            r45.cu5 cu5Var6 = this.f387208g;
            return cu5Var6 != null ? i18 + b36.f.i(5, cu5Var6.computeSize()) : i18;
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
        r45.uc ucVar = (r45.uc) objArr[1];
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
                ucVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var7 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var7.b(bArr2);
                }
                ucVar.f387205d = cu5Var7;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.cu5 cu5Var8 = new r45.cu5();
                if (bArr3 != null && bArr3.length > 0) {
                    cu5Var8.b(bArr3);
                }
                ucVar.f387206e = cu5Var8;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.jx3 jx3Var3 = new r45.jx3();
                if (bArr4 != null && bArr4.length > 0) {
                    jx3Var3.parseFrom(bArr4);
                }
                ucVar.f387207f = jx3Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.cu5 cu5Var9 = new r45.cu5();
            if (bArr5 != null && bArr5.length > 0) {
                cu5Var9.b(bArr5);
            }
            ucVar.f387208g = cu5Var9;
        }
        return 0;
    }
}
