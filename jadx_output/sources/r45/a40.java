package r45;

/* loaded from: classes8.dex */
public class a40 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.pb7 f369712d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369713e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f369714f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a40)) {
            return false;
        }
        r45.a40 a40Var = (r45.a40) fVar;
        return n51.f.a(this.BaseResponse, a40Var.BaseResponse) && n51.f.a(this.f369712d, a40Var.f369712d) && n51.f.a(this.f369713e, a40Var.f369713e) && n51.f.a(this.f369714f, a40Var.f369714f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f369714f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.pb7 pb7Var = this.f369712d;
            if (pb7Var != null) {
                fVar.i(2, pb7Var.computeSize());
                this.f369712d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f369713e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.pb7 pb7Var2 = this.f369712d;
            if (pb7Var2 != null) {
                i18 += b36.f.i(2, pb7Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f369713e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.g(4, 8, linkedList);
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
        r45.a40 a40Var = (r45.a40) objArr[1];
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
                a40Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.pb7 pb7Var3 = new r45.pb7();
                if (bArr3 != null && bArr3.length > 0) {
                    pb7Var3.parseFrom(bArr3);
                }
                a40Var.f369712d = pb7Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            a40Var.f369713e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.mj6 mj6Var = new r45.mj6();
            if (bArr4 != null && bArr4.length > 0) {
                mj6Var.parseFrom(bArr4);
            }
            a40Var.f369714f.add(mj6Var);
        }
        return 0;
    }
}
