package t45;

/* loaded from: classes9.dex */
public class d1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f415541d;

    /* renamed from: e, reason: collision with root package name */
    public t45.e0 f415542e;

    /* renamed from: f, reason: collision with root package name */
    public t45.f f415543f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.d1)) {
            return false;
        }
        t45.d1 d1Var = (t45.d1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f415541d), java.lang.Integer.valueOf(d1Var.f415541d)) && n51.f.a(this.f415542e, d1Var.f415542e) && n51.f.a(this.f415543f, d1Var.f415543f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f415541d);
            t45.e0 e0Var = this.f415542e;
            if (e0Var != null) {
                fVar.i(2, e0Var.computeSize());
                this.f415542e.writeFields(fVar);
            }
            t45.f fVar2 = this.f415543f;
            if (fVar2 != null) {
                fVar.i(3, fVar2.computeSize());
                this.f415543f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f415541d) + 0;
            t45.e0 e0Var2 = this.f415542e;
            if (e0Var2 != null) {
                e17 += b36.f.i(2, e0Var2.computeSize());
            }
            t45.f fVar3 = this.f415543f;
            return fVar3 != null ? e17 + b36.f.i(3, fVar3.computeSize()) : e17;
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
        t45.d1 d1Var = (t45.d1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d1Var.f415541d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                t45.e0 e0Var3 = new t45.e0();
                if (bArr != null && bArr.length > 0) {
                    e0Var3.parseFrom(bArr);
                }
                d1Var.f415542e = e0Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            t45.f fVar4 = new t45.f();
            if (bArr2 != null && bArr2.length > 0) {
                fVar4.parseFrom(bArr2);
            }
            d1Var.f415543f = fVar4;
        }
        return 0;
    }
}
