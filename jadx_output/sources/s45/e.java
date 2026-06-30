package s45;

/* loaded from: classes8.dex */
public class e extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f402975d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f402976e;

    /* renamed from: f, reason: collision with root package name */
    public s45.g f402977f;

    /* renamed from: g, reason: collision with root package name */
    public int f402978g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof s45.e)) {
            return false;
        }
        s45.e eVar = (s45.e) fVar;
        return n51.f.a(this.BaseRequest, eVar.BaseRequest) && n51.f.a(this.f402975d, eVar.f402975d) && n51.f.a(java.lang.Integer.valueOf(this.f402976e), java.lang.Integer.valueOf(eVar.f402976e)) && n51.f.a(this.f402977f, eVar.f402977f) && n51.f.a(java.lang.Integer.valueOf(this.f402978g), java.lang.Integer.valueOf(eVar.f402978g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f402975d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.e(3, this.f402976e);
            s45.g gVar = this.f402977f;
            if (gVar != null) {
                fVar.i(4, gVar.computeSize());
                this.f402977f.writeFields(fVar);
            }
            fVar.e(5, this.f402978g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.e(3, this.f402976e);
            s45.g gVar2 = this.f402977f;
            if (gVar2 != null) {
                i18 += b36.f.i(4, gVar2.computeSize());
            }
            return i18 + b36.f.e(5, this.f402978g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        s45.e eVar = (s45.e) objArr[1];
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
                eVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            eVar.f402975d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            eVar.f402976e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            eVar.f402978g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            s45.g gVar3 = new s45.g();
            if (bArr3 != null && bArr3.length > 0) {
                gVar3.parseFrom(bArr3);
            }
            eVar.f402977f = gVar3;
        }
        return 0;
    }
}
