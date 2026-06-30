package r45;

/* loaded from: classes4.dex */
public class te extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386338d;

    /* renamed from: f, reason: collision with root package name */
    public int f386340f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f386339e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f386341g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.te)) {
            return false;
        }
        r45.te teVar = (r45.te) fVar;
        return n51.f.a(this.BaseRequest, teVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f386338d), java.lang.Integer.valueOf(teVar.f386338d)) && n51.f.a(this.f386339e, teVar.f386339e) && n51.f.a(java.lang.Integer.valueOf(this.f386340f), java.lang.Integer.valueOf(teVar.f386340f)) && n51.f.a(this.f386341g, teVar.f386341g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386341g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f386338d);
            fVar.k(3, 2, this.f386339e);
            fVar.e(4, this.f386340f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f386338d) + b36.f.k(3, 2, this.f386339e) + b36.f.e(4, this.f386340f) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386339e.clear();
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
        r45.te teVar = (r45.te) objArr[1];
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
                teVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            teVar.f386338d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            byte[] bArr3 = aVar2.d(intValue).f192156a;
            d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
            kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
            e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            while (aVar3.f247596c < aVar3.f247595b) {
                linkedList2.add(java.lang.Integer.valueOf(aVar3.f()));
            }
            teVar.f386339e = linkedList2;
            return 0;
        }
        if (intValue == 4) {
            teVar.f386340f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr4 = (byte[]) j18.get(i19);
            r45.uo6 uo6Var = new r45.uo6();
            if (bArr4 != null && bArr4.length > 0) {
                uo6Var.parseFrom(bArr4);
            }
            teVar.f386341g.add(uo6Var);
        }
        return 0;
    }
}
