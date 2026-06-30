package r45;

/* loaded from: classes2.dex */
public class me1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f380396d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380397e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me1)) {
            return false;
        }
        r45.me1 me1Var = (r45.me1) fVar;
        return n51.f.a(this.f380396d, me1Var.f380396d) && n51.f.a(this.f380397e, me1Var.f380397e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f380396d;
            if (finderContact != null) {
                fVar.i(1, finderContact.computeSize());
                this.f380396d.writeFields(fVar);
            }
            java.lang.String str = this.f380397e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f380396d;
            int i18 = finderContact2 != null ? 0 + b36.f.i(1, finderContact2.computeSize()) : 0;
            java.lang.String str2 = this.f380397e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.me1 me1Var = (r45.me1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            me1Var.f380397e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
            if (bArr != null && bArr.length > 0) {
                finderContact3.parseFrom(bArr);
            }
            me1Var.f380396d = finderContact3;
        }
        return 0;
    }
}
