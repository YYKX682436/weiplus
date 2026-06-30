package r45;

/* loaded from: classes4.dex */
public class kf6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.c50 f378664d;

    /* renamed from: e, reason: collision with root package name */
    public int f378665e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f378666f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kf6)) {
            return false;
        }
        r45.kf6 kf6Var = (r45.kf6) fVar;
        return n51.f.a(this.BaseResponse, kf6Var.BaseResponse) && n51.f.a(this.f378664d, kf6Var.f378664d) && n51.f.a(java.lang.Integer.valueOf(this.f378665e), java.lang.Integer.valueOf(kf6Var.f378665e)) && n51.f.a(this.f378666f, kf6Var.f378666f);
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
            r45.c50 c50Var = this.f378664d;
            if (c50Var != null) {
                fVar.i(2, c50Var.computeSize());
                this.f378664d.writeFields(fVar);
            }
            fVar.e(3, this.f378665e);
            r45.cu5 cu5Var = this.f378666f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f378666f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.c50 c50Var2 = this.f378664d;
            if (c50Var2 != null) {
                i18 += b36.f.i(2, c50Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f378665e);
            r45.cu5 cu5Var2 = this.f378666f;
            return cu5Var2 != null ? e17 + b36.f.i(4, cu5Var2.computeSize()) : e17;
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
        r45.kf6 kf6Var = (r45.kf6) objArr[1];
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
                kf6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.c50 c50Var3 = new r45.c50();
                if (bArr2 != null && bArr2.length > 0) {
                    c50Var3.parseFrom(bArr2);
                }
                kf6Var.f378664d = c50Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            kf6Var.f378665e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr3 != null && bArr3.length > 0) {
                cu5Var3.b(bArr3);
            }
            kf6Var.f378666f = cu5Var3;
        }
        return 0;
    }
}
