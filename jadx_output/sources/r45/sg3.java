package r45;

/* loaded from: classes4.dex */
public class sg3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385690d;

    /* renamed from: e, reason: collision with root package name */
    public int f385691e;

    /* renamed from: f, reason: collision with root package name */
    public int f385692f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f385693g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sg3)) {
            return false;
        }
        r45.sg3 sg3Var = (r45.sg3) fVar;
        return n51.f.a(this.BaseResponse, sg3Var.BaseResponse) && n51.f.a(this.f385690d, sg3Var.f385690d) && n51.f.a(java.lang.Integer.valueOf(this.f385691e), java.lang.Integer.valueOf(sg3Var.f385691e)) && n51.f.a(java.lang.Integer.valueOf(this.f385692f), java.lang.Integer.valueOf(sg3Var.f385692f)) && n51.f.a(this.f385693g, sg3Var.f385693g);
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
            java.lang.String str = this.f385690d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f385691e);
            fVar.e(4, this.f385692f);
            r45.cu5 cu5Var = this.f385693g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f385693g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f385690d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f385691e) + b36.f.e(4, this.f385692f);
            r45.cu5 cu5Var2 = this.f385693g;
            return cu5Var2 != null ? e17 + b36.f.i(5, cu5Var2.computeSize()) : e17;
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
        r45.sg3 sg3Var = (r45.sg3) objArr[1];
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
                sg3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            sg3Var.f385690d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            sg3Var.f385691e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            sg3Var.f385692f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            sg3Var.f385693g = cu5Var3;
        }
        return 0;
    }
}
