package ks3;

/* loaded from: classes4.dex */
public class c extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f311642d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f311643e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.c)) {
            return false;
        }
        ks3.c cVar = (ks3.c) fVar;
        return n51.f.a(this.BaseRequest, cVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f311642d), java.lang.Integer.valueOf(cVar.f311642d)) && n51.f.a(this.f311643e, cVar.f311643e);
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
            fVar.e(2, this.f311642d);
            fVar.g(3, 8, this.f311643e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f311642d) + b36.f.g(3, 8, this.f311643e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f311643e.clear();
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
        ks3.c cVar = (ks3.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                cVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            cVar.f311642d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            ks3.h hVar = new ks3.h();
            if (bArr3 != null && bArr3.length > 0) {
                hVar.parseFrom(bArr3);
            }
            cVar.f311643e.add(hVar);
        }
        return 0;
    }
}
