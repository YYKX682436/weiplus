package t45;

/* loaded from: classes2.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f415653d;

    /* renamed from: e, reason: collision with root package name */
    public t45.n0 f415654e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.x)) {
            return false;
        }
        t45.x xVar = (t45.x) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f415653d), java.lang.Integer.valueOf(xVar.f415653d)) && n51.f.a(this.f415654e, xVar.f415654e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f415653d);
            t45.n0 n0Var = this.f415654e;
            if (n0Var != null) {
                fVar.i(2, n0Var.computeSize());
                this.f415654e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f415653d) + 0;
            t45.n0 n0Var2 = this.f415654e;
            return n0Var2 != null ? e17 + b36.f.i(2, n0Var2.computeSize()) : e17;
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
        t45.x xVar = (t45.x) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xVar.f415653d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            t45.n0 n0Var3 = new t45.n0();
            if (bArr != null && bArr.length > 0) {
                n0Var3.parseFrom(bArr);
            }
            xVar.f415654e = n0Var3;
        }
        return 0;
    }
}
