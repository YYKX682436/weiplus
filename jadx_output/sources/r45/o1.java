package r45;

/* loaded from: classes8.dex */
public class o1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f381808d;

    /* renamed from: e, reason: collision with root package name */
    public r45.p1 f381809e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o1)) {
            return false;
        }
        r45.o1 o1Var = (r45.o1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f381808d), java.lang.Boolean.valueOf(o1Var.f381808d)) && n51.f.a(this.f381809e, o1Var.f381809e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f381808d);
            r45.p1 p1Var = this.f381809e;
            if (p1Var != null) {
                fVar.i(2, p1Var.computeSize());
                this.f381809e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f381808d) + 0;
            r45.p1 p1Var2 = this.f381809e;
            return p1Var2 != null ? a17 + b36.f.i(2, p1Var2.computeSize()) : a17;
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
        r45.o1 o1Var = (r45.o1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o1Var.f381808d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.p1 p1Var3 = new r45.p1();
            if (bArr != null && bArr.length > 0) {
                p1Var3.parseFrom(bArr);
            }
            o1Var.f381809e = p1Var3;
        }
        return 0;
    }
}
