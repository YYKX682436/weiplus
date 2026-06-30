package r45;

/* loaded from: classes2.dex */
public class qo6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384150d;

    /* renamed from: e, reason: collision with root package name */
    public int f384151e;

    /* renamed from: f, reason: collision with root package name */
    public int f384152f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f384153g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qo6)) {
            return false;
        }
        r45.qo6 qo6Var = (r45.qo6) fVar;
        return n51.f.a(this.BaseResponse, qo6Var.BaseResponse) && n51.f.a(this.f384150d, qo6Var.f384150d) && n51.f.a(java.lang.Integer.valueOf(this.f384151e), java.lang.Integer.valueOf(qo6Var.f384151e)) && n51.f.a(java.lang.Integer.valueOf(this.f384152f), java.lang.Integer.valueOf(qo6Var.f384152f)) && n51.f.a(java.lang.Boolean.valueOf(this.f384153g), java.lang.Boolean.valueOf(qo6Var.f384153g));
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
            com.tencent.mm.protobuf.g gVar = this.f384150d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f384151e);
            fVar.e(4, this.f384152f);
            fVar.a(5, this.f384153g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f384150d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.e(3, this.f384151e) + b36.f.e(4, this.f384152f) + b36.f.a(5, this.f384153g);
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
        r45.qo6 qo6Var = (r45.qo6) objArr[1];
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
                qo6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qo6Var.f384150d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            qo6Var.f384151e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            qo6Var.f384152f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qo6Var.f384153g = aVar2.c(intValue);
        return 0;
    }
}
