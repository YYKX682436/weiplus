package t45;

/* loaded from: classes9.dex */
public class d0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f415538d;

    /* renamed from: e, reason: collision with root package name */
    public t45.e0 f415539e;

    /* renamed from: f, reason: collision with root package name */
    public t45.f f415540f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.d0)) {
            return false;
        }
        t45.d0 d0Var = (t45.d0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f415538d), java.lang.Integer.valueOf(d0Var.f415538d)) && n51.f.a(this.f415539e, d0Var.f415539e) && n51.f.a(this.f415540f, d0Var.f415540f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f415538d);
            t45.e0 e0Var = this.f415539e;
            if (e0Var != null) {
                fVar.i(2, e0Var.computeSize());
                this.f415539e.writeFields(fVar);
            }
            t45.f fVar2 = this.f415540f;
            if (fVar2 != null) {
                fVar.i(3, fVar2.computeSize());
                this.f415540f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f415538d) + 0;
            t45.e0 e0Var2 = this.f415539e;
            if (e0Var2 != null) {
                e17 += b36.f.i(2, e0Var2.computeSize());
            }
            t45.f fVar3 = this.f415540f;
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
        t45.d0 d0Var = (t45.d0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d0Var.f415538d = aVar2.g(intValue);
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
                d0Var.f415539e = e0Var3;
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
            d0Var.f415540f = fVar4;
        }
        return 0;
    }
}
