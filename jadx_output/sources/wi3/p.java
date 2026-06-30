package wi3;

/* loaded from: classes4.dex */
public class p extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f446255d;

    /* renamed from: e, reason: collision with root package name */
    public long f446256e;

    /* renamed from: f, reason: collision with root package name */
    public int f446257f;

    /* renamed from: g, reason: collision with root package name */
    public wi3.o f446258g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f446259h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wi3.p)) {
            return false;
        }
        wi3.p pVar = (wi3.p) fVar;
        return n51.f.a(this.BaseRequest, pVar.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f446255d), java.lang.Long.valueOf(pVar.f446255d)) && n51.f.a(java.lang.Long.valueOf(this.f446256e), java.lang.Long.valueOf(pVar.f446256e)) && n51.f.a(java.lang.Integer.valueOf(this.f446257f), java.lang.Integer.valueOf(pVar.f446257f)) && n51.f.a(this.f446258g, pVar.f446258g) && n51.f.a(this.f446259h, pVar.f446259h);
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
            fVar.h(2, this.f446255d);
            fVar.h(3, this.f446256e);
            fVar.e(4, this.f446257f);
            wi3.o oVar = this.f446258g;
            if (oVar != null) {
                fVar.i(5, oVar.computeSize());
                this.f446258g.writeFields(fVar);
            }
            fVar.g(6, 8, this.f446259h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f446255d) + b36.f.h(3, this.f446256e) + b36.f.e(4, this.f446257f);
            wi3.o oVar2 = this.f446258g;
            if (oVar2 != null) {
                i18 += b36.f.i(5, oVar2.computeSize());
            }
            return i18 + b36.f.g(6, 8, this.f446259h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f446259h.clear();
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
        wi3.p pVar = (wi3.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    pVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                pVar.f446255d = aVar2.i(intValue);
                return 0;
            case 3:
                pVar.f446256e = aVar2.i(intValue);
                return 0;
            case 4:
                pVar.f446257f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    wi3.o oVar3 = new wi3.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar3.parseFrom(bArr3);
                    }
                    pVar.f446258g = oVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    wi3.a aVar3 = new wi3.a();
                    if (bArr4 != null && bArr4.length > 0) {
                        aVar3.parseFrom(bArr4);
                    }
                    pVar.f446259h.add(aVar3);
                }
                return 0;
            default:
                return -1;
        }
    }
}
