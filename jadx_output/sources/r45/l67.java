package r45;

/* loaded from: classes8.dex */
public class l67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379186d;

    /* renamed from: e, reason: collision with root package name */
    public r45.s67 f379187e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l67)) {
            return false;
        }
        r45.l67 l67Var = (r45.l67) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379186d), java.lang.Integer.valueOf(l67Var.f379186d)) && n51.f.a(this.f379187e, l67Var.f379187e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379186d);
            r45.s67 s67Var = this.f379187e;
            if (s67Var != null) {
                fVar.i(2, s67Var.computeSize());
                this.f379187e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379186d) + 0;
            r45.s67 s67Var2 = this.f379187e;
            return s67Var2 != null ? e17 + b36.f.i(2, s67Var2.computeSize()) : e17;
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
        r45.l67 l67Var = (r45.l67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l67Var.f379186d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.s67 s67Var3 = new r45.s67();
            if (bArr != null && bArr.length > 0) {
                s67Var3.parseFrom(bArr);
            }
            l67Var.f379187e = s67Var3;
        }
        return 0;
    }
}
