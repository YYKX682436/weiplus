package r45;

/* loaded from: classes2.dex */
public class cq2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f371784d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371785e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371786f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cq2)) {
            return false;
        }
        r45.cq2 cq2Var = (r45.cq2) fVar;
        return n51.f.a(this.f371784d, cq2Var.f371784d) && n51.f.a(this.f371785e, cq2Var.f371785e) && n51.f.a(this.f371786f, cq2Var.f371786f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371784d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f371785e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f371786f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str3 = this.f371785e;
            if (str3 != null) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f371786f;
            return str4 != null ? g17 + b36.f.j(3, str4) : g17;
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
        r45.cq2 cq2Var = (r45.cq2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                cq2Var.f371785e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            cq2Var.f371786f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.bq2 bq2Var = new r45.bq2();
            if (bArr2 != null && bArr2.length > 0) {
                bq2Var.parseFrom(bArr2);
            }
            cq2Var.f371784d.add(bq2Var);
        }
        return 0;
    }
}
