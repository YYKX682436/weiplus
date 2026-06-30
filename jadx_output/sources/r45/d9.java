package r45;

/* loaded from: classes4.dex */
public class d9 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f372242d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.c9 f372243e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d9)) {
            return false;
        }
        r45.d9 d9Var = (r45.d9) fVar;
        return n51.f.a(this.BaseRequest, d9Var.BaseRequest) && n51.f.a(this.f372242d, d9Var.f372242d) && n51.f.a(this.f372243e, d9Var.f372243e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372242d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.c9 c9Var = this.f372243e;
            if (c9Var != null) {
                fVar.i(3, c9Var.computeSize());
                this.f372243e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            r45.c9 c9Var2 = this.f372243e;
            return c9Var2 != null ? i18 + b36.f.i(3, c9Var2.computeSize()) : i18;
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
        r45.d9 d9Var = (r45.d9) objArr[1];
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
                d9Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.c9 c9Var3 = new r45.c9();
                if (bArr3 != null && bArr3.length > 0) {
                    c9Var3.parseFrom(bArr3);
                }
                d9Var.f372242d.add(c9Var3);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.c9 c9Var4 = new r45.c9();
            if (bArr4 != null && bArr4.length > 0) {
                c9Var4.parseFrom(bArr4);
            }
            d9Var.f372243e = c9Var4;
        }
        return 0;
    }
}
