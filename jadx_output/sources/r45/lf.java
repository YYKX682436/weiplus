package r45;

/* loaded from: classes4.dex */
public class lf extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379400d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f379401e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f379402f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lf)) {
            return false;
        }
        r45.lf lfVar = (r45.lf) fVar;
        return n51.f.a(this.BaseRequest, lfVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f379400d), java.lang.Integer.valueOf(lfVar.f379400d)) && n51.f.a(this.f379401e, lfVar.f379401e) && n51.f.a(this.f379402f, lfVar.f379402f);
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
            fVar.e(2, this.f379400d);
            fVar.k(3, 2, this.f379401e);
            r45.cu5 cu5Var = this.f379402f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f379402f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f379400d) + b36.f.k(3, 2, this.f379401e);
            r45.cu5 cu5Var2 = this.f379402f;
            return cu5Var2 != null ? i18 + b36.f.i(4, cu5Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f379401e.clear();
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
        r45.lf lfVar = (r45.lf) objArr[1];
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
                lfVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            lfVar.f379400d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            byte[] bArr3 = aVar2.d(intValue).f192156a;
            d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
            kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
            e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            while (aVar3.f247596c < aVar3.f247595b) {
                linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
            }
            lfVar.f379401e = linkedList;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr4 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr4 != null && bArr4.length > 0) {
                cu5Var3.b(bArr4);
            }
            lfVar.f379402f = cu5Var3;
        }
        return 0;
    }
}
