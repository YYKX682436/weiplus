package r45;

/* loaded from: classes4.dex */
public class rf extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384784d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384785e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f384786f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf)) {
            return false;
        }
        r45.rf rfVar = (r45.rf) fVar;
        return n51.f.a(this.BaseRequest, rfVar.BaseRequest) && n51.f.a(this.f384784d, rfVar.f384784d) && n51.f.a(this.f384785e, rfVar.f384785e) && n51.f.a(this.f384786f, rfVar.f384786f);
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
            java.lang.String str = this.f384784d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384785e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, this.f384786f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f384784d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f384785e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.g(4, 8, this.f384786f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f384786f.clear();
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
        r45.rf rfVar = (r45.rf) objArr[1];
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
                rfVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rfVar.f384784d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            rfVar.f384785e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.p25 p25Var = new r45.p25();
            if (bArr3 != null && bArr3.length > 0) {
                p25Var.parseFrom(bArr3);
            }
            rfVar.f384786f.add(p25Var);
        }
        return 0;
    }
}
