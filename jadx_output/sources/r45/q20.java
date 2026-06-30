package r45;

/* loaded from: classes7.dex */
public class q20 extends r45.mr5 {

    /* renamed from: e, reason: collision with root package name */
    public int f383582e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383583f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f383581d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f383584g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q20)) {
            return false;
        }
        r45.q20 q20Var = (r45.q20) fVar;
        return n51.f.a(this.BaseRequest, q20Var.BaseRequest) && n51.f.a(this.f383581d, q20Var.f383581d) && n51.f.a(java.lang.Integer.valueOf(this.f383582e), java.lang.Integer.valueOf(q20Var.f383582e)) && n51.f.a(this.f383583f, q20Var.f383583f) && n51.f.a(this.f383584g, q20Var.f383584g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383581d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 2, linkedList);
            fVar.e(3, this.f383582e);
            java.lang.String str = this.f383583f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, this.f383584g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 2, linkedList) + b36.f.e(3, this.f383582e);
            java.lang.String str2 = this.f383583f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.g(5, 8, this.f383584g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f383584g.clear();
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
        r45.q20 q20Var = (r45.q20) objArr[1];
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
                q20Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            q20Var.f383581d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            q20Var.f383582e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            q20Var.f383583f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.p20 p20Var = new r45.p20();
            if (bArr3 != null && bArr3.length > 0) {
                p20Var.parseFrom(bArr3);
            }
            q20Var.f383584g.add(p20Var);
        }
        return 0;
    }
}
