package r45;

/* loaded from: classes4.dex */
public class rq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f385128d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f385129e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rq6)) {
            return false;
        }
        r45.rq6 rq6Var = (r45.rq6) fVar;
        return n51.f.a(this.f385128d, rq6Var.f385128d) && n51.f.a(java.lang.Integer.valueOf(this.f385129e), java.lang.Integer.valueOf(rq6Var.f385129e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385128d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f385129e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f385129e);
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
        r45.rq6 rq6Var = (r45.rq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            rq6Var.f385129e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.tq6 tq6Var = new r45.tq6();
            if (bArr2 != null && bArr2.length > 0) {
                tq6Var.parseFrom(bArr2);
            }
            rq6Var.f385128d.add(tq6Var);
        }
        return 0;
    }
}
