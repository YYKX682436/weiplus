package r45;

/* loaded from: classes8.dex */
public class i20 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376674d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376675e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376676f;

    /* renamed from: g, reason: collision with root package name */
    public int f376677g;

    /* renamed from: h, reason: collision with root package name */
    public int f376678h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376679i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i20)) {
            return false;
        }
        r45.i20 i20Var = (r45.i20) fVar;
        return n51.f.a(this.BaseResponse, i20Var.BaseResponse) && n51.f.a(this.f376674d, i20Var.f376674d) && n51.f.a(this.f376675e, i20Var.f376675e) && n51.f.a(this.f376676f, i20Var.f376676f) && n51.f.a(java.lang.Integer.valueOf(this.f376677g), java.lang.Integer.valueOf(i20Var.f376677g)) && n51.f.a(java.lang.Integer.valueOf(this.f376678h), java.lang.Integer.valueOf(i20Var.f376678h)) && n51.f.a(this.f376679i, i20Var.f376679i);
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
            com.tencent.mm.protobuf.g gVar = this.f376674d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f376675e;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f376676f;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            fVar.e(5, this.f376677g);
            fVar.e(6, this.f376678h);
            com.tencent.mm.protobuf.g gVar4 = this.f376679i;
            if (gVar4 != null) {
                fVar.b(7, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar5 = this.f376674d;
            if (gVar5 != null) {
                i18 += b36.f.b(2, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f376675e;
            if (gVar6 != null) {
                i18 += b36.f.b(3, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f376676f;
            if (gVar7 != null) {
                i18 += b36.f.b(4, gVar7);
            }
            int e17 = i18 + b36.f.e(5, this.f376677g) + b36.f.e(6, this.f376678h);
            com.tencent.mm.protobuf.g gVar8 = this.f376679i;
            return gVar8 != null ? e17 + b36.f.b(7, gVar8) : e17;
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
        r45.i20 i20Var = (r45.i20) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    i20Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                i20Var.f376674d = aVar2.d(intValue);
                return 0;
            case 3:
                i20Var.f376675e = aVar2.d(intValue);
                return 0;
            case 4:
                i20Var.f376676f = aVar2.d(intValue);
                return 0;
            case 5:
                i20Var.f376677g = aVar2.g(intValue);
                return 0;
            case 6:
                i20Var.f376678h = aVar2.g(intValue);
                return 0;
            case 7:
                i20Var.f376679i = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
