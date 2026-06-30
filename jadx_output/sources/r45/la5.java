package r45;

/* loaded from: classes2.dex */
public class la5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f379277d;

    /* renamed from: e, reason: collision with root package name */
    public r45.oe0 f379278e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.la5)) {
            return false;
        }
        r45.la5 la5Var = (r45.la5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f379277d), java.lang.Boolean.valueOf(la5Var.f379277d)) && n51.f.a(this.f379278e, la5Var.f379278e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f379277d);
            r45.oe0 oe0Var = this.f379278e;
            if (oe0Var != null) {
                fVar.i(2, oe0Var.computeSize());
                this.f379278e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f379277d) + 0;
            r45.oe0 oe0Var2 = this.f379278e;
            return oe0Var2 != null ? a17 + b36.f.i(2, oe0Var2.computeSize()) : a17;
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
        r45.la5 la5Var = (r45.la5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            la5Var.f379277d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.oe0 oe0Var3 = new r45.oe0();
            if (bArr != null && bArr.length > 0) {
                oe0Var3.parseFrom(bArr);
            }
            la5Var.f379278e = oe0Var3;
        }
        return 0;
    }
}
