package r45;

/* loaded from: classes4.dex */
public class aw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370288d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370289e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370290f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370291g;

    /* renamed from: h, reason: collision with root package name */
    public int f370292h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aw)) {
            return false;
        }
        r45.aw awVar = (r45.aw) fVar;
        return n51.f.a(this.BaseRequest, awVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f370288d), java.lang.Integer.valueOf(awVar.f370288d)) && n51.f.a(this.f370289e, awVar.f370289e) && n51.f.a(this.f370290f, awVar.f370290f) && n51.f.a(this.f370291g, awVar.f370291g) && n51.f.a(java.lang.Integer.valueOf(this.f370292h), java.lang.Integer.valueOf(awVar.f370292h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f370288d);
            com.tencent.mm.protobuf.g gVar = this.f370289e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370290f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            java.lang.String str = this.f370291g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f370292h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f370288d);
            com.tencent.mm.protobuf.g gVar3 = this.f370289e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f370290f;
            if (gVar4 != null) {
                i18 += b36.f.b(4, gVar4);
            }
            java.lang.String str2 = this.f370291g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f370292h);
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
        r45.aw awVar = (r45.aw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    awVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                awVar.f370288d = aVar2.g(intValue);
                return 0;
            case 3:
                awVar.f370289e = aVar2.d(intValue);
                return 0;
            case 4:
                awVar.f370290f = aVar2.d(intValue);
                return 0;
            case 5:
                awVar.f370291g = aVar2.k(intValue);
                return 0;
            case 6:
                awVar.f370292h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
