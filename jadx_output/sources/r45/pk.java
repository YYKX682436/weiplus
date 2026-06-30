package r45;

/* loaded from: classes2.dex */
public class pk extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f383122d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383123e;

    /* renamed from: f, reason: collision with root package name */
    public int f383124f;

    /* renamed from: g, reason: collision with root package name */
    public int f383125g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pk)) {
            return false;
        }
        r45.pk pkVar = (r45.pk) fVar;
        return n51.f.a(this.BaseRequest, pkVar.BaseRequest) && n51.f.a(this.f383122d, pkVar.f383122d) && n51.f.a(this.f383123e, pkVar.f383123e) && n51.f.a(java.lang.Integer.valueOf(this.f383124f), java.lang.Integer.valueOf(pkVar.f383124f)) && n51.f.a(java.lang.Integer.valueOf(this.f383125g), java.lang.Integer.valueOf(pkVar.f383125g));
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
            fVar.g(2, 1, this.f383122d);
            com.tencent.mm.protobuf.g gVar = this.f383123e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f383124f);
            fVar.e(5, this.f383125g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 1, this.f383122d);
            com.tencent.mm.protobuf.g gVar2 = this.f383123e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f383124f) + b36.f.e(5, this.f383125g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383122d.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.pk pkVar = (r45.pk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                pkVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            pkVar.f383122d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            pkVar.f383123e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            pkVar.f383124f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        pkVar.f383125g = aVar2.g(intValue);
        return 0;
    }
}
