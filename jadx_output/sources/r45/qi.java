package r45;

/* loaded from: classes4.dex */
public class qi extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384006d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.GoodsObject f384007e;

    /* renamed from: f, reason: collision with root package name */
    public float f384008f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384009g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384010h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qi)) {
            return false;
        }
        r45.qi qiVar = (r45.qi) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384006d), java.lang.Integer.valueOf(qiVar.f384006d)) && n51.f.a(this.f384007e, qiVar.f384007e) && n51.f.a(java.lang.Float.valueOf(this.f384008f), java.lang.Float.valueOf(qiVar.f384008f)) && n51.f.a(this.f384009g, qiVar.f384009g) && n51.f.a(this.f384010h, qiVar.f384010h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384006d);
            com.tencent.mm.protocal.protobuf.GoodsObject goodsObject = this.f384007e;
            if (goodsObject != null) {
                fVar.i(2, goodsObject.computeSize());
                this.f384007e.writeFields(fVar);
            }
            fVar.d(3, this.f384008f);
            java.lang.String str = this.f384009g;
            if (str != null) {
                fVar.j(4, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f384010h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384006d) + 0;
            com.tencent.mm.protocal.protobuf.GoodsObject goodsObject2 = this.f384007e;
            if (goodsObject2 != null) {
                e17 += b36.f.i(2, goodsObject2.computeSize());
            }
            int d17 = e17 + b36.f.d(3, this.f384008f);
            java.lang.String str2 = this.f384009g;
            if (str2 != null) {
                d17 += b36.f.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f384010h;
            return gVar2 != null ? d17 + b36.f.b(5, gVar2) : d17;
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
        r45.qi qiVar = (r45.qi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qiVar.f384006d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                qiVar.f384008f = aVar2.f(intValue);
                return 0;
            }
            if (intValue == 4) {
                qiVar.f384009g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            qiVar.f384010h = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mm.protocal.protobuf.GoodsObject goodsObject3 = new com.tencent.mm.protocal.protobuf.GoodsObject();
            if (bArr != null && bArr.length > 0) {
                goodsObject3.parseFrom(bArr);
            }
            qiVar.f384007e = goodsObject3;
        }
        return 0;
    }
}
