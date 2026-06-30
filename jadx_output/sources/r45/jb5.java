package r45;

/* loaded from: classes4.dex */
public class jb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.lj6 f377688d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f377689e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jb5)) {
            return false;
        }
        r45.jb5 jb5Var = (r45.jb5) fVar;
        return n51.f.a(this.BaseResponse, jb5Var.BaseResponse) && n51.f.a(this.f377688d, jb5Var.f377688d) && n51.f.a(this.f377689e, jb5Var.f377689e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377689e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.lj6 lj6Var = this.f377688d;
            if (lj6Var != null) {
                fVar.i(2, lj6Var.computeSize());
                this.f377688d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.lj6 lj6Var2 = this.f377688d;
            if (lj6Var2 != null) {
                i18 += b36.f.i(2, lj6Var2.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
        r45.jb5 jb5Var = (r45.jb5) objArr[1];
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
                jb5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.lj6 lj6Var3 = new r45.lj6();
                if (bArr3 != null && bArr3.length > 0) {
                    lj6Var3.parseFrom(bArr3);
                }
                jb5Var.f377688d = lj6Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.lj6 lj6Var4 = new r45.lj6();
            if (bArr4 != null && bArr4.length > 0) {
                lj6Var4.parseFrom(bArr4);
            }
            jb5Var.f377689e.add(lj6Var4);
        }
        return 0;
    }
}
