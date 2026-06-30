package r45;

/* loaded from: classes4.dex */
public class z51 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f391723d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391724e;

    /* renamed from: f, reason: collision with root package name */
    public int f391725f;

    /* renamed from: g, reason: collision with root package name */
    public int f391726g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z51)) {
            return false;
        }
        r45.z51 z51Var = (r45.z51) fVar;
        return n51.f.a(this.BaseResponse, z51Var.BaseResponse) && n51.f.a(this.f391723d, z51Var.f391723d) && n51.f.a(this.f391724e, z51Var.f391724e) && n51.f.a(java.lang.Integer.valueOf(this.f391725f), java.lang.Integer.valueOf(z51Var.f391725f)) && n51.f.a(java.lang.Integer.valueOf(this.f391726g), java.lang.Integer.valueOf(z51Var.f391726g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391723d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f391724e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f391725f);
            fVar.e(5, this.f391726g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f391724e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f391725f) + b36.f.e(5, this.f391726g);
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
        r45.z51 z51Var = (r45.z51) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                z51Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                z51Var.f391724e = aVar2.d(intValue);
                return 0;
            }
            if (intValue == 4) {
                z51Var.f391725f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            z51Var.f391726g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.rz6 rz6Var = new r45.rz6();
            if (bArr3 != null && bArr3.length > 0) {
                rz6Var.parseFrom(bArr3);
            }
            z51Var.f391723d.add(rz6Var);
        }
        return 0;
    }
}
