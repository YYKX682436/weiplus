package r45;

/* loaded from: classes2.dex */
public class un3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f387490d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f387492f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f387491e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f387493g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.un3)) {
            return false;
        }
        r45.un3 un3Var = (r45.un3) fVar;
        return n51.f.a(this.BaseResponse, un3Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f387490d), java.lang.Boolean.valueOf(un3Var.f387490d)) && n51.f.a(this.f387491e, un3Var.f387491e) && n51.f.a(java.lang.Boolean.valueOf(this.f387492f), java.lang.Boolean.valueOf(un3Var.f387492f)) && n51.f.a(this.f387493g, un3Var.f387493g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387493g;
        java.util.LinkedList linkedList2 = this.f387491e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.a(2, this.f387490d);
            fVar.g(3, 8, linkedList2);
            fVar.a(4, this.f387492f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f387490d) + b36.f.g(3, 8, linkedList2) + b36.f.a(4, this.f387492f) + b36.f.g(5, 8, linkedList);
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
        r45.un3 un3Var = (r45.un3) objArr[1];
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
                un3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            un3Var.f387490d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.q06 q06Var = new r45.q06();
                if (bArr3 != null && bArr3.length > 0) {
                    q06Var.parseFrom(bArr3);
                }
                un3Var.f387491e.add(q06Var);
            }
            return 0;
        }
        if (intValue == 4) {
            un3Var.f387492f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.q06 q06Var2 = new r45.q06();
            if (bArr4 != null && bArr4.length > 0) {
                q06Var2.parseFrom(bArr4);
            }
            un3Var.f387493g.add(q06Var2);
        }
        return 0;
    }
}
