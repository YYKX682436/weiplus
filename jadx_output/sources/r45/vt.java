package r45;

/* loaded from: classes4.dex */
public class vt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388511d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f388512e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f388513f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt)) {
            return false;
        }
        r45.vt vtVar = (r45.vt) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388511d), java.lang.Integer.valueOf(vtVar.f388511d)) && n51.f.a(this.f388512e, vtVar.f388512e) && n51.f.a(java.lang.Boolean.valueOf(this.f388513f), java.lang.Boolean.valueOf(vtVar.f388513f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388511d);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f388512e;
            if (finderJumpInfo != null) {
                fVar.i(2, finderJumpInfo.computeSize());
                this.f388512e.writeFields(fVar);
            }
            fVar.a(3, this.f388513f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388511d) + 0;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.f388512e;
            if (finderJumpInfo2 != null) {
                e17 += b36.f.i(2, finderJumpInfo2.computeSize());
            }
            return e17 + b36.f.a(3, this.f388513f);
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
        r45.vt vtVar = (r45.vt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vtVar.f388511d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            vtVar.f388513f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            if (bArr != null && bArr.length > 0) {
                finderJumpInfo3.parseFrom(bArr);
            }
            vtVar.f388512e = finderJumpInfo3;
        }
        return 0;
    }
}
