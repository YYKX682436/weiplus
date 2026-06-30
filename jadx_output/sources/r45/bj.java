package r45;

/* loaded from: classes4.dex */
public class bj extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370789d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370790e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370791f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.GoodsObject f370792g;

    /* renamed from: h, reason: collision with root package name */
    public long f370793h;

    /* renamed from: i, reason: collision with root package name */
    public int f370794i;

    /* renamed from: m, reason: collision with root package name */
    public int f370795m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370796n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bj)) {
            return false;
        }
        r45.bj bjVar = (r45.bj) fVar;
        return n51.f.a(this.BaseResponse, bjVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370789d), java.lang.Integer.valueOf(bjVar.f370789d)) && n51.f.a(this.f370790e, bjVar.f370790e) && n51.f.a(this.f370791f, bjVar.f370791f) && n51.f.a(this.f370792g, bjVar.f370792g) && n51.f.a(java.lang.Long.valueOf(this.f370793h), java.lang.Long.valueOf(bjVar.f370793h)) && n51.f.a(java.lang.Integer.valueOf(this.f370794i), java.lang.Integer.valueOf(bjVar.f370794i)) && n51.f.a(java.lang.Integer.valueOf(this.f370795m), java.lang.Integer.valueOf(bjVar.f370795m)) && n51.f.a(this.f370796n, bjVar.f370796n);
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
            fVar.e(2, this.f370789d);
            java.lang.String str = this.f370790e;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f370791f;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            com.tencent.mm.protocal.protobuf.GoodsObject goodsObject = this.f370792g;
            if (goodsObject != null) {
                fVar.i(9, goodsObject.computeSize());
                this.f370792g.writeFields(fVar);
            }
            fVar.h(11, this.f370793h);
            fVar.e(14, this.f370794i);
            fVar.e(15, this.f370795m);
            java.lang.String str3 = this.f370796n;
            if (str3 != null) {
                fVar.j(21, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370789d);
            java.lang.String str4 = this.f370790e;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            java.lang.String str5 = this.f370791f;
            if (str5 != null) {
                i18 += b36.f.j(8, str5);
            }
            com.tencent.mm.protocal.protobuf.GoodsObject goodsObject2 = this.f370792g;
            if (goodsObject2 != null) {
                i18 += b36.f.i(9, goodsObject2.computeSize());
            }
            int h17 = i18 + b36.f.h(11, this.f370793h) + b36.f.e(14, this.f370794i) + b36.f.e(15, this.f370795m);
            java.lang.String str6 = this.f370796n;
            return str6 != null ? h17 + b36.f.j(21, str6) : h17;
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
        r45.bj bjVar = (r45.bj) objArr[1];
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
                bjVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bjVar.f370789d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 7) {
            bjVar.f370790e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 8) {
            bjVar.f370791f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 9) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mm.protocal.protobuf.GoodsObject goodsObject3 = new com.tencent.mm.protocal.protobuf.GoodsObject();
                if (bArr2 != null && bArr2.length > 0) {
                    goodsObject3.parseFrom(bArr2);
                }
                bjVar.f370792g = goodsObject3;
            }
            return 0;
        }
        if (intValue == 11) {
            bjVar.f370793h = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 21) {
            bjVar.f370796n = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 14) {
            bjVar.f370794i = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 15) {
            return -1;
        }
        bjVar.f370795m = aVar2.g(intValue);
        return 0;
    }
}
