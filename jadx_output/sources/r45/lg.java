package r45;

/* loaded from: classes4.dex */
public class lg extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379441d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f379442e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f379443f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lg)) {
            return false;
        }
        r45.lg lgVar = (r45.lg) fVar;
        return n51.f.a(this.BaseResponse, lgVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379441d), java.lang.Integer.valueOf(lgVar.f379441d)) && n51.f.a(this.f379442e, lgVar.f379442e) && n51.f.a(this.f379443f, lgVar.f379443f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379443f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f379441d);
            fVar.k(3, 2, this.f379442e);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379441d) + b36.f.k(3, 2, this.f379442e) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f379442e.clear();
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
        r45.lg lgVar = (r45.lg) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                lgVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            lgVar.f379441d = aVar2.g(intValue);
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
            lgVar.f379442e = linkedList2;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr4 = (byte[]) j18.get(i19);
            r45.nq0 nq0Var = new r45.nq0();
            if (bArr4 != null && bArr4.length > 0) {
                nq0Var.parseFrom(bArr4);
            }
            lgVar.f379443f.add(nq0Var);
        }
        return 0;
    }
}
