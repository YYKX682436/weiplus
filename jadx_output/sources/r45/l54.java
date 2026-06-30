package r45;

/* loaded from: classes2.dex */
public class l54 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379150d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lq4 f379151e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l54)) {
            return false;
        }
        r45.l54 l54Var = (r45.l54) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379150d), java.lang.Integer.valueOf(l54Var.f379150d)) && n51.f.a(this.f379151e, l54Var.f379151e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379150d);
            r45.lq4 lq4Var = this.f379151e;
            if (lq4Var != null) {
                fVar.i(2, lq4Var.computeSize());
                this.f379151e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379150d) + 0;
            r45.lq4 lq4Var2 = this.f379151e;
            return lq4Var2 != null ? e17 + b36.f.i(2, lq4Var2.computeSize()) : e17;
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
        r45.l54 l54Var = (r45.l54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l54Var.f379150d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.lq4 lq4Var3 = new r45.lq4();
            if (bArr != null && bArr.length > 0) {
                lq4Var3.parseFrom(bArr);
            }
            l54Var.f379151e = lq4Var3;
        }
        return 0;
    }
}
