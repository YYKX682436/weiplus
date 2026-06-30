package r45;

/* loaded from: classes4.dex */
public class qe5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383912d;

    /* renamed from: e, reason: collision with root package name */
    public long f383913e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f383914f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f383915g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qe5)) {
            return false;
        }
        r45.qe5 qe5Var = (r45.qe5) fVar;
        return n51.f.a(this.BaseResponse, qe5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383912d), java.lang.Integer.valueOf(qe5Var.f383912d)) && n51.f.a(java.lang.Long.valueOf(this.f383913e), java.lang.Long.valueOf(qe5Var.f383913e)) && n51.f.a(this.f383914f, qe5Var.f383914f) && n51.f.a(this.f383915g, qe5Var.f383915g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383915g;
        java.util.LinkedList linkedList2 = this.f383914f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f383912d);
            fVar.h(3, this.f383913e);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383912d) + b36.f.h(3, this.f383913e) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.qe5 qe5Var = (r45.qe5) objArr[1];
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
                qe5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qe5Var.f383912d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            qe5Var.f383913e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.fe5 fe5Var = new r45.fe5();
                if (bArr3 != null && bArr3.length > 0) {
                    fe5Var.parseFrom(bArr3);
                }
                qe5Var.f383914f.add(fe5Var);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.fe5 fe5Var2 = new r45.fe5();
            if (bArr4 != null && bArr4.length > 0) {
                fe5Var2.parseFrom(bArr4);
            }
            qe5Var.f383915g.add(fe5Var2);
        }
        return 0;
    }
}
